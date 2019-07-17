package main;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


    // passs scode as parameter - using anomous in Java (the only wat)
        // lambda is another way to pass code as parameter

        // example anomous class
 /*       Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }*/

    //lmbda expression
        Comparator<String> comparator =

                //(String s1, String s2) -> Integer.compare(s1.length(), s2.length());

                //more complicated lambda expression
                (String s1, String s2) -> {
                    System.out.println("Iam comparinf string");
                    return Integer.compare(s1.length(), s2.length());
                };

            //Arrays.sort(tabString, comparator);




    };


    //exaple with anomous class
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                int i = 0;
//                while(i++<10){
//                    System.out.println("It works!");
//                }
//
//            }
//        };

    //lambda expression
    Runnable r =()-> {
        int i =0;
        while(i++<10) {
            System.out.println("It works!");
        }
    };




        //Executors.newSigleThreadExecutor().execute(r);
        // we pass code as paremter


    }
}
