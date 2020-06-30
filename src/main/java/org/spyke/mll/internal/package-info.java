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

/**
 * The Internal Launching Method
 *
 * <p>
 *     Launch a program by adding the jars to the current classpath and
 *     then launching manually a method of the target class.
 *
 *     A lot faster than the external method.
 * </p>
 *
 * Code example :
 *
 * <pre>{@code
 *     List<File> classpath = Explorer.dir("libs").files().match("^(.*\.((jar)$))*$").get();
 *     InternalLaunchProfile profile = new InternalLaunchProfile("org.spyke.MyMainClass", classpath);
 *     profile.launch();
 * }</pre>
 *
 * This will launch the main(String[] args) of the given class.
 * You can also choose the method to launch, and its parameters.
 * And, you can receive what it returned.
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 3.0.0-BETA
 * @deprecated Use {@link org.spyke.mll.external}, it crashes when used with Java 9
 */
package org.spyke.mll.internal;