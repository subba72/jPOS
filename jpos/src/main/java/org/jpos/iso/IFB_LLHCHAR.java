/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2015 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso;


/**
 * ISOFieldPackager Binary Hex LLCHAR
 * Almost the same as IFB_LLCHAR but len is encoded as a binary
 * value. A len of 16 is encoded as 0x10 instead of 0x16
 *
 * @author apr@cs.com.uy
 * @version $Id$
 * @see ISOComponent
 */
public class IFB_LLHCHAR extends ISOStringFieldPackager {
    public IFB_LLHCHAR() {
        super(NullPadder.INSTANCE, AsciiInterpreter.INSTANCE, BinaryPrefixer.B);
    }
    /**
     * @param len - field len
     * @param description symbolic descrption
     */
    public IFB_LLHCHAR (int len, String description) {
        super(len, description, NullPadder.INSTANCE, AsciiInterpreter.INSTANCE, BinaryPrefixer.B);
        checkLength(len, 255);
    }

    public void setLength(int len)
    {
        checkLength(len, 255);
        super.setLength(len);
    }
}
