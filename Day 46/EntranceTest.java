import java.util.Scanner;

public class EntranceTest {
	public static int count(int x, int n, int num) {
		int i;
		i = (int)(x - Math.pow(num, n));
		if(i == 0) {
			return 1;
		}
		if(i < 0) {
			return 0;
		} else {
			return count(i, n, num + 1) + count(x, n, num + 1);
		}
	}

	public static int countWays(int x, int n) {
		return count(x, n, 1);
	}

	public static void main(String[] args) {
		int x, n;
        Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		n = sc.nextInt();
		System.out.print(countWays(x, n));
	}
}