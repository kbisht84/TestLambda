package com.company.kbisht;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
//       Thread th=new Thread(new Runnable() {
//           @Override
//           public void run() {
//               System.out.println("This is secondary thread");
//           }
//       }) ;

        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9);

      //  values.forEach((value)->System.out.println(value));
        //Lambda usage
//       Thread th=new Thread(()->{
//                System.out.println("This is the secondary thread");
//       });
//       th.start();
//
//       System.out.println("This is main thread");

        values.stream().forEach(System.out::println);



    }
}
