package terramisc.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import terramisc.core.TFCMItems;

import com.bioxx.tfc.Entities.EntityProjectileTFC;

public class EntityMetalArrow extends EntityProjectileTFC 
{
	public Item pickupItem = TFCMItems.itemArrow_Copper;
	
	public EntityMetalArrow(World par1World) 
	{
		super(par1World);
	}

	public EntityMetalArrow(World par1World, EntityLivingBase shooter, float force)
	{
		super(par1World, shooter, force);
	}
}
