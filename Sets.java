package collectionspractice;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        System.out.println(cont());

    }
    public static TreeSet cont() {
        String s = "Mississippi";
        String[] arr = s.split("");
        
        //HashSet used. Because TreeSets are very slow because of sorting all elements with natural order.
        HashSet<String> set = new HashSet<>(List.of(arr));
        
        //After adding the elements to "set" TreeSet going to sort all elements according to the natural order.
        TreeSet<String> trSet = new TreeSet<>(set);
        return trSet;
    }

}
