package homework1;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        Participants[] participants = {human, cat, robot};
        Obstacles[] obstacles = {wall, treadmill};
        for(int i = 0; i < participants.length; i++) {
            for(int j = 0; j < obstacles.length; j++) {
                obstacles[j].passObstacle(participants[i]);
            }
        }
    }
}
