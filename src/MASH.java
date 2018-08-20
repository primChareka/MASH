import java.util.Scanner;

public class MASH {

	Scanner scanner = new Scanner(System.in);
	String story;
	String name;
	int num;

	String[] categories = new String[4];
	String[] category1 = new String[4];
	String[] category2 = new String[4];
	String[] category3 = new String[4];
	String[] category4 = new String[4];
	String[] storyTime = new String[4];
	static String[] allString = new String[16];
	int[] all = new int[16];
	int[] numberOfFlips = new int[4];
	

	// ---------------------------------Creating-getters---------------------------------\\
	public String getStory() {
		return story;
	}// getStory

	public String getName() {
		return name;
	}// getName

	public String getCategories(int i) {
		return categories[i];
	}// getCategories()

	public String getCategory1(int i) {
		return category1[i];
	}// getCategory1()

	public String getCategory2(int i) {
		return category2[i];
	}// getCategory2()

	public String getCategory3(int i) {
		return category3[i];
	}// getCategory3()

	public String getCategory4(int i) {
		return category4[i];
	}// getCategory4()

	// ---------------------------------Setters---------------------------------
	// \\
	public void setStory() {
		this.story = "When you grow up you will have a";
	}// setStory()

	public void setName(String newName) {
		this.name = newName;
	}// setName()

	public void setNumber(int newNumber) {
		this.num = newNumber;
	}// setName()

	public void setCategories(String newString, int i) {
		this.categories[i] = newString;
	}// setCategories()

	public void setCategory1(String newString, int i) {
		this.category1[i] = newString;
	}// setCategory1()

	public void setCategory2(String newString, int i) {
		this.category2[i] = newString;
	}// setCategory2()

	public void setCategory3(String newString, int i) {
		this.category3[i] = newString;
	}// setCategory3()

	public void setCategory4(String newString, int i) {
		this.category4[i] = newString;
	}// setCategory4()

	// ---------------------------------Get-data-from-player---------------------------------\\
	public void enterName() {
		setName(scanner.nextLine());
	}// enterName()

	public void enterNumber() {
		setNumber(Integer.parseInt(scanner.nextLine()));
	}// enterName()

	// ---------------Categories--------------- \\
	public void enterCategories(int i) {
		switch (i) {
		case 0:
			System.out.println("Give me your first category");
			setCategories(scanner.nextLine(), i);
			break;
		case 1:
			System.out.println("Give me another category");
			setCategories(scanner.nextLine(), i);
			break;
		case 2:
			System.out.println("I need another category");
			setCategories(scanner.nextLine(), i);
			break;
		case 3:
			System.out.println("Give me one last category");
			setCategories(scanner.nextLine(), i);
			break;
		}
	}// enterCategories()

	// ---------------Category-fields--------------- \\
	public void enterCategory1(int i) {
		switch (i) {
		case 0:
			System.out.println("Give me a type of " + categories[0]);
			setCategory1(scanner.nextLine(), i);
			break;
		case 1:
			System.out.println("Give me another type of " + categories[0]);
			setCategory1(scanner.nextLine(), i);
			break;
		case 2:
			System.out.println("I need another type of " + categories[0]);
			setCategory1(scanner.nextLine(), i);
			break;
		case 3:
			System.out.println("Give me one last type of " + categories[0]);
			setCategory1(scanner.nextLine(), i);
			break;
		}
	}// enterCategory1()

	public void enterCategory2(int i) {
		switch (i) {
		case 0:
			System.out.println("Give me a type of " + categories[1]);
			setCategory2(scanner.nextLine(), i);
			break;
		case 1:
			System.out.println("Give me another type of " + categories[1]);
			setCategory2(scanner.nextLine(), i);
			break;
		case 2:
			System.out.println("I need another type of " + categories[1]);
			setCategory2(scanner.nextLine(), i);
			break;
		case 3:
			System.out.println("Give me one last type of " + categories[1]);
			setCategory2(scanner.nextLine(), i);
			break;
		}
	}// enterCategory2()

	public void enterCategory3(int i) {
		switch (i) {
		case 0:
			System.out.println("Give me a type of " + categories[2]);
			setCategory3(scanner.nextLine(), i);
			break;
		case 1:
			System.out.println("Give me another type of " + categories[2]);
			setCategory3(scanner.nextLine(), i);
			break;
		case 2:
			System.out.println("I need another type of " + categories[2]);
			setCategory3(scanner.nextLine(), i);
			break;
		case 3:
			System.out.println("Give me one last type of " + categories[2]);
			setCategory3(scanner.nextLine(), i);
			break;
		}
	}// enterCategory3()

	public void enterCategory4(int i) {
		switch (i) {
		case 0:
			System.out.println("Give me a type of " + categories[3]);
			setCategory4(scanner.nextLine(), i);
			break;
		case 1:
			System.out.println("Give me another type of " + categories[3]);
			setCategory4(scanner.nextLine(), i);
			break;
		case 2:
			System.out.println("I need another type of " + categories[3]);
			setCategory4(scanner.nextLine(), i);
			break;
		case 3:
			System.out.println("Give me one last type of " + categories[3]);
			setCategory4(scanner.nextLine(), i);
			break;
		}
	}// enterCategory4()

