package j_20240624;

// 80 page
// 4 장 연습문제 4 번

public class Ex02 {
	
	public static void main(String args[]) {
		
		/*
				롤러코스터를 탈 수 있는 조건
				
				1) 6세 이상 탑승 가능
        (단, 키가 120cm 이상이면 보호자 동반하에 
         탑승 가능 : age < 6 && parent == true)
        
          (age >= 6 && height >= 120 && heartDisease == false) || 
          (age < 6  && height >= 120 && heartDisease == false && parent == true)
        
        2) 키 120cm 이상 탑승 가능
            height >= 120
        
        3) 심장관련 질환자 탑승 불가
            heartDisease == false

		*/
		
		int age = 8;
		int height = 131;
		boolean parent = true;
		boolean heartDisease = false;
		
		boolean result = (age >= 6 && height >= 120 && heartDisease == false) || 
                     (age < 6  && height >= 120 && heartDisease == false && parent == true);
		
		result = ((age >= 6 && height >= 120) || 
             (age < 6  && height >= 120 && parent == true)) && heartDisease == false;
		
		if (result) {
			System.out.println("롤러코스터를 탈 수 있습니다");
		}else {
			System.out.println("롤러코스터를 탈 수 없습니다");	
		}
		
		
	}

}


