/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author invitado
 */
public class Person {
    private int id;
    private String name;
    private Stirng lastName;
    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setLastName(Stirng lastName) {
        this.lastName = lastName;
    }

    public Stirng getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
