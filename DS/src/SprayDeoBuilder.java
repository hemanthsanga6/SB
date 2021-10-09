
public class SprayDeoBuilder extends DeoBuilder {
	public SprayDeoBuilder() {
		this.builderName = "Spray Deo Builder";
		setDeoClassifier(DeoClassifier.Spray);
	}
	public Deodorant build() {
		System.out.println("shake the can gently, remove the cap, and spray the underarm area from a distance of about 10 inches");
		return deodorant;
	}
}
