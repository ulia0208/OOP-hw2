package hw2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name,int appetite){
        this.name=name;
        this.appetite=appetite;
        this.satiety=false;
    }
     void eat(Plate plate) {
    }

    public String getName() {
        return name;
    }

    void SatInfo(Plate plate){

        if(plate.decreaseFood(appetite)==true){

            System.out.println(" сыт");
        }
        else {
            System.out.println(" голоден");
        }
    }
}
