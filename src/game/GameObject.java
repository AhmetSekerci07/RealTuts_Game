package game;

import javax.swing.text.Position;
import java.awt.*;

public abstract class GameObject {

    private Position position;
    private Size size;

    public GameObject(){

        position = new game.Position(50,50);
        size = new Size (50,50);

    }

    public abstract void update();
    public abstract Image getSprite();
}
