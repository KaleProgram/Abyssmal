package com.kale.Abyssmal.handler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EntityRenderer {

	//Use this function to render additional cubes to the player.
	
	
		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
			PlayerEntity player = event.getPlayer();
			
			
			
			if(!player.isSpectator())
			{
				
				//You need to implement data class to say that the player has been transformed then change it here
				if(TransPlayer.getPlayerStatus(player))
				{
					//stops player render
					event.setCanceled(true);
					FormRenderHandler.renderForm(player,event.getPoseStack(),event.getMultiBufferSource(),event.getPackedLight(),event.getPartialTick());
					
				}
			}
		
		
		
	}
}
