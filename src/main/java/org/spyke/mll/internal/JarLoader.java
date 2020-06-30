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

import org.spyke.mll.util.explorer.FileList;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;

/**
 * The Jar Loader
 *
 * <p>
 *     Load jars to the current classpath
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @deprecated Crash when used with Java 9
 */
@Deprecated
public class JarLoader
{
    /**
     * Loads a file array
     *
     * @param files The jars to load
     *
     * @throws ClasspathException If it failed
     */
    public static void load(File[] files) throws ClasspathException
    {
        load(Arrays.asList(files));
    }

    /**
     * Loads a file list
     *
     * @param list The list to load
     *
     * @throws ClasspathException If it failed
     */
    public static void load(FileList list) throws ClasspathException
    {
        load(list.get());
    }

    /**
     * Loads a list of files
     *
     * @param files The list to load
     *
     * @throws ClasspathException If it failed
     */
    public static void load(List<File> files) throws ClasspathException
    {
        for (File file : files)
            addToClasspath(file);
    }

    /**
     * Load a jar to the classpath
     *
     * @param jar The jar to load
     *
     * @throws ClasspathException If it failed
     */
    public static void addToClasspath(File jar) throws ClasspathException
    {
        if (!jar.exists())
            throw new ClasspathException(ClasspathException.JAR_NOT_FOUND_ERROR, jar.getAbsolutePath());

        URLClassLoader loader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class<URLClassLoader> classLoader = URLClassLoader.class;

        try
        {
            Method method = classLoader.getDeclaredMethod("addURL", URL.class);
            method.setAccessible(true);
            method.invoke(loader, jar.toURI().toURL());
        }
        catch (Throwable t)
        {
            t.printStackTrace();
            throw new ClasspathException(ClasspathException.JAR_LOADING_ERROR, jar.getAbsolutePath(), t);
        }
    }
}
