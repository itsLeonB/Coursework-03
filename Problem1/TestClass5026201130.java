public class TestClass5026201130 {
	public static void main(String[] args) {
		ComputeMethods5026201130 computeMethods = new ComputeMethods5026201130();
		double degC = computeMethods.fToC(32.0);
		double hypo = computeMethods.hypotenuse(6, 7);
		int diceValue = computeMethods.roll();
		System.out.println("Temp in celsius is " + degC);
		System.out.println("Hypotenuse is " + hypo);
		System.out.println("The sum of the dice values is " + diceValue);
	}
}