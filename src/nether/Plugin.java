package nether;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventsListener(), this);
		this.getLogger().info("Enabled!");
	}
	
}
