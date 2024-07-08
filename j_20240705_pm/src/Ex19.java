import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 518 page : BufferedReader

public class Ex19 {
	
	public static void main(String[ ] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String txt = null;
		
		try {
			fr = new FileReader("C:/workspace/java/j_20240705/src/Ex18.java");
			br = new BufferedReader(fr);
			
			// BufferedReader 클래스의 readLine() 메소드 : 문자열을 한 줄 단위로 읽어옴
			/*
			while(true) {
				txt = br.readLine();
				if(txt == null) {
					break;
				}
				System.out.println(txt);
			}
			*/
			while((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) { br.close(); }
				if (fr != null) { fr.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
