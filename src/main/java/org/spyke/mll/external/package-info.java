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
 * The External Launching package
 *
 * <p>
 *     The external launching is the launching method that create a java Process
 *     to launch a Java program.
 * </p>
 *
 * Code example :
 *
 * <pre>{@code
 *     ClasspathConstructor constructor = new ClasspathConstructor();
 *     constructor.add(new File("mymainjar.jar"));
 *     constructor.add(Explorer.dir("libs").files());
 *
 *     ExternalLaunchProfile profile = new ExternalLaunchProfile("org.spyke.MyClass", classpath.make());
 *     ExternalLauncher launcher = new ExternalLauncher(profile);
 *
 *     Process p = launcher.launch(); // throws LaunchException
 *     // Process is now launched =)
 * }</pre>
 *
 * You can also give programs/VM parameters.
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 3.0.0-BETA
 */
package org.spyke.mll.external;