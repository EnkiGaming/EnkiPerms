package com.enkigaming.minecraft.forge.enkipermissions.commandlisteners;

import com.enkigaming.minecraft.forge.enkipermissions.wtfquestionmark.Rank;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CmdGetRank extends CmdEnki
{
    public CmdGetRank()
    { super("getrank"); }
    
    public void onCommand(ICommandSender ics, String[] args)
    {
        EntityPlayer ep = null;
        
        if(ics instanceof EntityPlayer)
            ep = (EntityPlayer)ics;
        else
            ep = getPlayer(ics, args[0]);
        
        Rank r = Rank.getPlayerRank(LMPlayer.getPlayer(ep));
        
        LatCoreMC.printChat(ics, ep.getDisplayName() + "'s rank is " + Rank.getRankName(r));
    }
}