package texas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	public InitializeGame init;
	@Before
	public void setUp() throws Exception {
		 init = null;
	}

	@Test
	public void testPlayerNumber() {
		init = new InitializeGame(2,8);	
		assertEquals(GameInfo.getPlayersNumber(),2);
	}
	@Test
	public void testMoney(){
		init = new InitializeGame(2,8);
		assertEquals(GameInfo.getPlayer(1).getMoney(), 4);
	}

}
