package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		// vi caster Math.random double til int. Vi adderer 1 til at starte med så randomnumber ikke kan blive rundet ned til 0.
		int randomnumber= 1+(int)(Math.random()*6);
		return randomnumber;
	}


	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
