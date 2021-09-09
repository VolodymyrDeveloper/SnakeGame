package gameobject;

public class Snake extends ObjectOnScreen {

    int currentLenght;
    float speed;

    public Snake(int x, int y) {
        super(x, y, '#');

    }

    public void collideWith(ObjectOnScreen collision) {
        if (collision instanceof Wall) {
            System.out.println("Game over!");

        } else if (collision instanceof Food) {
            System.out.println("Level up!");
        }
    }
}