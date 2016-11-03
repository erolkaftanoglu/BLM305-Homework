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
public class Lesson {
    String code;
    String name;
    String teacher;

    public Lesson(String code, String name, String teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return code+" "+name+" "+teacher;
    }
    
    
    
}
