package j_20240705;
import java.io.IOException;
import java.io.InputStream;

// 510 ~ 511 page

public class Ex12 {
	
	public static void main(String[] args) {
		int data = 0;
		try {
			InputStream in = System.in;
			System.out.print("문자 하나를 입력하세요 (종료:q) : " );
			
			while(true) {
				data = in.read();
				if(data == 13 || data == 10) {
					continue;
				}
				// 정수인 ASCII CODE 를 출력함
				// System.out.print(data);
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
