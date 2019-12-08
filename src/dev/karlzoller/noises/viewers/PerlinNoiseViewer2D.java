package dev.karlzoller.noises.viewers;


import dev.karlzoller.noises.generators.perlin.PerlinNoise2D;
import dev.karlzoller.noises.gui.Canvas;

import javax.swing.*;

public class PerlinNoiseViewer2D {
    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Perlin Noise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        Canvas canvas = new Canvas(new PerlinNoise2D());
        frame.getContentPane().add(canvas); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}
