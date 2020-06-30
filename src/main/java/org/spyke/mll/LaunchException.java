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
package org.spyke.mll;

/**
 * The Launch Exception
 *
 * <p>
 *     An exception thrown when launching.
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 3.0.0-BETA
 */
public class LaunchException extends Exception
{
    /**
     * Normal constructor
     *
     * @param message The message
     */
    public LaunchException(String message)
    {
        super(message);
    }

    /**
     * Constructor with a cause
     *
     * @param message The message
     * @param cause   The cause
     */
    public LaunchException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
