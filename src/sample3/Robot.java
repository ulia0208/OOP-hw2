package sample3;



public class Robot extends BaseRobot implements Runner{

    private final String name;
    private final int maxRun;
    private final int maxJump;


    @Override
    public boolean jump(int height) {

        if(height<=maxJump){
            System.out.printf("%s перепрыгнул через стену высотой %d см.\n", name,height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену высотой %d см, остался на месте.\n", name,height);
            return false;
        }
    }

    @Override
    public boolean run(int lenght) {
        if(lenght<=maxRun){
            System.out.printf("%s пробежал по беговой дорожке %d м.\n", name,lenght);
            return true;

        }
        else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d м.\n", name,lenght);
            return false;

        }
    }

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}

class BaseRobot {

}