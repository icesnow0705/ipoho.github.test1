package xxx;

public class Homework_200525 {
	public static void main(String[] Args) {

		// 第一題：請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		System.out.println("第一題");
		System.out.println("12,6的和為" + (a + b));
		System.out.println("12,6的積為" + (a * b));

		// 第二題：請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int c = 200; // 雞蛋(被除數)
		int d = 12; // 一打(除數)
		int e = c / d; // 可分為幾打
		int f = c % d; // 剩下幾顆(餘數)
		System.out.println("第二題");
		System.out.println(c + "顆蛋共是" + e + "打" + f + "顆");

		// 第三題：請由程式算出256559秒為多少天、多少小時、多少分與多少秒?
		int totalSec = 256559;
		int day = totalSec / 86400;
		int hours = (totalSec % 86400) / 3600;
		int mins = (totalSec % 3600) / 60;
		int secs = totalSec % 60;
		System.out.println("第三題");
		System.out.println("256559秒為" + day + "天" + hours + "小時" + mins + "分" + secs + "秒");

		// 第四題：請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		double r = 5;
		double circleLength = r * 2 * pi;
		double circleArea = pi * Math.pow(r, 2);
		System.out.println("第四題");
		System.out.println("半徑為" + r + "的圓,其面積為" + circleArea + ",周長為" + circleLength);

		// 第五題：某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		final double defaultFortune = 1500000;
		double interestRate = 0.02;
		double totalFortune = defaultFortune;
		for(int i=0;i<10;i++) {
			totalFortune = totalFortune + (totalFortune*interestRate);
		}
		System.out.println("第五題");
		System.out.println("10年後本金加利息共有" + totalFortune + "元");

		// 第六題：請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + '5'
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因
		System.out.println("第六題");
		System.out.println(5 + 5); // 前者後者皆為數值為5的整數，同樣型態其數值直接相加5+5=10，因此印出10
		System.out.println(5 + '5'); // 前者為整數，後者為ANSII轉型成int其值為53，之後5+53=58，因此印出58
		System.out.println(5 + "5"); // 前者為整數，後者為字串，因此印出兩個5
	}

}
