public class GuessGame
{
	Player  p1;
	Player  p2;
	Player  p3;

	public void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRIght = false;
		boolean p3isRight = false;

		int targetNumber = (int) (math.random() * 10);
		System.out.println("I am Thinking of a Number 0 to 9");

		while(true)
		{
			System.out.println("NUmber to guess is" + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player one is guessed" + guessp1);

			guessp2 = p2.number;
			System.out.println("Player two is guessed" + guessp2);

			guessp3 = p3.number;
			System.out.println("Player Three is guessed" + guessp3);

			if(guessp1 == targetNumber)
			{
				p1isRight = true;
			} 
			if(guessp2 == targetNumber)
			{
				p1isRight = true;
			}
			if(guessp3 == targetNumber)
			{
				p1isRight = true;
			}
			if(p1isRight || p2isRIght || p3isRight)
			{
				System.out.println("We Have A Winner");
				System.out.println("Player one got it Right" + p1isRight);
				System.out.println("Player two Got it RIght" + p2isRIght);
				System.out.println("Player three Got it Right" + p3isRight);
				System.out.println("Game is Over");
			}
			else
			{
				System.out.println("Players will have to try again");
			}

		}

	}

}

public class Player
 {
	int number = 0; 
		public void guess()
		 {
			number = (int) (Math.random() * 10);
			System.out.println("I’m guessing"+ number);
		 }
 }

 public class GameLauncher 
 {
	public static void main (String[] args) 
	{
		GuessGame game = new GuessGame();
		game.startGame();
	}
}