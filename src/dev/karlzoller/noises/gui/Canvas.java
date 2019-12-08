package dev.karlzoller.noises.gui;

import dev.karlzoller.noises.generators.NoiseGenerator2D;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    NoiseGenerator2D noiseGenerator2D;

    public Canvas(NoiseGenerator2D noiseGenerator2D) {
        this.noiseGenerator2D = noiseGenerator2D;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                if (noiseGenerator2D.getValue(x, y) > 0) {
                    g.drawLine(x, y, x, y);
                }
            }
        }
    }
}
