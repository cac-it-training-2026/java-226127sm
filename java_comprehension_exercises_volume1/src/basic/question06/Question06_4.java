package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//本の冊数
		int amountBooks = 0;
		//本を売却するかどうか
		int sellFlag = 0;
		//本の値段
		int bookPrice = 200;

		System.out.println("本を売却します。");

		do {
			//冊数を増やす
			amountBooks++;
			//メッセージ表示
			System.out.println("売却する本の冊数を1つ増やしますか？");
			System.out.print("はい：０、いいえ：１ >");
			//入力
			String choice = reader.readLine();
			sellFlag = Integer.parseInt(choice);

		} while (sellFlag == 0);
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * bookPrice) + "円です。");

	}

}
