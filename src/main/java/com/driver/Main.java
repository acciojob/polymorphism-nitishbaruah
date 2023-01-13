package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Product p=new Product();

        System.out.println(p.product(sc.nextInt(),sc.nextInt()));
        System.out.println(p.product(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println(p.product(sc.nextDouble(),sc.nextDouble()));


    }
}
class Product{
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}