package com.hoodwink_dude.terraformer.eventhandlers;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;

public class LeftClickEventHandler {
	private BlockPos selectionCornerOne;
	private BlockPos selectionCornerTwo;
	
	@SubscribeEvent
	public void onClick(LeftClickBlock event) {
		//if(event.getEntityPlayer().getHeldItemOffhand().isItemEqual())
	}
	
	private void addNewPoint(LeftClickBlock event) {
		EnumHand curHand = event.getHand();
		World world = event.getWorld();
		BlockPos thisBlock = event.getPos();
		IBlockState thisBlockState = world.getBlockState(thisBlock);
		ItemStack is = event.getEntityPlayer().getHeldItem(curHand);
		
		event.setUseBlock(Event.Result.DENY);
		
		if(is.canHarvestBlock(thisBlockState)) {
		
		}
	}
}
