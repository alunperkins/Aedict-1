/**
 *     AUtils - A collection of utility classes for the Android system.
Copyright (C) 2009 Martin Vysny

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sk_x.baka.autils;

/**
 * Builds a list of items, separated by given separator.
 *
 * @author Martin Vysny
 */
public class ListBuilder {

    private final String separator;
    private boolean isFirst = true;
    /**
     * The underlying string builder.
     */
    public final StringBuilder sb = new StringBuilder();

    /**
     * Creates new list with given separator.
     *
     * @param separator
     *            the separator
     */
    public ListBuilder(final String separator) {
        this.separator = separator;
    }

    /**
     * Appends a string.
     *
     * @param string
     *            the string to append
     * @return this
     */
    public ListBuilder add(final String string) {
        if (isFirst) {
            isFirst = false;
        } else {
            sb.append(separator);
        }
        sb.append(string);
        return this;
    }

    /**
     * Checks if nothing has been added yet.
     * @return true if nothing has been added yet.
     */
    public boolean isEmpty() {
        return isFirst;
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
