import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkUI implements UI
{

	public SkunkController skunkController;

	public void setDomain(SkunkController skunkController)
	{
		this.skunkController = skunkController;
	}

	public String promptReadAndReturn(String question)
	{
		StdOut.print(question + " => ");
		String result = StdIn.readLine();
		return result;
	}

	public void print(String toPrint)
	{
		StdOut.print(toPrint);
	}

	public void println(String toPrint)
	{
		StdOut.println(toPrint);
	}

}
