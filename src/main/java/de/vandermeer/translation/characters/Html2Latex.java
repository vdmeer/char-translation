/* Copyright 2015 Sven van der Meer <vdmeer.sven@mykolab.com\>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.translation.characters;

import org.apache.commons.lang3.StringUtils;

import de.vandermeer.skb.interfaces.translators.CharacterTranslator;

/**
 * Translator for HTML characters to LaTeX.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt; - auto-generated by SKB Datatool from SKB CharacterMap data
 * @version    v0.0.1 build 160319 (19-Mar-16) for Java 1.7
 * @since      v0.0.1
 */
public class Html2Latex implements CharacterTranslator {

	/** Array of source strings. */
	protected String[] sourceArray = new String[]{
		"&#160;", "&nbsp;", "&#36;", "&#37;", "&#42;", "&#60;", "&lt;", "&#62;", "&gt;", "&#63;", "&#64;", "&#91;", "&#34;", "&quot;", "&#92;", "&#93;", "&#94;", "&circ;", "&#95;", "&#123;", "&#124;", "&#125;", "&#126;", "&tilde;", "&#161;", "&iexcl;", "&#162;", "&cent;", "&#163;", "&pound;", "&#164;", "&curren;", "&#167;", "&sect;", "&#168;", "&uml;", "&#169;", "&copy;", "&#170;", "&ordf;", "&#172;", "&not;", "&#174;", "&reg;", "&#175;", "&macr;", "&#176;", "&deg;", "&#177;", "&plusmn;", "&#178;", "&sup2;", "&#179;", "&sup3;", "&#181;", "&micro;", "&#182;", "&para;", "&#183;", "&middot;", "&#185;", "&sup1;", "&#186;", "&ordm;", "&#188;", "&frac14;", "&#189;", "&frac12;", "&#190;", "&frac34;", "&#191;", "&iquest;", "&#192;", "&Agrave;", "&#193;", "&Aacute;", "&#194;", "&Acirc;", "&#195;", "&Atilde;", "&#196;", "&Auml;", "&#197;", "&Aring;", "&#198;", "&AElig;", "&#199;", "&Ccedil;", "&#200;", "&Egrave;", "&#201;", "&Eacute;", "&#202;", "&Ecirc;", "&#203;", "&Euml;", "&#204;", "&Igrave;", "&#205;", "&Iacute;", "&#206;", "&Icirc;", "&#207;", "&Iuml;", "&#208;", "&ETH;", "&#209;", "&Ntilde;", "&#210;", "&Ograve;", "&#211;", "&Oacute;", "&#212;", "&Ocirc;", "&#213;", "&Otilde;", "&#214;", "&Ouml;", "&#215;", "&times;", "&#216;", "&Oslash;", "&#217;", "&Ugrave;", "&#218;", "&Uacute;", "&#219;", "&Ucirc;", "&#220;", "&Uuml;", "&#221;", "&Yacute;", "&#222;", "&THORN;", "&#223;", "&szlig;", "&#224;", "&agrave;", "&#225;", "&aacute;", "&#226;", "&acirc;", "&#227;", "&atilde;", "&#228;", "&auml;", "&#229;", "&aring;", "&#230;", "&aelig;", "&#231;", "&ccedil;", "&#232;", "&egrave;", "&#233;", "&eacute;", "&#234;", "&ecirc;", "&#235;", "&euml;", "&#236;", "&igrave;", "&#237;", "&iacute;", "&#238;", "&icirc;", "&#239;", "&iuml;", "&#240;", "&eth;", "&#241;", "&ntilde;", "&#242;", "&ograve;", "&#243;", "&oacute;", "&#244;", "&ocirc;", "&#245;", "&otilde;", "&#246;", "&ouml;", "&#247;", "&divide;", "&#248;", "&oslash", "&#249;", "&ugrave", "&#250;", "&uacute", "&#251;", "&ucirc;", "&#252;", "&uuml;", "&#253;", "&yacute;", "&#254;", "&thorn;", "&#255;", "&yuml;", "&#352;", "&Scaron;", "&#353;", "&scaron;", "&#376;", "&Yuml;", "&#710;", "&#732;", "&#913;", "&Alpha;", "&#914;", "Beta;", "&#915;", "&Gamma;", "&#916;", "&Delta;", "&#917;", "&Epsilon;", "&#918;", "&Zeta;", "&#919;", "&Eta;", "&#920;", "&Theta;", "&#921;", "&Iota;", "&#922;", "&Kappa;", "&#923;", "&Lambda;", "&#924;", "&Mu;", "&#925;", "&Nu;", "&#926;", "&Xi;", "&#927;", "&Omicron;", "&#928;", "&Pi;", "&#929;", "&Rho;", "&#931;", "&Sigma;", "&#932;", "&Tau;", "&#933;", "&Upsilon;", "&#934;", "&Phi;", "&#935;", "&Chi;", "&#936;", "&Psi;", "&#937;", "&Omega;", "&#945;", "&alpha;", "&#946;", "&beta;", "&#947;", "&gamma;", "&#948;", "&delta;", "&#949;", "&epsilon;", "&#950;", "&zeta;", "&#951;", "&eta;", "&#952;", "&theta;", "&#953;", "&iota;", "&#954;", "&kappa;", "&#955;", "&lambda;", "&#956;", "&mu;", "&#957;", "&nu;", "&#958;", "&xi;", "&#959;", "&omicron;", "&#960;", "&pi;", "&#961;", "&rho;", "&#962;", "&sigmaf;", "&#963;", "&sigma;", "&#964;", "&tau;", "&#965;", "&upsilon;", "&#966;", "&phi;", "&#967;", "&chi;", "&#968;", "&psi;", "&#969;", "&omega;", "&#977;", "&thetasym;", "&#982;", "&piv;", "&#8211;", "&ndash;", "&#8212;", "&mdash;", "&#8216;", "&lsquo;", "&#8217;", "&rsquo;", "&#8218;", "&sbquo;", "&#8220;", "&ldquo;", "&#8221;", "&rdquo;", "&#8224;", "&dagger;", "&#8225;", "&Dagger;", "&#8230;", "&hellip;", "&#8364;", "&euro;", "&#8482;", "&trade;", "&#8592;", "&larr;", "&#8593;", "&uarr;", "&#8594;", "&rarr;", "&#8595;", "&darr;", "&#8596;", "&harr;", "&#8656;", "&lArr;", "&#8657;", "&uArr;", "&#8658;", "&rArr;", "&#8659;", "&dArr;", "&#8660;", "&hArr;", "&#8704;", "&forall;", "&#8707;", "&exist;", "&#8712;", "&isin;", "&#8713;", "&notin;", "&#8719;", "&prod;", "&#8721;", "&sum;", "&#8734;", "&infin;", "&#8743;", "&and;", "&#8744;", "&or;", "&#8745;", "&cap;", "&#8746;", "&cup;", "&#8776;", "&asymp;", "&#8800;", "&ne;", "&#8804;", "&le;", "&#8805;", "&ge;"
	};

