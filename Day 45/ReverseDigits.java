import java.util.Scanner;

public class ReverseDigits {
	private static int rev;

	public static int reverse(int n) {
		if(n != 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			reverse(n / 10);
		} else {
			return 0;
		}

		return rev;
	}

	public static void main(String[] args) {
		int n;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		n = sc.nextInt();
		n = reverse(n);
		System.out.print("Reversed number: " + n);
	}
}