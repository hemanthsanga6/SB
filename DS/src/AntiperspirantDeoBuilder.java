

public class AntiperspirantDeoBuilder extends DeoBuilder{
	public AntiperspirantDeoBuilder() {
		this.builderName = "Anti Perspirant Deo Builder";
		setDeoClassifier(DeoClassifier.Antiperspirant);
	}
	public Deodorant build() {
		System.out.println("");
		return deodorant;
	}


}
