package com.kale.commands

import net.minecraft.command.CommandBase()


public class CommandCurse extends Commandbase()
{
  

}

public java.lang.String getCommandName(){
  return "curse";

}
public int getRequiredPermissionLevel()
{
  return 3;
}

public java.lang.String getCommandUsage()
{
  return "";

}
public void execute(MinecraftServer server, ICommandSender sender, java.lang.String[] args)
  throws command exeception
{
  world.getPlayerEntityByName(args[0]).setCurse(true);

}
