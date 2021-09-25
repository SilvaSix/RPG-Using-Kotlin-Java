package core;

import objects.Spaceship;
import render.Renderer;
import update.Updateable;
import update.Updater;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Window window = new Window("This is a game name!", Window.getWinWidth(), Window.getWinHeight());
        Renderer render = new Renderer();
        Updater updater = new Updater();

        window.addKeyListener(new Input());
        window.add(render);
        window.packWindow();
        window.setVisible(true);

        boolean runGame = true;

        new Spaceship(100,100);

        FPS.calcBeginTime();
        while(runGame){
            updater.update();
            render.repaint();

            FPS.calcDeltaTime();
        }

    }
}
