//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.Functions;

import org.bukkit.Bukkit;

public class console {
    public console() {
    }

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }
}
