import java.util.Arrays;
import java.util.Random;

public class Lesson05Homework11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] teamAAges = new int[25];
        int[] teamBAges = new int[25];
        for (int i = 0; i < 25; i++) {
            teamAAges[i] = random.nextInt(23) + 18;
            teamBAges[i] = random.nextInt(23) + 18;
        }
        System.out.print("Team A ages of 25 players: ");
        System.out.println(Arrays.toString(teamAAges));
        System.out.println("Average age of team A is " + Arrays.stream(teamAAges).average());

        System.out.print("Team B ages of 25 players: ");
        System.out.println(Arrays.toString(teamBAges));
        System.out.println("Average age of team B is " + Arrays.stream(teamBAges).average());
    }
}
