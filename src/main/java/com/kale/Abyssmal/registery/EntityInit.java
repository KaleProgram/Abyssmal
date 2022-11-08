package com.kale.Abyssmal.registery;

import net.minecraftforge.fml.common.registry.*;

public class EntityInit {

	
	
	public static void registerEntities()
	{
		
	}
	public static void registerEntities(String name Class<? extends Entity> entity,int id, int range, int color1, int color2)
	{
		EntityRegistry(new ResourceLocation(Refrence.MOD_ID+":"+name),entity,name,id, );
	}
	
}