	/** Array of target strings. */
	protected String[] targetArray = new String[]{
		" ", " ", "\\$", "\\%", "\\textasteriskcentered", "\\textless", "\\textless", "\\textgreater", "\\textgreater", "\\?", "\\@", "\\[", "\"", "\"", "\\textbackslash", "\\]", "\\textasciicircum", "\\textasciicircum", "\\_", "\\{", "\\textbar", "\\}", "\\textasciitilde", "\\textasciitilde", "\\textexclamdown", "\\textexclamdown", "\\cent", "\\cent", "\\pounds", "\\pounds", "\\currency", "\\currency", "{\\S}", "{\\S}", "\\textasciidieresis", "\\textasciidieresis", "{\\copyright}", "{\\copyright}", "\\textordfeminine", "\\textordfeminine", "\\textlnot", "\\textlnot", "{\\textregistered}", "{\\textregistered}", "\\textasciimacron", "\\textasciimacron", "\\textdegree", "\\textdegree", "\\textpm", "\\textpm", "\\texttwosuperior", "\\texttwosuperior", "\\textthreesuperior", "\\textthreesuperior", "\\textmu", "\\textmu", "\\P", "\\P", "\\textperiodcentered", "\\textperiodcentered", "\\textonesuperior", "\\textonesuperior", "\\textordmasculine", "\\textordmasculine", "\\textonequarter", "\\textonequarter", "\\textonehalf", "\\textonehalf", "\\textthreequarters", "\\textthreequarters", "\\textquestiondown", "\\textquestiondown", "\\`{A}", "\\`{A}", "\\'{A}", "\\'{A}", "\\^{A}", "\\^{A}", "\\~{A}", "\\~{A}", "\\\"{A}", "\\\"{A}", "\\AA", "\\AA", "\\AE", "\\AE", "\\c{C}", "\\c{C}", "\\`{E}", "\\`{E}", "\\'{E}", "\\'{E}", "\\^{E}", "\\^{E}", "\\\"{E}", "\\\"{E}", "\\`{I}", "\\`{I}", "\\'{I}", "\\'{I}", "\\^{I}", "\\^{I}", "\\\"{I}", "\\\"{I}", "\\DH", "\\DH", "\\~{N}", "\\~{N}", "\\`{O}", "\\`{O}", "\\'{O}", "\\'{O}", "\\^{O}", "\\^{O}", "\\~{O}", "\\~{O}", "\\\"{O}", "\\\"{O}", "\\texttimes", "\\texttimes", "\\O", "\\O", "\\`{U}", "\\`{U}", "\\'{U}", "\\'{U}", "\\^{U}", "\\^{U}", "\\\"{U}", "\\\"{U}", "\\'{Y}", "\\'{Y}", "\\TH", "\\TH", "{\\ss}", "{\\ss}", "\\'{a}", "\\'{a}", "\\^{a}", "\\^{a}", "\\`{a}", "\\`{a}", "\\~{a}", "\\~{a}", "\\\"{a}", "\\\"{a}", "\\aa", "\\aa", "\\ae", "\\ae", "\\c{c}", "\\c{c}", "\\`{e}", "\\`{e}", "\\'{e}", "\\'{e}", "\\^{e}", "\\^{e}", "\\\"{e}", "\\\"{e}", "\\`{i}", "\\`{i}", "\\'{i}", "\\'{i}", "\\^{i}", "\\^{i}", "\\\"{i}", "\\\"{i}", "\\dh", "\\dh", "\\~{n}", "\\~{n}", "\\`{o}", "\\`{o}", "\\'{o}", "\\'{o}", "\\^{o}", "\\^{o}", "\\~{o}", "\\~{o}", "\\\"{o}", "\\\"{o}", "\\textdiv", "\\textdiv", "\\o", "\\o", "\\`{u}", "\\`{u}", "\\'{u}", "\\'{u}", "\\^{u}", "\\^{u}", "\\\"{u}", "\\\"{u}", "\\'{y}", "\\'{y}", "\\th", "\\th", "\\\"{u}", "\\\"{u}", "\\v{S}", "\\v{S}", "\\v{s}", "\\v{s}", "\\\"{Y}", "\\\"{Y}", "\\texcuub", "	extasciitilde", "A", "A", "B", "B", "\\Gamma", "\\Gamma", "\\Delta", "\\Delta", "E", "E", "Z", "Z", "H", "H", "\\Theta", "\\Theta", "I", "I", "K", "K", "\\Lambda", "\\Lambda", "M", "M", "N", "N", "\\Xi", "\\Xi", "O", "O", "\\Pi", "\\Pi", "P", "P", "\\Sigma", "\\Sigma", "T", "T", "\\Upsilon", "\\Upsilon", "\\Phi", "\\Phi", "X", "X", "\\Psi", "\\Psi", "\\Omega", "\\Omega", "\\alpha", "\\alpha", "\\beta", "\\beta", "\\gamma", "\\gamma", "\\delta", "\\delta", "\\epsilon", "\\epsilon", "\\zeta", "\\zeta", "\\eta", "\\eta", "\\theta", "\\theta", "\\iota", "\\iota", "\\kappa", "\\kappa", "\\lambda", "\\lambda", "\\mu", "\\mu", "\\nu", "\\nu", "\\xi", "\\xi", "o", "o", "\\pi", "\\pi", "\\rho", "\\rho", "\\varsigma", "\\varsigma", "\\sigma", "\\sigma", "\\tau", "\\tau", "\\upsilon", "\\upsilon", "\\phi", "\\phi", "\\chi", "\\chi", "\\psi", "\\psi", "\\omega", "\\omega", "\\vartheta", "\\vartheta", "\\varpi", "\\varpi", "--", "--", "---", "---", "`", "`", "'", "'", ",", ",", "``", "``", "''", "''", "\\dag", "\\dag", "\\ddag", "\\ddag", "{\\dots}", "{\\dots}", "{\\euro}", "{\\euro}", "{\\texttrademark}", "{\\texttrademark}", "\\(\\leftarrow{}\\)", "\\(\\leftarrow{}\\)", "\\(\\uparrow\\)", "\\(\\uparrow\\)", "\\(\\rightarrow{}\\)", "\\(\\rightarrow{}\\)", "\\(\\downarrow{}\\)", "\\(\\downarrow{}\\)", "\\(\\leftrightarrow{}\\)", "\\(\\leftrightarrow{}\\)", "\\(\\Leftarrow{}\\)", "\\(\\Leftarrow{}\\)", "\\(\\Uparrow\\)", "\\(\\Uparrow\\)", "\\(\\Rightarrow{}\\)", "\\(\\Rightarrow{}\\)", "\\(\\Downarrow{}\\)", "\\(\\Downarrow{}\\)", "\\(\\Leftrightarrow{}\\)", "\\(\\Leftrightarrow{}\\)", "$\\forall$", "$\\forall$", "$\\exists$", "$\\exists$", "$\\in$", "$\\in$", "$\\notin$", "$\\notin$", "$\\prod$", "$\\prod$", "$\\sum$", "$\\sum$", "$infty$", "$infty$", "$\\wedge$", "$\\wedge$", "$\\vee$", "$\\vee$", "$\\cap$", "$\\cap$", "$\\cup$", "$\\cup$", "$\\approx{}$", "$\\approx{}$", "$\\neq$", "$\\neq$", "$\\leq$", "$\\leq$", "$\\geq$", "$\\geq$"
	};

	@Override
	public String translateCharacters(String input){
		return StringUtils.replaceEach(input, this.sourceArray, this.targetArray);
	}
}
