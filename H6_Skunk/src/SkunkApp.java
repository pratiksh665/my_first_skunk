public class SkunkApp
{
	public SkunkUI skunkUI;
	public SkunkController skunkController;
	public int numberOfPlayers;
	public String[] playerNames;

	public SkunkApp()
	{
		skunkUI = new SkunkUI();
		skunkController = new SkunkController(skunkUI);
		skunkUI.setDomain(skunkController);
		this.numberOfPlayers = 0;
		this.playerNames = new String[20];
	}

	public boolean run()
	{
		return skunkController.run();
	}

	public static void main(String[] args)
	{
		SkunkApp executibleProgram = new SkunkApp();
		executibleProgram.run();
	}

}
