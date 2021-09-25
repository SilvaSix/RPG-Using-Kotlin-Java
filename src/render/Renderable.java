package render;

import java.awt.*;


public interface Renderable extends Comparable<Object>{
    public void draw(Graphics2D g);
    public int getLayer();

    public default int compareTo(Object o){
        Renderable object = (Renderable)o;

        if(getLayer() < object.getLayer())
            return -1;
        else if(getLayer() > object.getLayer())
            return 1;
        else
            return 0;
    }
}
