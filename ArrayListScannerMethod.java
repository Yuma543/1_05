package poly.kansai.enshu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListScannerMethod {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();

		number = scores();

		showResultsocores(number);
	}

	public static ArrayList<Integer> scores() {//入力して値を判定して格納するメソッド
		ArrayList<Integer> number = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		try {
			while (true) {// -1が入力されるまでループを用意
				System.out.println("1～100の数字を入力してください");
				int scores = scn.nextInt();// //確認用変数に入力を一時保存
				if (scores == -1) {//条件
					System.out.println("入力を終了します");
					break;
				} else if (scores >= 0 && scores <= 100) {
					number.add(scores);//正常値（－1）以外の数値を入れる　戻り値boolean
				} else {
					System.out.println("無効な数値です");
				}

			}

		} catch (InputMismatchException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
		return number;//格納した配列をメインメソッドに戻す
	}

	//ArrayList<Integer>の配列をnumberとして受け取る戻り値のないshowResultsocoresというメソッド
	public static void showResultsocores(ArrayList<Integer> number) {
		System.out.println("--------------------------");
		for (int i = 0; i < number.size(); i++) {//ArrayListの入力した値の数だけ繰り返す
			System.out.println("入力値" + number.get(i));//順番に値が表示される
		}

	}
}
