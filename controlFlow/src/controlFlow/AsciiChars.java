package controlFlow;

public class AsciiChars {
	public static void printNumbers() {
		for(int i = 48; i < 58; i++) {
			System.out.printf("%c, ", i);
		}
		System.out.printf("\n"); 
	}

	public static void printLowerCase() {
		for(int j = 97; j < 123; j++) {
			System.out.printf("%c, ", j);
		}
		System.out.printf("\n");
	}


	public static void printUpperCase() {
		for(int k= 65; k < 91; k++) {
			System.out.printf("%c, ", k);
		}
		System.out.printf("\n");
	}
}