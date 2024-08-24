package io.github.jiangdequan;

import java.util.Scanner;

public class MainClass {

    

    public static int intSum(){
        int sum;
        try (Scanner scnr = new Scanner(System.in)) {
            int a = scnr.nextInt();
            int b = scnr.nextInt();
            sum = a + b;
        }
        return sum;

    }



    
    public static void main(String[] args) {
        


        System.out.println("Sum: " + intSum() ) ;

    }
}