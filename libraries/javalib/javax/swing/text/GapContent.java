/* GapContent.java --
   Copyright (C) 2002, 2004, 2005 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package javax.swing.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import javax.swing.undo.UndoableEdit;

/**
 * This implementation of {@link AbstractDocument.Content} uses a gapped buffer.
 * This takes advantage of the fact that text area content is mostly inserted
 * sequentially. The buffer is a char array that maintains a gap at the current
 * insertion point. If characters a inserted at gap boundaries, the cost is
 * minimal (simple array access). The array only has to be shifted around when
 * the insertion point moves (then the gap also moves and one array copy is
 * necessary) or when the gap is filled up and the buffer has to be enlarged.
 * 
 * TODO: Implement UndoableEdit support stuff
 */
public class GapContent
    implements AbstractDocument.Content, Serializable
{
  /**
   * A {@link Position} implementation for <code>GapContent</code>.
   */
  class GapContentPosition
      implements Position, Comparable
  {

    /** The index within the buffer array. */
    int mark;

    /**
     * Creates a new GapContentPosition object.
     * 
     * @param mark the mark of this Position
     */
    GapContentPosition(int mark)
    {
      this.mark = mark;
    }

    /**
     * Comparable interface implementation. This is used to store all
     * positions in an ordered fashion.
     * 
     * @param o the object to be compared to this
     * 
     * @return a negative integer if this is less than <code>o</code>, zero
     *         if both are equal or a positive integer if this is greater than
     *         <code>o</code>
     * 
     * @throws ClassCastException if <code>o</code> is not a
     *         GapContentPosition or Integer object
     */
    public int compareTo(Object o)
    {
      if (o instanceof Integer)
      {
        int otherMark = ((Integer) o).intValue();
        return mark - otherMark;
      }
      else
      {
        GapContentPosition other = (GapContentPosition) o;
        return mark - other.mark;
      }
    }

    /**
     * Returns the current offset of this Position within the content.
     * 
     * @return the current offset of this Position within the content.
     */
    public int getOffset()
    {
      // Check precondition.
      assert(mark <= gapStart || mark > gapEnd);

      if (mark <= gapStart)
        return mark;
      else
        return mark - (gapEnd - gapStart);
    }
  }

  /** The serialization UID (compatible with JDK1.5). */
  private static final long serialVersionUID = -6226052713477823730L;

  /**
   * This is the default buffer size and the amount of bytes that a buffer is
   * extended if it is full.
   */
  static final int DEFAULT_BUFSIZE = 64;

  /**
   * The text buffer.
   */
  char[] buffer;

  /**
   * The index of the first character of the gap.
   */
  int gapStart;

  /**
   * The index of the character after the last character of the gap.
   */
  int gapEnd;

  /**
   * The positions generated by this GapContent. They are kept in an ordered
   * fashion, so they can be looked up easily.
   */
  ArrayList positions;

  /**
   * Creates a new GapContent object.
   */
  public GapContent()
  {
    this(DEFAULT_BUFSIZE);
  }

  /**
   * Creates a new GapContent object with a specified initial size.
   * 
   * @param size the initial size of the buffer
   */
  public GapContent(int size)
  {
    buffer = (char[]) allocateArray(size);
    gapStart = 0;
    gapEnd = size - 1;
    buffer[size - 1] = '\n';
    positions = new ArrayList();
  }

  /**
   * Allocates an array of the specified length that can then be used as
   * buffer.
   * 
   * @param size the size of the array to be allocated
   * 
   * @return the allocated array
   */
  protected Object allocateArray(int size)
  {
    return new char[size];
  }

  /**
   * Returns the length of the allocated buffer array.
   * 
   * @return the length of the allocated buffer array
   */
  protected int getArrayLength()
  {
    return buffer.length;
  }

  /**
   * Returns the length of the content.
   * 
   * @return the length of the content
   */
  public int length()
  {
    return buffer.length - (gapEnd - gapStart);
  }

  /**
   * Inserts a string at the specified position.
   * 
   * @param where the position where the string is inserted
   * @param str the string that is to be inserted
   * 
   * @return an UndoableEdit object (currently not supported, so
   *         <code>null</code> is returned)
   * 
   * @throws BadLocationException if <code>where</code> is not a valid
   *         location in the buffer
   */
  public UndoableEdit insertString(int where, String str)
      throws BadLocationException
  {
    // check arguments
    int length = length();
    int strLen = str.length();

    if (where >= length)
      throw new BadLocationException("the where argument cannot be greater"
          + " than the content length", where);

    replace(where, 0, str.toCharArray(), str.length());

    return null;
  }

  /**
   * Removes a piece of content at th specified position.
   * 
   * @param where the position where the content is to be removed
   * @param nitems number of characters to be removed
   * 
   * @return an UndoableEdit object (currently not supported, so
   *         <code>null</code> is returned)
   * 
   * @throws BadLocationException if <code>where</code> is not a valid
   *         location in the buffer
   */
  public UndoableEdit remove(int where, int nitems) throws BadLocationException
  {
    // check arguments
    int length = length();

    if (where >= length)
      throw new BadLocationException("the where argument cannot be greater"
          + " than the content length", where);
    if ((where + nitems) > length)
      throw new BadLocationException("where + nitems cannot be greater"
          + " than the content length", where + nitems);

    replace(where, nitems, null, 0);

    return null;
  }

  /**
   * Returns a piece of content as String.
   * 
   * @param where the start location of the fragment
   * @param len the length of the fragment
   * 
   * @throws BadLocationException if <code>where</code> or
   *         <code>where + len</code> are no valid locations in the buffer
   */
  public String getString(int where, int len) throws BadLocationException
  {
    Segment seg = new Segment();
    try
      {
        getChars(where, len, seg);
        return new String(seg.array, seg.offset, seg.count);
      }
    catch (StringIndexOutOfBoundsException ex)
      {
        int invalid = 0;
        if (seg.offset < 0 || seg.offset >= seg.array.length)
          invalid = seg.offset;
        else
          invalid = seg.offset + seg.count;
        throw new BadLocationException("Illegal location: array.length = "
                                       + seg.array.length + ", offset = "
                                       + seg.offset + ", count = "
                                       + seg.count, invalid);
      }
  }

  /**
   * Fetches a piece of content and stores it in a {@link Segment} object.
   * 
   * If the requested piece of text spans the gap, the content is copied into a
   * new array. If it doesn't then it is contiguous and the actual content
   * store is returned.
   * 
   * @param where the start location of the fragment
   * @param len the length of the fragment
   * @param txt the Segment object to store the fragment in
   * 
   * @throws BadLocationException if <code>where</code> or
   *         <code>where + len</code> are no valid locations in the buffer
   */
  public void getChars(int where, int len, Segment txt)
      throws BadLocationException
  {
    // check arguments
    int length = length();
    if (where >= length)
      throw new BadLocationException("the where argument cannot be greater"
          + " than the content length", where);
    if ((where + len) > length)
      throw new BadLocationException("len plus where cannot be greater"
          + " than the content length", len + where);

    // check if requested segment is contiguous
    if ((where < gapStart) && ((gapStart - where) < len))
    {
      // requested segment is not contiguous -> copy the pieces together
      char[] copy = new char[len];
      int lenFirst = gapStart - where; // the length of the first segment
      System.arraycopy(buffer, where, copy, 0, lenFirst);
      System.arraycopy(buffer, gapEnd, copy, lenFirst, len - lenFirst);
      txt.array = copy;
      txt.offset = 0;
      txt.count = len;
    }
    else
    {
      // requested segment is contiguous -> we can simply return the
      // actual content
      txt.array = buffer;
      if (where < gapStart)
        txt.offset = where;
      else
        txt.offset = where + (gapEnd - gapStart);
      txt.count = len;
    }
  }

  /**
   * Creates and returns a mark at the specified position.
   * 
   * @param offset the position at which to create the mark
   * 
   * @return the create Position object for the mark
   * 
   * @throws BadLocationException if the offset is not a valid position in the
   *         buffer
   */
  public Position createPosition(final int offset) throws BadLocationException
  {
    if (offset < 0 || offset > length())
      throw new BadLocationException("The offset was out of the bounds of this"
          + " buffer", offset);

    // We store the actual array index in the GapContentPosition. The real
    // offset is then calculated in the GapContentPosition.
    int mark = offset;
    if (offset > gapStart)
      mark += gapEnd - gapStart;
    GapContentPosition pos = new GapContentPosition(mark);

    // Add this into our list in a sorted fashion.
    int index = Collections.binarySearch(positions, pos);
    if (index < 0)
      index = -(index + 1);
    positions.add(index, pos);
    
    return pos;
  }

  /**
   * Enlarges the gap. This allocates a new bigger buffer array, copy the
   * segment before the gap as it is and the segment after the gap at the end
   * of the new buffer array. This does change the gapEnd mark but not the
   * gapStart mark.
   * 
   * @param newSize the new size of the gap
   */
  protected void shiftEnd(int newSize)
  {
    int delta = (gapEnd - gapStart) - newSize;
    char[] newBuf = (char[]) allocateArray(length() + newSize);
    System.arraycopy(buffer, 0, newBuf, 0, gapStart);
    System.arraycopy(buffer, gapEnd, newBuf, gapStart + newSize, buffer.length
        - gapEnd);
    gapEnd = gapStart + newSize;
    buffer = newBuf;

    // Update the marks after the gapEnd.
    int index = Collections.binarySearch(positions, new GapContentPosition(
        gapEnd));
    if (index < 0)
    {
      index = -(index + 1);
    }
    for (ListIterator i = positions.listIterator(index); i.hasNext();)
    {
      GapContentPosition p = (GapContentPosition) i.next();
      p.mark += delta;
    }
  }

  /**
   * Shifts the gap to the specified position.
   * 
   * @param newGapStart the new start position of the gap
   */
  protected void shiftGap(int newGapStart)
  {
    if (newGapStart == gapStart)
      return;

    int newGapEnd = newGapStart + (gapEnd - gapStart);

    // Update the positions between newGapEnd and (old) gapEnd. The marks
    // must be shifted by (gapEnd - newGapEnd).
    int index1 = Collections.binarySearch(positions,
                                          new GapContentPosition(gapEnd));
    int index2 = Collections.binarySearch(positions,
                                          new GapContentPosition(newGapEnd));
    if (index1 > 0 && index2 > 0)
      {
        int i1 = Math.min(index1, index2);
        int i2 = Math.max(index1, index2);
        for (ListIterator i = positions.listIterator(i1); i.hasNext();)
          {
            if (i.nextIndex() > i2)
              break;
            
            GapContentPosition p = (GapContentPosition) i.next();
            p.mark += gapEnd - newGapEnd;
          }
      }

    if (newGapStart < gapStart)
      {
        System.arraycopy(buffer, newGapStart, buffer, newGapEnd, gapStart
                         - newGapStart);
        gapStart = newGapStart;
        gapEnd = newGapEnd;
      }
    else
      {
        System.arraycopy(buffer, gapEnd, buffer, gapStart, newGapStart
                         - gapStart);
        gapStart = newGapStart;
        gapEnd = newGapEnd;
      }
  }

  /**
   * Returns the allocated buffer array.
   * 
   * @return the allocated buffer array
   */
  protected Object getArray()
  {
    return buffer;
  }

  /**
   * Replaces a portion of the storage with the specified items.
   * 
   * @param position the position at which to remove items
   * @param rmSize the number of items to remove
   * @param addItems the items to add at location
   * @param addSize the number of items to add
   */
  protected void replace(int position, int rmSize, Object addItems,
                         int addSize)
  {
    // Remove content
    shiftGap(position);
    gapEnd += rmSize;

    // If gap is too small, enlarge the gap.
    if ((gapEnd - gapStart) < addSize)
      shiftEnd(addSize);

    // Add new items to the buffer.
    if (addItems != null)
      {
        System.arraycopy(addItems, 0, buffer, gapStart, addSize);
        gapStart += addSize;
      }
  }
}
