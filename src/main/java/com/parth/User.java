package com.parth;

public class User {
    String firstName;
    String lastName;
    String email;
    String country;

    
    User(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    User(String firstName, String lastName, String email) {
        this(firstName, lastName);   
        this.email = email;
     }


    public void sayName() {
        System.out.println("Hello! My name is "+firstName+" "+lastName);
    }

    public void saluation() {
        String gender = "male";
        String title = "Mr";
        if(gender == "male") {
            title = "Mr";
        }   
        else {
            title = "Miss";
        }

        System.out.println(title);
    }
  

    public static void main(String[] args) {

        User user2 = new User("James","Ray", "james@gmail.com");
        System.out.println(user2);

      

    }

    public String toString() {
        return this.firstName+" "+this.lastName+" "+this.email+" "+this.country;
        
    }


}