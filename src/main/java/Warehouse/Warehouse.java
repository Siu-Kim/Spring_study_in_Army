package Warehouse;

/*
등록된 화물 목록 object 배열
입고된 화물 목록 object 배열

최대 화물 적재량

warehouse id

챠량 

/*
# cargo를 저장할 임시 DB 구현 필요 -> DB를 저장하는 친구를 따로 만들고 DAO class가 필요할 듯. -> warehouse package 안에 만들어야 하나
# 화물 관리(각 화물 정보 출력, 창고 정보 출력, 화물 정보 수정 등), 입출고를 위한 메서드 구현 필요.
	- warehouse 전체 재고를 file로 출력하는 기능 + 새로운 cargo를 DB에 저장하고 SN 부여, 화물 종류에 맞는 객체 생성하고 초기화하기 등 입출고를 위한 다양한 메서드가 필요.
# SN 할당하는 메서드 필요 -> hashing + String(실제 사용할 SN format) 변환만 구현. 나머지는 부가적인 기능들은 입고 시, warehouse 객체가 responsibility를 가질 수 있도록 설계해야 함. 
# DAO(Data Access Object) class를 구현해서 DB에 쉽게 접근하고 데이터의 CRUD 기능을 적절히 수행할 수 있도록 해야 함.
# hash table과 B-tree 등 임시 DB로 cargo 객체들를 저장하기 좋은 자료구조를 선택하여 직접 구현해보자!! 



*/

public class Warehouse {
    
    
    
    
}
