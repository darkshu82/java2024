
// DTO class
// Data Transfer Object
// 데이터 전송 객체
// VO : Value Object
public class MemberDTO {
	private int memberNo;
	private String id;
	private String name;
	
	// getter
	public int getMemberNo() {
		return this.memberNo;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	// setter
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", this.memberNo, this.id, this.name);
	}

}




