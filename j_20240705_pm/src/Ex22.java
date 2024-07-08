import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

// 522 page

public class Ex22 {
	
	public static void main(String[] args) {
		// 한글 처리 안 됨 : byte Stream 이라서...
		//                    ㄴ 1 byte 씩 전송함
		// OutputStream out = null;
		// 한글 처리 됨 : character Stream 이라서...
		//                     ㄴ 2 byte 씩 전송함
		Writer out = null;
		
		try {
			// out = System.out;
			out = new OutputStreamWriter(System.out);
			// console 창에 write 함
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('2');
			out.write('3');
			out.write('가');
			out.write('나');
			out.write('다');
			out.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) { out.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
