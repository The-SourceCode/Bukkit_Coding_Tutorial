package me.dabuseck.Tutorial.Items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.dabuseck.Tutorial.Tutorial;
import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener {
private Plugin plugin = Tutorial.getPlugin(Tutorial.class);

public void customRecipe() {
ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
ItemMeta meta = item.getItemMeta();

meta.setDisplayName(ChatColor.AQUA + "AXE OF ZEUS");
ArrayList<String> lore = new ArrayList<String>();
lore.add(ChatColor.WHITE + "Used by Zeus in the great god battle");
meta.setLore(lore);
meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
item.setItemMeta(meta);
ShapedRecipe r = new ShapedRecipe(item);

r.shape("#% ", "#$ ", " $ ");
r.setIngredient('#', Material.DIAMOND);
r.setIngredient('%', Material.IRON_INGOT);
r.setIngredient('$', Material.STICK);

plugin.getServer().addRecipe(r);

}

public void unshaped(){
ItemStack item = new ItemStack(Material.ENDER_PEARL, 1);

ShapelessRecipe slr = new ShapelessRecipe(item);

slr.addIngredient(3,Material.LAVA_BUCKET);
slr.addIngredient(3, Material.FLINT);
plugin.getServer().addRecipe(slr);
}
}
