
public class UnlockedState implements State {
Deodorant deodorant;
	public UnlockedState(Deodorant deodorant) {
		// TODO Auto-generated constructor stub
		this.deodorant = deodorant;
	}

	@Override
	public void unlockDeo() {
		// TODO Auto-generated method stub
		System.out.println("The deodorant is already unlocked");
	}

	@Override
	public void lockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is locked now");
		deodorant.setState(deodorant.getLockedState());
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		System.out.println("you pressed the dispenser button, dispensing "+deodorant.name+" deodorant");
		deodorant.setState(deodorant.getSprayState());
		deodorant.dispenseDeo();
		
	
	}

	@Override
	public void dispenseDeo() {
		// TODO Auto-generated method stub
		System.out.println("you need to press the dispenser button to dispense deo");
		pressButton();
	}

	@Override
	public void newDeo() {
		// TODO Auto-generated method stub
		System.out.println("You need to press the button to check the quantity of the deodorant first");
		deodorant.getEmptyState().newDeo();
	}
	public String toString()
	{
		return "Waiting for dispenser button to be pressed";
	}
}
