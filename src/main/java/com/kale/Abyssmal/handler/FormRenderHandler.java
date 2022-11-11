package com.kale.Abyssmal.handler;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.eventbus.api.Cancelable;

public class FormRenderHandler extends PlayerEvent{

	private final Cursed curse;
	
	private FormRenderHandler(PlayerEntity player,Cursed curse)
	{
	
		super(player);
		this.curse = curse;
		
	}
	
	public Cursed getCurse()
	{
		return curse;
	}
	
	
	@Cancelable
	public static class CanAcquire extends FormRenderHandler
	{
		public CanAcquire(PlayerEntity player,Cursed curse)
		{
			
			super(player,curse);
		}
		
		
	}
	
	@Cancelable
	public static class Acquire extends FormRenderHandler
	{
		
		public Acquire(PlayerEntity player, Cursed curse)
		{
			super(player, curse);
			
		}
	}
	
	
	@Cancelable
	public static class CursePlayer extends FormRenderHandler
	{
		
		public CursePlayer(PlayerEntity player, Cursed curse)
		{
			super(player,curse);
		}
		
	}
	//Need to add more parameters here:
	public void renderForm(PlayerEntity player)
	{
		
		
	}
}
