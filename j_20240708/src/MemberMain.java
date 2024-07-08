
public class MemberMain {
  public static void main(String[] args) {
    
    MemberDTO dto;
    
    MemberDAO dao = new MemberDAO();
    dao.selectOne(1);
    
    
    System.out.println(dto);
    
  }
}
