package ru.fronto1000;


public class Ip {
    private String stringIp;
    private long longIp;

    public Ip(String stringIp) {
        this.stringIp = stringIp;

        String[] ipSplit = stringIp.split("\\.");
        long longIp = 0;
        for (int i = 0; i < ipSplit.length; i++) {
            longIp += Integer.parseInt(ipSplit[i]) * Math.pow(256, 3 - i);
        }
        this.longIp = longIp;
    }

    public Ip(long longIp) {
        this.longIp = longIp;
        this.stringIp = ((longIp >> 24) & 0xFF) + "." +

                ((longIp >> 16) & 0xFF) + "." +

                ((longIp >> 8) & 0xFF) + "." +

                (longIp & 0xFF);
    }

    public String getStringIp() {
        return stringIp;
    }

    public long getLongIp() {
        return longIp;
    }
}
