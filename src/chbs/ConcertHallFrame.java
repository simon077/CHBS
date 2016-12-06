/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class ConcertHallFrame extends JFrame {

    public void ConcertHallFrame() {
    }

    public void initComponents() {

        //Creating Variables
        JFrame frmConcertHall;
        JPanel pnlBookings = new JPanel(),
                pnlDetails = new JPanel(),
                pnlStage = new DrawStage(),
                pnlSeating = new JPanel(),
                pnlEntrance = new DrawEntrance(),
                pnlMiddleNumbers = new JPanel(),
                pnlRightNumbers = new JPanel(),
                pnlGoldMiddle = new JPanel(),
                pnlGoldRight = new JPanel(),
                pnlTopLetters = new JPanel(),
                pnlSilverMiddle = new JPanel(),
                pnlSilverRight = new JPanel(),
                pnlMiddleLetters = new JPanel(),
                pnlBronzeMiddle = new JPanel(),
                pnlBronzeRight = new JPanel(),
                pnlBottomLetters = new JPanel(),
                pnlEmpty = new JPanel();
        JLabel lblGoldSection = new JLabel("Gold Section:"),
                lblSilverSection = new JLabel("Silver Section:"),
                lblBronzeSection = new JLabel("Bronze Section:"),
                lblEmpty = new JLabel();
        List<Seat> unsavedBookings = new ArrayList<Seat>();

        Seat[] seatsOnForm = new Seat[90];
        GridLayout hGapGrid4x4 = new GridLayout(4, 4);
        hGapGrid4x4.setHgap(10);
        GridLayout hGapGrid3x5 = new GridLayout(3, 5);
        hGapGrid3x5.setHgap(2);
        GridLayout grid3x1 = new GridLayout(3, 1);
        GridLayout hGapGridMiddle1x5 = new GridLayout(1, 5);
        hGapGridMiddle1x5.setHgap(2);
        GridLayout hGapGridRight1x5 = new GridLayout(1, 5);
        hGapGridRight1x5.setHgap(2);
        GridLayout hvGapGrid0x2 = new GridLayout(0, 2);
        hvGapGrid0x2.setHgap(10);
        hvGapGrid0x2.setVgap(10);

        //Adding heading numbers
        //adding creating Seats in an array
        //setting and configuring panels layout and contents
        frmConcertHall = new JFrame();

        frmConcertHall.setTitle(
                "Concert Hall");
        frmConcertHall.setLayout(
                new FlowLayout());
        frmConcertHall.add(pnlBookings);

        frmConcertHall.add(pnlDetails);

        frmConcertHall.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlBookings.setLayout(
                new GridLayout(3, 1));
        pnlBookings.add(pnlStage);

        pnlBookings.add(pnlSeating);

        pnlBookings.add(pnlEntrance);

        pnlStage.repaint();

        pnlEntrance.repaint();

        pnlSeating.setLayout(hGapGrid4x4);

        pnlSeating.add(pnlEmpty);

        pnlSeating.add(pnlMiddleNumbers);

        pnlSeating.add(pnlRightNumbers);

        pnlSeating.add(lblEmpty);

        pnlSeating.add(lblGoldSection);

        pnlSeating.add(pnlGoldMiddle);

        pnlSeating.add(pnlGoldRight);

        pnlSeating.add(pnlTopLetters);

        pnlSeating.add(lblSilverSection);

        pnlSeating.add(pnlSilverMiddle);

        pnlSeating.add(pnlSilverRight);

        pnlSeating.add(pnlMiddleLetters);

        pnlSeating.add(lblBronzeSection);

        pnlSeating.add(pnlBronzeMiddle);

        pnlSeating.add(pnlBronzeRight);

        pnlSeating.add(pnlBottomLetters);

        //Create all 90 seats according to their colour
        for (int a = 0; a < 30; a++) {
            seatsOnForm[a] = new Seat(false, a, CHBS.priceGold, "gold", null);
        }
        for (int a = 30; a < 60; a++) {
            seatsOnForm[a] = new Seat(false, a, CHBS.priceSilver, "silver", null);
        }
        for (int a = 60; a < 90; a++) {
            seatsOnForm[a] = new Seat(false, a, CHBS.priceBronze, "bronze", null);
        }

        //Add actionlisteners to the seats
        for (int a = 0; a < 90; a++) {
            seatsOnForm[a].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // display/center the jdialog when the button is pressed
                    Seat source = (Seat) e.getSource();
                    if (source.booked == true && source.colour == "bronze") {
                        JOptionPane.showMessageDialog(frmConcertHall, "Bronze Seats can not be unreserved");
                        return;
                    } else if (source.booked == true && source.colour == "silver") {
                        unsavedBookings.remove(source);
                        source.setBackground(Seat.silver);
                        source.setBookedBy(null);
                        source.setBooked(false);
                    } else if (source.booked == true && source.colour == "gold") {
                        unsavedBookings.remove(source);
                        source.setBackground(Seat.gold);
                        source.setBookedBy(null);
                        source.setBooked(false);
                    } else {
                        String bookerName = JOptionPane.showInputDialog(frmConcertHall, "Please enter the name of person booking this seat");
                        if (bookerName != null) {
                            ((Component) source).setBackground(Color.red);
                            source.setBooked(true);
                            source.setBookedBy(bookerName);
                            unsavedBookings.add((Seat) source);

                        }

                    }
                }
            });
        }

        //Column Heading Numbers
        pnlMiddleNumbers.setLayout(hGapGridMiddle1x5);
        for (int a = 10;
                a > 5; a--) {
            pnlMiddleNumbers.add(new JLabel("" + a, JLabel.CENTER));
        }

        pnlRightNumbers.setLayout(hGapGridRight1x5);
        for (int a = 5;
                a > 0; a--) {
            pnlRightNumbers.add(new JLabel("" + a, JLabel.CENTER));
        }

        //Row Lettering
        pnlTopLetters.setLayout(grid3x1);

        pnlTopLetters.add(
                new JLabel("A"));
        pnlTopLetters.add(
                new JLabel("B"));
        pnlTopLetters.add(
                new JLabel("C"));

        pnlMiddleLetters.setLayout(grid3x1);

        pnlMiddleLetters.add(
                new JLabel("D"));
        pnlMiddleLetters.add(
                new JLabel("E"));
        pnlMiddleLetters.add(
                new JLabel("F"));

        pnlBottomLetters.setLayout(grid3x1);

        pnlBottomLetters.add(
                new JLabel("G"));
        pnlBottomLetters.add(
                new JLabel("H"));
        pnlBottomLetters.add(
                new JLabel("I"));

        //Gold Rows
        pnlGoldRight.setLayout(hGapGrid3x5);

        for (int a = 5;
                a > 0; a--) {
            pnlGoldRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 15;
                a > 10; a--) {
            pnlGoldRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 25;
                a > 20; a--) {
            pnlGoldRight.add(seatsOnForm[a - 1]);
        }

        pnlGoldMiddle.setLayout(hGapGrid3x5);
        for (int a = 10;
                a > 5; a--) {
            pnlGoldMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 20;
                a > 15; a--) {
            pnlGoldMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 30;
                a > 25; a--) {
            pnlGoldMiddle.add(seatsOnForm[a - 1]);
        }

        //Silver Rows
        pnlSilverRight.setLayout(hGapGrid3x5);
        for (int a = 35;
                a > 30; a--) {
            pnlSilverRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 45;
                a > 40; a--) {
            pnlSilverRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 55;
                a > 50; a--) {
            pnlSilverRight.add(seatsOnForm[a - 1]);
        }

        pnlSilverMiddle.setLayout(hGapGrid3x5);
        for (int a = 40;
                a > 35; a--) {
            pnlSilverMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 50;
                a > 45; a--) {
            pnlSilverMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 60;
                a > 55; a--) {
            pnlSilverMiddle.add(seatsOnForm[a - 1]);
        }

        //Bronze Rows
        pnlBronzeRight.setLayout(hGapGrid3x5);
        for (int a = 65;
                a > 60; a--) {
            pnlBronzeRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 75;
                a > 70; a--) {
            pnlBronzeRight.add(seatsOnForm[a - 1]);
        }
        for (int a = 85;
                a > 80; a--) {
            pnlBronzeRight.add(seatsOnForm[a - 1]);
        }

        pnlBronzeMiddle.setLayout(hGapGrid3x5);
        for (int a = 70;
                a > 65; a--) {
            pnlBronzeMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 80;
                a > 75; a--) {
            pnlBronzeMiddle.add(seatsOnForm[a - 1]);
        }
        for (int a = 90;
                a > 85; a--) {
            pnlBronzeMiddle.add(seatsOnForm[a - 1]);
        }

        frmConcertHall.setSize(
                1500, 900);
        frmConcertHall.setVisible(
                true);

        pnlDetails.setLayout(hvGapGrid0x2);

        pnlDetails.add(
                new JLabel("Concert Details:"));
        pnlDetails.add(
                new JLabel());
    }

}
