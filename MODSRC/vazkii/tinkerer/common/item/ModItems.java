/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 4.
 * Thaumcraft 4 (c) Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [4 Sep 2013, 16:57:28 (GMT)]
 */
package vazkii.tinkerer.common.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
import vazkii.tinkerer.common.block.ModBlocks;
import vazkii.tinkerer.common.core.handler.ConfigHandler;
import vazkii.tinkerer.common.item.foci.ItemFocusDeflect;
import vazkii.tinkerer.common.item.foci.ItemFocusDislocation;
import vazkii.tinkerer.common.item.foci.ItemFocusEnderChest;
import vazkii.tinkerer.common.item.foci.ItemFocusFlight;
import vazkii.tinkerer.common.item.foci.ItemFocusHeal;
import vazkii.tinkerer.common.item.foci.ItemFocusSmelt;
import vazkii.tinkerer.common.item.foci.ItemFocusTelekinesis;
import vazkii.tinkerer.common.item.kami.ItemCatAmulet;
import vazkii.tinkerer.common.item.kami.ItemKamiResource;
import vazkii.tinkerer.common.item.kami.armor.ItemGemBoots;
import vazkii.tinkerer.common.item.kami.armor.ItemGemChest;
import vazkii.tinkerer.common.item.kami.armor.ItemGemHelm;
import vazkii.tinkerer.common.item.kami.armor.ItemGemLegs;
import vazkii.tinkerer.common.item.kami.armor.ItemIchorclothArmor;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorAxe;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorAxeAdv;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorPick;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorPickAdv;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorShovel;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorShovelAdv;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorSword;
import vazkii.tinkerer.common.item.kami.tool.ItemIchorSwordAdv;
import vazkii.tinkerer.common.item.kami.wand.CapIchor;
import vazkii.tinkerer.common.item.kami.wand.RodIchorcloth;
import vazkii.tinkerer.common.lib.LibItemIDs;
import vazkii.tinkerer.common.lib.LibItemNames;

public final class ModItems {

	public static Item darkQuartz;
	public static Item connector;
	public static Item gaseousLight;
	public static Item gaseousShadow;
	public static Item gasRemover;
	public static Item spellCloth;
	public static Item focusFlight;
	public static Item focusDislocation;
	public static Item cleansingTalisman;
	public static Item brightNitor;
	public static Item focusTelekinesis;
	public static Item soulMould;
	public static Item xpTalisman;
	public static Item focusSmelt;
	public static Item focusHeal;
	public static Item focusEnderChest;
	public static Item bloodSword;
	public static Item revealingHelm;
	public static Item infusedInkwell;
	public static Item focusDeflect;

	public static Item kamiResource;
	public static Item ichorHelm;
	public static Item ichorChest;
	public static Item ichorLegs;
	public static Item ichorBoots;
	public static Item ichorHelmGem;
	public static Item ichorChestGem;
	public static Item ichorLegsGem;
	public static Item ichorBootsGem;
	public static Item catAmulet;
	public static Item ichorPick;
	public static Item ichorShovel;
	public static Item ichorAxe;
	public static Item ichorSword;
	public static Item ichorPickGem;
	public static Item ichorShovelGem;
	public static Item ichorAxeGem;
	public static Item ichorSwordGem;

	public static WandCap capIchor;
	public static WandRod rodIchorcloth;
	
	public static EnumToolMaterial toolMatIchor;

