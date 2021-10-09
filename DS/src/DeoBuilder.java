
public abstract class DeoBuilder {
	String builderName;
	enum DeoClassifier {
		Spray, RollOn, Antiperspirant, Gel
	}
	DeoClassifier deoClassifier;
	Deodorant deodorant = new Deodorant("String",2.0);//new Deodorant("String",2.0)
	
	public void setDeoClassifier(DeoClassifier deoClassifier) {
		this.deoClassifier = deoClassifier;
		deodorant.setDeoClassifier(deoClassifier);
	}
	// Each method in the Builder returns the Builder so we can use the Fluent Interface Pattern
	
	public Deodorant build() {
		System.out.println("Get the specific deodorant type");
		
		return deodorant;
	}
}