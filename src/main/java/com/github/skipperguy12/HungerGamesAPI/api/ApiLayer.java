package com.github.skipperguy12.HungerGamesAPI.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.github.skipperguy12.HungerGamesAPI.core.HungerGamesAPI;
import com.github.skipperguy12.Thirst.Thirst;

/**
 * Adds the API for HungerGames plugin
 * 
 * @author Neil Johari
 * 
 */
public class ApiLayer {
	/**
	 * Sets a players thirst
	 * 
	 * @param player
	 *            The player whose thirst shall be changed
	 * @param value
	 *            The value of what the players thirst should be set to
	 */
	public static void setThirst(Player player, int value) {
		if (HungerGamesAPI.Thirst != null) {
			((Thirst) HungerGamesAPI.Thirst).players.put(player, Integer.valueOf(value));
			player.setExp(Integer.valueOf(value) / 100.0F);
		}
	}

	/**
	 * 
	 * Gets a players thirst level
	 * 
	 * @param player
	 *            The player whose thirst will be returned
	 * @return The thirst level of the player (0 means the plugin was NOT
	 *         enabled)
	 */
	public static int getThirst(Player player) {
		if (HungerGamesAPI.Thirst != null) {
			return ((Thirst) HungerGamesAPI.Thirst).players.get(player);
		} else
			return 0;
	}

	/**
	 * Reset all player thirst levels
	 */
	public static void resetAllThirstLevels() {
		int value = 100;
		if (HungerGamesAPI.Thirst != null) {
			for (Player player : Bukkit.getOnlinePlayers()) {
				((Thirst) HungerGamesAPI.Thirst).players.put(player, Integer.valueOf(value));
				player.setExp(Integer.valueOf(value) / 100.0F);
			}
		}
	}
	
	
	


}
