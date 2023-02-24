/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Person {
 private String name;
    private int age;  
      
    // Constructeur paramétré 
    public Person(String name, int age) { 
        this.name = name; 
        this.age = age; 
    } 
      
    // Constructeur de copie
    Person(Person p) { 
        name = p.name; 
        age = p.age; 
    } 
       
    // Surcharger la méthode toString
    @Override
    public String toString() { 
        return  name + ", " + age + " ans"; 
    } 
}
