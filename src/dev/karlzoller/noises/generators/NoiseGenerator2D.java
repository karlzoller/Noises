package dev.karlzoller.noises.generators;

public interface NoiseGenerator2D {
    /**
     * Provides the value of the respective noise function at the given 2D coordinates.
     */
    double getValue(int x, int y);
}
