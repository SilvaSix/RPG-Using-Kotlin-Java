package objects;

import core.FPS;
import core.Input;
import render.Renderable;
import render.Renderer;
import update.Updateable;
import update.Updater;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Spaceship implements Renderable, Updateable {


    private static double width = 75;
    private static double height = 75;
    private double x;
    private double y;


    private int layer = 1;

    private static BufferedImage spaceship;

    private double speed = 200;

    public Spaceship(double x, double y) throws IOException {
        this.x = x;
        this.y = y;

        spaceship = ImageIO.read(new File("res/spaceship.png"));
        Renderer.addRenderableObject(this);
        Updater.addUpdateableObjects(this);
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Spaceship.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Spaceship.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(spaceship, (int)x, (int)y, (int) width, (int) height, null);
    }

    @Override
    public int getLayer() {
        return layer;
    }

    @Override
    public void update() {
        if(Input.keys[Input.RIGHT])
            x += speed * FPS.getDeltaTime();
        if(Input.keys[Input.LEFT])
            x -= speed * FPS.getDeltaTime();
        if(Input.keys[Input.UP])
            y -= speed * FPS.getDeltaTime();
        if(Input.keys[Input.DOWN])
            y += speed * FPS.getDeltaTime();
    }
}
