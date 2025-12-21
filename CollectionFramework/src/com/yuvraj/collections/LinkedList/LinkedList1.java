package com.yuvraj.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("David");
        list.add("KR$NA");

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
