package homework1;

public class Cat implements Participants{

    private int jump = 3;
    private int speed = 40;

    public Cat() {
    }

    public Cat(int jump, int speed) {
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
            return "Cat passed the obstacle";
        } else {
            return "Cat didn't passed the obstacle";
        }
    }
}
