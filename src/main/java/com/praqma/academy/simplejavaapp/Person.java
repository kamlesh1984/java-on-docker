/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praqma.academy.simplejavaapp;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sofus
 */
@XmlRootElement
public class Person {
private String name;
    public Person(String name) {
        this.name=name;
    }

    public Person() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     @Override
    public String toString() {
        return name;
    }
    
}
