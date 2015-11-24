package texas;

public class GameInfo {
	//liczba graczy bioracych udzial w rozgrywce
	 private static int playersNumber;
	 //aktualny posiadacz DealerButtona
	 private static int dealerButtonOwner;
	 //gracz rozpoczynajacy turê, tura koñczy siê w momencie przejscia do danego gracza
	 private static int startingPlayer;
<<<<<<< HEAD
	 //poczatkowa wartosc zetonow dla kazdego gracza, zaokraglona do int
=======
>>>>>>> origin/master
	 private static int startingMoneyPerCapita;
	 private static GameInfo gInfo = null;
	 //gracze
	 public final static Player[] player = new Player[10];
	 
	 //metody inicjalizujace rozgrywke
	 private GameInfo(int pNumber, int dButton, int money){
		 playersNumber = pNumber;
		 dealerButtonOwner = dButton;
		 startingPlayer = dButton;
		 startingMoneyPerCapita =  money/pNumber;
	 }
	 public static void setPlayer(int i){
		 player[i] = new Player();
	 }
	 public static void Initialize(int pNumber, int dButton, int money) {
		 if(gInfo == null) {
	         gInfo = new GameInfo(pNumber, dButton, money);
	      }
	}
	 
	 //gettery
	 public static int getPlayersNumber() {
		 return playersNumber;
	 }
	 
	 public static Player getPlayer(int i) {
		 return player[i];
	 }
	 
	 

}
