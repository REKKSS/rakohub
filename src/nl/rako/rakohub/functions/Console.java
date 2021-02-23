//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.functions;

import org.bukkit.Bukkit;

public class Console {
    public Console() {
    }

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }
}
