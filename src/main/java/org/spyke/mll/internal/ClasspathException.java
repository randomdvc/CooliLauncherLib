/*
 * Copyright 2020-2022 Riane "spykedev" spyke
 *
 * This file is part of MinecraftLaunchLibrary.

 * The MinecraftLaunchLibrary is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The MinecraftLaunchLibrary is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the MinecraftLaunchLibrary.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spyke.mll.internal;

import org.spyke.mll.LanguageManager;
import org.spyke.mll.LaunchException;

/**
 * The Classpath Exception
 *
 * <p>
 *     An exception thrown when the Classpath fails somewhere
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 3.0.0-BETA
 * @deprecated
 */
@Deprecated
public class ClasspathException extends LaunchException
{
    /**
     * When a JAR is not found
     */
    public static final int JAR_NOT_FOUND_ERROR = 0;

    /**
     * When a JAR can't be load
     */
    public static final int JAR_LOADING_ERROR = 1;

    /**
     * The Classpath Exception
     *
     * @param type The type of exception (need to be ClasspathException.JAR_NOT_FOUND_ERROR or JAR_LOADING_ERROR)
     * @param str  The message
     */
    public ClasspathException(int type, String str)
    {
        super(type == JAR_NOT_FOUND_ERROR ? LanguageManager.lang("jar-notfound", ":", str) + str : (type == JAR_LOADING_ERROR ? LanguageManager.lang("load-fail", ":", str) : str));
    }

    /**
     * The Classpath Exception with a cause
     *
     * @param type The type of exception (need to be ClasspathException.JAR_NOT_FOUND_ERROR or JAR_LOADING_ERROR)
     * @param str  The message
     * @param t    The cause
     */
    public ClasspathException(int type, String str, Throwable t)
    {
        super(type == JAR_NOT_FOUND_ERROR ? LanguageManager.lang("jar-notfound", ":", str) + str : (type == JAR_LOADING_ERROR ? LanguageManager.lang("load-fail", ":", str) : str), t);
    }


}
