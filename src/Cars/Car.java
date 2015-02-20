package Cars;

/**
 * Created by Alex on 11.12.2014.
 */
public class Car {
    String name;
    protected int  speed;
    protected int posX;
    int chanceBreaking;

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean broken;

    public Car(int speed, String name, int posX,  int chanceBreaking/*from 0 till 100%*/) {
        this.speed = speed;
        this.name = name;
        this.posX = posX;
        this.chanceBreaking = chanceBreaking;

    }

    public int drive() {
        if (broken) {
            return posX;
        }
        int rand =(int) (Math.random()*100);
        if (rand > 0 && rand < chanceBreaking) {
            broken = true;
            return posX;
        }else{
        posX = posX + speed;
        return posX;}
    }

    public int getPosX() {
        return posX;
    }





}
