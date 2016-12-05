/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

import java.awt.event.ActionEvent;

/**
 * @author Simon
 */
public class Seat extends javax.swing.JButton {

    boolean booked;
    int id, price;
    String colour;

    //Constructors
    public Seat() {

    }

    public Seat(boolean booked, int id, int price, String colour) {
        this.booked = booked;
    }

    //Gets and Sets
    public boolean getBooked() {
        return booked;
    }

    public int getID() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void setBooked(boolean Booked) {
        booked = Booked;
    }

    public void setID(int ID) {
        id = ID;
    }

    public void setPrice(int Price) {
        price = Price;
    }

    public void setColour(String Colour) {
        colour = Colour;
    }
    
    public void actionPerformed(ActionEvent e) { 

}
}
