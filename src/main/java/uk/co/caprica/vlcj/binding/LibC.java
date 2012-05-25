/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010, 2011, 2012 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.binding;

import java.nio.ByteBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;

/**
 * Minimal interface to the standard "C" library.
 */
public interface LibC extends Library {

    /**
     * Native library instance.
     */
    LibC INSTANCE = (LibC)Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), LibC.class);

    /**
     * Format a string with a variable arguments list into a fixed size buffer.
     * <p>
     * The resultant string will be truncated to the size of the buffer if it would
     * otherwise exceed it.
     * 
     * @param str buffer
     * @param size capacity of the buffer
     * @param format format string
     * @param args format arguments
     * @return number of bytes written to the buffer
     */
    int vsnprintf(ByteBuffer str, int size, String format, Pointer args); 
}