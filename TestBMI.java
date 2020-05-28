package xxx;

public class TestBMI {
	public static void main(String[] Args) {

		double w = 0; // 體重 (公斤)
		double h = 1.76; // 身高(米)
		double bmi = w / Math.pow(h, 2); // 1.76米正常體重範圍 57.3056~74.3424公斤
		System.out.println("您的BMI為：" + bmi);

		if (bmi < 18.5 && bmi > 0) {
			System.out.print("過瘦");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.print("正常");
		} else if (bmi >= 24) {
			System.out.print("過胖");
		} else {
			System.out.println("輸入資料錯誤");
		}

	}
}
