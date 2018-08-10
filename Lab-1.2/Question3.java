
import java.util.Random;
import java.util.Scanner;

public class SortedList {
	
	int [] n = new int[total]; //lista buena
	int [] p;// liste porhibida
	static int total;
	int pro;
	int index = 0;
	
	
	
	
	public SortedList(int arr) {
		
		for(int i = 0; i<total; i++) {
			n[i]=i;	
		}	
		
		Random generator = new Random();
		int randomIndex = generator.nextInt(n.length);
		
	} return n[randomIndex];

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		total = in.nextInt();
		

	}

}
