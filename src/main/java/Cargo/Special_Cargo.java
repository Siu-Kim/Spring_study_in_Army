package Cargo;

public class Special_Cargo extends Cargo{
    private String cargoType;  
    private String category;
    
    public Special_Cargo(String cargoType) {
        this.cargoType = cargoType;
        this.category = "Special";
    }
    
    public void setCargo(String nameCargo, int numCargo, int weight_per_unit){
        this.nameCargo = nameCargo;
        this.numCargo = numCargo;
        this.weight_per_unit = weight_per_unit;
        
        return;
    }
        
    public void setDate(String date_mfd){
     	this.mfdCargo = date_mfd; //String으로 받은 날짜를 YearMonth 형식을 변환 필요 -> 문자열 파싱? YearMonth 메서드 뜯어봐야 할 듯   
     	
        return;   
    }
    
    /*setSN은 SN을 hashing하는 서비스까지 구현한 뒤에 만들자!!
    public void setSN(){
        
    }
    */
    
    
}