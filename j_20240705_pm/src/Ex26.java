import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 525 page
public class Ex26 {
	
	public static void main(String[] args) {
		
		// try-with-resources 구문으로 변경하세요
		try (FileWriter fw = new FileWriter("test3.txt", true);
				 BufferedWriter bw = new BufferedWriter(fw);) 
		{
			bw.write('A');
			
			char[] buf = new char[] {'B','C','D','E','F'};
			bw.write(buf);
			bw.write(buf, 2, 3);
			bw.write("\n여기는 더조은 학원입니다\n");
			
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
