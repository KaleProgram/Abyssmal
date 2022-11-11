package com.kale.Abyssmal.handler;

import net.minecraft.entity.player.PlayerEntity;

public class TransPlayer {

	public void TransPlayer()
	{
		
		
	}
	
	
	
	public static Boolean getPlayerStatus(PlayerEntity player)
	{
		
		if(player.canBreatheUnderwater()==true)
		{
			
			return true;
		}
		
		return false;
	}
	
	
}
