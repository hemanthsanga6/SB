import java.util.*;

public class Deodorant
{
	State unlockedState;
	State lockedState;
	State emptyState;
	State sprayState;
	State state;
	double quantity;
	int count=0;
	String name;
	DeoBuilder.DeoClassifier deoClassifier;
	String deoType;
	Deodorant deodorant;
	public Deodorant(String name,double quantity)
	{
		
		unlockedState = new UnlockedState(this);
		lockedState = new LockedState(this);
		emptyState = new EmptyState(this);
		sprayState = new SprayState(this);
		this.name = name;
		this.quantity= quantity;
		
		
		if(this.quantity>0)
		{
			state= lockedState;
		}
		else
		{
			state= emptyState;
		}
	}
	public void lockDeo() {
		state.lockDeo();
	}
	public void unlockDeo()
	{
		state.unlockDeo();
	}


	public void dispenseDeo()
	{
		state.dispenseDeo();
		if(deodorant.quantity>0)
		{
			deodorant.quantity = deodorant.quantity-0.2;
			count++;
		}
		else
		{
			System.out.println("Deodorant is empty, it has been sprayed "+deodorant.count+" times");
			state.newDeo();		
		}
		
	}
	public void newDeo()
	{
		state.newDeo();
		
	}
	String getName()
	{
		return name;
	}
	double getQuantity()
	{
		return quantity;
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	public State getState(Deodorant deodorant)
	{
		return deodorant.state;
	}
	public State getUnlockedState()
	{
		return unlockedState;
	}
	public State getLockedState()
	{
		return lockedState;
	}
	public State getEmptyState()
	{
		return emptyState;
	}
	public State getSprayState()
	{
		return sprayState  ;
	}
	public void setDeoClassifier(DeoBuilder.DeoClassifier deoClassifier) {
		// TODO Auto-generated method stub
		this.deoClassifier = deoClassifier;
		switch (deoClassifier) {
		case Spray: this.deoType = "Spray type Deodorant"; break;
		case RollOn: this.deoType = "Roll On type Deodorant"; break;
		case Antiperspirant: this.deoType = "Antiperspirant type Deodorant"; break;
		case Gel: this.deoType = "Gel type Deodorant"; break;
			
	}}
	public String toString()
	{
	
		StringBuffer result = new StringBuffer();
		result.append("\nDeodorant: "+name);
		result.append("\ntyppe: "+deoType);
		result.append("\nQuantity: "+quantity+ "oz remaining");
		
		result.append("\n");
		result.append("Deodorant "+name+"  is in "+state+"\n");
		result.append("");
		
		return result.toString();
	}
	
	
}


//***************************************************************************************************


