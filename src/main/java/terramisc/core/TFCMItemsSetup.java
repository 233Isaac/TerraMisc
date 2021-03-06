package terramisc.core;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import terramisc.common.ArmorStats;
import terramisc.items.ItemBottleJuice;
import terramisc.items.ItemBottleJuiceLemon;
import terramisc.items.ItemBottleJuiceOnion;
import terramisc.items.ItemBottleSoyMilk;
import terramisc.items.ItemBottleSugar;
import terramisc.items.ItemBottleWine;
import terramisc.items.ItemBowLimb;
import terramisc.items.ItemBowlTallow;
import terramisc.items.ItemCustomQuiver;
import terramisc.items.ItemMetalPart;
import terramisc.items.ItemTallowDye;
import terramisc.items.ItemToolMold;
import terramisc.items.tools.ItemCustomArmor;
import terramisc.items.tools.ItemCustomArrow;
import terramisc.items.tools.ItemCustomBolt;
import terramisc.items.tools.ItemCustomCrossbow;
import terramisc.items.tools.ItemCustomHalberd;
import terramisc.items.tools.ItemCustomLongbow;
import terramisc.items.tools.ItemCustomPoniard;
import terramisc.items.tools.ItemCustomProjectileHead;
import terramisc.items.tools.ItemCustomToolHead;
import terramisc.items.tools.ItemCustomWarHammer;
import terramisc.items.weights.ItemWeightLargeHeavy;
import terramisc.items.weights.ItemWeightLightMedium;
import terramisc.items.weights.ItemWeightSmallHeavy;
import terramisc.items.weights.ItemWeightTinyLight;

import com.bioxx.tfc.CommonProxy;
import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Food.ItemFoodTFC;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;

