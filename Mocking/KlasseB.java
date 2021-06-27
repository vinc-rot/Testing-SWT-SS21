package Mocking;

public class KlasseB {
	
	KlasseA Difference = new KlasseA();
	public KlasseB(KlasseA Difference){this.Difference=Difference;}
	public double Multiply(double i) {
		double multiple = Difference.minusCalc(i, i);
		return multiple;
	}
}
