public class Fish extends Animal
{
	static private int count;

	public Fish()
	{
		setLegs(0);
		setKind("Fish");
		count++;
	}

	static public int getCount()
	{
		return count;
	}
}