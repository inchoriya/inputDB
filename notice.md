※프로젝트 생성하기 전 jdk 버전 확인하기(현재 jdk 11버전 사용중)
[1] 프로젝트 이름 : InputDB
[2] 4개 패키지, mapper폴더 만들기
	com.icia.input (1) controller (2) service (3) dto (4) dao
	4개 패키지 만들고 dao 패키지에서 mapper 폴더 만든 후 inputMapper.xml 파일 생성 후 복사 붙여넣기
[3] src/main/resoureces : mybatis-config.xml 파일 생성 후 복사 붙여넣기

=== [4]번 - [7]번까지 가장 최근에 만든 프로젝트 참조 ===
[4] pom.xml : <properties> 아래로 다 복사해서 붙여넣기
[5] web.xml : 모두 복사 후 붙여넣기
[6] root-context.xml : 모두 복사 후 mapperLocations의 value값 확인(패키지)
[7] servlet-context.xml : 모두 복사 후 붙여넣기

[8] 프로젝트 우클릭 후 맨아래 properties 선택
 (1) Java Build Path - Library - JRE System Library 선택
      : workspace default JRE 으로 바꾸기
 (2) Java Compiler : 1.6 버전에서 11 버전으로 변경
 (3) Project Facets
       - Dynamic Web Module 4.0
       - Java 11
       - Runtimes -> tomcat 9.0 선택
       
       
       
       
       
       
       
       
       
       
       
       