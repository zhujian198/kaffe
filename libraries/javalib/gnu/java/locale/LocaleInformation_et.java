/* LocaleInformation_et.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

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
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

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


// This file was automatically generated by gnu.localegen from LDML

package gnu.java.locale;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.ListResourceBundle;

public class LocaleInformation_et extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "EEK";

  private static final String currenciesDisplayNameValues = "EEK";

  private static final Hashtable currenciesDisplayName;
  static
  {
    currenciesDisplayName = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesDisplayNameKeys, "\u00A6");
    Enumeration values = new StringTokenizer(currenciesDisplayNameValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesDisplayName.put(key, value);
      }
  }

  private static final String currenciesSymbolKeys = "EEK";

  private static final String currenciesSymbolValues = "kr";

  private static final Hashtable currenciesSymbol;
  static
  {
    currenciesSymbol = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesSymbolKeys, "\u00A6");
    Enumeration values = new StringTokenizer(currenciesSymbolValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesSymbol.put(key, value);
      }
  }

  private static final String[] shortMonths = {
    "jaan",
    "veebr",
    "m\u00e4rts",
    "apr",
    "mai",
    "juuni",
    "juuli",
    "aug",
    "sept",
    "okt",
    "nov",
    "dets",
    null,
  };

  private static final String[] months = {
    "jaanuar",
    "veebruar",
    "m\u00e4rts",
    "aprill",
    "mai",
    "juuni",
    "juuli",
    "august",
    "september",
    "oktoober",
    "november",
    "detsember",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "P",
    "E",
    "T",
    "K",
    "N",
    "R",
    "L",
  };

  private static final String[] weekdays = {
    null,
    "p\u00fchap\u00e4ev",
    "esmasp\u00e4ev",
    "teisip\u00e4ev",
    "kolmap\u00e4ev",
    "neljap\u00e4ev",
    "reede",
    "laup\u00e4ev",
  };

  private static final String[] eras = {
    "e.m.a.",
    "m.a.j.",
  };

  private static final String territoriesKeys = "TL\u00A6TK\u00A6TJ\u00A6TH\u00A6TG\u00A6TF\u00A6GY\u00A6TD\u00A6TC\u00A6GW\u00A6GU\u00A6GT\u00A6GS\u00A6GR\u00A6GQ\u00A6GP\u00A6SZ\u00A6SY\u00A6GN\u00A6GM\u00A6GL\u00A6SV\u00A6ST\u00A6GI\u00A6GH\u00A6SR\u00A6GF\u00A6GE\u00A6SO\u00A6GD\u00A6SN\u00A6SM\u00A6GB\u00A6SL\u00A6GA\u00A6SK\u00A6SJ\u00A6SI\u00A6SH\u00A6SG\u00A6SE\u00A6SD\u00A6SC\u00A6SB\u00A6SA\u00A6FR\u00A6FO\u00A6FM\u00A6RW\u00A6FK\u00A6RU\u00A6FJ\u00A6FI\u00A6RO\u00A6RE\u00A6ET\u00A6ES\u00A6ER\u00A6EH\u00A6EG\u00A6EE\u00A6EC\u00A6DZ\u00A6QA\u00A6DO\u00A6PY\u00A6DM\u00A6PW\u00A6DK\u00A6DJ\u00A6PT\u00A6PS\u00A6PR\u00A6DE\u00A6PN\u00A6PM\u00A6PL\u00A6PK\u00A6PH\u00A6PG\u00A6PF\u00A6CZ\u00A6PE\u00A6CY\u00A6CX\u00A6CV\u00A6PA\u00A6CU\u00A6CR\u00A6CO\u00A6CN\u00A6CM\u00A6CL\u00A6CK\u00A6CI\u00A6CH\u00A6CG\u00A6CF\u00A6CD\u00A6CC\u00A6OM\u00A6CA\u00A6BZ\u00A6BY\u00A6BW\u00A6BV\u00A6BT\u00A6BS\u00A6BR\u00A6NZ\u00A6BO\u00A6BN\u00A6BM\u00A6NU\u00A6BJ\u00A6BI\u00A6BH\u00A6NR\u00A6BG\u00A6BF\u00A6NP\u00A6BE\u00A6NO\u00A6BD\u00A6BB\u00A6ZW\u00A6NL\u00A6BA\u00A6NI\u00A6NG\u00A6NF\u00A6AZ\u00A6NE\u00A6NC\u00A6AW\u00A6ZM\u00A6NA\u00A6AU\u00A6AT\u00A6AS\u00A6AR\u00A6AQ\u00A6MZ\u00A6AO\u00A6MY\u00A6AN\u00A6MX\u00A6AM\u00A6MW\u00A6AL\u00A6MV\u00A6ZA\u00A6MU\u00A6MT\u00A6AI\u00A6MS\u00A6MR\u00A6AG\u00A6MQ\u00A6AF\u00A6MP\u00A6AE\u00A6MO\u00A6AD\u00A6MN\u00A6MM\u00A6ML\u00A6MK\u00A6YU\u00A6YT\u00A6MH\u00A6MG\u00A6MD\u00A6MC\u00A6MA\u00A6YE\u00A6LY\u00A6LV\u00A6LU\u00A6LT\u00A6LS\u00A6LR\u00A6LK\u00A6LI\u00A6LC\u00A6LB\u00A6LA\u00A6KZ\u00A6KY\u00A6KW\u00A6KR\u00A6KP\u00A6KN\u00A6KM\u00A6KI\u00A6WS\u00A6KH\u00A6KG\u00A6KE\u00A6WF\u00A6JP\u00A6JO\u00A6JM\u00A6VU\u00A6VN\u00A6VI\u00A6VG\u00A6VE\u00A6VC\u00A6VA\u00A6IT\u00A6IS\u00A6IR\u00A6IQ\u00A6UZ\u00A6IO\u00A6UY\u00A6IN\u00A6IL\u00A6US\u00A6IE\u00A6ID\u00A6UM\u00A6UG\u00A6UA\u00A6HU\u00A6HT\u00A6HR\u00A6TZ\u00A6HN\u00A6HM\u00A6TW\u00A6TV\u00A6HK\u00A6TT\u00A6TR\u00A6TO\u00A6TN\u00A6TM";

  private static final String territoriesValues = "Ida-Timor\u00A6Tokelau\u00A6Tad\u012aikistan\u00A6Tai\u00A6Togo\u00A6Prantsuse L\u00f5unaalad\u00A6Guyana\u00A6Tiaad\u00A6Turks ja Caicos\u00A6Guinea-Bissau\u00A6Guam\u00A6Guatemala\u00A6L\u00f5una-Georgia ja L\u00f5una-Sandwichi saared\u00A6Kreeka\u00A6Ekvatoriaal-Guinea\u00A6Guadeloupe\u00A6Svaasimaa\u00A6S\u00fc\u00fcria\u00A6Guinea\u00A6Gambia\u00A6Gr\u00f6\u00f6nimaa\u00A6El Salvador\u00A6Sao Tom\u00e9 ja Principe\u00A6Gibraltar\u00A6Ghana\u00A6Suriname\u00A6Prantsuse Guajaana\u00A6Gruusia\u00A6Somaalia\u00A6Grenada\u00A6Senegal\u00A6San Marino\u00A6\u00dchendkuningriik\u00A6Sierra Leone\u00A6Gabon\u00A6Slovakkia\u00A6Svalbard ja Jan Mayen\u00A6Sloveenia\u00A6Saint Helena\u00A6Singapur\u00A6Rootsi\u00A6Sudaan\u00A6Seiiellid\u00A6Saalomoni Saared\u00A6Saudi Araabia\u00A6Prantsusmaa\u00A6F\u00e4\u00e4ri saared\u00A6Mikroneesia Liiduriigid\u00A6Rwanda\u00A6Falklandi saared\u00A6Venemaa\u00A6Fid\u012ai\u00A6Soome\u00A6Rumeenia\u00A6R\u00e9union\u00A6Etioopia\u00A6Hispaania\u00A6Eritrea\u00A6L\u00e4\u00e4ne-Sahara\u00A6Egiptus\u00A6Eesti\u00A6Ecuador\u00A6Al\u012aeeria\u00A6Katar\u00A6Dominikaani Vabariik\u00A6Paraguay\u00A6Dominica\u00A6Belau\u00A6Taani\u00A6Djibouti\u00A6Portugal\u00A6Palestiina Omavalitsus\u00A6Puerto Rico\u00A6Saksamaa\u00A6Pitcairn\u00A6Saint-Pierre ja Miquelon\u00A6Poola\u00A6Pakistan\u00A6Filipiinid\u00A6Paapua Uus-Guinea\u00A6Prantsuse Pol\u00fcneesia\u00A6Tiehhi Vabariik\u00A6Peruu\u00A6K\u00fcpros\u00A6J\u00f5ulusaar\u00A6Cabo Verde\u00A6Panama\u00A6Kuuba\u00A6Costa Rica\u00A6Colombia\u00A6Hiina\u00A6Kamerun\u00A6Tiiili\u00A6Cooki saared\u00A6Cote d\u2019Ivoire\u00A6\u0128veits\u00A6Kongo\u00A6Kesk-Aafrika Vabariik\u00A6Kongo DV\u00A6Kookossaared\u00A6Omaan\u00A6Kanada\u00A6Belize\u00A6Valgevene\u00A6Botswana\u00A6Bouvet\u2019 saar\u00A6Bhutan\u00A6Bahama saared\u00A6Brasiilia\u00A6Uus-Meremaa\u00A6Boliivia\u00A6Brunei\u00A6Bermuda\u00A6Niue\u00A6Benin\u00A6Burundi\u00A6Bahrein\u00A6Nauru\u00A6Bulgaaria\u00A6Burkina Faso\u00A6Nepal\u00A6Belgia\u00A6Norra\u00A6Bangladesh\u00A6Barbados\u00A6Zimbabwe\u00A6Holland\u00A6Bosnia ja Hertsegoviina\u00A6Nicaragua\u00A6Nigeeria\u00A6Norfolk\u00A6Aserbaid\u012aaan\u00A6Niger\u00A6Uus-Kaledoonia\u00A6Aruba\u00A6Sambia\u00A6Namiibia\u00A6Austraalia\u00A6Austria\u00A6Ameerika Samoa\u00A6Argentina\u00A6Antarktika\u00A6Mosambiik\u00A6Angola\u00A6Malaisia\u00A6Hollandi Antillid\u00A6Mehhiko\u00A6Armeenia\u00A6Malawi\u00A6Albaania\u00A6Maldiivid\u00A6L\u00f5una-Aafrika Vabariik\u00A6Mauritius\u00A6Malta\u00A6Anguilla\u00A6Montserrat\u00A6Mauritaania\u00A6Antigua ja Barbuda\u00A6Martinique\u00A6Afganistan\u00A6P\u00f5hja-Mariaanid\u00A6Araabia \u00dchendemiraadid\u00A6Aomeni Hiina erihalduspiirkond\u00A6Andorra\u00A6Mongoolia\u00A6Myanmar\u00A6Mali\u00A6Makedoonia Vabariik\u00A6Jugoslaavia\u00A6Mayotte\u00A6Marshalli Saared\u00A6Madagaskar\u00A6Moldova\u00A6Monaco\u00A6Maroko\u00A6Jeemen\u00A6Liib\u00fca\u00A6L\u00e4ti\u00A6Luksemburg\u00A6Leedu\u00A6Lesotho\u00A6Libeeria\u00A6Sri Lanka\u00A6Liechtenstein\u00A6Saint Lucia\u00A6Liibanon\u00A6Laose DRV\u00A6Kasahstan\u00A6Kaimani saared\u00A6Kuveit\u00A6L\u00f5una-Korea\u00A6P\u00f5hja-Korea\u00A6Saint Kitts ja Nevis\u00A6Komoorid\u00A6Kiribati\u00A6Samoa\u00A6Kambod\u012aa\u00A6K\u00f5rg\u00f5zstan\u00A6Kenya\u00A6Wallis ja Futuna\u00A6Jaapan\u00A6Jordaania\u00A6Jamaica\u00A6Vanuatu\u00A6Vietnam\u00A6USA Neitsisaared\u00A6Briti Neitsisaared\u00A6Venezuela\u00A6Saint Vincent ja Grenadiinid\u00A6P\u00fcha Tool (Vatikan)\u00A6Itaalia\u00A6Island\u00A6Iraan\u00A6Iraak\u00A6Usbekistan\u00A6Briti India ookeani ala\u00A6Uruguay\u00A6India\u00A6Iisrael\u00A6Ameerika \u00dchendriigid\u00A6Iirimaa\u00A6Indoneesia\u00A6\u00dchendriikide hajasaared\u00A6Uganda\u00A6Ukraina\u00A6Ungari\u00A6Haiti\u00A6Horvaatia\u00A6Tansaania\u00A6Honduras\u00A6Heard ja McDonald\u00A6Taiwan\u00A6Tuvalu\u00A6Hongkongi erihalduspiirkond\u00A6Trinidad ja Tobago\u00A6T\u00fcrgi\u00A6Tonga\u00A6Tuneesia\u00A6T\u00fcrkmenistan";

  private static final Hashtable territories;
  static
  {
    territories = new Hashtable();
    Enumeration keys = new StringTokenizer(territoriesKeys, "\u00A6");
    Enumeration values = new StringTokenizer(territoriesValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         territories.put(key, value);
      }
  }

  private static final String languagesKeys = "ja\u00A6en\u00A6tr\u00A6ko\u00A6no\u00A6el\u00A6nl\u00A6bg\u00A6lv\u00A6he\u00A6cs\u00A6it\u00A6lt\u00A6fr\u00A6zh\u00A6ru\u00A6ro\u00A6fi\u00A6ar\u00A6sv\u00A6pt\u00A6pl\u00A6sl\u00A6sk\u00A6de\u00A6hu\u00A6et\u00A6es\u00A6hr\u00A6da";

  private static final String languagesValues = "Jaapani\u00A6Inglise\u00A6T\u00fcrgi\u00A6Korea\u00A6Norra\u00A6Kreeka\u00A6Hollandi\u00A6Bulgaaria\u00A6L\u00e4ti\u00A6Heebrea\u00A6Tiehhi\u00A6Itaalia\u00A6Leedu\u00A6Prantsuse\u00A6Hiina\u00A6Vene\u00A6Rumeenia\u00A6Soome\u00A6Araabia\u00A6Rootsi\u00A6Portugali\u00A6Poola\u00A6Sloveeni\u00A6Slovaki\u00A6Saksa\u00A6Ungari\u00A6Eesti\u00A6Hispaania\u00A6Horvaadi\u00A6Taani";

  private static final Hashtable languages;
  static
  {
    languages = new Hashtable();
    Enumeration keys = new StringTokenizer(languagesKeys, "\u00A6");
    Enumeration values = new StringTokenizer(languagesValues, "\u00A6");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         languages.put(key, value);
      }
  }

  private static final Object[][] contents =
  {
    { "decimalSeparator", "," },
    { "groupingSeparator", "\u00a0" },
    { "localPatternChars", "GanjkHmsSEDFwWxhKzAeugXZ" },
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "shortDateFormat", "dd.MM.yy" },
    { "mediumDateFormat", "dd.MM.yyyy" },
    { "longDateFormat", "d MMMM yyyy" },
    { "fullDateFormat", "EEEE, d, MMMM yyyy" },
    { "shortTimeFormat", "H:mm" },
    { "mediumTimeFormat", "H:mm:ss" },
    { "longTimeFormat", "H:mm:ss z" },
    { "fullTimeFormat", "H:mm:ss z" },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
