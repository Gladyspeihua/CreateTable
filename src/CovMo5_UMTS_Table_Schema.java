import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CovMo5_UMTS_Table_Schema {

	public static void main(String[] args) throws IOException {
		String oneLine = "";
		String [] TableNameoneLineSp = null;
		String [] DATA_TYPEoneLineSp= null;
		
		FileWriter fw = new FileWriter("C:/Users/gladys/Desktop/output/output.txt");
		Scanner scanner = new Scanner(new FileReader("C:/Users/gladys/Downloads/CovMo5 UMTS Table Schema_20161116.txt"));
		ArrayList<String> tableNameList = new ArrayList<String>();
		
		while (scanner.hasNext()) {
			
			for(int i=1;i<6;i++){//跑前面幾行不要
				oneLine = scanner.nextLine();
			}
			
			oneLine = scanner.nextLine();//tableName
			TableNameoneLineSp = oneLine.split("\t");
						
			for(int i=7;i<17;i++){//跑中間幾行不要
				oneLine = scanner.nextLine();
			}
			
			oneLine = scanner.nextLine();//DATA_TYPE
			DATA_TYPEoneLineSp = oneLine.split("\t");
			
			break;
			
		}
		
		for(int i=0;i<TableNameoneLineSp.length;i++){
			if(TableNameoneLineSp[i].matches(" *")){
				i++;
			}
			fw.write("`"+TableNameoneLineSp[i]+"`"+" "+DATA_TYPEoneLineSp[i]+" "+"DEFAULT NULL,"+"\n");
		}
		
		fw.flush();
		fw.close();
		scanner.close();
	}
}


