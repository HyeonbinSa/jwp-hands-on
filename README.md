# JWP Hands-On

## 만들면서 배우는 스프링 실습 코드

### 학습 순서
- cache
- thread
- servlet
- reflection
- di

### cache
- [x] 휴리스틱 캐싱 제거하기 
  - [x] 휴리스틱 캐싱이란?
    - Cache-Control이나 Expires 헤더가 없을 때 자체적으로 캐시의 유효 시간을 계산  
  - [x] GreetingControllerTest 클래스의 testNoCachePrivate() 통과
- [x] HTTP Compression 설정하기
  - [x] GreetingControllerTest 클래스의 testCompression() 통과
  - HTTP Response를 압축할 수 있다. Spring에서는 application.yml 파일을 통해 적용할 수 있다. 
- [x] ETag/If-None-Match 적용하기
  - [x] GreetingControllerTest 클래스의 testETag() 통과
- [x] 캐시 무효화(Cache Busting)
  - [x] GreetingControllerTest 클래스의 testCacheBustingOfStaticResources() 통과

### Thread
- [x] 스레드 이해하기
  - [x] ThreadTest
  - [x] SynchronizationTest
  - [x] ThreadPoolsTest
- [ ] 동시성 이슈 확인하기
  - 스레드 사용 시 발생할 수 있는 이슈 학습
  - ConcurrencyTest 설명 학습
- [ ] WAS 스레드 설정
  - [ ] application.yml 파일 확인
  - [ ] 각 설정의 의미 파악

### Servlet
- [ ] 서블릿 학습 테스트
  - [ ] SharedCounterServlet vs. LocalCounterServlet
  - [ ] ServletTest 통과
  - [ ] init, service, destroy 메서드 실행 시점 확인
  - [ ] ServletApplication 실행 시키고 localhost:8080/shared-counter 접속 확인
- [ ] 필터 학습 테스트
  - [ ] FilterTest 통과
  - [ ] doFilter() 실행 시점 파악
    - 인코딩 설정에 대한 학습 
