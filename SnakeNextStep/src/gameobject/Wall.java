package gameobject;

public class Wall extends ObjectOnScreen{

    public Wall (int x, int y,int gf) {
        super(x, y, 'W');

    }
    public Wall (int x, int y) {
        super(x, y, '~');
    }
}
