package kr.mocha;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Spawn extends PluginBase implements Listener{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("spawn")){
			try{
				Player player = (Player)sender;
				player.teleport(player.getLevel().getSpawnLocation());
				player.sendMessage("스폰으로 이동되었습니다.");
			}catch (ClassCastException e){}
		}
		return super.onCommand(sender, command, label, args);
	}
}