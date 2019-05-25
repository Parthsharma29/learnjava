

import java.util.Random;
import java.util.Scanner;

public class Randomnew{

 public static void main(String[] args) {
    
 

    Random r = new Random();
    int n= r.nextInt(8);
    System.out.println(n);
   


    for(int i=0;i<10;i++){
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
    }

 }
