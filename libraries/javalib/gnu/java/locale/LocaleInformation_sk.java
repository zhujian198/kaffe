/* LocaleInformation_sk.java --
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

public class LocaleInformation_sk extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "JOD\u00A6BOV\u00A6XAU\u00A6FOK\u00A6LBP\u00A6EUR\u00A6VND\u00A6TZS\u00A6BOP\u00A6KHR\u00A6KHO\u00A6ZMP\u00A6AUP\u00A6XAF\u00A6MTP\u00A6GHR\u00A6ZMK\u00A6GHP\u00A6GHO\u00A6MTL\u00A6AUD\u00A6USS\u00A6ITL\u00A6USN\u00A6GHC\u00A6SGD\u00A6PAB\u00A6LAK\u00A6KGS\u00A6CHF\u00A6ATS\u00A6USD\u00A6ETD\u00A6BND\u00A6JMP\u00A6ETB\u00A6DZG\u00A6DZF\u00A6DZD\u00A6PYG\u00A6LYP\u00A6JMD\u00A6ISK\u00A6ESP\u00A6BMP\u00A6LYD\u00A6LYB\u00A6BMD\u00A6NLG\u00A6MRO\u00A6IRR\u00A6SEK\u00A6ERN\u00A6KES\u00A6CFF\u00A6ARS\u00A6ARP\u00A6ARM\u00A6TWD\u00A6SDP\u00A6GEL\u00A6GEK\u00A6MQF\u00A6FKP\u00A6ARA\u00A6SDD\u00A6IQD\u00A6TVD\u00A6SCR\u00A6LVR\u00A6FJP\u00A6LVL\u00A6CDL\u00A6CDG\u00A6CDF\u00A6FJD\u00A6NIO\u00A6MOP\u00A6NIG\u00A6NIC\u00A6XTR\u00A6FIN\u00A6FIM\u00A6SBD\u00A6LUF\u00A6TTO\u00A6AOS\u00A6AOR\u00A6MNT\u00A6HUF\u00A6BIF\u00A6AON\u00A6AOK\u00A6TTD\u00A6SZL\u00A6NHF\u00A6GBP\u00A6SAS\u00A6SAR\u00A6LTT\u00A6INR\u00A6PTE\u00A6AOA\u00A6PTC\u00A6LTL\u00A6KZT\u00A6KZR\u00A6VGD\u00A6NGP\u00A6MMX\u00A6NGN\u00A6HTG\u00A6SYP\u00A6PSP\u00A6BHD\u00A6MMK\u00A6ANG\u00A6CZK\u00A6IMP\u00A6BGX\u00A6LSL\u00A6GAF\u00A6BGO\u00A6BGN\u00A6BGM\u00A6CAD\u00A6BGL\u00A6TRL\u00A6KYD\u00A6CYP\u00A6ILS\u00A6GYD\u00A6AMD\u00A6ILP\u00A6MLF\u00A6ILL\u00A6VEB\u00A6ALX\u00A6LRD\u00A6ALV\u00A6HRK\u00A6REF\u00A6HRD\u00A6ALL\u00A6JEP\u00A6ALK\u00A6MKN\u00A6VDP\u00A6VDN\u00A6MKD\u00A6VDD\u00A6TPP\u00A6XPF\u00A6BEL\u00A6GWP\u00A6KWD\u00A6GWM\u00A6BEF\u00A6TPE\u00A6BEC\u00A6GWE\u00A6SVC\u00A6CWG\u00A6BDT\u00A6TOS\u00A6TOP\u00A6XOF\u00A6SUR\u00A6SUN\u00A6NCF\u00A6CVE\u00A6XNF\u00A6ZAR\u00A6DOP\u00A6CUX\u00A6ZAP\u00A6ZAL\u00A6TND\u00A6CUP\u00A6GUF\u00A6UGX\u00A6LNR\u00A6AIF\u00A6VAL\u00A6STE\u00A6UGS\u00A6STD\u00A6MHD\u00A6NZP\u00A6WST\u00A6WSP\u00A6HNL\u00A6XMF\u00A6TMM\u00A6GTQ\u00A6NZD\u00A6SSP\u00A6BBD\u00A6NAD\u00A6MGF\u00A6MGA\u00A6EGP\u00A6BZH\u00A6PLZ\u00A6BAN\u00A6PLX\u00A6BAM\u00A6BZD\u00A6BAD\u00A6PLN\u00A6YER\u00A6SRG\u00A6CSK\u00A6KRW\u00A6BYR\u00A6YEI\u00A6BYL\u00A6CSC\u00A6KRO\u00A6KRH\u00A6BYB\u00A6SQS\u00A6GRN\u00A6PKR\u00A6ZWD\u00A6LKR\u00A6GRD\u00A6IEP\u00A6YDD\u00A6RWF\u00A6CRC\u00A6TJS\u00A6TJR\u00A6EEK\u00A6GQP\u00A6MDR\u00A6HKD\u00A6DKK\u00A6MDL\u00A6GQF\u00A6GQE\u00A6IDR\u00A6AED\u00A6KPW\u00A6IDN\u00A6BWP\u00A6MDC\u00A6IDJ\u00A6KPP\u00A6IDG\u00A6VUV\u00A6XID\u00A6SOS\u00A6ADP\u00A6RUR\u00A6GPF\u00A6DJF\u00A6ADD\u00A6MCG\u00A6MCF\u00A6ECV\u00A6ECS\u00A6LIF\u00A6RUB\u00A6PHP\u00A6UZS\u00A6COP\u00A6THB\u00A6IBP\u00A6BUR\u00A6COF\u00A6BUK\u00A6COB\u00A6UZC\u00A6UAK\u00A6QAR\u00A6UAH\u00A6GNS\u00A6CNY\u00A6MZM\u00A6CNX\u00A6UYU\u00A6GNI\u00A6SML\u00A6MZE\u00A6CNP\u00A6GNF\u00A6OMS\u00A6PGK\u00A6OMR\u00A6UYP\u00A6XFU\u00A6BTR\u00A6ZRZ\u00A6MAF\u00A6MAD\u00A6BTN\u00A6XFO\u00A6UYF\u00A6MYR\u00A6ZRN\u00A6AZM\u00A6GMP\u00A6KMF\u00A6SLL\u00A6GMD\u00A6BSP\u00A6CMF\u00A6MXV\u00A6XEF\u00A6BSD\u00A6MXP\u00A6MXN\u00A6PES\u00A6GLK\u00A6BRZ\u00A6PEN\u00A6CLP\u00A6SKK\u00A6PEI\u00A6BRR\u00A6XDR\u00A6FRG\u00A6FRF\u00A6BRN\u00A6CLF\u00A6CLE\u00A6BRL\u00A6CLC\u00A6BRE\u00A6DES\u00A6MWP\u00A6BRC\u00A6BRB\u00A6MWK\u00A6PDR\u00A6DEM\u00A6TDF\u00A6PDN\u00A6PDK\u00A6NPR\u00A6CKD\u00A6JPY\u00A6MVR\u00A6XCF\u00A6MVP\u00A6XCD\u00A6SIT\u00A6YUR\u00A6AWG\u00A6YUO\u00A6DDM\u00A6YUN\u00A6YUM\u00A6TCC\u00A6YUG\u00A6YUF\u00A6RON\u00A6YUD\u00A6ROL\u00A6SIB\u00A6NOK\u00A6MUR\u00A6GIP\u00A6VNS\u00A6VNR\u00A6KID\u00A6SHP\u00A6VNN";

  private static final String currenciesDisplayNameValues = "Jord\u00e1nsky din\u00e1r\u00A6Boliv\u00edjske mvdol\u00A6Zlato\u00A6Faeroe Islands Kronur\u00A6Libanonsk\u00e1 libra\u00A6Euro\u00A6Vietnamsk\u00fd dong\u00A6Tanzansk\u00fd \u0161iling\u00A6Boliv\u00edjske peso\u00A6Kambod\u017esk\u00fd riel\u00A6Kambod\u017esk\u00fd star\u00fd riel\u00A6Zambsk\u00e1 libra\u00A6Austr\u00e1lska libra\u00A6CFA frank BEAC\u00A6Maltsk\u00e1 libra\u00A6Ghansk\u00fd prehodnoten\u00fd cedi\u00A6Zambsk\u00e1 kwacha\u00A6Ghansk\u00e1 libra\u00A6Ghansk\u00fd star\u00fd cedi\u00A6Maltsk\u00e1 lira\u00A6Austr\u00e1lsky dol\u00e1r\u00A6US dol\u00e1r (Same day)\u00A6Taliansk\u00e1 lira\u00A6US dol\u00e1r (Next day)\u00A6Ghansk\u00fd cedi\u00A6Singap\u00farsky dol\u00e1r\u00A6Panamsk\u00e1 balboa\u00A6Laosk\u00fd kip\u00A6Kyrgysk\u00fd som\u00A6\u0160vaj\u010diarsk\u00fd frank\u00A6Rak\u00fasky \u0161iling\u00A6US dol\u00e1r\u00A6Ethiopsk\u00fd dol\u00e1r\u00A6Bruneisk\u00fd dol\u00e1r\u00A6Jamajsk\u00e1 libra\u00A6Ethiopsk\u00fd birr\u00A6Al\u017e\u00edrsky frank Germinal\u00A6Al\u017e\u00edrsky nov\u00fd frank\u00A6Al\u017e\u00edrsky din\u00e1r\u00A6Paraguaysk\u00e9 guarani\u00A6Libyjsk\u00e1 libra\u00A6Jamajsk\u00fd dol\u00e1r\u00A6Islandsk\u00e1 krona\u00A6\u0160panielsk\u00e1 peseta\u00A6Bermudsk\u00e1 libra\u00A6Libyjsk\u00fd din\u00e1r\u00A6Libyjsk\u00e1 BMA lira\u00A6Bermudsk\u00fd dol\u00e1r\u00A6Nizozemsk\u00fd guilder\u00A6Mauritania Ouguiya\u00A6Ir\u00e1nsky rial\u00A6\u0160v\u00e9dska krona\u00A6Eritrejsk\u00e1 nakfa\u00A6Ke\u0148sk\u00fd \u0161iling\u00A6CAR CFA frank\u00A6Argentinsk\u00e9 peso\u00A6Argentinsk\u00e9 peso (1983-1985)\u00A6Argentinsk\u00e9 peso Moneda Nacional\u00A6Taiwansk\u00fd nov\u00fd dol\u00e1r\u00A6Sud\u00e1nska libra\u00A6Gruz\u00ednsky lari\u00A6Gruz\u00ednsky Kupon Larit\u00A6Martinique frank\u00A6Falklandsk\u00e1 libra\u00A6Argentinsk\u00fd austral\u00A6Sud\u00e1nsky din\u00e1r\u00A6Irack\u00fd din\u00e1r\u00A6Tuvalu dol\u00e1r\u00A6Sej\u0161elsk\u00e1 rupia\u00A6Loty\u0161sk\u00fd rube\u013e\u00A6Fiji libra\u00A6Loty\u0161sk\u00fd lats\u00A6Kon\u017esk\u00fd zaire\u00A6Kon\u017esk\u00fd frank\u00A6Kon\u017esk\u00fd frank Congolais\u00A6Fiji dol\u00e1r\u00A6Nikaragujsk\u00e1 Cordoba Oro\u00A6Macao Pataca\u00A6Nikaragujsk\u00e1 zlat\u00e1 Cordoba\u00A6Nikaragujsk\u00e1 cordoba\u00A6COMECON rube\u013e\u00A6Finsk\u00e1 marka (1860-1962)\u00A6Finsk\u00e1 marka\u00A6Solomon Islands dol\u00e1r\u00A6Luxembursk\u00fd frank\u00A6Trinidad a Tobago star\u00fd dol\u00e1r\u00A6Angolsk\u00e9 eskudo\u00A6Angolsk\u00e1 kwanza Reajustado (1995-1999)\u00A6Mongolsk\u00fd tugrik\u00A6Ma\u010farsk\u00fd forint\u00A6Burundsk\u00fd frank\u00A6Angolsk\u00e1 nov\u00e1 kwanza (1990-2000)\u00A6Angolsk\u00e1 kwanza (1977-1990)\u00A6Trinidad a Tobago dol\u00e1r\u00A6Swaziland lilangeni\u00A6New Hebrides CFP frank\u00A6Britsk\u00e1 libra\u00A6Saudsk\u00fd Riyal\u00A6Saudsk\u00fd riyal\u00A6Litevsk\u00fd talonas\u00A6Indijsk\u00e1 rupia\u00A6Portugalsk\u00e9 eskudo\u00A6Angolsk\u00e1 kwanza\u00A6Portugalsk\u00e9 conto\u00A6Litevsk\u00e1 lita\u00A6Kaza\u017esk\u00fd tenge\u00A6Kaza\u017esk\u00fd rube\u013e\u00A6British Virgin Islands dol\u00e1r\u00A6Nigersk\u00e1 libra\u00A6Myanmarsk\u00e9 dol\u00e1rov\u00e9 certifik\u00e1ty\u00A6Nigersk\u00e1 naira\u00A6Haitsk\u00e9 gourde\u00A6Syrsk\u00e1 libra\u00A6Palest\u00ednska libra\u00A6Bahraisk\u00fd din\u00e1r\u00A6Myanmarsk\u00fd kyat\u00A6Nizozemsk\u00fd Antilsk\u00fd guilder\u00A6\u010cesk\u00e1 koruna\u00A6Libra Isle of Man\u00A6Bulharsk\u00e9 certifik\u00e1ty v leva\u00A6Lesothsk\u00fd loti\u00A6Gab\u00fansky CFA frank\u00A6Bulharsk\u00fd leva (1879-1952)\u00A6Bulharsk\u00fd leva nov\u00fd\u00A6Bulharsk\u00fd socialistick\u00fd leva\u00A6Kanadsk\u00fd dol\u00e1r\u00A6Bulharsk\u00fd leva\u00A6Tureck\u00e1 lira\u00A6Kajmansk\u00fd dol\u00e1r\u00A6Cyprusk\u00e1 libra\u00A6Izraelsk\u00fd \u0161ekel\u00A6Guyansk\u00fd dol\u00e1r\u00A6Armensk\u00fd dram\u00A6Izraelsk\u00e1 libra\u00A6Malsk\u00fd frank\u00A6Izraelsk\u00fd \u0161ekel\u00A6Venezuelsk\u00fd bolivar\u00A6Alb\u00e1nske dol\u00e1rov\u00e9 certifik\u00e1ty\u00A6Lib\u00e9rsk\u00fd dol\u00e1r\u00A6Alb\u00e1nsky valutov\u00fd lek\u00A6Chorv\u00e1tska kuna\u00A6Reunion frank\u00A6Chorv\u00e1tsky din\u00e1r\u00A6Alb\u00e1nsky lek\u00A6Jersey libra\u00A6Alb\u00e1nsky lek (1946-1961)\u00A6Maced\u00f3nsky den\u00e1r (1992-1993)\u00A6Severovietnamsk\u00fd Viet Minh Piastre Dong Viet\u00A6Severovietnamsk\u00fd nov\u00fd Dong\u00A6Maced\u00f3nsky den\u00e1r\u00A6Severovietnamsk\u00fd Piastre Dong Viet\u00A6Timorsk\u00e1 pataca\u00A6CFP frank\u00A6Belgick\u00fd frank (finan\u010dn\u00fd)\u00A6Guinea-Bissau peso\u00A6Kuvaitsk\u00fd din\u00e1r\u00A6Portugalsk\u00e9 Guinea Mil Reis\u00A6Belgick\u00fd frank\u00A6Timorsk\u00e9 eskudo\u00A6Belgick\u00fd frank (konvertibiln\u00fd)\u00A6Portugalsk\u00e1 Guinea eskudo\u00A6El Salvadorsk\u00fd colon\u00A6Curacao guilder\u00A6Banglad\u00e9\u0161ska taka\u00A6Tonga libra\u00A6Tonga Pa\u02bbanga\u00A6CFA frank BCEAO\u00A6Sovietsk\u00fd rube\u013e\u00A6Sovietsk\u00fd nov\u00fd rube\u013e\u00A6New Caledonia frank Germinal\u00A6Cape Verde eskudo\u00A6Franc\u00fazske Antilly CFA frank\u00A6Juhoafrick\u00fd rand\u00A6Dominik\u00e1nske peso\u00A6Kub\u00e1nske certifik\u00e1ty\u00A6Juhoafrick\u00e1 libra\u00A6Juhoafrick\u00fd rand (financial)\u00A6Tunisk\u00fd din\u00e1r\u00A6Kub\u00e1nske peso\u00A6Franc\u00fazska Guyana frank Guiana\u00A6Ugandsk\u00fd \u0161iling\u00A6Ceylonsk\u00e1 rupia\u00A6Affars a Issas frank\u00A6Vatik\u00e1nska lira\u00A6Sao Tome a Principe eskudo\u00A6Ugandan \u0161iling (1966-1987)\u00A6Sao Tome a Principe dobra\u00A6Marshall Islands dol\u00e1r\u00A6Nikaragujsk\u00e1 libra\u00A6Z\u00e1padn\u00e1 Samoa tala\u00A6Z\u00e1padn\u00e1 Samoa libra\u00A6Hodurask\u00e1 lempira\u00A6Franc\u00fazsky Metropolitan Nouveau frank\u00A6Turkm\u00e9nsky manat\u00A6Guatemalsk\u00fd quetzal\u00A6Novoz\u00e9landsk\u00fd dol\u00e1r\u00A6\u0160k\u00f3tska libra\u00A6Barbadosk\u00fd dol\u00e1r\u00A6Namibsk\u00fd dol\u00e1r\u00A6Madagaskarsk\u00fd frank\u00A6Madagaskarsk\u00fd ariary\u00A6Egyptsk\u00e1 libra\u00A6Britisk\u00fd Hondurask\u00fd dol\u00e1r\u00A6Polsk\u00fd zloty (1950-1995)\u00A6Bosniansk\u00fd nov\u00fd din\u00e1r\u00A6Polsk\u00e9 certifik\u00e1ty v  US dol\u00e1roch\u00A6Bosniansk\u00fd konvertibiln\u00e1 marka\u00A6Belize dol\u00e1r\u00A6Bosniansk\u00fd din\u00e1r\u00A6Polsk\u00fd zloty\u00A6Jemensk\u00fd rial\u00A6Surinamsk\u00fd guilder\u00A6\u010ceskoslovensk\u00e1 koruna\u00A6Juhok\u00f3rejsk\u00fd won\u00A6Belarussian rube\u013e\u00A6Jemensk\u00fd Imadi Riyal\u00A6Belarussian rube\u013e (1992-1994)\u00A6\u010ceskoslovensk\u00e1 koruna\u00A6Juhok\u00f3rejsk\u00fd star\u00fd won\u00A6Juhok\u00f3rejsk\u00fd hwan\u00A6Belarussian nov\u00fd rube\u013e (1994-1999)\u00A6Som\u00e1lsky \u0161iling\u00A6Gr\u00e9cka nov\u00e1 drachma\u00A6Pakistansk\u00e1 rupia\u00A6Zimbabsk\u00fd dol\u00e1r\u00A6\u0160rilansk\u00e1 rupia\u00A6Gr\u00e9cka drachma\u00A6\u00cdrska libra\u00A6Jemensk\u00fd din\u00e1r\u00A6Rwandsk\u00fd frank\u00A6Kostariksk\u00fd colon\u00A6Tad\u017eikistansk\u00fd somoni\u00A6Tad\u017eikistansk\u00fd rube\u013e\u00A6Est\u00f3nska kroon\u00A6Rovn\u00edkov\u00e1 Guinea Peseta Guineana\u00A6Moldavsk\u00fd rube\u013e\u00A6Hong Kongsk\u00fd dol\u00e1r\u00A6D\u00e1nska krone\u00A6Moldavsk\u00fd leu\u00A6Rovn\u00edkov\u00e1 Guinea franko\u00A6Rovn\u00edkov\u00e1 Guinea Ekwele Guineana\u00A6Indon\u00e9zska rupia\u00A6UAE dirham\u00A6Severok\u00f3rejsk\u00fd won\u00A6Indon\u00e9zska nov\u00e1 rupia\u00A6Botswanan Pula\u00A6Moldavsk\u00fd Leu Cupon\u00A6Indon\u00e9zska Java rupia\u00A6Severok\u00f3rejsk\u00fd won\u00A6Indon\u00e9zsky nica guilder\u00A6Vanuatu vatu\u00A6Islamsk\u00fd din\u00e1r\u00A6Som\u00e1lsky \u0161iling\u00A6Andorsk\u00e1 peseta\u00A6Rusk\u00fd rube\u013e (1991-1998)\u00A6Guadeloupsk\u00fd frank\u00A6D\u017eibutsk\u00fd frank\u00A6Andorsk\u00fd diner\u00A6Monack\u00fd frank Germinal\u00A6Monack\u00fd frank Nouveau\u00A6Ekuadorsk\u00fd Unidad de Valor Constante (UVC)\u00A6Ekuadorsk\u00fd sucre\u00A6Lichten\u0161teinsk\u00fd frank\u00A6Rusk\u00fd rube\u013e\u00A6Filip\u00ednske peso\u00A6Uzbekistansk\u00fd sum\u00A6Colombijsk\u00e9 peso\u00A6Thajsk\u00fd b\u00e1t\u00A6Severo\u00edrska libra\u00A6Burmese rupia\u00A6Kon\u017esk\u00fd CFA frank\u00A6Burmese Kyat\u00A6Colombijsk\u00e9 papierov\u00e9 peso\u00A6Uzbekistansk\u00fd Coupon Som\u00A6Ukrainsk\u00fd karbovanetz\u00A6Qatarsk\u00fd rial\u00A6Ukrainsk\u00e1 hrivna\u00A6Guinejsk\u00fd syli\u00A6\u010c\u00ednsky Yuan Renminbi\u00A6Mozambijsk\u00e9 metical\u00A6\u010c\u00ednsky certifik\u00e1ty v US dol\u00e1roch\u00A6Uruguajsk\u00e9 peso Uruguayo\u00A6Guinejsk\u00fd frank (1960-1972)\u00A6San Marino lira\u00A6Mozambijsk\u00e9 eskudo\u00A6\u010c\u00ednsky Jen Min Piao Yuan\u00A6Guinejsk\u00fd frank\u00A6Om\u00e1nsk\u00fd rial Saidi\u00A6Papua Nov\u00e1 Guinea kina\u00A6Om\u00e1nsk\u00fd rial\u00A6Uruguajsk\u00e9 peso (1975-1993)\u00A6Franc\u00fazsky UIC-frank\u00A6Bhutan rupia\u00A6Zairsk\u00fd Zaire\u00A6Marock\u00fd frank\u00A6Marock\u00fd dirham\u00A6Bhutansky ngultrum\u00A6Franc\u00fazsky zlat\u00fd frank\u00A6Uruguajsk\u00e9 peso Fuerte\u00A6Malajsk\u00fd ringgit\u00A6Zairsk\u00fd nov\u00fd zaire\u00A6Azerbaid\u017eansk\u00fd manat\u00A6Gambsk\u00e1 libra\u00A6Comoro frank\u00A6Sierra Leone Leone\u00A6Gambsk\u00fd dalasi\u00A6Bahamsk\u00e1 libra\u00A6Camerunsk\u00fd CFA frank\u00A6Mexick\u00e9 Unidad de Inversion (UDI)\u00A6CFA frank BCEAEC\u00A6Bahamsk\u00fd dol\u00e1r\u00A6Mexick\u00e9 striborn\u00e9 peso (1861-1992)\u00A6Mexick\u00e9 peso\u00A6Peruvsk\u00fd sol\u00A6Gr\u00f3nsky krone\u00A6Braz\u00edlske cruzeiro (1942-1967)\u00A6Peruvsk\u00fd sol Nuevo\u00A6\u010c\u00edlske peso\u00A6Slovensk\u00e1 koruna\u00A6Peruvsk\u00fd inti\u00A6Braz\u00edlske cruzeiro\u00A6\u0160peci\u00e1lne pr\u00e1va \u010derpania\u00A6Franc\u00fazsky frank Germinal/frank Poincare\u00A6Franc\u00fazsky frank\u00A6Braz\u00edlske Cruzado Novo\u00A6\u010c\u00edlske Unidades de Fomento\u00A6\u010c\u00edlske eskudo\u00A6Boliv\u00edjsky real\u00A6\u010c\u00edlsky condor\u00A6Boliv\u00edjske cruzeiro (1990-1993)\u00A6Nemeck\u00e1 sperrmarka\u00A6Malavsk\u00e1 libra\u00A6Boliv\u00edjske cruzado\u00A6Boliv\u00edjske Cruzeiro Novo (1967-1986)\u00A6Malavsk\u00e1 kwacha\u00A6Transdniestria rube\u013e\u00A6Nemeck\u00e1 marka\u00A6Chadsk\u00fd CFA frank\u00A6Transdniestria nov\u00fd rube\u013e\u00A6Transdniestria rube\u013e Kupon\u00A6Nep\u00e1lska rupia\u00A6Cook Islands dol\u00e1r\u00A6Japonsk\u00fd yen\u00A6Maldivsk\u00e1 rufiyaa\u00A6CFA Nouveau frank\u00A6Maldivsk\u00e1 rupia\u00A6East Caribbean dol\u00e1r\u00A6Slovinsk\u00fd Tolar\u00A6Juhosl\u00e1vsky din\u00e1r\u00A6Arubsk\u00fd guilder\u00A6Juhosl\u00e1vsky okt\u00f3brov\u00fd din\u00e1r\u00A6V\u00fdchodonemeck\u00e1 marka\u00A6Juhosl\u00e1vsky din\u00e1r\u00A6Juhosl\u00e1vsky Noviy din\u00e1r\u00A6Turks a Caicos Crown\u00A6Juhosl\u00e1vsky din\u00e1r\u00A6Juhosl\u00e1vsky din\u00e1r\u00A6Rumunsk\u00fd nov\u00fd leu\u00A6Juhosl\u00e1vsky din\u00e1r\u00A6Rumunsk\u00fd leu\u00A6Slovinsk\u00fd tolar Bons\u00A6N\u00f3rksy krone\u00A6Mauritsk\u00e1 rupia\u00A6Gibraltarsk\u00e1 libra\u00A6Vietnamsk\u00fd n\u00e1rodn\u00fd dong\u00A6Vietnamsk\u00fd dong\u00A6Kiribati dol\u00e1r\u00A6Libra\u00A6Vietnamsk\u00fd nov\u00fd dong";

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

  private static final String currenciesSymbolKeys = "JOD\u00A6BOV\u00A6XAU\u00A6FOK\u00A6LBP\u00A6VND\u00A6TZS\u00A6BOP\u00A6KHR\u00A6KHO\u00A6ZMP\u00A6AUP\u00A6XAF\u00A6MTP\u00A6GHR\u00A6ZMK\u00A6GHP\u00A6GHO\u00A6MTL\u00A6AUD\u00A6USS\u00A6USN\u00A6GHC\u00A6SGD\u00A6PAB\u00A6LAK\u00A6KGS\u00A6CHF\u00A6ATS\u00A6USD\u00A6ETD\u00A6BND\u00A6JMP\u00A6ETB\u00A6DZG\u00A6DZF\u00A6DZD\u00A6PYG\u00A6LYP\u00A6JMD\u00A6ISK\u00A6ESP\u00A6BMP\u00A6LYD\u00A6LYB\u00A6BMD\u00A6NLG\u00A6MRO\u00A6IRR\u00A6SEK\u00A6ERN\u00A6KES\u00A6CFF\u00A6ARS\u00A6ARP\u00A6ARM\u00A6TWD\u00A6SDP\u00A6GEL\u00A6GEK\u00A6MQF\u00A6FKP\u00A6ARA\u00A6SDD\u00A6IQD\u00A6TVD\u00A6SCR\u00A6LVR\u00A6FJP\u00A6LVL\u00A6CDL\u00A6CDG\u00A6CDF\u00A6FJD\u00A6NIO\u00A6MOP\u00A6NIG\u00A6NIC\u00A6XTR\u00A6FIN\u00A6FIM\u00A6SBD\u00A6LUF\u00A6TTO\u00A6AOS\u00A6AOR\u00A6MNT\u00A6HUF\u00A6BIF\u00A6AON\u00A6AOK\u00A6TTD\u00A6SZL\u00A6NHF\u00A6SAS\u00A6SAR\u00A6LTT\u00A6INR\u00A6PTE\u00A6AOA\u00A6PTC\u00A6LTL\u00A6KZT\u00A6KZR\u00A6VGD\u00A6NGP\u00A6MMX\u00A6NGN\u00A6HTG\u00A6SYP\u00A6PSP\u00A6BHD\u00A6MMK\u00A6ANG\u00A6CZK\u00A6IMP\u00A6BGX\u00A6LSL\u00A6GAF\u00A6BGO\u00A6BGN\u00A6BGM\u00A6CAD\u00A6BGL\u00A6TRL\u00A6KYD\u00A6CYP\u00A6ILS\u00A6GYD\u00A6AMD\u00A6ILP\u00A6MLF\u00A6ILL\u00A6VEB\u00A6ALX\u00A6LRD\u00A6ALV\u00A6HRK\u00A6REF\u00A6HRD\u00A6ALL\u00A6JEP\u00A6ALK\u00A6MKN\u00A6VDP\u00A6VDN\u00A6MKD\u00A6VDD\u00A6TPP\u00A6XPF\u00A6BEL\u00A6GWP\u00A6KWD\u00A6GWM\u00A6BEF\u00A6TPE\u00A6BEC\u00A6GWE\u00A6SVC\u00A6CWG\u00A6BDT\u00A6TOS\u00A6TOP\u00A6XOF\u00A6SUR\u00A6SUN\u00A6NCF\u00A6CVE\u00A6XNF\u00A6ZAR\u00A6DOP\u00A6CUX\u00A6ZAP\u00A6ZAL\u00A6TND\u00A6CUP\u00A6GUF\u00A6UGX\u00A6LNR\u00A6AIF\u00A6VAL\u00A6STE\u00A6UGS\u00A6STD\u00A6MHD\u00A6NZP\u00A6WST\u00A6WSP\u00A6HNL\u00A6XMF\u00A6TMM\u00A6GTQ\u00A6NZD\u00A6SSP\u00A6BBD\u00A6NAD\u00A6MGF\u00A6MGA\u00A6EGP\u00A6BZH\u00A6PLZ\u00A6BAN\u00A6PLX\u00A6BAM\u00A6BZD\u00A6BAD\u00A6PLN\u00A6YER\u00A6SRG\u00A6CSK\u00A6KRW\u00A6BYR\u00A6YEI\u00A6BYL\u00A6CSC\u00A6KRO\u00A6KRH\u00A6BYB\u00A6SQS\u00A6GRN\u00A6PKR\u00A6ZWD\u00A6LKR\u00A6GRD\u00A6IEP\u00A6YDD\u00A6RWF\u00A6CRC\u00A6TJS\u00A6TJR\u00A6EEK\u00A6GQP\u00A6MDR\u00A6HKD\u00A6DKK\u00A6MDL\u00A6GQF\u00A6GQE\u00A6IDR\u00A6AED\u00A6KPW\u00A6IDN\u00A6BWP\u00A6MDC\u00A6IDJ\u00A6KPP\u00A6IDG\u00A6VUV\u00A6XID\u00A6SOS\u00A6ADP\u00A6RUR\u00A6GPF\u00A6DJF\u00A6ADD\u00A6MCG\u00A6MCF\u00A6ECV\u00A6ECS\u00A6LIF\u00A6RUB\u00A6PHP\u00A6UZS\u00A6COP\u00A6THB\u00A6IBP\u00A6BUR\u00A6COF\u00A6BUK\u00A6COB\u00A6UZC\u00A6UAK\u00A6QAR\u00A6UAH\u00A6GNS\u00A6CNY\u00A6MZM\u00A6CNX\u00A6UYU\u00A6GNI\u00A6SML\u00A6MZE\u00A6CNP\u00A6PGK\u00A6OMS\u00A6GNF\u00A6OMR\u00A6UYP\u00A6XFU\u00A6BTR\u00A6ZRZ\u00A6MAF\u00A6MAD\u00A6BTN\u00A6XFO\u00A6UYF\u00A6MYR\u00A6ZRN\u00A6AZM\u00A6GMP\u00A6KMF\u00A6SLL\u00A6GMD\u00A6BSP\u00A6CMF\u00A6MXV\u00A6XEF\u00A6BSD\u00A6MXP\u00A6MXN\u00A6PES\u00A6GLK\u00A6BRZ\u00A6PEN\u00A6CLP\u00A6SKK\u00A6PEI\u00A6BRR\u00A6XDR\u00A6FRG\u00A6FRF\u00A6BRN\u00A6CLF\u00A6CLE\u00A6BRL\u00A6CLC\u00A6BRE\u00A6DES\u00A6MWP\u00A6BRC\u00A6BRB\u00A6MWK\u00A6PDR\u00A6DEM\u00A6TDF\u00A6PDN\u00A6PDK\u00A6NPR\u00A6CKD\u00A6MVR\u00A6XCF\u00A6MVP\u00A6XCD\u00A6SIT\u00A6YUR\u00A6AWG\u00A6YUO\u00A6DDM\u00A6YUN\u00A6YUM\u00A6TCC\u00A6YUG\u00A6YUF\u00A6RON\u00A6YUD\u00A6ROL\u00A6SIB\u00A6NOK\u00A6MUR\u00A6GIP\u00A6VNS\u00A6VNR\u00A6KID\u00A6SHP\u00A6VNN";

  private static final String currenciesSymbolValues = "JD\u00A6BOV\u00A6XAU\u00A6FOK\u00A6LL\u00A6VND\u00A6T Sh\u00A6BOP\u00A6CR\u00A6KHO\u00A6ZMP\u00A6AUP\u00A6XAF\u00A6MTP\u00A6GHR\u00A6ZMK\u00A6GHP\u00A6GHO\u00A6Lm\u00A6$A\u00A6USS\u00A6USN\u00A6GHC\u00A6S$\u00A6PAB\u00A6LAK\u00A6som\u00A6SwF\u00A6ATS\u00A6US$\u00A6ETD\u00A6BND\u00A6JMP\u00A6Br\u00A6DZG\u00A6DZF\u00A6DA\u00A6PYG\u00A6LYP\u00A6J$\u00A6ISK\u00A6ESP\u00A6BMP\u00A6LD\u00A6LYB\u00A6Ber$\u00A6NLG\u00A6UM\u00A6RI\u00A6SKr\u00A6ERN\u00A6K Sh\u00A6CFF\u00A6Arg$\u00A6ARP\u00A6ARM\u00A6NT$\u00A6SDP\u00A6lari\u00A6GEK\u00A6MQF\u00A6FKP\u00A6ARA\u00A6SDD\u00A6ID\u00A6TVD\u00A6SR\u00A6LVR\u00A6FJP\u00A6LVL\u00A6CDL\u00A6CDG\u00A6CDF\u00A6F$\u00A6NIO\u00A6MOP\u00A6NIG\u00A6NIC\u00A6XTR\u00A6FIN\u00A6FIM\u00A6SI$\u00A6LUF\u00A6TTO\u00A6AOS\u00A6AOR\u00A6Tug\u00A6Ft\u00A6Fbu\u00A6AON\u00A6AOK\u00A6TT$\u00A6E\u00A6NHF\u00A6SAS\u00A6SRl\u00A6LTT\u00A6INR\u00A6PTE\u00A6AOA\u00A6PTC\u00A6LTL\u00A6T\u00A6KZR\u00A6VGD\u00A6NGP\u00A6MMX\u00A6NGN\u00A6HTG\u00A6LS\u00A6PSP\u00A6BD\u00A6MMK\u00A6NA f.\u00A6CZK\u00A6IMP\u00A6BGX\u00A6M\u00A6GAF\u00A6BGO\u00A6BGN\u00A6BGM\u00A6Can$\u00A6lev\u00A6TL\u00A6KYD\u00A6\u00a3C\u00A6ILS\u00A6G$\u00A6dram\u00A6ILP\u00A6MLF\u00A6ILL\u00A6Be\u00A6ALX\u00A6LRD\u00A6ALV\u00A6HRK\u00A6REF\u00A6HRD\u00A6lek\u00A6JEP\u00A6ALK\u00A6MKN\u00A6VDP\u00A6VDN\u00A6MDen\u00A6VDD\u00A6TPP\u00A6CFPF\u00A6BEL\u00A6GWP\u00A6KD\u00A6GWM\u00A6BF\u00A6TPE\u00A6BEC\u00A6GWE\u00A6SVC\u00A6CWG\u00A6Tk\u00A6TOS\u00A6T$\u00A6XOF\u00A6SUR\u00A6SUN\u00A6NCF\u00A6CVEsc\u00A6XNF\u00A6R\u00A6RD$\u00A6CUX\u00A6ZAP\u00A6ZAL\u00A6TND\u00A6CUP\u00A6GUF\u00A6U Sh\u00A6LNR\u00A6AIF\u00A6VAL\u00A6STE\u00A6UGS\u00A6Db\u00A6MHD\u00A6NZP\u00A6WST\u00A6WSP\u00A6L\u00A6XMF\u00A6TMM\u00A6Q\u00A6$NZ\u00A6SSP\u00A6BDS$\u00A6N$\u00A6MGF\u00A6MGA\u00A6EGP\u00A6BZH\u00A6PLZ\u00A6BAN\u00A6PLX\u00A6KM\u00A6BZ$\u00A6BAD\u00A6Zl\u00A6YRl\u00A6Sf\u00A6CSK\u00A6KRW\u00A6Rbl\u00A6YEI\u00A6BYL\u00A6CSC\u00A6KRO\u00A6KRH\u00A6BYB\u00A6SQS\u00A6GRN\u00A6Pra\u00A6Z$\u00A6SL Re\u00A6GRD\u00A6IR\u00a3\u00A6YDD\u00A6RWF\u00A6C\u00A6TJS\u00A6TJR\u00A6EEK\u00A6GQP\u00A6MDR\u00A6HK$\u00A6DKr\u00A6MDL\u00A6GQF\u00A6GQE\u00A6Rp\u00A6AED\u00A6KPW\u00A6IDN\u00A6BWP\u00A6MDC\u00A6IDJ\u00A6KPP\u00A6IDG\u00A6VT\u00A6XID\u00A6So. Sh.\u00A6ADP\u00A6RUR\u00A6GPF\u00A6DF\u00A6ADD\u00A6MCG\u00A6MCF\u00A6ECV\u00A6ECS\u00A6LIF\u00A6RUB\u00A6PHP\u00A6UZS\u00A6Col$\u00A6THB\u00A6IBP\u00A6BUR\u00A6COF\u00A6BUK\u00A6COB\u00A6UZC\u00A6UAK\u00A6QR\u00A6UAH\u00A6GNS\u00A6Y\u00A6Mt\u00A6CNX\u00A6Ur$\u00A6GNI\u00A6SML\u00A6MZE\u00A6CNP\u00A6PGK\u00A6OMS\u00A6GF\u00A6RO\u00A6UYP\u00A6XFU\u00A6BTR\u00A6ZRZ\u00A6MAF\u00A6MAD\u00A6Nu\u00A6XFO\u00A6UYF\u00A6RM\u00A6ZRN\u00A6AZM\u00A6GMP\u00A6CF\u00A6SLL\u00A6GMD\u00A6BSP\u00A6CMF\u00A6MXV\u00A6XEF\u00A6BSD\u00A6MXP\u00A6MEX$\u00A6PES\u00A6GLK\u00A6BRZ\u00A6PEN\u00A6Ch$\u00A6Sk\u00A6PEI\u00A6BRR\u00A6XDR\u00A6FRG\u00A6FRF\u00A6BRN\u00A6CLF\u00A6CLE\u00A6R$\u00A6CLC\u00A6BRE\u00A6DES\u00A6MWP\u00A6BRC\u00A6BRB\u00A6MK\u00A6PDR\u00A6DEM\u00A6TDF\u00A6PDN\u00A6PDK\u00A6Nrs\u00A6CKD\u00A6MVR\u00A6XCF\u00A6MVP\u00A6EC$\u00A6SIT\u00A6YUR\u00A6AWG\u00A6YUO\u00A6DDM\u00A6YUN\u00A6YUM\u00A6TCC\u00A6YUG\u00A6YUF\u00A6RON\u00A6YUD\u00A6leu\u00A6SIB\u00A6NKr\u00A6MUR\u00A6GIP\u00A6VNS\u00A6VNR\u00A6KID\u00A6SHP\u00A6VNN";

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
    "jan",
    "feb",
    "mar",
    "apr",
    "m\u00e1j",
    "j\u00fan",
    "j\u00fal",
    "aug",
    "sep",
    "okt",
    "nov",
    "dec",
    null,
  };

  private static final String[] months = {
    "janu\u00e1r",
    "febru\u00e1r",
    "marec",
    "apr\u00edl",
    "m\u00e1j",
    "j\u00fan",
    "j\u00fal",
    "august",
    "september",
    "okt\u00f3ber",
    "november",
    "december",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "Ne",
    "Po",
    "Ut",
    "St",
    "\u0160t",
    "Pi",
    "So",
  };

  private static final String[] weekdays = {
    null,
    "Nede\u013ea",
    "Pondelok",
    "Utorok",
    "Streda",
    "\u0160tvrtok",
    "Piatok",
    "Sobota",
  };

  private static final String[] eras = {
    "pred n.l.",
    "n.l.",
  };

  private static final String territoriesKeys = "TL\u00A6TK\u00A6TJ\u00A6TH\u00A6TG\u00A6TF\u00A6GY\u00A6TD\u00A6TC\u00A6GW\u00A6GU\u00A6GT\u00A6GS\u00A6GR\u00A6GQ\u00A6GP\u00A6SZ\u00A6SY\u00A6GN\u00A6GM\u00A6GL\u00A6SV\u00A6ST\u00A6GI\u00A6GH\u00A6SR\u00A6GF\u00A6GE\u00A6SO\u00A6GD\u00A6SN\u00A6SM\u00A6GB\u00A6SL\u00A6GA\u00A6SK\u00A6SJ\u00A6SI\u00A6SH\u00A6SG\u00A6SE\u00A6SD\u00A6SC\u00A6SB\u00A6SA\u00A6FR\u00A6FO\u00A6FM\u00A6RW\u00A6FK\u00A6RU\u00A6FJ\u00A6FI\u00A6RO\u00A6RE\u00A6ET\u00A6ES\u00A6ER\u00A6EH\u00A6EG\u00A6EE\u00A6EC\u00A6DZ\u00A6QA\u00A6DO\u00A6PY\u00A6DM\u00A6PW\u00A6DK\u00A6DJ\u00A6PT\u00A6PS\u00A6PR\u00A6DE\u00A6PN\u00A6PM\u00A6PL\u00A6PK\u00A6PH\u00A6PG\u00A6PF\u00A6CZ\u00A6PE\u00A6CY\u00A6CX\u00A6CV\u00A6PA\u00A6CU\u00A6CR\u00A6CO\u00A6CN\u00A6CM\u00A6CL\u00A6CK\u00A6CI\u00A6CH\u00A6CG\u00A6CF\u00A6CD\u00A6CC\u00A6OM\u00A6CA\u00A6BZ\u00A6BY\u00A6BW\u00A6BV\u00A6BT\u00A6BS\u00A6BR\u00A6NZ\u00A6BO\u00A6BN\u00A6BM\u00A6NU\u00A6BJ\u00A6BI\u00A6BH\u00A6NR\u00A6BG\u00A6BF\u00A6NP\u00A6BE\u00A6NO\u00A6BD\u00A6BB\u00A6ZW\u00A6NL\u00A6BA\u00A6NI\u00A6NG\u00A6NF\u00A6AZ\u00A6NE\u00A6NC\u00A6AW\u00A6ZM\u00A6NA\u00A6AU\u00A6AT\u00A6AS\u00A6AR\u00A6AQ\u00A6MZ\u00A6AO\u00A6MY\u00A6AN\u00A6MX\u00A6AM\u00A6MW\u00A6AL\u00A6MV\u00A6ZA\u00A6MU\u00A6MT\u00A6AI\u00A6MS\u00A6MR\u00A6AG\u00A6MQ\u00A6AF\u00A6MP\u00A6AE\u00A6MO\u00A6AD\u00A6MN\u00A6MM\u00A6ML\u00A6MK\u00A6YU\u00A6YT\u00A6MH\u00A6MG\u00A6MD\u00A6MC\u00A6MA\u00A6YE\u00A6LY\u00A6LV\u00A6LU\u00A6LT\u00A6LS\u00A6LR\u00A6LK\u00A6LI\u00A6LC\u00A6LB\u00A6LA\u00A6KZ\u00A6KY\u00A6KW\u00A6KR\u00A6KP\u00A6KN\u00A6KM\u00A6KI\u00A6WS\u00A6KH\u00A6KG\u00A6KE\u00A6WF\u00A6JP\u00A6JO\u00A6JM\u00A6VU\u00A6VN\u00A6VI\u00A6VG\u00A6VE\u00A6VC\u00A6VA\u00A6IT\u00A6IS\u00A6IR\u00A6IQ\u00A6UZ\u00A6IO\u00A6UY\u00A6IN\u00A6IL\u00A6US\u00A6IE\u00A6ID\u00A6UM\u00A6UG\u00A6UA\u00A6HU\u00A6HT\u00A6HR\u00A6TZ\u00A6HN\u00A6HM\u00A6TW\u00A6TV\u00A6HK\u00A6TT\u00A6TR\u00A6TO\u00A6TN\u00A6TM";

  private static final String territoriesValues = "V\u00fdchodn\u00fd Timor\u00A6Tokelau\u00A6Tad\u017eikistan\u00A6Thajsko\u00A6Togo\u00A6Franc\u00fazske ju\u017en\u00e9 \u00fazemia\u00A6Guayana\u00A6\u010cad\u00A6Turks a Caicos\u00A6Guinea-Bissau\u00A6Guam\u00A6Guatemala\u00A6Ju\u017en\u00e1 Georgia a Ju\u017en\u00e9 Sandwichove ostrovy\u00A6Gr\u00e9cko\u00A6Rovn\u00edkov\u00e1 Guinea\u00A6Guadeloupe\u00A6Svazijsko\u00A6S\u00fdrska arabsk\u00e1 republika\u00A6Guinea\u00A6Gambia\u00A6Gr\u00f3nsko\u00A6Salvador\u00A6Sv\u00e4t\u00fd Tom\u00e1\u0161 a Princove ostrovy\u00A6Gibralt\u00e1r\u00A6Ghana\u00A6Surinam\u00A6Franc\u00fazska Guayana\u00A6Gruz\u00ednsko\u00A6Som\u00e1lsko\u00A6Grenada\u00A6Senegal\u00A6San Mar\u00edno\u00A6Spojen\u00e9 kr\u00e1\u013eovstvo\u00A6Sierra Leone\u00A6Gabon\u00A6Slovensk\u00e1 republika\u00A6\u0160picbergy a Jan Mayen\u00A6Slovinsko\u00A6Sv\u00e4t\u00e1 Helena\u00A6Singapur\u00A6\u0160v\u00e9dsko\u00A6Sud\u00e1n\u00A6Seychelsk\u00e9 ostrovy\u00A6\u0160alam\u00fanove ostrovy\u00A6Saudsk\u00e1 Ar\u00e1bia\u00A6Franc\u00fazsko\u00A6Faersk\u00e9 ostrovy\u00A6Mikron\u00e9zia, Federat\u00edvne \u0161t\u00e1ty\u00A6Rwanda\u00A6Falklandsk\u00e9 ostrovy\u00A6Rusk\u00e1 feder\u00e1cia\u00A6Fid\u017ei\u00A6F\u00ednsko\u00A6Rumunsko\u00A6Reunion\u00A6Eti\u00f3pia\u00A6\u0160panielsko\u00A6Eritrea\u00A6Z\u00e1padn\u00e1 Sahara\u00A6Egypt\u00A6Est\u00f3nsko\u00A6Ekv\u00e1dor\u00A6Al\u017e\u00edrsko\u00A6Katar\u00A6Dominik\u00e1nska republika\u00A6Paraguaj\u00A6Dominika\u00A6Palau\u00A6D\u00e1nsko\u00A6D\u017eibuti\u00A6Portugalsko\u00A6Palest\u00ednske \u00fazemie\u00A6Portoriko\u00A6Nemecko\u00A6Pitcairnove ostrovy\u00A6Saint Pierre a Miquelon\u00A6Po\u013esko\u00A6Pakistan\u00A6Filip\u00edny\u00A6Papua Nov\u00e1 Guinea\u00A6Franc\u00fazska Polyn\u00e9zia\u00A6\u010cesk\u00e1 republika\u00A6Peru\u00A6Cyprus\u00A6Viano\u010dn\u00fd ostrov\u00A6Kapverdy\u00A6Panama\u00A6Kuba\u00A6Kostarika\u00A6Kolumbia\u00A6\u010c\u00edna\u00A6Kamerun\u00A6\u010cile\u00A6Cookove ostrovy\u00A6Pobre\u017eie Slonoviny\u00A6\u0160vaj\u010diarsko\u00A6Kongo\u00A6Stredoafrick\u00e1 republika\u00A6Kon\u017esk\u00e1 demokratick\u00e1 republika\u00A6Kokosov\u00e9 (Keelingove) ostrovy\u00A6Om\u00e1n\u00A6Kanada\u00A6Belize\u00A6Bielorusko\u00A6Botswana\u00A6Bouvetov ostrov\u00A6But\u00e1n\u00A6Bahamy\u00A6Braz\u00edlia\u00A6Nov\u00fd Z\u00e9land\u00A6Bol\u00edvia\u00A6Brunej\u00A6Bermudy\u00A6Niue\u00A6Benin\u00A6Burundi\u00A6Bahrajn\u00A6Nauru\u00A6Bulharsko\u00A6Burkina Faso\u00A6Nep\u00e1l\u00A6Belgicko\u00A6N\u00f3rsko\u00A6Banglad\u00e9\u0161\u00A6Barbados\u00A6Zimbabwe\u00A6Holandsko\u00A6Bosna a Hercegovina\u00A6Nikaragua\u00A6Nig\u00e9ria\u00A6Norfolkov ostrov\u00A6Azerbajd\u017ean\u00A6Niger\u00A6Nov\u00e1 Kaled\u00f3nia\u00A6Aruba\u00A6Zambia\u00A6Nam\u00edbia\u00A6Austr\u00e1lia\u00A6Rak\u00fasko\u00A6Americk\u00e1 Samoa\u00A6Argent\u00edna\u00A6Antarctica\u00A6Mozambik\u00A6Angola\u00A6Malajzia\u00A6Holandsk\u00e9 Antily\u00A6Mexiko\u00A6Arm\u00e9nsko\u00A6Malawi\u00A6Alb\u00e1nsko\u00A6Maldivy\u00A6Ju\u017en\u00e1 Afrika\u00A6Maur\u00edcius\u00A6Malta\u00A6Anguilla\u00A6Montserrat\u00A6Maurit\u00e1nia\u00A6Antigua a Barbados\u00A6Martinik\u00A6Afganistan\u00A6Severn\u00e9 Mari\u00e1ny\u00A6Spojen\u00e9 arabsk\u00e9 emir\u00e1ty\u00A6Makao S.A.R. \u010c\u00edny\u00A6Andorra\u00A6Mongolsko\u00A6Mjanmarsko\u00A6Mali\u00A6Maced\u00f3nsko, republika\u00A6Juhosl\u00e1via\u00A6Mayotte\u00A6Marshallove ostrovy\u00A6Madagaskar\u00A6Moldavsko, republika\u00A6Monako\u00A6Maroko\u00A6Jemen\u00A6L\u00fdbijsk\u00e1 arabsk\u00e1 d\u017eamah\u00edrija\u00A6Loty\u0161sko\u00A6Luxembursko\u00A6Litva\u00A6Lesotho\u00A6Lib\u00e9ria\u00A6Sr\u00ed Lanka\u00A6Lichten\u0161tajnsko\u00A6Sv\u00e4t\u00e1 Lucia\u00A6Libanon\u00A6Laosk\u00e1 \u013eudovodemokratick\u00e1 republika\u00A6Kazachstan\u00A6Kajmansk\u00e9 ostrovy\u00A6Kuvajt\u00A6K\u00f3rea, Ju\u017en\u00e1\u00A6K\u00f3rea, Severn\u00e1\u00A6Saint Kitts a Nevis\u00A6Komory\u00A6Kiribati\u00A6Samoa\u00A6Kambod\u017ea\u00A6Kirgizsko\u00A6Ke\u0148a\u00A6Wallis a Futuna\u00A6Japonsko\u00A6Jord\u00e1nsko\u00A6Jamajka\u00A6Vanuatu\u00A6Vietnam\u00A6Panensk\u00e9 ostrovy - USA\u00A6Britsk\u00e9 panensk\u00e9 ostrovy\u00A6Venezuela\u00A6Sv\u00e4t\u00fd Vincent a Grenad\u00edny\u00A6Sv\u00e4t\u00e1 stolica (Vatik\u00e1nsky mestsk\u00fd \u0161t\u00e1t)\u00A6Taliansko\u00A6Island\u00A6Ir\u00e1n\u00A6Irak\u00A6Uzbekistan\u00A6Britsk\u00e9 \u00fazemie v Indickom oce\u00e1ne\u00A6Uruguaj\u00A6India\u00A6Izrael\u00A6Spojen\u00e9 \u0161t\u00e1ty\u00A6\u00cdrsko\u00A6Indon\u00e9zia\u00A6Men\u0161ie od\u013eahl\u00e9 ostrovy USA\u00A6Uganda\u00A6Ukrajina\u00A6Ma\u010farsko\u00A6Haiti\u00A6Chorv\u00e1tsko\u00A6Tanz\u00e1nia\u00A6Honduras\u00A6Heardove ostrovy a McDonaldove ostrovy\u00A6Tajwan\u00A6Tuvalu\u00A6Hong Kong S.A.R. \u010c\u00edny\u00A6Trinidad a Tobago\u00A6Turecko\u00A6Tonga\u00A6Tunisko\u00A6Turkm\u00e9nsko";

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

  private static final String languagesValues = "japonsk\u00fd\u00A6anglick\u00fd\u00A6tureck\u00fd\u00A6k\u00f3rejsk\u00fd\u00A6n\u00f3rsky\u00A6gr\u00e9cky\u00A6holandsk\u00fd\u00A6bulharsk\u00fd\u00A6loty\u0161sk\u00fd\u00A6hebrejsk\u00fd\u00A6\u010desk\u00fd\u00A6taliansky\u00A6litovsk\u00fd\u00A6franc\u00fazsky\u00A6\u010d\u00ednsky\u00A6rusk\u00fd\u00A6rumunsk\u00fd\u00A6f\u00ednsky\u00A6arabsk\u00fd\u00A6\u0161v\u00e9dsky\u00A6portugalsk\u00fd\u00A6po\u013esk\u00fd\u00A6slovinsk\u00fd\u00A6slovensk\u00fd\u00A6nemeck\u00fd\u00A6ma\u010farsk\u00fd\u00A6est\u00f3nsky\u00A6\u0161panielsky\u00A6chorv\u00e1tsky\u00A6d\u00e1nsky";

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
    { "shortDateFormat", "d.M.yyyy" },
    { "mediumDateFormat", "d.M.yyyy" },
    { "longDateFormat", "d. MMMM yyyy" },
    { "fullDateFormat", "EEEE, d. MMMM yyyy" },
    { "shortTimeFormat", "H:mm" },
    { "mediumTimeFormat", "H:mm:ss" },
    { "longTimeFormat", "H:mm:ss z" },
    { "fullTimeFormat", "H:mm:ss z" },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
