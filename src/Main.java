public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next high score is " +
                calculateScore(gameOver, score, levelCompleted, bonus));


        // calculateScore(true, 800, levelCompleted, bonus); // 2 argument 2 parameters
        System.out.println("High score is " +
                calculateScore(true, 800, 5, 100));

        System.out.println("The next high score is " +
                calculateScore(true, 10000, 8, 200));

        // calculateScore(true, 800, 5, 100); // 4 arguments

        // calculateScore(true, 10000, 8, 200); // 4 arguments

    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // 4 parameters
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Final score is " + finalScore);
//        }
//    }

    // Parameters and arguments are terms that are often used interchangeably by developers.
    // But technically, a parameter is the definition as shown in the method declaration, and the argument will be the value that's passed to the method when we call it.

    // To execute a method that's defined with parameters, you have to pass variables, values, or expressions that match the type, order and number of parameters declared.

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // 4 parameters

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            // System.out.println("Final score is " + finalScore);
        }
        return finalScore;
    }

}
