package gameobject;

public class Food extends ObjectOnScreen {

     public int growthFactor;

        public Food (int x, int y,int gf) {
        super(x, y, 'F');
        this.growthFactor=gf;
    }
       public Food(int x, int y) {
        super(x, y, '@');
    }
}





