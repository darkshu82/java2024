import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 20 장 
// 571 page
public class Ex08_JDBC {
	
	public static void main(String[] args) {
		
		// 데이터베이스 접속 객체
    Connection conn = null;
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    String id  = "tjoeun"; 
    String pw  = "1111";
    
    try {
    	// Oracle Driver Load
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	
    	// Database 접속
    	conn = DriverManager.getConnection(url, id, pw);
    	
    	System.out.println("Oracle Database 접속 성공 !!!");
    	
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    } finally {
    	try {
				if(conn != null) {
					System.out.println("Oracle Database 접속 종료 !!!");
					conn.close(); 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
		
	}

}
