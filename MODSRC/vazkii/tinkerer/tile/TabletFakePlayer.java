/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 3.
 * Thaumcraft 3 � Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [15 May 2013, 19:38:21 (GMT)]
 */
package vazkii.tinkerer.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayer;

public class TabletFakePlayer extends FakePlayer {

	TileEntityAnimationTablet tablet;

	public TabletFakePlayer(TileEntityAnimationTablet tablet) {
		super(tablet.worldObj, tablet.getInvName());
		this.tablet = tablet;
	}

	@Override
	public void openGui(Object mod, int modGuiId, World world, int x, int y, int z) {
		// NO-OP
	}

	@Override
	public void onUpdate() {
		posX = tablet.xCoord + 0.5;
		posY = tablet.yCoord + 1.6;
		posZ = tablet.zCoord + 0.5;

		if(riddenByEntity != null)
			riddenByEntity.ridingEntity = null;
		if(ridingEntity != null)
			ridingEntity.riddenByEntity = null;
		riddenByEntity = null;
		ridingEntity = null;

		motionX = motionY = motionZ = 0;
		setEntityHealth(getMaxHealth());
		isDead = false;

		int meta = tablet.getBlockMetadata() & 7;
		int rotation = meta == 2 ? 180 : meta == 3 ? 0 : meta == 4 ? 90 : -90;
		rotationYaw = rotationYawHead = rotation;
		rotationPitch = -15;

		for(int i = 0; i < inventory.getSizeInventory(); i++) {
			if(i != inventory.currentItem) {
				ItemStack stack = inventory.getStackInSlot(i);
				if(stack != null) {
					dropPlayerItem(stack);
					inventory.setInventorySlotContents(i, null);
				}
			}
		}
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		return new ChunkCoordinates(tablet.xCoord, tablet.yCoord, tablet.zCoord);
	}

}
