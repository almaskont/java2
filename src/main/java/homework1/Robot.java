package homework1;

public class Robot implements Participants{

    private int jump = 10;
    private int speed = 50;

    public Robot() {
    }

    public Robot(int jump, int speed) {
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
        return this.speed;
    }

    @Override
    public int jump() {
        return this.jump;
    }

    @Override
    public String doIt(boolean pass) {
        if(pass) {
            return "Robot passed the obstacle";
        } else {
            return "Robot didn't passed the obstacle";
        }
    }
}
