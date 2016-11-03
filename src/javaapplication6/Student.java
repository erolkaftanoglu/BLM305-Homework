/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author erol
 */
public class Student {
    String number;
    String name;
    String lasname;

    public Student(String number, String name, String lasname) {
        this.number = number;
        this.name = name;
        this.lasname = lasname;
    }

    @Override
    public String toString() {
        return number + " "+ name + " "+ lasname;
    }
    
    
    
}
