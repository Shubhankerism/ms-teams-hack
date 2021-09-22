
import java.awt.Robot;
import java.awt.MouseInfo;

public class Main {
    public static final int ONE_MINUTE = 60000;
    public static final int MAX_Y = 1;
    public static final int MAX_X = 1;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        long millis=System.currentTimeMillis();

        System.out.println("You can relax now.\n");

        while (true) {
            double x = MouseInfo.getPointerInfo().getLocation().getX();
            double y = MouseInfo.getPointerInfo().getLocation().getY();

            System.out.println("You're away since "+ (System.currentTimeMillis()-millis)/ONE_MINUTE+" minutes.");

            robot.mouseMove((int)(x+1), (int)(y+1));
            
            Thread.sleep(ONE_MINUTE);
        }
    }
}
