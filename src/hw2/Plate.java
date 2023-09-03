package hw2;

public class Plate {


    private int food;
    public Plate(int food){
        this.food=food;
    }

    boolean decreaseFood(int n){
        int diff=food-n;

        if(diff<0){
            return  false;
        }
        else {
            food-=n;
            return true;
        }
    }

    void addFood(int food){
        this.food+=food;
    }
    public void info(){
        System.out.println("Количество еды: "+ food);
    }

}
