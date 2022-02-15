package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
	// write your code here

        int sum=0;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sum =0;

        for(int i=a;i<=b;i++){
            sum +=i;
            if(i==a){

            }else{
                sb.append("+"+i);
            }
}
        sb.append("="+sum);
        System.out.print(sb.toString());
    }
}
