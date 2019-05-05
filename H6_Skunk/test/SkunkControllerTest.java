import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class SkunkControllerTest {

	@Test
	public void test_skunk_controller_score_skunk_turn() 
	{
		SkunkController sc = new SkunkController(new SkunkUI());
		String pn = "testPlayer";
		Player ap = new Player(pn);
		ap.setRollScore(0);
		Die d1 = new Die(new int[] {1});
		Die d2 = new Die(new int[] {1});
		Dice sd = new Dice(d1,d2);
		sd.roll();
		sc.rollScore(ap, 4);
		assertEquals(ap.getNumberChips(),46);
	}
	
	
	//Added JUnit Test1- Written to verify that code refactoring didnt create regression faults
	@Test
	public void test_get_position_of_the_active_player() 
	{
		ArrayList<Player> p = new ArrayList<Player>();
		p.add(new Player("P1"));
		p.add(new Player("P2"));
		p.add(new Player("P3"));

		int activePlayerIndex = 0;
		
		for (int i = 0; i < p.size(); i++)
		{
			assertEquals(p.indexOf(p.get(i)), activePlayerIndex);
			activePlayerIndex++;
		}
	}
	
	//Added JUnit Test2- Written to verify that code refactoring didnt create regression faults
	@Test
	public void test_get_name_of_the_active_Player() 
	{
		String playerName = "TestPlayer";
		Player activePlayer = new Player(playerName);
		assertEquals(activePlayer.getName(), "TestPlayer");
	}
}