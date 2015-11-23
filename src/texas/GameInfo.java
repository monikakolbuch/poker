package texas;

public class GameInfo {
	//liczba graczy bioracych udzial w rozgrywce
	 private static int playersNumber;
	 //aktualny posiadacz DealerButtona
	 private static int dealerButtonOwner;
	 //gracz rozpoczynajacy tur�, tura ko�czy si� w momencie przejscia do danego gracza
	 private static int startingPlayer;
	 public static int startingMoneyPerCapita;
	 private static GameInfo gInfo = null;
	 
	 private GameInfo(int pNumber, int dButton, int money){
		 playersNumber = pNumber;
		 dealerButtonOwner = dButton;
		 startingPlayer = dButton;
		 startingMoneyPerCapita =  money/pNumber;
	 }
	 
	 public static GameInfo getInstance(int pNumber, int dButton, int money) {
		 if(gInfo == null) {
	         gInfo = new GameInfo(pNumber, dButton, money);
	      }
	      return gInfo;  }
	 
	 public static int getPlayersNumber() {
		 return playersNumber;
	 }
}