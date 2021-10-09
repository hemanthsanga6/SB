public class GelDeoBuilder extends DeoBuilder {
	public GelDeoBuilder() {
		this.builderName = "Gel Deo Builder";
		setDeoClassifier(DeoClassifier.Gel);
	}
	public Deodorant build() {
		System.out.println("");
		return deodorant;
	}

}
