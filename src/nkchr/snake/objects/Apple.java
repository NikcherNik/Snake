package nkchr.snake.objects;
import nkchr.snake.SnakeGame;
/**
 * Created by Nikcher on 06.04.2016.
 */
public class Apple {

    SnakeGame main;

    public int posX;
    public int posY;

    public Apple(int startX, int startY){

        posX = startX;
        posY = startY;

    }

    public void setRandomPosition(){
        posX = (int)(Math.random()*main.WIDTH);
        posY = (int)(Math.random()*main.HEIGHT);
    }
}
