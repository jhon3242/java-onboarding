# 미션 - 온보딩

## 🔍 진행 방식

- 미션은 **기능 요구 사항, 프로그래밍 요구 사항, 과제 진행 요구 사항** 세 가지로 구성되어 있다.
- 세 개의 요구 사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.
- 기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.

## 📮 미션 제출 방법

- 미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.
    - GitHub을 활용한 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고해
      제출한다.
- GitHub에 미션을 제출한 후 [우아한테크코스 지원](https://apply.techcourse.co.kr) 사이트에 접속하여 프리코스 과제를 제출한다.
    - 자세한 방법은 [제출 가이드](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 참고
    - **Pull Request만 보내고 지원 플랫폼에서 과제를 제출하지 않으면 최종 제출하지 않은 것으로 처리되니 주의한다.**

## 🚨 과제 제출 전 체크 리스트 - 0점 방지

- 기능 구현을 모두 정상적으로 했더라도 **요구 사항에 명시된 출력값 형식을 지키지 않을 경우 0점으로 처리**한다.
- 기능 구현을 완료한 뒤 아래 가이드에 따라 테스트를 실행했을 때 모든 테스트가 성공하는지 확인한다.
- **테스트가 실패할 경우 0점으로 처리**되므로, 반드시 확인 후 제출한다.

### 테스트 실행 가이드

- 터미널에서 `java -version`을 실행하여 Java 버전이 11인지 확인한다. 또는 Eclipse 또는 IntelliJ IDEA와 같은 IDE에서 Java 11로 실행되는지 확인한다.
- 터미널에서 Mac 또는 Linux 사용자의 경우 `./gradlew clean test` 명령을 실행하고,   
  Windows 사용자의 경우  `gradlew.bat clean test` 명령을 실행할 때 모든 테스트가 아래와 같이 통과하는지 확인한다.

```
BUILD SUCCESSFUL in 0s
```

---

## 🚀 기능 요구 사항
아래의 7가지 기능 요구 사항을 모두 해결해야 한다.

1. [문제 1](./docs/PROBLEM1.md)
2. [문제 2](./docs/PROBLEM2.md)
3. [문제 3](./docs/PROBLEM3.md)
4. [문제 4](./docs/PROBLEM4.md)
5. [문제 5](./docs/PROBLEM5.md)
6. [문제 6](./docs/PROBLEM6.md)
7. [문제 7](./docs/PROBLEM7.md)

---

## 🎯 프로그래밍 요구 사항

- JDK 11 버전에서 실행 가능해야 한다. **JDK 11에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- `build.gradle`을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.

---

## ✏️ 과제 진행 요구 사항

- 미션은 [java-onboarding](https://github.com/woowacourse-precourse/java-onboarding) 저장소를 Fork & Clone해 시작한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고한다.

# 구현할 목록

## 문제 1
* 매개변수로 입력 받은 배열을 확인한다.
* 각각의 배열을 더하거나 곱해서 더 큰 값을 서로 구한다.
* 서로 구한 가장 큰 값을 비교해서 누가 더 큰지 확인한다.
### 매개변수 확인
- [X] 매개변수로 받은 배열의 크기가 2인지 확인하는 메서드 구현
- [X] 매개변수로 받은 배열이 정수가 3~398 사이인지 확인하는 메서드 구현
- [X] 매개변수로 받은 배열이 연속된 숫자인지 확인하는 메서드 구현
- [X] 매개변수로 받은 배열이 첫번째 값이 홀수이고 두번쨰 값이 짝수인지 확인하는 메서드 구현
### 매개변수 처리
- [X] 배열의 합이나 곱중 큰 값을 리턴하는 메서드 구현
### 비교
- [X] 두개의 값을 비교해서 누가 더 큰지 확인하는 메서드 구현

## 문제 2

### 매개변수 확인
- [X] cryptogram가 길이가 1 이상 1000 이하인 문자열인지 확인
- [X] cryptogram가 알파벳 소문자로만 이루어져 있는지 확인
### 처리
- [X] 지울 문자가 있는지 확인하는 메서드 구현
- [X] 문자열이 주어지면 연속으로 중복되는 문자 확인해서 지우는 메서드 구현
- [X] 더이상 지울 문자가 없을 때 까지 문자열 지우기 반복

## 문제 3
### 매개변수
- [X] 매개변수가 1이상 10,000 이하의 자연수인지 확인
### 처리
- [X] 매개변수로 받은 숫자의 손벽 횟수 구하는 메서드 구현
- [X] 반복문을 돌면서 총 손벽 횟수 리턴

## 문제 4
### 매개변수 처리
- [X] 매개변수 word 의 길이가 1 이상, 1000 이하 문자열인지 확인
### 처리
- [X] 문자열을 char 배열로 바꿔줌
- [X] 배열을 순회하면서 알파벳인지 확인
- [X] 알파벳이 들어오면 교환해주는 메서드 구현
- [X] 최종적으로 변환된 배열을 문자열로 바꿔서 리턴

## 문제 5
### 매개변수 처리
- [X] 매개변수 money 의 길이가 1 이상, 1,000,000 이하 자연수인지 확인
- [X] 속성값으로 화폐 베열과 돈을 가지고 있게 구현
### 처리
- [X] 오만원 부터 일원 동전 까지 순서대로 해당 화폐로 바꿀 수 있는지 확인하고 바꿀 수 있는 개수를 배열에 추가한다.
- [X] 매개변수로 화폐 단위를 받으면 돈에서 해당 화폐로 바꿀 만큼 빼고 바꾼 개수만큼 배열에 추가해주는 함수 구현

## 문제 6
### 매개변수 처리
- [X] 크루는 1명 이상, 10,000명 이하인지 확인
- [X] 이메일 형식에 부합하는지 확인하고, email.com 도메인으로만 제한
- [X] 전체 길이가 11자 이상, 20자 미만
- [X] 닉네임은 한글이고, 1자 이상 20자 미만
### 과정
-[X] forms 를 순회하면서 닉네임을 2글자씩 쪼개서 Map 에 등록
  -[X] Map 에서 key 는 닉네임 2글자, value는 ArrayList로 이메일을 가지고 있음
  -[X] 이미 등록된 경우 ArrayList 에 이메일을 추가
-[X] ~~Map의 value 들을 순회하면서 중복을 제거한 이후 개수가 2개 이상인 경우~~ 이메일들을 result 배열에 추가
-[X] 이메일 배열을 오름차순으로 정렬하고 중복은 제거하여 리턴


