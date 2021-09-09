package gameobject;

public abstract class ObjectOnScreen {
    public int x,y;
    public char printTableCharacter;
    public ObjectOnScreen (int x, int y, char printTableCharacter) {
        this.x = x;
        this.y = y;
        this.printTableCharacter = printTableCharacter;
    }
    public boolean intersectsWith(ObjectOnScreen other) {
        return other.x==other.x && other.y == other.y;
    }

}
