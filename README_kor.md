# README

## 이 문서는 OOP와 Spring 구현 실습을 위해 진행하는 Warehouse Management System 프로젝트의 구조, 구현 단계를 설명한다.

- warehouse management system은 크게 Server Side, Cient Side 2가지 측면에서 구현된다.
- 주요 기능은 화물 관리, 재고 추적, 창고 관리 등 크게 3가지로 구성되며, 각 기능은 웹 페이지에서의 GUI를 통해 접근할 수 있도록 한다.
- 웹 페이지는 REST API를 통해 클라이언트와 서버 간의 데이터 통신을 수행한다.
- Server side에서는 DB와의 상호작용, 각 기능을 제공하는 Service와 Container, Client와의 통신 등의 기능을 구현한다.
- Client side에서는 Server와의 통신, 사용자로부터의 I/O 처리 및 UI 관리 기능을 구현한다.


## 주요 기술 스택
- Java, Spring Framework, MySQL, RESTful API

## 1단계 구현: Java와 OOP 실습을 위한 기초 구현으로 각 class와 인터페이스를 정의하고 기본적인 CRUD 기능을 구현한다.
- warehouse와 cargo 클래스를 구현하고 CLI를 통해 기초적인 CRUD 기능을 구현한다.
- warehouse 클래스는 Cargo를 저장하는 임시 DB를 구현하고, 화물 관리, 재고 추적 등의 method를 구현한다. 또한 임시 DB의 hashing 값에 따라 SN를 부여하는 서비스를 구현한다.
- cargo 클래스는 화물의 정보 (이름, 종류, SN, 수량, 단위 무게, 제조년월)를 member variable로 가지며, 세터와 게터 method를 구현한다.
- cargo 클래스의 화물의 상태를 관리하기 위한 상태 관리 기능을 추가하여, 각 화물의 입고 및 출고 이력을 추적할 수 있도록 한다. (적재 / 출고(일정 기간 동안, 이후 삭제) / 화물 없음)


## 2단계 구현: Spring과 AOP 실습을 위한 응용 구현으로 Spring Bean과 다양한 의존성 관계를 활용하고, AOP를 통해 서비스 로직을 분리하여 구현한다.

## 3단계 구현: RESTful API를 활용해 클라이언트와 서버 간의 데이터 통신 및 다양한 서비스 처리를 구현한다.

## 4단계 구현: DB 설계 및 연동을 통해 데이터의 영속성을 확보하고, CRUD 기능을 완전하게 구현한다.

## 5단계 구현: 코드의 관리를 위한 로깅 및 예외 처리 기능을 추가하여 시스템의 안정성을 높이고, Auth를 이용한 보안 기능을 구현한다.



화물 관리, 재고 추적 
화물 등록 / 입고 / 출고 / 분류 기능을 지원하는 warehouse management system 구현하기~!

cargo를 종류 별로 구분하여 적재(hashing 이용) 및 SN(Seriel number) 부여 -> hash map 이용하여 데이터 저장 -> DB 연동으로 수정하기

abstract class Cargo를 상속하는 general_cargo / special_cargo -> clean, dirty, liquid, bulk, refrigerated / 
	valueable, heavy, dangerous, livestock, perishable 구현

화물의 종류와 무게를 입력하여 등록, 입고 / 출고 기능 구현

cargo는 멤버 변수로 SN, weigt, kind, quantity를 가지고, 멤버 함수로 setter(SN은 setter를 이용해 초기화, 
	나머지 변수는 constructor를 이용해 초기화), getter 구현, toString

- SN는 Cargo의 고유 식별자로, 각 화물을 구분하는 데 사용되며, 총 8자리 숫자의 string으로 구성된다.
- SN의 앞 4자리는 각 Cargo의 자식 클래스에서 Cargo의 구분에 따라 다르게 지정된다.
- SN의 뒤 4자리는 hasing을 위한 static 메서드를 통해 지정된다.


프록시 지정 필요

공통 기능 구현할 class 필요

Bean 등록 필요

의존 설정 필요

화물 출고/입고를 위한 메서드 구현 필요 -> 이를 관리하는 Controller 필요


##### 실행방법
- 프로젝트를 톰캣 경로에 배포하기 위해 빌드를 먼저한 후, 실행을 해야합니다.
- 빌드 후 실행을 하면, 프로젝트에 연결된 도메인으로 실행 결과를 확인하실 수 있습니다.

##### 빌드
- 빌드 시 .war 파일 생성 및 기존에 배포되었던 application 삭제, 생성 된 .war 파일을 Tomcat의 webapps directory에 배포하는 프로세스가 진행됩니다.
- 서버 실행 도중 빌드할 시, 빌드 완료 후 잠시 기다리면 Tomcat이 자동으로 application을 재시작합니다.


##### 환경변수 설정
- Tomcat, Maven 경로 등의 환경변수는 ~/.profile 파일에 작성되어 있어, 직접 setting이 필요한 경우 vim 등의 편집기로 열어서 수정하면 됩니다.

##### Directory Role 설정
- Sources Root 경로는 src/main/java가 기본값으로 설정되어있으며 프로젝트 속성에서 '소스 경로'를 수정하여 설정할 수 있습니다.

