
 프로젝트 개요
 
- 일정 CRUD
- 회원가입, 로그인 (Session/Cookie 기반 인증)
- JPA Auditing을 활용한 생성/수정 시간 자동화
- 인증 기반 필터 적용

 

ERD 문서 확인:  

ERD  (https://renzpark572.atlassian.net/wiki/external/MzA3OTFjN2ZlM2EwNDc5Njk1OGZkOTIwNTY2NGVmODA)




API (https://renzpark572.atlassian.net/wiki/spaces/~7120206237f980ba584c9eb7cea78d2372e0c5/pages/262158/Schedule+API)


일정 (Todo)

- GET /api/todos : 전체 일정 조회
- POST /api/todos : 일정 생성
- GET /api/todos/{id} : 일정 상세 조회
- PUT /api/todos/{id} : 일정 수정
- DELETE /api/todos/{id} : 일정 삭제

유저 (User)

- POST /api/users/signup : 회원가입
- POST /api/users/login : 로그인
- POST /api/users/logout : 로그아웃
- GET /api/users/me : 내 정보 조회

