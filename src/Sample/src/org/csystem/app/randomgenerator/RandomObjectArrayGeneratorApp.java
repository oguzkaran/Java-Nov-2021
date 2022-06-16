package org.csystem.app.randomgenerator;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.geometry.MutablePoint;
import org.csystem.util.wrapper.IntValue;

import java.util.Random;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    public static void run()
    {
        Random r = new Random();
        RandomObjectArrayFactory factory = new RandomObjectArrayFactory(r);
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (Object o : factory.getObject(count)) {
            System.out.println("--------------------------------------------------");
            String typeName = o.getClass().getName();
            System.out.printf("Dinmamik tür ismi:%s%n", typeName);

            if (o instanceof IntValue i) {
                System.out.println(i.getValue());
                System.out.println(i.getValue() * 2);
            }
            else if (o instanceof MutablePoint p) {
                System.out.println(p.toString());
                p.offset(20);
                System.out.println(p.toString());
            }
            else if (o instanceof int [] a) {
                ArrayUtil.print(2, a);
                System.out.printf("Toplam:%d%n", ArrayUtil.sum(a));
            }
            else  if (o instanceof String s) {
                System.out.println(s);
                System.out.println(s.toUpperCase());
            }

            System.out.println("--------------------------------------------------");
        }
    }
}
