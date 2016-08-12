import java.util.Scanner;

public class Adventure {
	public static void main (String[] args) {	
		boolean play = true;
		boolean loss = false;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Hello and welcome!");
			System.out.println("This is a story of trials and tribulations of your choosing. Please choose wisely.");
			System.out.println();
			
			System.out.print("Please enter your name: ");
			String name = scan.nextLine();
			
			System.out.print(" - " + name + ", Do you dare travel down this dark path? (Y/N): ");
			String playChoice = scan.nextLine();
			
			if (playChoice.equalsIgnoreCase("N")) {
				System.out.println("Smart choice. Good luck on your future endeavors. Goodbye!");
				
		//Story Start
			} else if (playChoice.equalsIgnoreCase("Y")) {
				System.out.println(name + "... Don't say you were not warned. Good Luck.");
				
				loss = false;
				while (!loss) {
					System.out.println();
					System.out.println("**************************************************************************************************");
					System.out.println();
					System.out.println(name + " starts their journey by heading down a lonesome path.");
					System.out.printf("There is no explanation for why you are out here, or what you are looking for, so don't ask why. %n"
							+ "...seriously " + name + ". Don't ask.%n");
					System.out.println();
					System.out.println(name + " happens upon a fork in the path.");
					System.out.println();
					System.out.printf("The left path is clearly more traveled. Further up the left trail, you see bright fields full of life, %n"
							+ "complete with animals grazing and children playing. There are also a few merry men singing songs.%n");
					System.out.println();
					System.out.printf("The right path is rather dreary. It's narrow and grown-over. You see a dark storm slowly rolling over the path. %n"
							+ "Up ahead on the right trail, you can see a grave yard and a few dark figures huddled together. %n");
					System.out.println();
					System.out.print(" - Which path do you choose? (L/R): ");
					String path = scan.nextLine();
					System.out.println();
					System.out.println("**************************************************************************************************");
					System.out.println();
					
					
			//First Choice - Left or Right path.
					
				//Left Path -> Bright, and full of life.
					if (path.equalsIgnoreCase("L")) {
						System.out.println();
						System.out.println(name + ", you have chosen the Left path.");
						System.out.println();
						System.out.printf("As you walk down the left path, you see the quaint town up ahead. You decide to head straight for it.%n"
								+ "You get closer to the town, but must decide what's the first thing you will see in this new town.%n%n");
						boolean leftWrong = false; // Used to decide the next step.
						
						do {
							System.out.printf(name + " do you approach the merry men and request your favorite track?%n Or do you head towards the town square?%n%n"
											+ " - Please enter (1. merry men / 2. town square): ");
							String location = scan.nextLine();
							System.out.println();
							System.out.println("**************************************************************************************************");
							System.out.println();
							
						//You have chose the merry men.
							if (location.equalsIgnoreCase("1")) {
								System.out.println();
								System.out.println("You head towards the merry men that are full of song.");
								
								System.out.printf("%nAs you approach the merry men, they stop their singing and turn towards you.%n"
										+ "Delighted that these people have actually acknowledged your existence, you smile.%n"
										+ "You make your song request, but it is not well received. As it turns out, they don't%n"
										+ "know or care who let the dogs out. You are promptly ran out of town.%n%n"
										+ name + ", I think it is time for you to head home.%n%n - Agree? (y/n): ");
								String goHome = scan.nextLine();
								System.out.println();
								System.out.println("**************************************************************************************************");
								System.out.println();
								if (goHome.equalsIgnoreCase("y")) {
									System.out.println();
									System.out.println("You wander your way home ultimately disappointed with your adventure.");
									leftWrong = false;
								} else {
									System.out.printf("%nYou turn around to face these once-merry men, and demand they perform for%n"
											+ "you an a cappella version of 'Who Let The Dogs Out'.%n%nYou are promptly beat into"
											+ " something that resembles a human smoothie.%n%nYou are dead.");
									leftWrong = false;
								}
							
						//You are headed towards the town square.
							} else if (location.equalsIgnoreCase("2")) {
								System.out.println();
								System.out.println("**************************************************************************************************");
								System.out.println();
								System.out.println("You head towards the town square.");
								
								System.out.printf("%nYou start walking into the town square. As you get closer to the center, you trip.%n"
										+ "This misstep causes a ridiculous chain of event that ends up with you falling into the town well.%n%n"
										+ "You are dead.");
								leftWrong = false;
								
						//Wrong answer. 
							} else {
								System.out.println("That was not a valid option.");
								System.out.println();
								leftWrong = true;
							} 
						} while (leftWrong);
						
				//Right Path -> Dark, Death ahead.	
					} else if (path.equalsIgnoreCase("R")) {
						System.out.println();
						System.out.println();
						System.out.println("**************************************************************************************************");

						System.out.println(name + ", you have chosen the Right path.");
						System.out.printf("%n%nYou wander down the dark trail. By this time, the dark huddled mass of figures notice you approaching.%n"
								+ "'Excuse me! Please help!', they shout.%nAs you get closer, you see that these once frightening figures are actually just a family who have%n"
								+ " just hit a bad pothole and need assistance with changing their flat tire.%n%n - Do you help them change there tire? (Y/N): ");
						String help = scan.nextLine();
						System.out.println();
						System.out.println("**************************************************************************************************");
						System.out.println();
						if (help.equalsIgnoreCase("y")) {
							System.out.printf("%nYou help the family change their tire. They continue on their way, and you on yours.%n%n" + name + ", You did a good thing today.%n%n");
							System.out.println("The End.");
						} else {
							System.out.printf("%nAs the soulless person you are, you snub the family-in-need and continue down the path.%n%n"
									+ "Karma quickly catches up with you and you drop dead on the spot.%n");
							System.out.println("The End.");
						}
						
						
					} else {
						System.out.println();
						System.out.println();
						System.out.println("**************************************************************************************************");
						System.out.println();
						System.out.printf("Congratulations, " + name + ", instead of making a definitive choice, you turned around and walked home %n"
								+ "with your tail between your legs. %nNever shall you return.%n");
					}
				//All possible threads will end up here, stop the loop, and be given the option to play again.
					loss = true;
				}
			} else {
				System.out.println("Incorrect answer. You must start again.");
			}
			
		//Default option: User gets the choice to play again.
			System.out.println();
			System.out.println();
			System.out.println("**************************************************************************************************");
			System.out.println();
			System.out.print(" - Would you like to play again?:  (Y/N) ");
			String answer = scan.nextLine();
			play = answer.equalsIgnoreCase("y");
			System.out.println();
			System.out.println("**************************************************************************************************");
			System.out.println();
			if (!play) {
				System.out.println();
				System.out.println("Thank you for playing.");
				return;
			}
		} while (play);
		scan.close();
	}
}

