package com.example.dubbo_demo;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.SetUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleTest {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress addr = InetAddress.getLocalHost();
//        System.out.println("Local HostAddress: " + addr.getHostAddress());
//        String hostname = addr.getHostName();
//        System.out.println("Local host name: " + hostname);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2000);
        list1.add(3);
        Set set1 = new HashSet(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2000);
        Set set2 = new HashSet(list2);

        System.out.println(list1.equals(list2));
        System.out.println(SetUtils.isEqualSet(set1, set2));
    }
}
