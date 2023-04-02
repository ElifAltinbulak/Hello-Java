import java.util.Scanner;

public class hello {
    static String[] questions = {
            "1-Which is the first animal to be domesticated?",
            "2-Which one is used for direction function?",
            "3-Which of the fish species is the mammal?",
            "4-Which is the planet with the largest satellite?",
            "5-Which animal is more resistant to the desert?",
            "6-In which environment does sound propagate fastest?",
            "7-Which is a natural light source?",
            "8-Which animal is a reptile?",
            "9-Which one is an organelle?",
            "10-What is the derivative of 1?"
    };
    static String[] answers = {
            "A)Dog B)Fish C)Elephant D)Horse E)Empty",
            "A)Tree B)Flower C)North Star D)Rock E)Empty",
            "A)Anchovy B)Whale C)Shark D)Perch E)Empty",
            "A)World B)Anthem C)Saturn D)Jupiter E)Empty",
            "A)Dog B)Horse C)Camel D)Chameleon E)Empty",
            "A)Solid B)Liquid C)Gas D)Board E)Empty",
            "A)Lamp B)Oil Lamp C)Firefly D)Moon E)Empty",
            "A)Turtle B)Mole C)Hedgehog D)Squirrel E)Empty",
            "A)DNA B)RNA C)MRNA D)Lisosome E)Empty",
            "A)2 B)-1 C)0 D)1 E)Empty"
    };
    static String[] correctAnswers = {"A", "C", "B", "D", "C", "A", "C", "A", "D", "C"};
    static int s = 0, a = 0;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[a]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.toUpperCase().equals(correctAnswers[s])) {
                System.out.println("Your answer is CORRECT");
                score += 10;
            } else if (userAnswer.toUpperCase().equals("E")) {
                System.out.println("Your answer is EMPTY");
            } else {
                System.out.println("Your answer is WRONG");
            }

            i++;
            s++;
            a++;
        }

        System.out.println("Your Score: " + score);

        if (score >= 50) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }

        scanner.close();
    }
}
