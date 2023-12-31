﻿# security-version-6.x
# 로그인, 회원가입 및 권한처리 토이 프로젝트

## 사용 SKILL
- Spring Boot
- Spring Security
- Mastach
- Mysql
- Mybatis
- lombok

</br>

## 구현 기능
- 로그인
- 회원가입
- 권한처리

</br>

### 회원가입

</br>

스프링 시큐리티를 이용하여 SecurityConfig 클래스 파일에 Bcryp 을 Bean 등록하여 스프링 전역에서 사용할 수 있도록 하였으며
컨트롤단에서 해당 Bcryp 을 사용하여 회원가입시 암호화 작업 진행

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/c3644e48-5ec2-4fd2-ab0a-2b05a77e3b95)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/2f4c1a59-65a2-484a-8dc6-0f92fbd26d46)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/b545b067-ac7e-470d-8388-05bcf8fc81b1)

</br>

### 로그인
</br>

스프링 시큐리티에서 로그인 작업을 위해 Security Session 에 들어가는 Authentication 객체의 안에 들어가는 UserDetails 객체타입을 만들어 주고 
Authentication 객체 생성을 위해 UserDetailsService 객체 타입을 만들어 loadByUsername method 를 오버라이드 하여 UserDetails 객체타입의 new PrincipalDetails(user); 의 객체를 만들어
리턴 시키는 작업을 하였습니다.

- Security Session > Authentication > UserDetails
- UserDetailsService : Authentication(UserDetails)
- Security Session [Authentication(UserDetails)]

 ![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/900fe20c-b757-4876-8cba-d410ffc6f5e3)

</br>

 ![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/b2b24a4e-63ec-4bf8-826e-d301d21a5e2f)

</br>

### 권한 처리

</br>

로그인한 User 가 가지고 있는 Role에 따라 접근할 수 있는 경로를 다르게 설정하기 위해 Global 설정과 /info 경로에 @Secured("ROLE_ADMIN") 설정을 해주었다

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/7b145418-e0fb-4805-a006-e851983a8fd7)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/e6e1e5c6-4888-4524-878f-f0cc9dfe1f9c)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/74f1a56f-39dc-4cb6-ab0a-086cc9aae44a)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/92b86bd6-a979-4eb1-b5c2-09b03e63feca)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/13210f00-5c4f-4bd2-941e-7ada46e56ade)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/c834a872-aeed-4c1e-b1e0-c7efe78eba7a)

</br>

![image](https://github.com/Sn-bow/security-version-6.x-login-and-Permission-handling-toy-project/assets/107871028/61adff95-f4a6-4ffc-ad23-c2dee93e0c33)
