package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   float width;
	   float height;

        Scanner scanner = new Scanner(System.in);//khai báo đối tượng

        System.out.println("Enter width: ");
        width = scanner.nextFloat();//nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//nhập chiều dài

        float area = width * height;

        System.out.println("Area is: "+area);
    }
}
