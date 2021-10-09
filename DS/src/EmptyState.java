import java.util.Scanner;
public class EmptyState implements State {
Deodorant deodorant;
Scanner sc = new Scanner(System.in);
	public EmptyState(Deodorant deodorant) {
		// TODO Auto-generated constructor stub
	this.deodorant=deodorant;
	}

	@Override
	public void unlockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is empty you cannot unlock");
	}

	@Override
	public void lockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is already locked");
	
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		System.out.println("you pressed the dispenser but the dispenser is empty");
		dispenseDeo();
	}

	@Override
	public void dispenseDeo() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Deodorant is empty, time to get a new one\n");
		System.out.println("Do you want a new one? press y or n\n");
		String result= sc.next();
		
		if(result=="y")
		{
			newDeo();
		}
		else if(result=="n")
		{
			System.out.println("Your current deo is empty!!");
		}
		else
		{
			System.out.println("Enter y or n");
		}
		}
		
	

	@Override
	public void newDeo() {
		System.out.println("What type of deodorant are you looking to purchase : Spray(1), RollOn(2), Antiperspirant(3), Gel(4)\n");
		int option = sc.nextInt();
	
	if(option == 1)
	{
		DeoBuilder sprayBuilder = new SprayDeoBuilder();
		Deodorant spray = sprayBuilder.build();
		System.out.println(spray);
	}
	else if(option == 2)
	{
		DeoBuilder rollonBuilder = new RollOnDeoBuilder();
		Deodorant rollon = rollonBuilder.build();
		System.out.println(rollon);
	}
	else if(option == 3)
	{
		DeoBuilder antiperspirantBuilder = new AntiperspirantDeoBuilder();
		Deodorant antiperspirant = antiperspirantBuilder.build();
		System.out.println(antiperspirant);
	}
	else if(option == 4)
	{
		DeoBuilder gelBuilder = new GelDeoBuilder();
		Deodorant gel = gelBuilder.build();
		System.out.println(gel);
	}
	else
	{
		System.out.println("Enter valid options");
	}
	}
		
	
	public String toString()
	{
		return "Time to buy a new one";
	}

}
