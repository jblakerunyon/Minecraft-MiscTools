package com.runyontech.misctools;

import org.bukkit.plugin.java.JavaPlugin;

public class MiscTools extends JavaPlugin {

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
        System.out.println("Verilious' Misc Tools Enabled!");
        this.getCommand("launch").setExecutor(new CommandLaunch());
    }
}
