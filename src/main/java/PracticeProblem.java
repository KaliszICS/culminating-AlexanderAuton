/**

        * File: Culminating

        * Author: Alexander D. Auton

        * Date Created: June 02, 2026

        * Date Last Modified: June --, 2026

        */
	   import java.util.Scanner;
           import java.util.HashMap;
	   //and so it begins
public class PracticeProblem {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Input an integer between 1 & 9 (inclusive)");
                HashMap<Integer, String> questions = new HashMap<Integer, String>();
                int ques;
                while (!(in.hasNextInt() && ((ques = in.nextInt()) >= 1 && ques <= 9))) {
                 System.out.println("Invalid input, try again.");      
                 in.nextLine();
                }
                if
                //now i need these numbers to unlock individual questions, board, timer, answers, points, and the question itself included. And also an instruction of rules
	}
        //instruction/rules for later use: System.out.println("Welcome to Campbelly Feud. Input "YES" to begin the game. To win, clear the board. If you get three strikes, you lose and the game ends. Try and get as many points as you can. If the time runs out, you are automatically wrong.");
}