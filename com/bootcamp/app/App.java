package com.bootcamp.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * definieer de vragen dat gesteld moeten worden
		 */
		String q1 = "Given the following definitions, which of these expression will NOT evaluate to true?\nboolean b1 = true, b2 = false; int i1 = 1, i2 = 2;\n"
				+ "(a)(i1 | i2) == 3\n(b)i2 && b1\n(c)b1 || !b2\n(d)(i1 ^ i2) < 4\n";

		String q2 = " How do you write a foreach loop that will iterate over ArrayList<Pencil>pencilCase?\n"
				+ "(a)for (Pencil pencil : pencilCase) {}\n(b)for (pencilCase.next()) {}\n(c)for (Pencil pencil : pencilCase.iterator()) {}\n(d)for (pencil in pencilCase) {}\n";

		String q3 = "  Which is the most up-to-date way to instantiate the current date?\n"
				+ "(a)new SimpleDateFormat(\"yyyy-MM-dd\").format(new Date())\n(b)new Date(System.currentTimeMillis())\n(c)LocalDate.now()\n(d)Calendar.getInstance().getTime()\n";

		String q4 = " class Main {\r\n"
				+ "    public static void main(String[] args){\r\n"
				+ "       String message = \"Hello\";\r\n"
				+ "       for (int i = 0; i<message.length(); i++){\r\n"
				+ "          System.out.print(message.charAt(i+1));\r\n"
				+ "       }\r\n"
				+ "    }\r\n"
				+ "}\n"
				+ "(a)\"Hello\"\n(b)A runtime exception is thrown.\n(c)The code does not compile.\n(d)\"ello\"\n";

		/*
		 * hier worden de vragen met de antwoorden opgeslagen in een array
		 */
		Question[] questions = { new Question(q1, "b"), new Question(q2, "a"), new Question(q3, "c"), new Question(q4, "b") };
		takeTest(questions);
	}

	public static void takeTest(Question[] questions) {

		/*
		 * hier wordt de score bepaald aan de hand van hoeveel vragen de user goed heeft
		 * om dat te doen moeten er aan de user input gevraagd worden en dat gaat via de
		 * scanner method gedaan worden
		 */
		int score = 0;
		Scanner userInput = new Scanner(System.in);

		/*
		 * in deze for loop nemen we de lengte van de vragen, mocht het zijn dat er meer
		 * vragen later bijgevoegd zullen worden verder gaat de loop door alle vragen
		 * heen en checken als de user de correcte heeft doorgegeven als het antwoord
		 * correct is dan wordt de score geincrementeerd met 1 punt
		 */
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String userAnswer = userInput.nextLine();
			if (userAnswer.equals(questions[i].answer)) {
				score++;
			}
		}

		System.out.println("you got " + score + "/" + questions.length);
	}
}
