package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//鉛筆の個数を意味する
		int amount = 0;
		//鉛筆の値段を意味する
		int price = 100;

		System.out.println("鉛筆を購入しますか？");
		System.out.print("はい:0,いいえ:1 >");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buyFlagStr = reader.readLine();
		int buyFlag = Integer.parseInt(buyFlagStr);

		while (buyFlag == 0) {
			amount++;

			System.out.println("購入する鉛筆の本数を1つ増やしますか？");
			System.out.print("はい：0，いいえ：1 >");

			String buyFlagString = reader.readLine();
			buyFlag = Integer.parseInt(buyFlagString);

			System.out.println("購入した鉛筆の本数は" + amount + "本です。");
			System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");

		}
	}

}
