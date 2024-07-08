package j_20240705;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 525 page
public class Ex25 {
	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("test3.txt", true);
			
			// BufferedWriter 기능 추가
			bw = new BufferedWriter(fw);
			
			bw.write('A');
			
			char[] buf = new char[] {'B','C','D','E','F'};
			bw.write(buf);
			bw.write(buf, 2, 3);
			bw.write("\n여기는 더조은 학원입니다\n");
			
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) { bw.close(); }
				if(fw != null) { fw.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
