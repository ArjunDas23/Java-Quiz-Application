import java.util.*;
public class QuizApplication {

    // Display Menu..
    public static void displayMenu() {
        System.out.println("\n===== JAVA QUIZ APPLICATION =====");
        System.out.println("\n1. Start Quiz");
        System.out.println("2. View Score");
        System.out.println("3. Exit");
        System.out.print("\nEnter your choice: ");
    }
   
    // Start Quiz..
    public static int startQuiz(Scanner sc, String questions[], int correctAnswers[]) {
        int score = 0;
        int answer = 0;

        for (int i=0; i<questions.length; i++) {
            // print question.
            System.out.println ("\n" + questions[i]);
            switch(i) {
                case 0 : 
                    System.out.println ("\n(1) Dennis Ritchie");
                    System.out.println ("(2) James Gosling"); //
                    System.out.println ("(3) Bjarne Stroustrup");
                    System.out.println ("(4) Guido van Rossum");

                    System.out.print ("\nEnter the Answer : ");
                    answer = sc.nextInt();

                    if (answer < 1 || 4 < answer) {
                        System.out.println ("Invalid Option !");
                    } else if (answer == correctAnswers[i]) {
                        System.out.println ("Correct Answer.");
                        score++;
                    } else {
                        System.out.println ("Wrong Answer.");
                        System.out.println ("Correct Answer : Option (" + correctAnswers[i] + ")");
                    }
                break;

                case 1 : 
                    System.out.println ("\n(1) class");
                    System.out.println ("(2) new");   //
                    System.out.println ("(3) create");
                    System.out.println ("(4) object");

                    System.out.print ("\nEnter the Answer : ");
                    answer = sc.nextInt();

                    if (answer < 1 || 4 < answer) {
                        System.out.println ("Invalid Option !");
                    } else if (answer == correctAnswers[i]) {
                        System.out.println ("Correct Answer.");
                        score++;
                    } else {
                        System.out.println ("Wrong Answer.");
                        System.out.println ("Correct Answer : Option (" + correctAnswers[i] + ")");
                    }
                break;

                case 2 : 
                    System.out.println("\n(1) start()");
                    System.out.println("(2) init()");  
                    System.out.println("(3) run()");
                    System.out.println("(4) main()");  //

                    System.out.print ("\nEnter the Answer : ");
                    answer = sc.nextInt();

                    if (answer < 1 || 4 < answer) {
                        System.out.println ("Invalid Option !");
                    } else if (answer == correctAnswers[i]) {
                        System.out.println ("Correct Answer.");
                        score++;
                    } else {
                        System.out.println ("Wrong Answer.");
                        System.out.println ("Correct Answer : Option (" + correctAnswers[i] + ")");
                    }
                break;

                case 3 : 
                    System.out.println("\n(1) Procedural");
                    System.out.println("(2) Functional");  
                    System.out.println("(3) Object-Oriented"); //
                    System.out.println("(4) Machine");

                    System.out.print ("\nEnter the Answer : ");
                    answer = sc.nextInt();

                    if (answer < 1 || 4 < answer) {
                        System.out.println ("Invalid Option !");
                    } else if (answer == correctAnswers[i]) {
                        System.out.println ("Correct Answer.");
                        score++;
                    } else {
                        System.out.println ("Wrong Answer.");
                        System.out.println ("Correct Answer : Option (" + correctAnswers[i] + ")");
                    }
                break;

                case 4 : 
                    System.out.println("\n(1) =");
                    System.out.println("(2) ==");  //
                    System.out.println("(3) ->");
                    System.out.println("(4) :=");

                    System.out.print ("\nEnter the Answer : ");
                    answer = sc.nextInt();

                    if (answer < 1 || 4 < answer) {
                        System.out.println ("Invalid Option !");
                    } else if (answer == correctAnswers[i]) {
                        System.out.println ("Correct Answer.");
                        score++;
                    } else {
                        System.out.println ("Wrong Answer.");
                        System.out.println ("Correct Answer : Option (" + correctAnswers[i] + ")");
                    }
                break;

            }
        }
        System.out.println ("============================");
        System.out.println ("Quiz Completed Successfully!");
        System.out.println ("============================");
        return score;
    }

    // Calculate Percentage..
    public static double calculatePercentage(int score, String questions[]) {
        double percentage = ((double)score / questions.length) * 100;
        return percentage;
    }

    // Display Score..
    public static void displayScore(double percentage, int score, String questions[]) {
        System.out.println ("\nOut of " + questions.length + " Questions, Your Score : " + score);
        System.out.printf("Percentage : %.2f%%%n", percentage);
    }

    // Exit..
    public static void exit() {
    System.out.println("\n=================================");
    System.out.println(" Thank You for Playing the Quiz!");
    System.out.println(" Keep Learning, Keep Growing!");
    System.out.println("=================================");
    }


    // Main Method..
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int choice = 0;
        int score = 0;
        double percentage = 0.0;
        boolean quizPlayed = false;
        
        String questions[] = {
            "1. Java is developed by?",
            "2. Which keyword is used to create an object?",
            "3. Which method is the entry point of a Java program?",
            "4. Java is a ______ language.",
            "5. Which operator is used for comparison?",
        };

        int correctAnswers[] = {2,2,4,3,2};

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 : score = startQuiz(sc, questions, correctAnswers);
                quizPlayed = true;
                break;

                case 2 : 
                    if (quizPlayed) {
                        percentage = calculatePercentage(score, questions);
                        displayScore(percentage, score, questions);
                    } else {
                        System.out.println ("\nPlease complete the quiz first!");
                    }
                break;

                case 3 : exit();
                break;

                default : 
                    System.out.println ("Invalid Input !");
            }
        } while (choice != 3);

        sc.close();
    }
}