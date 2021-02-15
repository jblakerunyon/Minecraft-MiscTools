package com.runyontech.misctools;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CommandLaunch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player)
        {
            Player player = (Player) commandSender;
            if(s.equalsIgnoreCase("launch"))
            {
                player.setVelocity(player.getLocation().getDirection().multiply(5));
            } else if(s.equalsIgnoreCase("launch") && strings.length != 0)
            {
                int val = Integer.parseInt(strings[0]);
                player.setVelocity(player.getLocation().getDirection().multiply(val));
            }
        }

        return true;
    }
}
