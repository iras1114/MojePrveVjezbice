package Vjezba.oop.myjavaprogram;

public class Person {
    public String firstName;
    public String lastName;
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void show(){
        System.out.println("Osoba " + firstName+" "+lastName);
}
}


    
