//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.functions;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import nl.rako.rakohub.rakohub;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class Bungee implements PluginMessageListener {

    public static void bungeePluginChannel(Plugin plugin, String name) {
        plugin.getServer().getMessenger().registerOutgoingPluginChannel(plugin, name);
        plugin.getServer().getMessenger().registerIncomingPluginChannel(plugin, name, new Bungee());
    }


    public void onPluginMessageReceived(String channel, Player player, byte[] msg) {
        if (channel.equals("BungeeCord")) {
            ByteArrayDataInput input = ByteStreams.newDataInput(msg);
            String subChannel = input.readUTF();
            if (subChannel.equals("PlayerCount")) {
                String server = input.readUTF();
                rakohub.playerCount.put(server, input.readInt());
            }
            if (subChannel.equals("Connect")) return;

        }
    }

    public static void bungeeSendPlayer(Player player, String server) {
        ByteArrayDataOutput output = ByteStreams.newDataOutput();

        output.writeUTF("Connect");
        output.writeUTF(server);
        player.sendPluginMessage(rakohub.plugin, "BungeeCord", output.toByteArray());
    }

    public static void bungeePlayerCount(String server){

        ByteArrayDataOutput output = ByteStreams.newDataOutput();
        output.writeUTF("PlayerCount");
        output.writeUTF(server);


        for(Player player : Bukkit.getOnlinePlayers()) {
            player.sendPluginMessage(rakohub.plugin, "BungeeCord", output.toByteArray());
        }






    }



}
