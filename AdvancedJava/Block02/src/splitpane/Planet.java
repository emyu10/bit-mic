package splitpane;

import javax.swing.*;

public class Planet {
    private String name;
    private double radius;
    private int moons;
    private ImageIcon image;

    public Planet(String n, double r, int m) {
        name = n;
        radius = r;
        moons = m;
        image = new ImageIcon("planets/" + name + ".png");
    }

    public String toString() {
        return name;
    }

    public String getDescription() {
        return "Radius: " + radius + "\nMoons: " + moons + "\n";
    }

    public ImageIcon getImage() {
        return image;
    }
}
