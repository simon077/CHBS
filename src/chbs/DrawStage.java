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
 * @author Andy
 */
public class DrawStage extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        g2.setColor(Color.BLACK);
        BasicStroke pen = new BasicStroke(4F);
        g2.setStroke(pen);
        setSize(600, 200);
        // Left Stage
        g2.drawLine(190, 130, 230, 130);
        //Left Stage After Gap
        g2.drawLine(280, 130, 320, 130);
        //Nothing on xAxis but Y axis is going downward.
        g2.drawLine(320, 130, 320, 170);
        //Nothing on yAxis but Xaxis is going from left to right across the stage.
        g2.drawLine(320, 170, 420, 170);
        //Nothing on xAxis but Y axis is going upward.
        g2.drawLine(420, 170, 420, 130);
        // Right Stage
        g2.drawLine(420, 130, 460, 130);
        // After Gap
        g2.drawLine(510, 130, 550, 130);

        
        //Adding text for direction
        g2.drawString("Stage", 352, 150);
        g2.drawString("Fire Exit", 230, 120);
        g2.drawString("Fire Exit", 460, 120);

    }
}
