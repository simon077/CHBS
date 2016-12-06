/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Simon
 */
public class DrawEntrance extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        g2.setColor(Color.BLACK);
        BasicStroke pen = new BasicStroke(4F);
        g2.setStroke(pen);
        setSize(600, 100);
        // Left Stage
        g2.drawLine(220, 50, 340, 50);
        //Left Stage After Gap
        g2.drawLine(400, 50, 520, 50);
        g2.drawString("Entrance", 345, 50);

    }
}
