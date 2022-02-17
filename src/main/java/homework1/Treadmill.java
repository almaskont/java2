package homework1;

public class Treadmill implements Obstacles {
    private int length = 40;

    public Treadmill(int speed) {
        this.length = speed;
    }

    public Treadmill() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacle(Participants p) {
        System.out.println("Run through treadmill!");
        if(getLength() <= p.run()) {
            System.out.println(p.doIt(true) + " treadmill!");
            return true;
        } else {
            System.out.println(p.doIt(false) + " treadmill!");
            return false;
        }
    }
}
