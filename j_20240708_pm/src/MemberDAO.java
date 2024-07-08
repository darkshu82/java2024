import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 574 page
// DAO class
// Database Access Object
/*
    ORACLE JDBC 설정값
    
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    String id  = "tjoeun"; 
    String pw  = "1111";
    String driver = "oracle.jdbc.driver.OracleDriver"
   	
   	Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, id, pw);
*/
public class MemberDAO {
	
	// 데이터베이스 접속 객체
  Connection conn = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  
  String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
  String id  = "tjoeun"; 
  String pw  = "1111";
  String driver = "oracle.jdbc.driver.OracleDriver";
  
  // 생성자에서 database 에 접속함
  //  ㄴ MemberDAO 객체를 생성하면 자동으로 database 에 접속함
  public MemberDAO() {
  	try {
  		// Oracle database 드라이버 로드
  		Class.forName(driver);
  		// Oracle database 접속
  		conn = DriverManager.getConnection(url, id, pw);
  		System.out.println("DB 접속 성공 !!!");
  	}catch(ClassNotFoundException e) {
  		System.out.println(e.getMessage());
  	}catch(SQLException e) {
  		System.out.println(e.getMessage());
  	}
  	
  } // 생성자
  
  // data 조회하기 : select 
  public MemberDTO selectOne(int memberNo) {
  	
  	MemberDTO dto = new MemberDTO();
  	
  	try {
  	// sql 문을 String 으로 저장해서 활용함
  	String sql = "SELECT * FROM MEMBER WHERE MEMBERNO = ?";
  	// PreparedStatement 객체 생성
  	pstmt = conn.prepareStatement(sql);
  	pstmt.setInt(1, memberNo);
  	
  	rs = pstmt.executeQuery();
  	
  	if(rs.next()) {
  		dto.setMemberNo(rs.getInt("memberNo"));
  		dto.setId(rs.getString("id"));
  		dto.setName(rs.getString("name"));
  	}else {
  		System.out.println(memberNo + " 번 회원이 없습니다");
  	}
  	
  	}catch(SQLException e) {
  		System.out.println(e.getMessage());
  	}
  	
  	return dto;
  	
  } // selectOne
  
  
  //data 조회하기 : selectAll 
  public List<MemberDTO> selectAll() {
 	
  	List<MemberDTO> memberList = new ArrayList<>();
  	
  	try {
    	// sql 문을 String 으로 저장해서 활용함
    	String sql = "SELECT * FROM MEMBER";
    	// PreparedStatement 객체 생성
    	pstmt = conn.prepareStatement(sql);
    	rs = pstmt.executeQuery();
    	
    	while(rs.next()) {
    		MemberDTO dto = new MemberDTO();
    		dto.setMemberNo(rs.getInt("memberNo"));
    		dto.setId(rs.getString("id"));
    		dto.setName(rs.getString("name"));
    		memberList.add(dto);
    	}
    	
    	}catch(SQLException e) {
    		System.out.println(e.getMessage());
    	}
	  
  	return memberList;
  }	 
  
  
  
	

}







