import java.io.FileInputStream;
import java.util.Scanner;

class Solution {

	static int N;
	static String A, B;
	static long Answer;
	
	static int[] visited = new int[100];
	
	public static void main(String args[]) throws Exception {
		/*
		  �Ʒ��� ȣ���� ǥ�� �Է� ��� sample input ���Ϸκ��� �о���ڴٴ� �ǹ��Դϴ�.
		  �������� �ۼ��� �ڵ带 �׽�Ʈ�� �� �� ���� �Է��� ������ �� �� �ڵ带 �߰��Ͽ�
		  ���� �Է��� ǥ�� �Է� ��� �� ���Ϸκ��� �޾ƿ� �� �ֽ��ϴ�. 
		  ���� �׽�Ʈ ���� �ÿ��� �� �ڵ带 ����ϼŵ� �����ϴ�.
		  ��, �ڵ带 �����Ͻ� ������ �ݵ�� �� �ڵ带 ����ų� �ּ�ó�� �ϼž� �մϴ�.
		*/
		System.setIn(new FileInputStream("sample_input.txt"));
	
		/*
		   ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		*/
		Scanner sc = new Scanner(System.in);
	
		// �׽�Ʈ ���̽��� �� T 
		int T = sc.nextInt();
		
		
		// �׽�Ʈ ���̽� ������ ó���մϴ�.
		 
		for(int test_case = 1; test_case <= T; test_case++) {
			/******************************************************/
			// �� ���� �˰����� �����մϴ�.
			/******************************************************/
			N = sc.nextInt();
			A = sc.next();
			B = sc.next();
			
			Answer = Math.abs(getIndex(A) - getIndex(B)) - 1;
			System.out.println("#" + test_case + " " + Answer);
		}
	}
	
	public static long getIndex(String perm) {
		long result = 1;
		
		for(int i = 0; i < N; i++) {
			visited[i] = 0;
		}
		
		int tmp, cnt;
		for(int i = 0; i < N; i++) {
			tmp = (int) (perm.charAt(i) - 'a');
			cnt = countLessThan(tmp);
			
			result += cnt * fact(N - i -1);
			
			visited[tmp] = 1;
		}
		
		return result;
	}
	
	public static int countLessThan(int value) {
		int result = 0;
		
		for(int i = 0; i < value; i++) {
			if(visited[i] == 0) {
				result ++;
			}
		}
		
		return result;
	}
	
	public static long fact(long value) {
		if(value == 0) {
			return 1;
		}
		
		return value * fact(value - 1);
	}
}


