package Cars;

/**
 * Created by Alex on 13.12.2014.
 */
public class SelfFixiesCar extends Car {

    SelfFixiesCar (int speed, String name, int posX,  int chanceBreaking){
        super(speed,name,posX,chanceBreaking);
    }

    @Override
    public int drive() {
        if (broken) {

            return fix();
        }
        int rand =(int) (Math.random()*100);
        if (rand > 0 && rand < chanceBreaking) {
            broken = true;
            return posX;
        }else{
            posX = posX + speed;
            return posX;
        }
    }
    public int fix (){
        broken = false;
        System.out.println("Car was broken, but already fixed");
        return posX;
    }
}