public class TFCMItemsSetup extends TFCMItems
{
	public static void ItemSetup()
	{
		//Materials
		ToolMaterial CopperToolMaterial;
		ToolMaterial BronzeToolMaterial;
		ToolMaterial BismuthBronzeToolMaterial;
		ToolMaterial BlackBronzeToolMaterial;
		ToolMaterial IronToolMaterial;
		ToolMaterial SteelToolMaterial;
		ToolMaterial BlackSteelToolMaterial;
		ToolMaterial BlueSteelToolMaterial;
		ToolMaterial RedSteelToolMaterial;
				
		int CopperUses = 600;
		int BronzeUses = 1300;
		int BismuthBronzeUses = 1200;
		int BlackBronzeUses = 1460;
		int WroughtIronUses = 2200;
		int SteelUses = 3300;
		int BlackSteelUses = 4200;
		int BlueSteelUses = 6500;
		int RedSteelUses = 6500;

		float CopperEff = 8;
		float BronzeEff = 11;
		float BismuthBronzeEff = 10;
		float BlackBronzeEff = 9;
		float WroughtIronEff = 12;
		float SteelEff = 14;
		float BlackSteelEff = 16;
		float BlueSteelEff = 18;
		float RedSteelEff = 18;
		
		CopperToolMaterial = EnumHelper.addToolMaterial("Copper", 2, CopperUses, CopperEff, 65, 8);
		BronzeToolMaterial = EnumHelper.addToolMaterial("Bronze", 2, BronzeUses, BronzeEff, 100, 13);
		BismuthBronzeToolMaterial = EnumHelper.addToolMaterial("BismuthBronze", 2, BismuthBronzeUses, BismuthBronzeEff, 90, 10);
		BlackBronzeToolMaterial = EnumHelper.addToolMaterial("BlackBronze", 2, BlackBronzeUses, BlackBronzeEff, 95, 10);
		IronToolMaterial = EnumHelper.addToolMaterial("Iron", 2, WroughtIronUses, WroughtIronEff, 135, 10);
		SteelToolMaterial = EnumHelper.addToolMaterial("Steel", 2, SteelUses, SteelEff, 170, 10);
		BlackSteelToolMaterial = EnumHelper.addToolMaterial("BlackSteel", 2, BlackSteelUses, BlackSteelEff, 205, 12);
		BlueSteelToolMaterial = EnumHelper.addToolMaterial("BlueSteel", 3, BlueSteelUses, BlueSteelEff, 240, 22);
		RedSteelToolMaterial = EnumHelper.addToolMaterial("RedSteel", 3, RedSteelUses, RedSteelEff, 240, 22);

		
		System.out.println("[" + TFCMDetails.ModName + "] Registering Items"); //Beginning of item registering
		
		//Basic Items
		itemCasingBrass = new ItemWeightSmallHeavy().setUnlocalizedName("CasingBrass");
		itemCasingIron = new ItemWeightSmallHeavy().setUnlocalizedName("CasingIron");
		itemCasingRoseGold = new ItemWeightSmallHeavy().setUnlocalizedName("CasingRoseGold");
		itemGear = new ItemWeightTinyLight().setUnlocalizedName("Gear");
		itemCaseinGlue = new ItemWeightTinyLight().setUnlocalizedName("CaseinGlue");
		itemPistonBase = new ItemWeightLargeHeavy().setUnlocalizedName("PistonBase");
		itemCircuit = new ItemWeightSmallHeavy().setUnlocalizedName("Circuit");
		itemDeerTendon = new ItemWeightTinyLight().setUnlocalizedName("DeerTendon");
		itemSinewFiber = new ItemWeightTinyLight().setUnlocalizedName("SinewFiber");
		itemSinewString = new ItemWeightTinyLight().setUnlocalizedName("SinewString");
		itemSinewBowString = new ItemWeightTinyLight().setUnlocalizedName("SinewBowString");
		itemBowLimb = new ItemBowLimb().setUnlocalizedName("BowLimb");
		itemSuet = new ItemWeightSmallHeavy().setUnlocalizedName("Suet");
		itemBowlSuet = new ItemWeightSmallHeavy().setUnlocalizedName("BowlSuet").setMaxStackSize(1);
		itemBowlTallow = new ItemBowlTallow().setUnlocalizedName("BowlTallow");
		itemBrownDye = new ItemWeightTinyLight().setUnlocalizedName("BrownDye");
		itemIronDust = new ItemWeightSmallHeavy().setUnlocalizedName("IronDust");
		itemTallowDye = new ItemTallowDye().setUnlocalizedName("TallowDye");
		
		//Bows and Such
		itemLongBow = new ItemCustomLongbow().setUnlocalizedName("LongBow");
		itemCrossBow = new ItemCustomCrossbow().setUnlocalizedName("CrossBow");
		
		//Halberds
		itemHalberd_BismuthBronze = new ItemCustomHalberd(BismuthBronzeToolMaterial, 315).setUnlocalizedName("Halberd_BismuthBronze").setMaxDamage(BismuthBronzeUses);
		itemHalberd_BlackBronze = new ItemCustomHalberd(BlackBronzeToolMaterial, 	 345).setUnlocalizedName("Halberd_BlackBronze").setMaxDamage(BlackBronzeUses);
		itemHalberd_BlackSteel = new ItemCustomHalberd(BlackSteelToolMaterial, 	     405).setUnlocalizedName("Halberd_BlackSteel").setMaxDamage(BlackSteelUses);
		itemHalberd_BlueSteel = new ItemCustomHalberd(BlueSteelToolMaterial,		 472).setUnlocalizedName("Halberd_BlueSteel").setMaxDamage(BlueSteelUses);
		itemHalberd_Bronze = new ItemCustomHalberd(BronzeToolMaterial,			     330).setUnlocalizedName("Halberd_Bronze").setMaxDamage(BronzeUses);
		itemHalberd_Copper = new ItemCustomHalberd(CopperToolMaterial, 			     248).setUnlocalizedName("Halberd_Copper").setMaxDamage(CopperUses);
		itemHalberd_WroughtIron = new ItemCustomHalberd(IronToolMaterial,			 360).setUnlocalizedName("Halberd_WroughtIron").setMaxDamage(WroughtIronUses);
		itemHalberd_RedSteel = new ItemCustomHalberd(RedSteelToolMaterial,		     472).setUnlocalizedName("Halberd_RedSteel").setMaxDamage(RedSteelUses);
		itemHalberd_Steel = new ItemCustomHalberd(SteelToolMaterial,				 398).setUnlocalizedName("Halberd_Steel").setMaxDamage(SteelUses);
		
		//Halberd Tool Heads
		itemHalberd_BismuthBronze_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_BismuthBronze_Head");
		itemHalberd_BlackBronze_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_BlackBronze_Head");
		itemHalberd_BlackSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_BlackSteel_Head");
		itemHalberd_BlueSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_BlueSteel_Head");
		itemHalberd_Bronze_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_Bronze_Head");
		itemHalberd_Copper_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_Copper_Head");
		itemHalberd_WroughtIron_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_WroughtIron_Head");
		itemHalberd_RedSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_RedSteel_Head");
		itemHalberd_Steel_Head = new ItemCustomToolHead().setUnlocalizedName("Halberd_Steel_Head");
		
		//War Hammers
		itemWarHammer_BismuthBronze = new ItemCustomWarHammer(BismuthBronzeToolMaterial, 315).setUnlocalizedName("WarHammer_BismuthBronze").setMaxDamage(BismuthBronzeUses);
		itemWarHammer_BlackBronze = new ItemCustomWarHammer(BlackBronzeToolMaterial, 	 345).setUnlocalizedName("WarHammer_BlackBronze").setMaxDamage(BlackBronzeUses);
		itemWarHammer_BlackSteel = new ItemCustomWarHammer(BlackSteelToolMaterial, 	     405).setUnlocalizedName("WarHammer_BlackSteel").setMaxDamage(BlackSteelUses);
		itemWarHammer_BlueSteel = new ItemCustomWarHammer(BlueSteelToolMaterial,		 472).setUnlocalizedName("WarHammer_BlueSteel").setMaxDamage(BlueSteelUses);
		itemWarHammer_Bronze = new ItemCustomWarHammer(BronzeToolMaterial,			     330).setUnlocalizedName("WarHammer_Bronze").setMaxDamage(BronzeUses);
		itemWarHammer_Copper = new ItemCustomWarHammer(CopperToolMaterial, 			     248).setUnlocalizedName("WarHammer_Copper").setMaxDamage(CopperUses);
		itemWarHammer_WroughtIron = new ItemCustomWarHammer(IronToolMaterial,			 360).setUnlocalizedName("WarHammer_WroughtIron").setMaxDamage(WroughtIronUses);
		itemWarHammer_RedSteel = new ItemCustomWarHammer(RedSteelToolMaterial,		     472).setUnlocalizedName("WarHammer_RedSteel").setMaxDamage(RedSteelUses);
		itemWarHammer_Steel = new ItemCustomWarHammer(SteelToolMaterial,				 398).setUnlocalizedName("WarHammer_Steel").setMaxDamage(SteelUses);
		
		//War Hammer Heads
		itemWarHammer_BismuthBronze_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_BismuthBronze_Head");
		itemWarHammer_BlackBronze_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_BlackBronze_Head");
		itemWarHammer_BlackSteel_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_BlackSteel_Head");
		itemWarHammer_BlueSteel_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_BlueSteel_Head");
		itemWarHammer_Bronze_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_Bronze_Head");
		itemWarHammer_Copper_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_Copper_Head");
		itemWarHammer_WroughtIron_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_WroughtIron_Head");
		itemWarHammer_RedSteel_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_RedSteel_Head");
		itemWarHammer_Steel_Head = new ItemCustomToolHead().setUnlocalizedName("WarHammer_Steel_Head");
		
		//Poniards
		itemPoniard_BismuthBronze = new ItemCustomPoniard(BismuthBronzeToolMaterial, 175).setUnlocalizedName("Poniard_BismuthBronze").setMaxDamage(BismuthBronzeUses);
		itemPoniard_BlackBronze = new ItemCustomPoniard(BlackBronzeToolMaterial, 	 190).setUnlocalizedName("Poniard_BlackBronze").setMaxDamage(BlackBronzeUses);
		itemPoniard_BlackSteel = new ItemCustomPoniard(BlackSteelToolMaterial, 	     225).setUnlocalizedName("Poniard_BlackSteel").setMaxDamage(BlackSteelUses);
		itemPoniard_BlueSteel = new ItemCustomPoniard(BlueSteelToolMaterial,		 263).setUnlocalizedName("Poniard_BlueSteel").setMaxDamage(BlueSteelUses);
		itemPoniard_Bronze = new ItemCustomPoniard(BronzeToolMaterial,			     183).setUnlocalizedName("Poniard_Bronze").setMaxDamage(BronzeUses);
		itemPoniard_Copper = new ItemCustomPoniard(CopperToolMaterial, 			     138).setUnlocalizedName("Poniard_Copper").setMaxDamage(CopperUses);
		itemPoniard_WroughtIron = new ItemCustomPoniard(IronToolMaterial,			 200).setUnlocalizedName("Poniard_WroughtIron").setMaxDamage(WroughtIronUses);
		itemPoniard_RedSteel = new ItemCustomPoniard(RedSteelToolMaterial,		     263).setUnlocalizedName("Poniard_RedSteel").setMaxDamage(RedSteelUses);
		itemPoniard_Steel = new ItemCustomPoniard(SteelToolMaterial,				 221).setUnlocalizedName("Poniard_Steel").setMaxDamage(SteelUses);
		
		//Poniard Blades
		itemPoniard_BismuthBronze_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_BismuthBronze_Head");
		itemPoniard_BlackBronze_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_BlackBronze_Head");
		itemPoniard_BlackSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_BlackSteel_Head");
		itemPoniard_BlueSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_BlueSteel_Head");
		itemPoniard_Bronze_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_Bronze_Head");
		itemPoniard_Copper_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_Copper_Head");
		itemPoniard_WroughtIron_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_WroughtIron_Head");
		itemPoniard_RedSteel_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_RedSteel_Head");
		itemPoniard_Steel_Head = new ItemCustomToolHead().setUnlocalizedName("Poniard_Steel_Head");
		
		//Arrows
		itemArrow_BismuthBronze = new ItemCustomArrow().setUnlocalizedName("Arrow_BismuthBronze");
		itemArrow_BlackBronze = new ItemCustomArrow().setUnlocalizedName("Arrow_BlackBronze");
		itemArrow_BlackSteel = new ItemCustomArrow().setUnlocalizedName("Arrow_BlackSteel");
		itemArrow_BlueSteel = new ItemCustomArrow().setUnlocalizedName("Arrow_BlueSteel");
		itemArrow_Bronze = new ItemCustomArrow().setUnlocalizedName("Arrow_Bronze");
		itemArrow_Copper = new ItemCustomArrow().setUnlocalizedName("Arrow_Copper");
		itemArrow_RedSteel = new ItemCustomArrow().setUnlocalizedName("Arrow_RedSteel");
		itemArrow_Steel = new ItemCustomArrow().setUnlocalizedName("Arrow_Steel");
		itemArrow_WroughtIron = new ItemCustomArrow().setUnlocalizedName("Arrow_WroughtIron");
		
		//Arrow Heads
		itemArrow_BismuthBronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_BismuthBronze_Head");
		itemArrow_BlackBronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_BlackBronze_Head");
		itemArrow_BlackSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_BlackSteel_Head");
		itemArrow_BlueSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_BlueSteel_Head");
		itemArrow_Bronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_Bronze_Head");
		itemArrow_Copper_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_Copper_Head");
		itemArrow_WroughtIron_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_WroughtIron_Head");
		itemArrow_RedSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_RedSteel_Head");
		itemArrow_Steel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Arrow_Steel_Head");
		
		//Bolt
		itemBolt_BismuthBronze = new ItemCustomBolt().setUnlocalizedName("Bolt_BismuthBronze");
		itemBolt_BlackBronze = new ItemCustomBolt().setUnlocalizedName("Bolt_BlackBronze");
		itemBolt_BlackSteel = new ItemCustomBolt().setUnlocalizedName("Bolt_BlackSteel");
		itemBolt_BlueSteel = new ItemCustomBolt().setUnlocalizedName("Bolt_BlueSteel");
		itemBolt_Bronze = new ItemCustomBolt().setUnlocalizedName("Bolt_Bronze");
		itemBolt_Copper = new ItemCustomBolt().setUnlocalizedName("Bolt_Copper");
		itemBolt_RedSteel = new ItemCustomBolt().setUnlocalizedName("Bolt_RedSteel");
		itemBolt_Steel = new ItemCustomBolt().setUnlocalizedName("Bolt_Steel");
		itemBolt_WroughtIron = new ItemCustomBolt().setUnlocalizedName("Bolt_WroughtIron");
		
		//Bolt Heads
		itemBolt_BismuthBronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_BismuthBronze_Head");
		itemBolt_BlackBronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_BlackBronze_Head");
		itemBolt_BlackSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_BlackSteel_Head");
		itemBolt_BlueSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_BlueSteel_Head");
		itemBolt_Bronze_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_Bronze_Head");
		itemBolt_Copper_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_Copper_Head");
		itemBolt_WroughtIron_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_WroughtIron_Head");
		itemBolt_RedSteel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_RedSteel_Head");
		itemBolt_Steel_Head = new ItemCustomProjectileHead().setUnlocalizedName("Bolt_Steel_Head");
		
		//Pottery
		itemHalberd_Mold = new ItemToolMold().setMetaNames(new String[]{"Clay_Mold_Halberd","Ceramic_Mold_Halberd",
				"Ceramic_Mold_Halberd_Copper","Ceramic_Mold_Halberd_Bronze","Ceramic_Mold_Halberd_BismuthBronze","Ceramic_Mold_Halberd_BlackBronze"}).setUnlocalizedName("itemHalberd_Mold");
		itemWarHammer_Mold = new ItemToolMold().setMetaNames(new String[]{"Clay_Mold_WarHammer","Ceramic_Mold_WarHammer",
				"Ceramic_Mold_WarHammer_Copper","Ceramic_Mold_WarHammer_Bronze","Ceramic_Mold_WarHammer_BismuthBronze","Ceramic_Mold_WarHammer_BlackBronze"}).setUnlocalizedName("itemWarHammer_Mold");
		itemPoniard_Mold = new ItemToolMold().setMetaNames(new String[]{"Clay_Mold_Poniard","Ceramic_Mold_Poniard",
				"Ceramic_Mold_Poniard_Copper","Ceramic_Mold_Poniard_Bronze","Ceramic_Mold_Poniard_BismuthBronze","Ceramic_Mold_Poniard_BlackBronze"}).setUnlocalizedName("itemPoniard_Mold");
		itemArrow_Mold = new ItemToolMold().setMetaNames(new String[]{"Clay_Mold_Arrow","Ceramic_Mold_Arrow",
				"Ceramic_Mold_Arrow_Copper","Ceramic_Mold_Arrow_Bronze","Ceramic_Mold_Arrow_BismuthBronze","Ceramic_Mold_Arrow_BlackBronze"}).setUnlocalizedName("itemArrow_Mold");
		itemBolt_Mold = new ItemToolMold().setMetaNames(new String[]{"Clay_Mold_Bolt","Ceramic_Mold_Bolt",
				"Ceramic_Mold_Bolt_Copper","Ceramic_Mold_Bolt_Bronze","Ceramic_Mold_Bolt_BismuthBronze","Ceramic_Mold_Bolt_BlackBronze"}).setUnlocalizedName("itemBolt_Mold");
		
		//Armor Ingrediants
		itemCoil_BismuthBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_BismuthBronze")).setMetal("Bismuth Bronze", 100);
		itemCoil_BlackBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_BlackBronze")).setMetal("Black Bronze", 100);
		itemCoil_BlackSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_BlackSteel")).setMetal("Black Steel", 100);
		itemCoil_BlueSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_BlueSteel")).setMetal("Blue Steel", 100);
		itemCoil_Bronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_Bronze")).setMetal("Bronze", 100);
		itemCoil_Copper = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_Copper")).setMetal("Copper", 100);
		itemCoil_WroughtIron = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_WroughtIron")).setMetal("Wrought Iron", 100);
		itemCoil_RedSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_RedSteel")).setMetal("Red Steel", 100);
		itemCoil_Steel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Coil_Steel")).setMetal("Steel", 100);
		
		itemLink_BismuthBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_BismuthBronze")).setMetal("Bismuth Bronze", (short) 6.25);
		itemLink_BlackBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_BlackBronze")).setMetal("Black Bronze", (short) 6.25);
		itemLink_BlackSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_BlackSteel")).setMetal("Black Steel", (short) 6.25);
		itemLink_BlueSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_BlueSteel")).setMetal("Blue Steel", (short) 6.25);
		itemLink_Bronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_Bronze")).setMetal("Bronze", (short) 6.25);
		itemLink_Copper = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_Copper")).setMetal("Copper", (short) 6.25);
		itemLink_WroughtIron = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_WroughtIron")).setMetal("Wrought Iron", (short) 6.25);
		itemLink_RedSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_RedSteel")).setMetal("Red Steel", (short) 6.25);
		itemLink_Steel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Link_Steel")).setMetal("Steel", (short) 6.25);
		
		itemChain_Square_BismuthBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_BismuthBronze")).setMetal("Bismuth Bronze", 25);
		itemChain_Square_BlackBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_BlackBronze")).setMetal("Black Bronze", 25);
		itemChain_Square_BlackSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_BlackSteel")).setMetal("Black Steel", 25);
		itemChain_Square_BlueSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_BlueSteel")).setMetal("Blue Steel", 25);
		itemChain_Square_Bronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_Bronze")).setMetal("Bronze", 25);
		itemChain_Square_Copper = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_Copper")).setMetal("Copper", 25);
		itemChain_Square_WroughtIron = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_WroughtIron")).setMetal("Wrought Iron", 25);
		itemChain_Square_RedSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_RedSteel")).setMetal("Red Steel", 25);
		itemChain_Square_Steel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Square_Steel")).setMetal("Steel", 25);
		
		itemChain_Sheet_BismuthBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_BismuthBronze")).setMetal("Bismuth Bronze", 100);
		itemChain_Sheet_BlackBronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_BlackBronze")).setMetal("Black Bronze", 100);
		itemChain_Sheet_BlackSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_BlackSteel")).setMetal("Black Steel", 100);
		itemChain_Sheet_BlueSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_BlueSteel")).setMetal("Blue Steel", 100);
		itemChain_Sheet_Bronze = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_Bronze")).setMetal("Bronze", 100);
		itemChain_Sheet_Copper = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_Copper")).setMetal("Copper", 100);
		itemChain_Sheet_WroughtIron = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_WroughtIron")).setMetal("Wrought Iron", 100);
		itemChain_Sheet_RedSteel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_RedSteel")).setMetal("Red Steel", 100);
		itemChain_Sheet_Steel = ((ItemMetalPart) new ItemMetalPart().setUnlocalizedName("Chain_Sheet_Steel")).setMetal("Steel", 100);
		
		//Food Stuffs
		itemBottleFruitJuice = new ItemBottleJuice().setUnlocalizedName("BottleFruitJuice");
		itemBottleFruitWine = new ItemBottleWine().setUnlocalizedName("BottleFruitWine");
		itemBottleSugar= new ItemBottleSugar().setUnlocalizedName("BottleSugar");
		
		itemBottleJuiceApple = new ItemBottleJuice().setUnlocalizedName("BottleJuiceApple");
		itemBottleJuiceOrange = new ItemBottleJuice().setUnlocalizedName("BottleJuiceOrange");
		
		itemBottleJuiceLemon = new ItemBottleJuiceLemon().setUnlocalizedName("BottleJuiceLemon");
		itemBottleLemonade = new ItemBottleJuice().setUnlocalizedName("BottleLemonade");
		
		itemBottleJuiceOnion = new ItemBottleJuiceOnion().setUnlocalizedName("BottleJuiceOnion");
		
		itemBottleSoyMilk = new ItemBottleSoyMilk().setUnlocalizedName("BottleSoyMilk");
		itemBucketHotWater= new ItemWeightLightMedium().setUnlocalizedName("BucketHotWater");
		itemSoyPaste = new ItemFoodTFC(EnumFoodGroup.Protein, 10, 0, 0, 0, 40, false).setUnlocalizedName("SoyPaste");
		
		//Inventory Items
		itemQuiver = new ItemCustomQuiver().setUnlocalizedName("Quiver");
		
		SetupArmor();
		registerItems();
		System.out.println("[" + TFCMDetails.ModName + "] Done Registering Items");
	}
	
