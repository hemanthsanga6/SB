
public class Test {
public static void main(String[] args)
{
	Deodorant deodorant = new Deodorant("axe",2.0);
	System.out.println(deodorant);

	deodorant.unlockDeo();

	System.out.println(deodorant);
	DeoBuilder sprayBuilder = new SprayDeoBuilder();
	Deodorant spray = sprayBuilder.build();
	System.out.println(spray);
	
	deodorant.newDeo();
	
	
	
}
}

