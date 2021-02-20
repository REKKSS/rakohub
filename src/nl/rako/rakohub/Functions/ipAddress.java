package nl.rako.rakohub.Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class ipAddress {

    public static String getDomain;


        public static String getDomainName() throws IOException {
            // Dit pakt het ipadress van amazon
            URL amazonIpCheckUrl = new URL("http://checkip.amazonaws.com");
            BufferedReader input = new BufferedReader(new InputStreamReader(amazonIpCheckUrl.openStream()));
            String ipAddress = input.readLine();

            // Dit pakt de eventueele domain name van die output
            InetAddress intetAddress = InetAddress.getByName(ipAddress);
            String domainName = intetAddress.getHostName();

            // Print het ip en domain naar console
            return domainName;
        }

}
