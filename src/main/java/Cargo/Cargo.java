package Cargo;
import java.time.*;
// java.time.YearMonth를 이용해서 Cargo의 제조년월을 멤버 변수로 설정 -> DB에 날짜 형식으로 저장할 수 있도록

//이름, SN, 수량, 단위 무게
public abstract class Cargo{
	
    private String nameCargo;
    private String SN;
    private int numCargo;
    private int weight_per_unit;
    private YearMonth mfdCargo;
    
    
    // Cargo의 제조년월을 멤버 변수로 받을 것. 같은 제품이어도, 제조년월이 다르다면 SN을 다르게 부여!
    /* 
    SN을 Cargo의 종류에 따라 서로 다른 4자리 이진수로 구성된 필드 추가 + 다른 화물과 겹치지 않게 hashing 한 4자리 필드를 SN로 구성하면?
    제조년월에 따라 SN을 다르게 생성하고자 하면 제조년월과 제품 이름을 비교하는 메서드 추가 + 다르다면 서로 다른 제품으로 구분 다른 hashing을 적용
    
    */
    public abstract void setCargo(String nameCargo, int numCargo, int weight_per_unit);
    public abstract void setDate(String date_mfd);
    //public abstract void setSN(); ## SN의 setter는 warehouse class에서 cargo의 hashing 값을 부여하는 메서드를 완성한 뒤에 구현하자!
}

