package xxx;

public class Test4Numbers {
	public static void main(String[] Args) {
		for (int i = 0; i < 101; i++) {   	//for迴圈定義i變數，為0~100的整數，從0開始每次遞增1
			int j = i % 4;                	//j變數為i除以4的餘數
			int k = i % 20;				  	//k變數為i除以20的餘數
			if (k == 0 && i != 0) {       	//if用來判斷k的數值，其目的為每五個4的倍數空一行
				System.out.println();
			}
			if (j == 0) {                 	//if用來判斷j的數值，其目的為印出4的倍數
				System.out.print(i + "\t");
			}
		}
	}
}
