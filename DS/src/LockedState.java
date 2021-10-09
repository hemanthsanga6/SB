
public class LockedState implements State {
Deodorant deodorant;
	public LockedState(Deodorant deodorant) {
		// TODO Auto-generated constructor stub
		this.deodorant = deodorant;
	}

	@Override
	public void unlockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is unlocked now");
		deodorant.setState(deodorant.getUnlockedState());
	}

	@Override
	public void lockDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is already locked");
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		System.out.println("Cannot press dispenser button, you need to unlock the deodorant first");
	}

	@Override
	public void dispenseDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is locked, it cannot be dispensed");
	}

	@Override
	public void newDeo() {
		// TODO Auto-generated method stub
		System.out.println("Deodorant is locked so not possible to check how much quantity is remaining");
		deodorant.getEmptyState().newDeo();
	}
	public String toString()
	{
		return "\nWaiting to unlock";
	}

}
