package com.parth;
import java.util.Random;
import java.util.Scanner;

public class Randomnew{

 public static void main(String[] args) {
    
 

    Random r = new Random();
    int n= r.nextInt(8);
    System.out.println(n);
    int count=0;
   
   


    while(true){
    	count++;
        System.out.println("enter the guess");
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
    if(n < c){
        System.out.println("think of a less number");
        continue;
    }
    else if(n>c){
        System.err.println("think of a greater no");
        continue;
    }
    else if(n==c){
        System.out.println("u guessed it right");
        break;
    }
   }
    System.out.println("no of tries"+count);


 }
}