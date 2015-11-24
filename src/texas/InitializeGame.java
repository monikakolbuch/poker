package texas;

import java.util.Random;

public class InitializeGame {
	private int i;

	public InitializeGame(int num, int money){
		Random generator = new Random(); 
		int rand = generator.nextInt(num) + 1;
		GameInfo.Initialize(num, rand, money);
		this.setPlayers(num);
	}
	public void setPlayers(int k) {
		for(i=0;i<k;i++)
			GameInfo.setPlayer(i);
	}
	public void SetPlayersMoney(int k){
		for(i=0;i<k;i++)
			GameInfo.player[i].setMoney(k);
		
	}
}