	// ---------------------------------Data-Entry-Methods---------------------------------\\
	public void getInfo(int gameStart) {
		int i = 0;
		switch (gameStart){
		case 1:
		
		// Get four categories
		System.out.println("First I will need 4 different categories");
		for (i = 0; i < 4; i++) {
			enterCategories(i);
		}
		}

		System.out.println("Your 4 categories are: " + categories[0] + ", " + categories[1] + ", " + categories[2]
				+ ", and " + categories[3]);
		System.out.println();

		// ---Get-Category-Fields---\\
		// Category 1
		System.out.println("Time to pick you options for Category 1: " + categories[0]);
		for (i = 0; i < 4; i++) {
			enterCategory1(i);
		}
		System.out.println("Your 4 types of " + categories[0] + " are: " + category1[0] + ", " + category1[1] + ", "
				+ category1[2] + ", and " + category1[3]);
		System.out.println();

		// Category 2
		System.out.println("Time to pick you options for Category 2: " + categories[1]);
		for (i = 0; i < 4; i++) {
			enterCategory2(i);
		}
		System.out.println("Your 4 types of " + categories[1] + " are: " + category2[0] + ", " + category2[1] + ", "
				+ category2[2] + ", and " + category2[3]);
		System.out.println();

		// Category 3
		System.out.println("Time to pick you options for Category 3: " + categories[2]);
		for (i = 0; i < 4; i++) {
			enterCategory3(i);
		}
		System.out.println("Your 4 types of " + categories[2] + " are: " + category3[0] + ", " + category3[1] + ", "
				+ category3[2] + ", and " + category3[3]);
		System.out.println();

		// Category 4
		System.out.println("Time to pick you options for Category 4: " + categories[3]);
		for (i = 0; i < 4; i++) {
			enterCategory4(i);
		}
		System.out.println("Your 4 types of " + categories[3] + " are: " + category4[0] + ", " + category4[1] + ", "
				+ category4[2] + ", and " + category4[3]);
		System.out.println();

		// Place strings all into one big array
		System.arraycopy(category1, 0, allString, 0, category1.length);
		System.arraycopy(category2, 0, allString, 4, category2.length);
		System.arraycopy(category3, 0, allString, 8, category3.length);
		System.arraycopy(category4, 0, allString, 12, category4.length);
		
		// -----Get-Rotation-Number------\\
				System.out.println("Next I need a number");
				enterNumber();
				
				System.out.println("We are ready to begin! Here is your game layout.");
				printResults();
				System.out.println("To advance each round, you will need to press enter. Let's get started!");

	}// getInfo()
		// ---------------------------------Game-Play-Methods---------------------------------\\

	public boolean gameStatus() {
		// play until 3/4 of each category is flipped
		if (numberOfFlips[0] >= 3 && numberOfFlips[1] >= 3 && numberOfFlips[2] >= 3 && numberOfFlips[3] >= 3) {
			return false;
		} else {
			return true;
		}
	}// gameStatus()

	public boolean allowedToFlip(int i) {
		int flips = 0;
		boolean result = true;
		// Determine which category is being flipped
		if (i >= 0 && i < 4) {
			flips = numberOfFlips[0];
		} else if (i >= 4 && i < 7) {
			flips = numberOfFlips[1];
		} else if (i >= 8 && i < 11) {
			flips = numberOfFlips[2];
		} else {
			flips = numberOfFlips[3];
		}
		// Determine how many flips that category has
		if (flips >= 3) {
			result = false;
		}

		return result;
	}// allowedToFlip()

	public void Flip(int i) {

		if (i >= 0 && i < 4) {
			numberOfFlips[0]++;
			if(numberOfFlips[0]==3)
			{decsionMade(i);}
		} else if (i >= 4 && i < 8) {
			numberOfFlips[1]++;
			if(numberOfFlips[1]==3)
			{decsionMade(i);}
		} else if (i >= 8 && i < 12) {
			numberOfFlips[2]++;
			if(numberOfFlips[2]==3)
			{decsionMade(i);}
		} else {
			numberOfFlips[3]++;
			if(numberOfFlips[3]==3)
			{decsionMade(i);}
		}

	}// Flip()
	
	public void decsionMade(int i) {

		if (i >= 0 && i < 4) {
			storyTime[0]=allString[i];
			System.out.println("It has been decided that for a "+categories[0]+" you will get a "+allString[i]);
		
		} else if (i >= 4 && i < 8) {
			storyTime[1]=allString[i];
			System.out.println("It has been decided that for a "+categories[1]+" you will get a "+allString[i]);
		} else if (i >= 8 && i < 12) {
			storyTime[2]=allString[i];
			System.out.println("It has been decided that for a "+categories[2]+" you will get a "+allString[i]);
		} else {
			storyTime[3]=allString[i];
			System.out.println("It has been decided that for a "+categories[3]+" you will get a "+allString[i]);
		}
		
		System.out.println("Press enter to continue.");
		scanner.nextLine();

	}// Flip()

