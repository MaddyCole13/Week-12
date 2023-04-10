import java.util.Random;

/**
 * 
 */

/**
 * @author maddycole
 *
 */
public class TestDemo {

	public int addPositive(int a, int b) {
	
	if(a>=0 && b>=0) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}else {
		throw new IllegalArgumentException("Both parameters must be positive!"); 
	}
 }
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1; 
	}
	
	public int randomNumberSquared() {
		int randomNumber = getRandomInt();
		int randomNumberSquared = randomNumber * randomNumber;
		return randomNumberSquared; 
	}
}
