package Cars;

/**
 * Created by Alex on 11.12.2014.
 */
public class Race {
    public static void main(String[] args) {
        Car []racer = new Car[5];

        racer[0]=new Car(10, "Honda", 0, 8);
        racer[1]=new Car(13, "Toyota", 0, 10);
        racer[2]=new Car(11, "Mazda", 0, 10);
        racer[3]=new Car(15, "Ferrari", 0, 18);
        racer[4]=new SelfFixiesCar(16, "VAZ", 0, 20);

        int finish = 100;
        int currentPos = 0;
        int prevPos = 0;
        int laps = 10;

        for(int j=1;j<=laps;j++) {
            System.out.println("-----LAP"+j+"-----");
			System.out.println("tratata");
			System.out.println("фывфывфыв");
            for (int i = 0; i < racer.length; i++) {

                racer[i].drive();
                currentPos = racer[i].getPosX();
                if (prevPos != currentPos) {
                    System.out.print(racer[i].name + ", Distance :" + racer[i].getPosX());
                    prevPos = currentPos;
                    if (racer[i].broken) {
                        System.out.println(", State - broken");
                        System.out.println("The trip is over," + racer[i].name + " was broken on "+j+" lap!");

                    } else {
                        System.out.println(", State - active");
                    }
                    if (finish <= currentPos) {
                        System.out.println("Congratulations, you win");

                    }

                }

            }
            System.out.println();
        }
    }
}