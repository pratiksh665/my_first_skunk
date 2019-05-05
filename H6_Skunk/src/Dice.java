public class Dice
{
	private Die die1;
	private Die die2;
	private int lastRoll;

	public Dice()
	{
		this.die1 = new Die();
		this.die2 = new Die();
		this.roll();
	}

	public Dice(Die die1, Die die2)
	{
		this.die1 = die1;
		this.die2 = die2;
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		die1.roll();
		die2.roll();
		lastRoll = die1.getLastRoll() + die2.getLastRoll();
	}

	public String toString()
	{
		return "Dice with last roll: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}

	public Die getDie1()
	{
		return this.die1;
	}

	public Die getDie2()
	{
		return this.die2;
	}

	public void setDie1(Die d)
	{
		this.die1 = d;
	}

	public void setDie2(Die d)
	{
		this.die2 = d;
	}

	public static final int NUM_TRIALS = 360;
}
