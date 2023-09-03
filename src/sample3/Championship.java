package sample3;

import java.nio.file.Watchable;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик",1500,300),
                new Cat("Мурка",1700,250),
                new Human("Петр",2500,300),
                new Human("Васлий",3000,50),
                new Robot("E456",15000,150),
                new Robot("M765",10000,220),

        };

        Obstacle[] obstacles = {
                new Track(1200),
                new Track(2000),
                new Wall(140),

                new Track(3000),
                new Wall(30),
                new Wall(250),

        };

        for(Runner runner:runners){
            for (Obstacle obstacle:obstacles){
                if (obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength()))
                        break;

                }
                if (obstacle instanceof Wall){
                    if(!runner.jump(obstacle.getHeight()))
                        break;

                }


            }
        }
    }
}
