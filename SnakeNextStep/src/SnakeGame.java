import gameobject.Food;
import gameobject.ObjectOnScreen;
import gameobject.Snake;
import gameobject.Wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakeGame {
    //input from player
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    //game loading
    Snake snake1 = new Snake(1,3);
    List<ObjectOnScreen> gameObjects = new ArrayList<>();

    gameObjects.add (new Food(1,2));
    gameObjects.add (new Food(4,6));
    gameObjects.add (new Food(2,2));

    gameObjects.add (new Wall(2,4));
    gameObjects.add (new Wall(2,7));

    GameScreen gameScreen = new GameScreen();
    gameScreen.fillScreenWithBlankCell();
    char input;

    //main loop
    while (true){
        gameScreen.fillScreenWithBlankCell();
        gameScreen.setObjectOnScreen(snake1);
        for(ObjectOnScreen drawable : gameObjects){
           gameScreen.setObjectOnScreen(drawable);
       }
        gameScreen.printScreen();
        // todo user input
        switch (input = scanner.nextLine().charAt(0)) {
            case 'a':
                snake1.x =snake1.x-1;
                break;
            case 'd':
                snake1.x =snake1.x+1;
                break;
            case 's':
                snake1.y =snake1.y+1;
                break;
            case 'w':
                snake1.y =snake1.y-1;
                break;
        }

//     todo calculate game status
//         check intersec
        for (ObjectOnScreen obj: gameObjects){
            if (snake1. intersectsWith(obj)) {
                System.out.println("Collide!");
                snake1.collideWith(obj);
            }
        }



    }
    }
}