	public static void SetupArmor()
	{
		String[] Names = {"BismuthBronze", "BlackBronze", "BlackSteel", "BlueSteel", "Bronze", "Copper", "WroughtIron", "RedSteel", "Steel"};
		CommonProxy proxy = TerraFirmaCraft.proxy;
		int i = 0;

		i = 0;
		BismuthBronzeChainGreaves = (new ItemCustomArmor(ArmorStats.BismuthBronzeChain, proxy.getArmorRenderID("bismuthbronze"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		BlackBronzeChainGreaves = 	(new ItemCustomArmor(ArmorStats.BlackBronzeChain, proxy.getArmorRenderID("blackbronze"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		BlackSteelChainGreaves = 	(new ItemCustomArmor(ArmorStats.BlackSteelChain, proxy.getArmorRenderID("blacksteel"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		BlueSteelChainGreaves = 	(new ItemCustomArmor(ArmorStats.BlueSteelChain, proxy.getArmorRenderID("bluesteel"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		BronzeChainGreaves = 		(new ItemCustomArmor(ArmorStats.BronzeChain, proxy.getArmorRenderID("bronze"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		CopperChainGreaves = 		(new ItemCustomArmor(ArmorStats.CopperChain, proxy.getArmorRenderID("copper"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		WroughtIronChainGreaves =	(new ItemCustomArmor(ArmorStats.WroughtIronChain, proxy.getArmorRenderID("wroughtiron"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		RedSteelChainGreaves = 		(new ItemCustomArmor(ArmorStats.RedSteelChain, proxy.getArmorRenderID("redsteel"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves")); i++;
		SteelChainGreaves = 		(new ItemCustomArmor(ArmorStats.SteelChain, proxy.getArmorRenderID("steel"), 2, 50,1).setUnlocalizedName(Names[i]+"_Chain_Greaves"));

		i = 0;
		BismuthBronzeChainChestplate =	(new ItemCustomArmor(ArmorStats.BismuthBronzeChain, proxy.getArmorRenderID("bismuthbronze"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		BlackBronzeChainChestplate = 	(new ItemCustomArmor(ArmorStats.BlackBronzeChain, proxy.getArmorRenderID("blackbronze"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		BlackSteelChainChestplate = 	(new ItemCustomArmor(ArmorStats.BlackSteelChain, proxy.getArmorRenderID("blacksteel"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		BlueSteelChainChestplate = 		(new ItemCustomArmor(ArmorStats.BlueSteelChain, proxy.getArmorRenderID("bluesteel"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		BronzeChainChestplate = 		(new ItemCustomArmor(ArmorStats.BronzeChain, proxy.getArmorRenderID("bronze"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		CopperChainChestplate = 		(new ItemCustomArmor(ArmorStats.CopperChain, proxy.getArmorRenderID("copper"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		WroughtIronChainChestplate = 	(new ItemCustomArmor(ArmorStats.WroughtIronChain, proxy.getArmorRenderID("wroughtiron"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		RedSteelChainChestplate = 		(new ItemCustomArmor(ArmorStats.RedSteelChain, proxy.getArmorRenderID("redsteel"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate")); i++;
		SteelChainChestplate = 			(new ItemCustomArmor(ArmorStats.SteelChain, proxy.getArmorRenderID("steel"), 1, 50,2).setUnlocalizedName(Names[i]+"_Chain_Chestplate"));

		i = 0;
		BismuthBronzeChainHelmet = 	(new ItemCustomArmor(ArmorStats.BismuthBronzeChain, proxy.getArmorRenderID("bismuthbronze"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		BlackBronzeChainHelmet = 	(new ItemCustomArmor(ArmorStats.BlackBronzeChain, proxy.getArmorRenderID("blackbronze"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		BlackSteelChainHelmet = 	(new ItemCustomArmor(ArmorStats.BlackSteelChain, proxy.getArmorRenderID("blacksteel"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		BlueSteelChainHelmet = 		(new ItemCustomArmor(ArmorStats.BlueSteelChain, proxy.getArmorRenderID("bluesteel"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		BronzeChainHelmet = 		(new ItemCustomArmor(ArmorStats.BronzeChain, proxy.getArmorRenderID("bronze"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		CopperChainHelmet = 		(new ItemCustomArmor(ArmorStats.CopperChain, proxy.getArmorRenderID("copper"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		WroughtIronChainHelmet = 	(new ItemCustomArmor(ArmorStats.WroughtIronChain, proxy.getArmorRenderID("wroughtiron"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		RedSteelChainHelmet = 		(new ItemCustomArmor(ArmorStats.RedSteelChain, proxy.getArmorRenderID("redsteel"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet")); i++;
		SteelChainHelmet = 			(new ItemCustomArmor(ArmorStats.SteelChain, proxy.getArmorRenderID("steel"), 0, 50,3).setUnlocalizedName(Names[i]+"_Chain_Helmet"));
	}
}
