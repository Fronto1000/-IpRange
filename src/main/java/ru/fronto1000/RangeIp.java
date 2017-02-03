package ru.fronto1000;

import java.util.ArrayList;
import java.util.List;

public class RangeIp {
    private List<Ip> ipList = new ArrayList<Ip>();

    public RangeIp(Ip ip1,Ip ip2) {

        int range = (int) Math.abs(ip1.getLongIp()-ip2.getLongIp());
        long start = Math.min(ip1.getLongIp(),ip2.getLongIp());
        for (int i = 0; i < range - 1; i++) {
            start++;
            Ip ip = new Ip(start);
            this.ipList.add(ip);
        }
    }

    public List<Ip> getIpList() {
        return ipList;
    }
}
