import gameobject.ObjectOnScreen;
import gameobject.Snake;

public class GameScreen {

    int screenSize = 10;
    char emptyCell= '*';

    char [][]screen = new char[screenSize][screenSize];

    void fillScreenWithBlankCell(){
        for (int i=0; i<screenSize;i++){
            for (int j=0;j<screenSize;j++){
                screen[i][j] = emptyCell;
            }
        }
    }
    void printScreen(){
        for (int i=0; i<screenSize; i++){
            for(int j=0;j<screenSize;j++){
                System.out.print(screen[j][i]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void setObjectOnScreen(ObjectOnScreen o){
        screen[o.x][o.y] = o.printTableCharacter;
    }


}