	public static void initItems() {
		darkQuartz = new ItemMod(LibItemIDs.idDarkQuartz).setUnlocalizedName(LibItemNames.DARK_QUARTZ);
		connector = new ItemConnector(LibItemIDs.idConnector).setUnlocalizedName(LibItemNames.CONNECTOR);
		gaseousLight = new ItemGas(LibItemIDs.idGaseousLight, ModBlocks.gaseousLight).setUnlocalizedName(LibItemNames.GASEOUS_LIGHT);
		gaseousShadow = new ItemGas(LibItemIDs.idGaseousShadow, ModBlocks.gaseousShadow).setUnlocalizedName(LibItemNames.GASEOUS_SHADOW);
		gasRemover = new ItemGasRemover(LibItemIDs.idGasRemover).setUnlocalizedName(LibItemNames.GAS_REMOVER);
		spellCloth = new ItemSpellCloth(LibItemIDs.idSpellCloth).setUnlocalizedName(LibItemNames.SPELL_CLOTH);
		focusFlight = new ItemFocusFlight(LibItemIDs.idFocusFlight).setUnlocalizedName(LibItemNames.FOCUS_FLIGHT);
		focusDislocation = new ItemFocusDislocation(LibItemIDs.idFocusDislocation).setUnlocalizedName(LibItemNames.FOCUS_DISLOCATION);
		cleansingTalisman = new ItemCleansingTalisman(LibItemIDs.idCleansingTalisman).setUnlocalizedName(LibItemNames.CLEANSING_TALISMAN);
		brightNitor = new ItemBrightNitor(LibItemIDs.idBrightNitor).setUnlocalizedName(LibItemNames.BRIGHT_NTIOR);
		focusTelekinesis = new ItemFocusTelekinesis(LibItemIDs.idFocusTelekinesis).setUnlocalizedName(LibItemNames.FOCUS_TELEKINESIS);
		soulMould = new ItemSoulMould(LibItemIDs.idSoulMould).setUnlocalizedName(LibItemNames.SOUL_MOULD);
		xpTalisman = new ItemXPTalisman(LibItemIDs.idXPTalisman).setUnlocalizedName(LibItemNames.XP_TALISMAN);
		focusSmelt = new ItemFocusSmelt(LibItemIDs.idFocusSmelt).setUnlocalizedName(LibItemNames.FOCUS_SMELT);
		focusHeal = new ItemFocusHeal(LibItemIDs.idFocusHeal).setUnlocalizedName(LibItemNames.FOCUS_HEAL);
		focusEnderChest = new ItemFocusEnderChest(LibItemIDs.idFocusEnderChest).setUnlocalizedName(LibItemNames.FOCUS_ENDER_CHEST);
		bloodSword = new ItemBloodSword(LibItemIDs.idBloodSword).setUnlocalizedName(LibItemNames.BLOOD_SWORD);
		revealingHelm = new ItemRevealingHelm(LibItemIDs.idRevealingHelm).setUnlocalizedName(LibItemNames.REVEALING_HELM);
		infusedInkwell = new ItemInfusedInkwell(LibItemIDs.idInfusedInkwell).setUnlocalizedName(LibItemNames.INFUSED_INKWELL);
		focusDeflect = new ItemFocusDeflect(LibItemIDs.idFocusDeflect).setUnlocalizedName(LibItemNames.FOCUS_DEFLECT);

		if(ConfigHandler.enableKami) {
			toolMatIchor = EnumHelper.addToolMaterial("ICHOR", 4, -1, 10F, 5F, 25);
			
			kamiResource = new ItemKamiResource(LibItemIDs.idKamiResource).setUnlocalizedName(LibItemNames.KAMI_RESOURCE);
			ichorHelm = new ItemIchorclothArmor(LibItemIDs.idIchorHelm, 0).setUnlocalizedName(LibItemNames.ICHOR_HELM);
			ichorChest = new ItemIchorclothArmor(LibItemIDs.idIchorChest, 1).setUnlocalizedName(LibItemNames.ICHOR_CHEST);
			ichorLegs = new ItemIchorclothArmor(LibItemIDs.idIchorLegs, 2).setUnlocalizedName(LibItemNames.ICHOR_LEGS);
			ichorBoots = new ItemIchorclothArmor(LibItemIDs.idIchorBoots, 3).setUnlocalizedName(LibItemNames.ICHOR_BOOTS);
			ichorHelmGem = new ItemGemHelm(LibItemIDs.idIchorHelmGem, 0).setUnlocalizedName(LibItemNames.ICHOR_HELM_GEM);
			ichorChestGem = new ItemGemChest(LibItemIDs.idIchorChestGem, 1).setUnlocalizedName(LibItemNames.ICHOR_CHEST_GEM);
			ichorLegsGem = new ItemGemLegs(LibItemIDs.idIchorLegsGem, 2).setUnlocalizedName(LibItemNames.ICHOR_LEGS_GEM);
			ichorBootsGem = new ItemGemBoots(LibItemIDs.idIchorBootsGem, 3).setUnlocalizedName(LibItemNames.ICHOR_BOOTS_GEM);
			catAmulet = new ItemCatAmulet(LibItemIDs.idCatAmulet).setUnlocalizedName(LibItemNames.CAT_AMULET);
			ichorPick = new ItemIchorPick(LibItemIDs.idIchorPick).setUnlocalizedName(LibItemNames.ICHOR_PICK);
			ichorShovel = new ItemIchorShovel(LibItemIDs.idIchorShovel).setUnlocalizedName(LibItemNames.ICHOR_SHOVEL);
			ichorAxe = new ItemIchorAxe(LibItemIDs.idIchorAxe).setUnlocalizedName(LibItemNames.ICHOR_AXE);
			ichorSword = new ItemIchorSword(LibItemIDs.idIchorSword).setUnlocalizedName(LibItemNames.ICHOR_SWORD);
			ichorPickGem = new ItemIchorPickAdv(LibItemIDs.idIchorPickGem).setUnlocalizedName(LibItemNames.ICHOR_PICK_GEM);
			ichorShovelGem = new ItemIchorShovelAdv(LibItemIDs.idIchorShovelGem).setUnlocalizedName(LibItemNames.ICHOR_SHOVEL_GEM);
			ichorAxeGem = new ItemIchorAxeAdv(LibItemIDs.idIchorAxeGem).setUnlocalizedName(LibItemNames.ICHOR_AXE_GEM);
			ichorSwordGem = new ItemIchorSwordAdv(LibItemIDs.idIchorSwordGem).setUnlocalizedName(LibItemNames.ICHOR_SWORD_GEM);

			capIchor = new CapIchor();
			rodIchorcloth = new RodIchorcloth();
		}
	}
}
