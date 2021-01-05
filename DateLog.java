package poly.kansai.enshu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLog {

	public static void main(String[] args) {
		try {
			//			File file = new File("D:/java/test.txt");
			FileWriter fw = new FileWriter("D:/java/Log.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			//			Date date = new Date();
			//			bw.write(date.toString());
			Date date = new Date();
			DateFormat dateFormat1 = new SimpleDateFormat(" yyyy年 MM月 dd日 HH時 mm分 ss秒");
			bw.write(dateFormat1.format(date));

			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
