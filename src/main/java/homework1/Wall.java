package homework1;

public class Wall implements Obstacles {

    private int height = 3;

    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void passObstacle(Participants p) {
        System.out.println("Jump over the wall!");
        if(getHeight() <= p.jump()) {
            System.out.println(p.doIt(true) + " the wall!");
        } else {
            System.out.println(p.doIt(false) + " the wall!");
        }
    }
}
