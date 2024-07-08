
// DTO class
// Data Transfer Object
// 데이터 전송 객체

public class MemberDTO {
  private int memberNo;
  private String id;
  private String name;

  public int getMemberNo() {
    return this.memberNo;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

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
    return String.format("");
  }
}