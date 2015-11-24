package texas;

public class Player {
	private int money;
	private Card[] card = new Card[3];
	
	public void setMoney(int k){
		this.money = k;
	}
	
	public int getMoney()
	{
		return this.money;
	}
	
	public Card getCard(int i){
		return card[i];
	}
}
