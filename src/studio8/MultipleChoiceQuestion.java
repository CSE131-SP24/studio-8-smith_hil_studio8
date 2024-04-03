package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] answers;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
	
		super(prompt,answer,points);
		answers = choices; 
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	
	public void displayPrompt() {
		//FIXME
		super.displayPrompt();
		for (int n=0;n<answers.length;n++)
		{
			System.out.println((n+1)+". "+answers[n]);
		}
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		String[] choices2 = {"CSE 131","Chemistry 112","Intro to Micro"};
		Question multipleChoice2 = new MultipleChoiceQuestion("What is the best class at Washu?","0",1,choices2);
		multipleChoice2.displayPrompt();
		System.out.println(multipleChoice2.checkAnswer("CSE 131"));
		
	}

}
