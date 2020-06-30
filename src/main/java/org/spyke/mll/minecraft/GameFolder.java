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
package org.spyke.mll.minecraft;

/**
 * The Game Folder
 *
 * <p>
 *     The Game Folder contains the Minecraft folder organisation.
 * </p>
 *
 * @author spykedev
 * @version 3.0.2-BETA
 * @since 2.0.0-SNAPSHOT
 */
public class GameFolder
{

    /**
     * The default game folder (assets, libraries, natives, minecraft.jar)
     */
    public static final GameFolder DEFAULT = new GameFolder("assets", "libraries", "natives", "minecraft.jar");

    /**
     * The name of the folder containing the assets
     */
    private String assetsFolder;

    /**
     * The name of the folder containing the librairies
     */
    private String libsFolder;

    /**
     * The name of the folder containing the natives
     */
    private String nativesFolder;

    /**
     * The name of the main jar
     */
    private String mainJar;

    /**
     * The Main Constructor
     *
     * @param assetsFolder  The name of the folder containing the assets
     * @param libsFolder    The name of the folder containing the librairies
     * @param nativesFolder The name of the folder containing the natives
     * @param mainJar       The name of the main Jar
     */
    public GameFolder(String assetsFolder, String libsFolder, String nativesFolder, String mainJar)
    {
        this.assetsFolder = assetsFolder;
        this.libsFolder = libsFolder;
        this.nativesFolder = nativesFolder;
        this.mainJar = mainJar;
    }

    /**
     * Returns the name of the folder containing the assets
     *
     * @return The name of the assets folder
     */
    public String getAssetsFolder()
    {
        return assetsFolder;
    }

    /**
     * Returns the name of the folder containing the librairies
     *
     * @return The name of the librairies folder
     */
    public String getLibsFolder()
    {
        return libsFolder;
    }

    /**
     * Returns the name of the folder containing the natives
     *
     * @return The name of the natives folder
     */
    public String getNativesFolder()
    {
        return nativesFolder;
    }

    /**
     * Return the main minecraft jar
     *
     * @return The main jar
     */
    public String getMainJar()
    {
        return mainJar;
    }

}
