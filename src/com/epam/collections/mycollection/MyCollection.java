package com.epam.collections.mycollection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyCollection {

    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }
        ListIterator<Integer> it = mylist.listIterator();
        while (it.hasNext()) {
            it.next();
            if (!it.hasNext()){
                break;
            }
            it.next();
            it.set(3);
        }
      it = mylist.listIterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
    }

}
