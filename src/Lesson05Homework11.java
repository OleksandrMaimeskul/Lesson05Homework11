import java.util.Arrays;

public class Lesson05Homework11 {
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 40;

    public static void main(String[] args) {

        // Team A
        String teamA = "Team A ages of 25 players: ";
        int randomAgeAPlayer1 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer2 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer3 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer4 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer5 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer6 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer7 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer8 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer9 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer10 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer11 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer12 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer13 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer14 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer15 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer16 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer17 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer18 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer19 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer20 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer21 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer22 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer23 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer24 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeAPlayer25 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;

        int[] intArrA = new int[]{randomAgeAPlayer1, randomAgeAPlayer2, randomAgeAPlayer3, randomAgeAPlayer4,
                randomAgeAPlayer5, randomAgeAPlayer6, randomAgeAPlayer7, randomAgeAPlayer8,
                randomAgeAPlayer9, randomAgeAPlayer10, randomAgeAPlayer11, randomAgeAPlayer12,
                randomAgeAPlayer13, randomAgeAPlayer14, randomAgeAPlayer15, randomAgeAPlayer16,
                randomAgeAPlayer17, randomAgeAPlayer18, randomAgeAPlayer19, randomAgeAPlayer20,
                randomAgeAPlayer21, randomAgeAPlayer22, randomAgeAPlayer23, randomAgeAPlayer24,
                randomAgeAPlayer25};

        System.out.println(teamA + Arrays.toString(intArrA));

        int length = intArrA.length;
        int summary = 0;

        for (int j : intArrA) {
            summary += j;
        }
        int averageAgeA = summary / length;
        System.out.println("Average age of team A is " + averageAgeA + ".");

        // Team B
        String teamB = "Team B ages of 25 players: ";
        int randomAgeBPlayer1 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer2 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer3 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer4 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer5 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer6 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer7 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer8 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer9 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer10 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer11 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer12 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer13 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer14 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer15 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer16 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer17 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer18 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer19 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer20 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer21 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer22 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer23 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer24 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;
        int randomAgeBPlayer25 = (int) (Math.random() * (MAX_AGE - MIN_AGE + 1)) + MIN_AGE;

        int[] intArrB = new int[]{randomAgeBPlayer1, randomAgeBPlayer2, randomAgeBPlayer3, randomAgeBPlayer4,
                randomAgeBPlayer5, randomAgeBPlayer6, randomAgeBPlayer7, randomAgeBPlayer8,
                randomAgeBPlayer9, randomAgeBPlayer10, randomAgeBPlayer11, randomAgeBPlayer12,
                randomAgeBPlayer13, randomAgeBPlayer14, randomAgeBPlayer15, randomAgeBPlayer16,
                randomAgeBPlayer17, randomAgeBPlayer18, randomAgeBPlayer19, randomAgeBPlayer20,
                randomAgeBPlayer21, randomAgeBPlayer22, randomAgeBPlayer23, randomAgeBPlayer24,
                randomAgeBPlayer25};

        System.out.println(teamB + Arrays.toString(intArrB));

        int length1 = intArrB.length;
        int summary1 = 0;
        for (int i : intArrB) {
            summary1 += i;
        }
        int averageAgeB = summary1 / length1;
        System.out.println("Average age of team B is " + averageAgeB + ".");
    }
}