	public void putDashes(int i) {
		int j;

		char[] myCharArray = allString[i].toCharArray();
		char[] myString = new char[myCharArray.length * 2];
		for (j = 0; j < myCharArray.length; j++) {
			myString[2 * j] = myCharArray[j];
			myString[2 * j + 1] = '/';
			allString[i] = String.valueOf(myString);
		}
	}// putDashes
		// ---------------------------------Actual-Play-Method---------------------------------\\

	public void play() {

		int index = -1;
		int counter = 0;

		while (gameStatus()) {
			System.out.println("Press enter");
			scanner.nextLine();
			// count n empty spots
			while (counter != num) {

				if (all[(index + 1) % 16] == 0) {
					if (allowedToFlip((index + 1) % 16)) {
						counter++;
					}
				}

				index++;
			}
			// reset counter
			counter = 0;

			// Make sure with bounds
			index %= 16;

			// Continue until next non flipped variable
			while (true) {
				while (all[index] == 1) {
					index++;
					index %= 16;
				}

				if (allowedToFlip(index % 16)) {
					break;
				}
			}

			// Once variable is found, flip it, put dashes and print results
			Flip(index);
			all[index] = 1;
			putDashes(index);

			printResults();
		}
	}//play()

	// ---------------------------------Print-Methods---------------------------------\\
	public void printInstructions() {
		System.out.println("Welcom to the game of MASH. If you type in "
				+ "words we'll tell you your future life story. \nStart by typing in your name and then pressing enter.");

		enterName();

		System.out.println("Alright " + name + ", lets get started!");
	}// printInstructions()

	public void printInitalValues() {
		System.out.println("We are ready to Play! Here are your options");

		System.out.println(categories[0] + "			" + categories[1] + "			" + categories[2]
				+ "			" + categories[3]);
		System.out.println(category1[0] + "			" + category2[0] + "			" + category3[0] + "			"
				+ category4[0]);
		System.out.println(category1[1] + "			" + category2[1] + "			" + category3[1] + "			"
				+ category4[1]);
		System.out.println(category1[2] + "			" + category2[2] + "			" + category3[2] + "			"
				+ category4[2]);
		System.out.println(category1[3] + "			" + category2[3] + "			" + category3[3] + "			"
				+ category4[3]);
	}// printInitalValues()

	public void printResults() {
		System.out.println(categories[0] + " 				" + categories[1] + "				 " + categories[2]
				+ " 			" + categories[3]);
		System.out.println(allString[0] + "				" + allString[4] + "				" + allString[8]
				+ "				" + allString[12]);
		System.out.println(allString[1] + "				" + allString[5] + "				" + allString[9]
				+ "				" + allString[13]);
		System.out.println(allString[2] + "				" + allString[6] + "				" + allString[10]
				+ "				" + allString[14]);
		System.out.println(allString[3] + "			" + allString[7] + "				" + allString[11]
				+ "				" + allString[15]);
	}// printResults()
	
	public void printsSummary() {
		System.out.println("Here is a summary of your results!");
		System.out.println("When you grow up, you will have a:");
		System.out.println(storyTime[0]+ " for a "+categories[0]+", a ");
		System.out.println(storyTime[1]+ " for a "+categories[1]+", a ");
		System.out.println(storyTime[2]+ " for a "+categories[2]+",and a ");
		System.out.println(storyTime[3]+ " for a "+categories[3]);
	}// printInstructions()
		// ---------------------------------Extra-Methods---------------------------------\\
	public void theGameOfMASH() {
		int status=1;
		printInstructions();
		while(status!=3){
		getInfo(status);
			
		play();
		System.out.println("The game is over!!");
		printsSummary();
		System.out.println("To play again with the different categories, press 1");
		System.out.println("To play again with the same categories, press 2");
		
		System.out.println("To quit the game, press 3");
		status=Integer.parseInt(scanner.nextLine());
		}
	}//theGameOfMASH()
	public void test() {
		num=4;
		
		categories[0] = "1";
		categories[1] = "2";
		categories[2] = "3";
		categories[3] = "4";

		category1[0] = "0aaa";
		category1[1] = "1bbb";
		category1[2] = "2ccc";
		category1[3] = "3ddd";
		category2[0] = "4eee";
		category2[1] = "5fff";
		category2[2] = "6ggg";
		category2[3] = "7hhh";
		category3[0] = "8iii";
		category3[1] = "9jjj";
		category3[2] = "10kkk";
		category3[3] = "11lll";
		category4[0] = "12mmm";
		category4[1] = "13nnn";
		category4[2] = "14ooo";
		category4[3] = "15ppp";

		System.arraycopy(category1, 0, allString, 0, category1.length);
		System.arraycopy(category2, 0, allString, 4, category2.length);
		System.arraycopy(category3, 0, allString, 8, category3.length);
		System.arraycopy(category4, 0, allString, 12, category4.length);
	}
	
	//---------------------------------Main-Method---------------------------------\\
	public static void main(String[] args) {
		MASH game = new MASH();
		
		game.theGameOfMASH();
		

	}

}
