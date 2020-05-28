package xxx;

public class NineNineDoWhile {
	public static void main(String[] Args) {
		int i = 1;
		int j = 1;
		do {
			for (j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
			}
			i++;
			System.out.println();
		} while (i < 10);

	}

}
