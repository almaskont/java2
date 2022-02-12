package homework1;

public class Human implements Participants{

    private int jump = 5;
    private int speed = 30;

    public Human() {
    }

    public Human(int jump, int speed) {
        this.jump = jump;
        this.speed = speed;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public int jump() {
        return 0;
    }

    @Override
    public String doIt(boolean pass) {
        if(pass) {
            return "Human passed the obstacle";
        } else {
            return "Human didn't passed the obstacle";
        }
    }
}
