/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * @author Simon
 */
public class Seat extends javax.swing.JButton {

    boolean booked;
    int id, price;
    String colour, bookedBy;
    static Color gold = new Color(255, 215, 0);
    static Color silver = new Color(192, 192, 192);
    static Color bronze = new Color(205, 127, 50);

    //Constructors
    public Seat() {

    }

    public Seat(boolean booked, int id, int price, String colour, String bookedBy) {
        this.booked = booked;
        this.id = id;
        this.price = price;
        this.colour = colour;
        this.bookedBy = bookedBy;

        if (colour == "gold") {
            setBackground(gold);
        }
        if (colour == "silver") {
            setBackground(silver);
        }
        if (colour == "bronze") {
            setBackground(bronze);
        }
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
    public String getBookedBy(){
        return bookedBy;
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
    public void setBookedBy(String BookedBy){
        bookedBy = BookedBy;
    }
}
