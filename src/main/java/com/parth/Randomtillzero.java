package com.parth;

import java.util.Random;

public class Randomtillzero{

 public static void main(String[] args) {
    
 

    Random r = new Random();
    while(true){
        int n= r.nextInt(11);
        if(n==0){
            break;
        }
        else{
            System.out.print(n+",");
        }

    }
    
}



}