import java.util.Random;

public class ComputeMethods5026201130 {

	public double fToC(double degreesF) {
		double degreesC = 5/9*(degreesF-32);
		return degreesC;
	}

	public double hypotenuse(int a, int b) {
		double c = Math.sqrt(a*a + b*b);
		return c;
	}

	public int roll() {
		Random rndDice = new Random();
		int dice1 = rndDice.nextInt(6) + 1;
		int dice2 = rndDice.nextInt(6) + 1;
		int sumDice = dice1 + dice2;
		return sumDice;
	}
}