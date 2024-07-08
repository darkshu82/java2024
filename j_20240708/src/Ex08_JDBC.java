import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex08_JDBC {
  public static void main(String[] args) {
    Connection conn = null;
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String id = "tjoeun";
    String pw = "1111";

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      conn = DriverManager.getConnection(url, id, pw);

      System.out.println("Oracle Database 접속 성공");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      if (conn != null) {
        try {
          System.out.println("Oracle Database 접속 종료");
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }

  } // main
}
