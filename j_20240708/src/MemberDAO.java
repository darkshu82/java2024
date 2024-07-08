import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO class
// Database Access Object

public class MemberDAO {

  Connection conn = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;

  String url = "jdbc:oracle:thin:@localhost:1521:xe";
  String id = "tjoeun";
  String pw = "1111";
  String driver = "oracle.jdbc.driver.OracleDriver";

  // 수정: 생성자 추가
  public MemberDAO() {
    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, id, pw);
    } catch(ClassNotFoundException e) {
      System.out.println(e.getMessage());
    } catch(SQLException e) { // 수정: SQLException 처리 추가
      System.out.println(e.getMessage());
    }
  }

  public MemberDTO selectOne(int memberNo) {
    MemberDTO dto = new MemberDTO();

    try {
      String sql = "SELECT * FROM MEMBER WHERE MEMBERNO = " + memberNo;
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery(); // 수정: 쿼리 실행 추가

      if (rs.next()) { // 수정: 결과 집합에서 데이터 추출 추가
        dto.setMemberNo(rs.getInt("MEMBERNO"));
        dto.setId(rs.getString("MEMBERNAME"));
        dto.setName(rs.getString("MEMBEREMAIL"));
        // 필요한 필드 추가 설정
      }
    } catch(SQLException e) {
      System.out.println(e.getMessage());
    } finally { // 수정: 리소스 해제 추가
      try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
    return dto;
  }
}