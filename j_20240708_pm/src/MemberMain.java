import java.util.List;

// 577 page

public class MemberMain {

	public static void main(String[] args) {
		
		MemberDTO dto;
		
		MemberDAO dao = new MemberDAO();
		dto = dao.selectOne(1);
		
		// getter 를 호출하는 방법
		System.out.printf("%d - %s - %s%n", dto.getMemberNo(), dto.getId(), dto.getName());
		System.out.printf("%d - %s - %s%n", dao.selectOne(1).getMemberNo(), dao.selectOne(1).getId(), dao.selectOne(1).getName());
		
		// toString() 을 호출하는 방법
	  // System.out.println(dto.toString());
	  System.out.println(dto);
	  System.out.println(dao.selectOne(1));
	  System.out.println(dao.selectOne(2));
	  System.out.println(dao.selectOne(3));
	  System.out.println(dao.selectOne(4));
	  System.out.println(dao.selectOne(5));
	  
	  System.out.println("===== 회 원 전 체 조 회 =====");
	  
	  List<MemberDTO> memberList = dao.selectAll();
	  
	  for(MemberDTO dto2 : memberList) {
	  	System.out.println(dto2);
	  }
	  
		
	}
	
}





