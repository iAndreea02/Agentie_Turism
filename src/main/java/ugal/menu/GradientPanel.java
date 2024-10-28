/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugal.menu;

import ugal.login.*;
import javax.swing.*;
import java.awt.*;

public class GradientPanel extends JPanel {
    private Color color1;
    private Color color2;

    public GradientPanel(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Crearea gradientului
        GradientPaint gradient = new GradientPaint(0,0, color1, getHeight(),0, color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight()); // Umple întregul panou
    }
}
