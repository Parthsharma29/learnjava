package com.parth;

import java.util.Scanner;

public class prime{

     public static void main(String[] args) {
         
    int n = 100 ;
    
    

    for(int i=0;i<=n;i++){
        if(i % 2 !=0){
            System.out.print(i+",");
        }
        else if(i%3==0){
            System.out.print("Foo,");
        }
        else if(i%5==0){
            System.out.print("bar,");
        }
    

    }

    
    }
}
