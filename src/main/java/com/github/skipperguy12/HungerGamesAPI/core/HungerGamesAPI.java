package com.github.skipperguy12.HungerGamesAPI.core;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of HungerGamesAPI for HungerGames plugin
 * 
 * @author Neil Johari
 * 
 */
public class HungerGamesAPI extends JavaPlugin {
	public static Plugin HungerGames;
	public static Plugin Thirst;

	public void onEnable() {
		if (Bukkit.getPluginManager().getPlugin("Thirst") != null)
			Thirst = (com.github.skipperguy12.Thirst.Thirst) Bukkit.getPluginManager().getPlugin("Thirst");

		if (Bukkit.getPluginManager().getPlugin("HungerGames") != null)
			HungerGames = (com.github.skipperguy12.HungerGames.core.HungerGames) Bukkit.getPluginManager().getPlugin("HungerGames");

	}

	public void onDisable() {

	}

}
