package com.parth;

public class employee {

  String firstname1 ;
  String lastname;
  String d_o_b;
  String joiningdate;
  String department;




employee(String firstname1 ,String lastname, String d_o_b,String joiningdate,String department ){

    this.firstname1 = firstname1 ;
    this.lastname = lastname;
    this.d_o_b = d_o_b;
    this.joiningdate=joiningdate;
    this.department = department;
}

public static void main(String[] args) {
    employee emp=new employee("abc", "xyz", "ddd", "29/11/1654", "it");  
    System.out.println(emp);
}
 public String toString(){

 return  this.firstname1+ " " +this.lastname+ " " +this.d_o_b +" "+this.department;
}
}