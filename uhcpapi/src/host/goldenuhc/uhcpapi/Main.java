package host.goldenuhc.uhcpapi;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class Main extends PlaceholderExpansion{
    @Override
    public boolean canRegister() {
    	return true;
    }
    @Override
    public String getAuthor() {
    	return "theencomputers";
    }
    @Override
    public String getIdentifier() {
    	return "uhcpapi";
    }
    @Override
    public String getPlugin() {
        return null;
    }
    @Override
    public String getVersion() {
    	return "1.0.0";
    }
    

		@Override
        public String onPlaceholderRequest(Player player, String identifier) {

	if (identifier.equals("prefix")) {
	    if (player.getPlayer().getScoreboard().getPlayerTeam(player.getPlayer())== null) {
	    	return "";
	    }
	else {
	    Team team= player.getPlayer().getScoreboard().getPlayerTeam(player.getPlayer());
	    	return new StringBuilder().append(team.getPrefix()).toString();
	    }
	}
	if (identifier.contains("borderradiusworld-")) {
		String[] identifierarray = identifier.split("-");
	    if (identifierarray[0].equals("borderradiusworld")) {
	    	if (Bukkit.getWorld(identifierarray[1]) != null) {
	    		World borderradiusworld = Bukkit.getWorld(identifierarray[1]);
	    		WorldBorder border = borderradiusworld.getWorldBorder();
	    		String borderradius = String.valueOf(Math.round(border.getSize()/2));
	    		return borderradius;


	    	}
	    	else {
	    		return "";
	    	}
	    
	    }
	

    }
	if (identifier.contains("borderdiameterworld-")) {
		String[] identifierarray = identifier.split("-");
	    if (identifierarray[0].equals("borderdiameterworld")) {
	    	if (Bukkit.getWorld(identifierarray[1]) != null) {
	    		World borderradiusworld = Bukkit.getWorld(identifierarray[1]);
	    		WorldBorder border = borderradiusworld.getWorldBorder();
	    		String borderradius = String.valueOf(Math.round(border.getSize()));
	    		return borderradius;


	    	}
	    	else {
	    	return "";
	    	}
	    
	    }
	

    }


	return null;
        }
}

