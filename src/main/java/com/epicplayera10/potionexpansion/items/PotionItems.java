package com.epicplayera10.potionexpansion.items;

import com.epicplayera10.potionexpansion.PotionExpansion;
import com.epicplayera10.potionexpansion.api.effects.PotionSightType;
import com.epicplayera10.potionexpansion.utils.ItemUtil;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.chat.ChatColors;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class PotionItems {

    //Normal Items
    public static final ItemStack mundanePotion = new CustomItem(Material.POTION, (itemMeta -> {
        PotionMeta meta = (PotionMeta) itemMeta;
        meta.setBasePotionData(new PotionData(PotionType.MUNDANE));
    }));

    //Categories
    public static final Category potionCategory = new Category(new NamespacedKey(PotionExpansion.getInstance(),
            "potionexpansion"),
            new CustomItem(Material.POTION, itemMeta -> {
                PotionMeta meta = (PotionMeta) itemMeta;
                meta.setColor(Color.AQUA);
                meta.setDisplayName(ChatColors.color("&b藥水擴充"));
                meta.addEnchant(Enchantment.LURE, 1, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            })
    );

    //Items
    public static final SlimefunItemStack ALCHEMIC_STATION = new SlimefunItemStack("ALCHEMIC_STATION",
            Material.BREWING_STAND,
            "&6煉金站",
            "&a&o像普通的釀造台一樣工作，但可以製作視覺藥水."
    );

    // Powders
    public static final SlimefunItemStack COAL_POWDER = new SlimefunItemStack("COAL_POWDER",
            Material.GUNPOWDER,
            "&8煤炭粉"
    );

    public static final SlimefunItemStack IRON_POWDER = new SlimefunItemStack("IRON_POWDER",
            Material.GUNPOWDER,
            "&7鐵粉"
    );

    public static final SlimefunItemStack DIAMOND_POWDER = new SlimefunItemStack("DIAMOND_POWDER",
            Material.GLOWSTONE_DUST,
            "&b鑽石粉"
    );

    public static final SlimefunItemStack GOLD_POWDER = new SlimefunItemStack("GOLD_POWDER",
            Material.GLOWSTONE_DUST,
            "&e金粉"
    );

    public static final SlimefunItemStack LAPIS_POWDER = new SlimefunItemStack("LAPIS_POWDER",
            Material.GUNPOWDER,
            "&9青金石粉"
    );

    public static final SlimefunItemStack REDSTONE_POWDER = new SlimefunItemStack("REDSTONE_POWDER",
            Material.REDSTONE,
            "&c紅石粉"
    );

    public static final SlimefunItemStack EMERALD_POWDER = new SlimefunItemStack("EMERALD_POWDER",
            Material.GLOWSTONE_DUST,
            "&a綠寶石粉"
    );

    public static final SlimefunItemStack QUARTZ_POWDER = new SlimefunItemStack("QUARTZ_POWDER",
            Material.SUGAR,
            "&f石英粉"
    );

    public static final SlimefunItemStack ANCIENT_DEBRIS_POWDER = new SlimefunItemStack("ANCIENT_DEBRIS_POWDER",
            Material.REDSTONE,
            "&4遠古遺骸粉"
    );

    public static final SlimefunItemStack COPPER_POWDER = new SlimefunItemStack("COPPER_POWDER",
            Material.GLOWSTONE_DUST,
            "&6銅粉"
    );


    // Sights
    public static final SlimefunItemStack COAL_SIGHT = ItemUtil.createCustomPotionItem("COAL_SIGHT",
            "&8&l煤炭礦視覺",
            PotionSightType.COAL_SIGHT.getColor());

    public static final SlimefunItemStack IRON_SIGHT = ItemUtil.createCustomPotionItem("IRON_SIGHT",
            "&7&l鐵礦視覺",
            PotionSightType.IRON_SIGHT.getColor());

    public static final SlimefunItemStack DIAMOND_SIGHT = ItemUtil.createCustomPotionItem("DIAMOND_SIGHT",
            "&b&l鑽石礦視覺",
            PotionSightType.DIAMOND_SIGHT.getColor());

    public static final SlimefunItemStack GOLD_SIGHT = ItemUtil.createCustomPotionItem("GOLD_SIGHT",
            "&e&l金礦視覺",
            PotionSightType.GOLD_SIGHT.getColor());

    public static final SlimefunItemStack LAPIS_SIGHT = ItemUtil.createCustomPotionItem("LAPIS_SIGHT",
            "&9&l青金石礦視覺",
            PotionSightType.LAPIS_SIGHT.getColor());

    public static final SlimefunItemStack REDSTONE_SIGHT = ItemUtil.createCustomPotionItem("REDSTONE_SIGHT",
            "&c&l紅石礦視覺",
            PotionSightType.REDSTONE_SIGHT.getColor());

    public static final SlimefunItemStack EMERALD_SIGHT = ItemUtil.createCustomPotionItem("EMERALD_SIGHT",
            "&a&l綠寶石礦視覺",
            PotionSightType.EMERALD_SIGHT.getColor());

    public static final SlimefunItemStack QUARTZ_SIGHT = ItemUtil.createCustomPotionItem("QUARTZ_SIGHT",
            "&f&l石英礦視覺",
            PotionSightType.QUARTZ_SIGHT.getColor());

    public static final SlimefunItemStack ANCIENT_DEBRIS_SIGHT = ItemUtil.createCustomPotionItem("ANCIENT_DEBRIS_SIGHT",
            "&4&l遠古遺骸視覺",
            PotionSightType.ANCIENT_DEBRIS_SIGHT.getColor());

    public static final SlimefunItemStack COPPER_SIGHT = ItemUtil.createCustomPotionItem("COPPER_SIGHT",
            "&6&l銅礦視覺",
            PotionSightType.COPPER_SIGHT.getColor());
}
