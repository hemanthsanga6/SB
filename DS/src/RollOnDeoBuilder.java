

public class RollOnDeoBuilder extends SprayDeoBuilder{
	public RollOnDeoBuilder() {
		this.builderName = "Roll On Deo Builder";
		setDeoClassifier(DeoClassifier.RollOn);
	}
	public Deodorant build() {
		System.out.println("");
		return deodorant;
	}

}
