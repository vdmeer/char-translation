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

package de.vandermeer.translation.helements;

import org.apache.commons.lang3.StringUtils;

import de.vandermeer.skb.interfaces.translators.HtmlElementTranslator;

/**
 * HTML Element translator translating from text to AsciiDoc.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt; - auto-generated by SKB Datatool from SKB Html Element Map data
 * @version    v0.0.2 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.1
 */
public class Text2AsciiDoc implements HtmlElementTranslator {

	/** Array of HTML Element strings. */
	protected String[] searchListHE = new String[]{
		"</abbr>", "</b>", "</code>", "</i>", "</li>", "</ol>", "</sub>", "</sup>", "</ul>", "<abbr>", "<b>", "<br />", "<br/>", "<br>", "<code>", "<i>", "<li>", "<ol>", "<sub>", "<sup>", "<ul>"
	};

	/** Array of temporary replacements for HTML Element strings. */
	protected String[] replacementListHE = new String[]{
		"(((/abbr)))", "(((/b)))", "(((/code)))", "(((/i)))", "(((/li)))", "(((/ol)))", "(((/sub)))", "(((/sup)))", "(((/ul)))", "(((abbr)))", "(((b)))", "(((br /)))", "(((br/)))", "(((br)))", "(((code)))", "(((i)))", "(((li)))", "(((ol)))", "(((sub)))", "(((sup)))", "(((ul)))"
	};

	/** Array of AsciiDoc replacements for temporary HTML Element strings. */
	protected String[] adListHE = new String[]{
		"", "*", "+", "_", "", "", "", "", "", "", "*", "\n", "\n", "\n", "+", "_", "* ", "", "_", "^", ""
	};

	@Override
	public String text2tmp(String input){
		return StringUtils.replaceEach(input, this.searchListHE, this.replacementListHE);
	}

	@Override
	public String tmp2target(String input){
		return StringUtils.replaceEach(input, this.replacementListHE, this.adListHE);
	}

	@Override
	public String translateHtmlElements(String input){
		return StringUtils.replaceEach(input, this.searchListHE, this.adListHE);
	}
}
