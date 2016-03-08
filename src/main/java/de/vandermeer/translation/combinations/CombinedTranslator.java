/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
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

package de.vandermeer.translation.combinations;

import de.vandermeer.translation.characters.CharacterTranslator;
import de.vandermeer.translation.helements.HtmlElementTranslator;

/**
 * Interface for a combined translator (characters and HTML Elements).
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 160306 (06-Mar-16) for Java 1.7
 * @since      v0.0.1
 */
public interface CombinedTranslator extends CharacterTranslator, HtmlElementTranslator {

	/**
	 * Translates HTML Elements and characters from a source to a target representation.
	 * @param input string
	 * @return translated string
	 */
	String translate(String input);
}