/**
 *     Aedict - an EDICT browser for Android
 Copyright (C) 2009 Martin Vysny
 
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package sk_x.baka.aedict.util;

/**
 * Constants.
 * 
 * @author Martin Vysny
 */
public final class Constants {
	private Constants() {
		throw new AssertionError();
	}

	/**
	 * A show-once info dialog ID, which shows KanjiDraw warning.
	 */
	public static final String INFOONCE_KANJIDRAWWARNING = "kanjidrawwarning";
	/**
	 * A show-once info dialog ID, which shows warning about reading possibly missing from the Tanaka dictionary.
	 */
	public static final String INFOONCE_TANAKA_MISSING_READING = "tanakamissingreading";
	/**
	 * A show-once info dialog ID. Informs about possibility to search by clicking on the onyomi/kunyomi etc.
	 */
	public static final String INFOONCE_CLICKABLE_NOTE = "clickablenote";
}
