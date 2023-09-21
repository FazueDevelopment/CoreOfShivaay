package cf.monaz.coreofshivaay;

import org.bukkit.plugin.java.JavaPlugin;

public final class CoreOfShivaay extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("CoreOfShivaay Started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("CoreOfShivaay Going To Offline!");
    }
}
