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
 * Provides check methods
 *
 * @author Martin Vysny
 */
public class Check {
	private Check() {
		throw new AssertionError();
	}

	public static void checkNotNull(final String name, final Object value) {
		if (value == null) {
			throw new NullPointerException("Parameter " + name + " is null");
		}
	}

	public static void checkTrue(String string, boolean valid) {
		if (!valid) {
			throw new IllegalArgumentException(string);
		}
	}
}
