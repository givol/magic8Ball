package magic8Ball;
import java.util.Random;
import java.util.Scanner;

public class Magic8 {

	public static void main(String[] args) {
		String question = "Your Yes or No question here";
		System.out.println(question);
		Scanner scanner = new Scanner(System.in);
		String UserQuestion = scanner.nextLine();
		System.out.println("You asked: " + UserQuestion);
		// Fill the array with at least five potential answers
		
		String[] answers = new String[10];  //I used 10
		
		answers[0] = "Ask again later";
		answers[1] = "Reply hazy, try again";
		answers[2] = "Outlook good";
		answers[3] = "Cannot predict now";
		answers[4] = "Most likely";
		answers[5] = "As I see it, yes";
		answers[6] = "You may rely on it";
		answers[7] = "It is certain";
		answers[8] = "It is decidedly so";
		answers[9] = "Without a doubt";
		 

		// Choose one of the answers at random, then print it
		//if(UserQuestion.matches(".*\\?\\b.*") == true){
		//if(UserQuestion.charAt(k) == ?){
		Random r = new Random(10);
		int choice = 1 + r.nextInt(10);
		System.out.println(answers[choice]);
		//} else {
		//	System.out.println("That is not a valid Question.");
	//		System.out.println("Try adding a Question Mark at the end of your question");
	//	}
		
	}

}

