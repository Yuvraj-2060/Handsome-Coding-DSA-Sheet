package com.yuvraj.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Yuvraj Singh");
        list.add("Shakti Singh");
        list.add("Manvi Singh");
        list.add("Sumit Singh");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
