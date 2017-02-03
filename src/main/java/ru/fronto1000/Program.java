package ru.fronto1000;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите ip");
            String ip1 = bufferedReader.readLine();
            String ip2 = bufferedReader.readLine();
            RangeIp rangeIp = new RangeIp(new Ip(ip1),new Ip(ip2));
            List<Ip> range = rangeIp.getIpList();
            for (Ip ip:range) {
                System.out.println(ip.getStringIp());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
