
### 📚JPA 연습<br>

📍 Spring boot 프로젝트를 세팅하고 JPA를 이용하여 프로젝트 구현

1. [start.spring.io](http://start.spring.io) 들어가서 프로젝트 원하는대로 만들기
2. 프로젝트 실행 후 pom.xml 의 자바,스프링 부트 버전 확인 , dependency 필요한것 추가
3. (선택사항) [application.properties](http://application.properties) 를 yml로 변경 → 가독성을 위하여
4. mustache 플러그인 설치 → 인텔리제이 마켓에서 플러그인 
5. 패키지 세팅 (controller,  service, entity(dto)- 컨트롤러부터 서비스,db까지 오가는 데이터전달, repository ,domain - 클라이언트와 컨트롤러 사이의 데이터전달 , util)
    
    [mybatis인 경우 mapper , domain, dto 추가] 
    
6. mastache는 템플릿 파일에 생성 

*** 혹시 JPA가 아니라 mybatis로 세팅하고 싶으면 pom.xml에서 dependency 수정
