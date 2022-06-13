package main.java.files4blockchain;

import java.security.MessageDigest;

public class SHA256Controller {
    
    public static String hash(String data) {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            StringBuffer hexString = new StringBuffer();

            for(int i=0; i<hash.length; i++)
            {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                hexString.append(hexadecimal);
            }

            return hexString.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
