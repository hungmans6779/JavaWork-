public class Zoo
{
	public static void main(String argv[])
	{
		Ostrich ostrich = new Ostrich();

		ostrich.move();
		((Bird) ostrich).move();
		((Animal) ostrich).move();
	}
}