
public class Main {

	public static void main(String[] args) {
		
		long l =0;
		
		
		long start = System.currentTimeMillis();
		for(int i=0; i < 1000000000; i++) {
			l+=i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);

	}

}
