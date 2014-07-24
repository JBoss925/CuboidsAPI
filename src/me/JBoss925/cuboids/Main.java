package me.JBoss925.cuboids;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by jagger1 on 7/17/14.
 */
public class Main extends JavaPlugin {

    public void onEnable(){
        setClass(Cuboid.class);
}

    public void setClass(final Class<?> clazz) {
        if (ConfigurationSerializable.class.isAssignableFrom(clazz)) {
                Class<? extends ConfigurationSerializable> serializable = clazz.asSubclass(ConfigurationSerializable.class);
                ConfigurationSerialization.registerClass(serializable);
        }
    }
}