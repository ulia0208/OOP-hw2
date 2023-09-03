package hw2;

public class MainClass {
    public static void main(String[] args) {


        Cat[] cats = {
                new Cat("Барсик",80),
                new Cat("Мурка",25),
                new Cat("Васька",10)
        };

        Plate plate=new Plate(100);


        for(Cat cat:cats){
            System.out.println(cat.getName());
            cat.SatInfo(plate);
            plate.info();
        }

    }
}
