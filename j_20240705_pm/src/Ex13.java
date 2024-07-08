import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// 510 ~ 511 page
// 한글을 입력받기 위해서 InputStreamReader 를 사용함
// InputStreamReader 의 조상 클래스는 Reader 클래스
public class Ex13 {
	
	// 515 page
	public static void main(String[] args) {
		int data = 0;
		try {
			Reader in = new InputStreamReader(System.in);
			System.out.print("문자 하나를 입력하세요 (종료:q) : " );
			
			while(true) {
				data = in.read();
				if(data == 13 || data == 10) {
					continue;
				}
				// 정수인 ASCII CODE (UNI CODE) 를 출력함
			  // System.out.println(data);
				// 입력한 문자를 출력함
				System.out.println((char)data);
				
				if(data == 113) {
					System.out.print("입력을 종료합니다");
					break;
				}
				System.out.print("문자 하나를 입력하세요 (종료:q) : ");
			}
		}catch(IOException e) { }
	}

}
