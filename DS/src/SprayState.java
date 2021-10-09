
public class SprayState implements State{
Deodorant deodorant;
	public SprayState(Deodorant deodorant) {
		// TODO Auto-generated constructor stub
		this.deodorant = deodorant;
	}

	@Override
	public void unlockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is already unlocked");
		
	}

	@Override
	public void lockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is being used");
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		System.out.println("Dispenser button pressed");
	}

	@Override
	public void dispenseDeo() {
		// TODO Auto-generated method stub
		//deodorant.dispenseDeo();
		if(deodorant.getQuantity()>0)
		{
			deodorant.dispenseDeo();
			//deodorant.setState(deodorant.getLockedState());
		}
		else
		{
			System.out.println("Deodorant "+deodorant.name+" is empty!! Cannot dispense Deo");
			deodorant.setState(deodorant.getEmptyState());
		}
		
	}

	@Override
	public void newDeo() {
		// TODO Auto-generated method stub
		System.out.println("Time to buy a new one");
		deodorant.getEmptyState().newDeo();
	}
	public String toString()
	{
		return "Dispensing Deodorant ";
	}

}
