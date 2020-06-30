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

import java.lang.reflect.Field;

public class JavaUtil
{

    public static String JavaCommand;

    /**
     * Return the special default VM arguments
     *
     * @return The special VM args
     */
    public static String[] getSpecialArgs()
    {
        return new String[]{"-XX:-UseAdaptiveSizePolicy", "-XX:+UseConcMarkSweepGC"};
    }

    /**
     * Create an argument for the mac dock name
     *
     * @param name The name to set
     *
     * @return The generated argument
     */
    public static String macDockName(String name)
    {
        return "-Xdock:name=" + name;
    }

    public static void setJavaCommand(String javaCommand){
        if(javaCommand.contains("\\bin\\java") || javaCommand.contains("/bin/java")) JavaCommand = javaCommand;
        else
        if (System.getProperty("os.name").toLowerCase().contains("win")) JavaCommand = javaCommand + "\\bin\\java";
        else JavaCommand = javaCommand + "/bin/java";
    }

    public static String getJavaCommand()
    {
        if(JavaCommand == null){
            if (System.getProperty("os.name").toLowerCase().contains("win"))
                return "\"" + System.getProperty("java.home") + "\\bin\\java" + "\"";
        return System.getProperty("java.home") + "/bin/java";}
        else return JavaCommand;
    }

    /**
     * Manually set the Java Library Path
     *
     * @param path The new library path
     * @throws Exception If it failed
     */
    public static void setLibraryPath(String path) throws Exception
    {
        System.setProperty("java.library.path", path);

        Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
        fieldSysPath.setAccessible(true);
        fieldSysPath.set(null, null);
    }
}