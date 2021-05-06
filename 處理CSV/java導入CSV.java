import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class java導入CSV {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.kcg.gov.tw/dataset/5936f124-dc59-44b4-a731-997d8ba85279/resource/7053bfe4-5ef6-417f-900e-55a83fefb0db/download/110131.csv");
			InputStream openStream = url.openStream();//開啟連結
			InputStreamReader isr = new InputStreamReader(openStream,"UTF-8");//因為政府資料平台是BIG5
			BufferedReader br = new BufferedReader(isr);
			String str="";
			
			while((str=br.readLine())!=null) {
				String[] split = str.split(",");
				for(String string : split) {
					System.out.print(string+" ");
				}
				System.out.println();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
/*
單位別
109年新竹縣政府核定公教人員退休人數
"本府暨所屬(不含警察局及各公所)"
"19"
"警察局"
"16"
"國中小"
"68"
"合計"
"103"

*/