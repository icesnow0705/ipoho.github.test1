package xxx;

public class NineNineWhile {
	public static void main(String[] Args) {
		int i = 1;
		int j = 1;
		while (i < 10) {				//while迴圈，其目的為定義i為被乘數
			for (j = 1; j < 10; j++) {  //while迴圈，其目的為定義j為乘數
				System.out.print(i + "x" + j + "=" + i * j + "\t");
			}
			i++;
			System.out.println();
		}

	}
}
