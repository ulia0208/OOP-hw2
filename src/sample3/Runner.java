package sample3;

public interface Runner {

    int getMaxJump();
    int getMaxRun();

    String getName();




     default boolean jump(int height) {

        if(height<=getMaxJump()){
            System.out.printf("%s перепрыгнул через стену высотой %d см.\n", getName(),height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену высотой %d см, остался на месте.\n", getName(),height);
            return false;
        }
    }

     default boolean run(int lenght) {
        if(lenght<=getMaxRun()){
            System.out.printf("%s пробежал по беговой дорожке %d м.\n", getName(),lenght);
            return true;

        }
        else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d м.\n", getName(),lenght);
            return false;

        }
    }


}
