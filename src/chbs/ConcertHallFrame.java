/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Simon
 */
public class ConcertHallFrame {

    public void ConcertHallFrame() {
    }

    public void initComponents() {

        //Creating Variables
        JFrame concertHallFrame;
        JPanel pnlBookings = new JPanel(),
                pnlDetails = new JPanel(),
                pnlStage = new JPanel(),
                pnlSeating = new JPanel(),
                pnlEntrance = new JPanel(),
                pnlGoldMiddle = new JPanel(),
                pnlGoldRight = new JPanel(),
                pnlSilverMiddle = new JPanel(),
                pnlSilverRight = new JPanel(),
                pnlBronzeMiddle = new JPanel(),
                pnlBronzeRight = new JPanel();
        JLabel lblGoldSection = new JLabel("Gold Section:"),
                lblSilverSection = new JLabel("Silver Section:"),
                lblBronzeSection = new JLabel("Bronze Section:");

        //setting and configuring panels layout and contents
        concertHallFrame = new JFrame();
        concertHallFrame.setLayout(new FlowLayout());
        concertHallFrame.add(pnlBookings);
        concertHallFrame.add(pnlDetails);

        pnlBookings.setLayout(new GridLayout(3, 1));
        pnlBookings.add(pnlStage);
        pnlBookings.add(pnlSeating);
        pnlBookings.add(pnlEntrance);

        pnlSeating.setLayout(new GridLayout(3, 3));
        pnlSeating.add(lblGoldSection);
        pnlSeating.add(pnlGoldMiddle);
        pnlSeating.add(pnlGoldRight);
        pnlSeating.add(lblSilverSection);
        pnlSeating.add(pnlSilverMiddle);
        pnlSeating.add(pnlSilverRight);
        pnlSeating.add(lblBronzeSection);
        pnlSeating.add(pnlBronzeMiddle);
        pnlSeating.add(pnlBronzeRight);

        pnlGoldRight.setLayout(new GridLayout(3, 5));
        for(int a = 1; a < 6; a++) pnlGoldRight.add(new Seat());
        concertHallFrame.setSize(900, 900);
        concertHallFrame.setVisible(true);
    }

}
