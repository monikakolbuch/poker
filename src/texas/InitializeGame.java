package texas;

import java.util.Random;

public class InitializeGame {
	
	private InitializeGame(int num, int money){
		Random generator = new Random(); 
		int rand = generator.nextInt(num) + 1;
		GameInfo.getInstance(num, rand, money);
	}

}
