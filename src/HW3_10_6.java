
public class HW3_10_6 {
	
	public static void main(String args[]) {
		
		boolean isPrime;
		int[] primes = new int[30];
		int index = 0;
		
		for(int i = 2; i < 120; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i != 2 && i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				primes[index] = i;
				index++;
			}
		}		
		//Instantiation of StackofIntegers object as provided from the textbook
		StackOfIntegers stack = new StackOfIntegers(primes.length);
		
		for(int i = 0; i < primes.length; i++) {
			stack.push(primes[i]);
		}
		System.out.println("All primes below 120 in descending order:");
		
		for(int i = 0; i < primes.length; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

}
