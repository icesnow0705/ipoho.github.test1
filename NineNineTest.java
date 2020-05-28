package xxx;

public class NineNineTest {
	public static void main(String[] Args) {
		for(int i=0;i<10;i++) { 						//for迴圈，其目的為定義i為被乘數
			for (int j=1;j<10;j++) {					//for迴圈，其目的為定義j為乘數
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
