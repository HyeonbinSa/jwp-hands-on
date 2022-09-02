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
- [ ] HTTP Compression 설정하기
  - [ ] GreetingControllerTest 클래스의 testCompression() 통과
- [ ] ETag/If-None-Match 적용하기
  - [ ] GreetingControllerTest 클래스의 testETag() 통과
- [ ] 캐시 무효화(Cache Busting)
  - [ ] GreetingControllerTest 클래스의 testCacheBustingOfStaticResources() 통과
