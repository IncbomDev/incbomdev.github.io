package tld.party++.files;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (command.getName().equalsIgnoreCase("Party")) {
            sender.sendMessage("-----Party-----
                               /p create - Create a Party
                               /p invite {username} - Invite a user to your party
                               /p promote {username} - Promote a user
                               /p demote {username} - Demote a user
                               /p help - Bring up this menu
                               /p list - List your party members
                               /p accpet {username} - Accept a party invite
                               /p disband - Disband your party
                               /p leave - Leave your current party
                               /p remove {username} - Kick a user from your party
                               /p warp - Warp your party into your game
                               /p admin - List admin commands for party ");
                               
     @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (command.getName().equalsIgnoreCase("Party")) {
            sender.sendMessage("-----Party Admin-----
                              /p hijack - Become leader of a specific party
                              /p disband {username}" - Disband a specific party
                              /p listallparties - List all current parties);
            return true;
        }
        return false;
    }

}
