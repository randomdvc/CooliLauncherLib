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
package org.spyke.mll.util;

import org.spyke.mll.LanguageManager;

/**
 * The Log Util
 *
 * <p>
 *     Useful to print some messages :p
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 3.0.0-BETA
 */
public final class LogUtil
{
    /**
     * Print a message, with some translated strings
     *
     * @param err      If it is an error message
     * @param messages All the strings keys to translate
     */
    public static void message(boolean err, String... messages)
    {
        String message = "[CooliLauncher] " + LanguageManager.lang(messages);

        if (err)
            System.err.println(message);
        else
            System.out.println(message);
    }

    /**
     * Print a message, with [minecraftlauncherlibrary] before
     *
     * @param message The message to print
     */
    public static void rawInfo(String message)
    {
        System.out.println("[CooliLauncher] " + message);
    }

    /**
     * Print an error message, with [minecraftlauncherlibrary] before
     *
     * @param message The message to print
     */
    public static void rawErr(String message)
    {
        System.err.println("[CooliLauncher] " + message);
    }

    /**
     * Print an info message, with some translated strings
     *
     * @param messages All the strings keys to translate
     */
    public static void info(String... messages)
    {
        message(false, messages);
    }

    /**
     * Print an error message, with some translated strings
     *
     * @param messages All the strings keys to translate
     */
    public static void err(String... messages)
    {
        message(true, messages);
    }
}
