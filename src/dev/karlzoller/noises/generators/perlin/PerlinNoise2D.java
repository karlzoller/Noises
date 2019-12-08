package dev.karlzoller.noises.generators.perlin;

import dev.karlzoller.noises.generators.NoiseGenerator2D;

public class PerlinNoise2D implements NoiseGenerator2D {

    @Override
    public double getValue(int x, int y) {
        //TODO: Implement proper Perlin Noise, for now Checkerboard!
        return (x / 30) % 2 == 0 && (y / 30) % 2 != 0 || (x / 30) % 2 != 0 && (y / 30) % 2 == 0 ? 255 : 0;
    }
}
