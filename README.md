# Design-Pattern

<img src="http://www.hanbit.co.kr/data/books/B3400922670_l.jpg">

* 'JAVA 객체지향 디자인 패턴'을 읽고 정리한 내용입니다.

* 매일 하나의 패턴을 공부하는 것이 목표입니다.

---

### 스트래티지 패턴 (Strategy Pattern)

  [[version 1] 각 클래스에서 개별 기능 구현](https://github.com/wschoi8640/Design-Pattern/tree/master/src/strategy01)

  [[version 2] 각 클래스에 구현된 개별 기능 수정](https://github.com/wschoi8640/Design-Pattern/tree/master/src/strategy02)

  [[version final] 변경될 기능 단위로 미리 캡슐화](https://github.com/wschoi8640/Design-Pattern/tree/master/src/strategy03)

---

### 싱글톤 패턴 (Singleton Pattern)

  [[version 1] new 생성자를 통한 인스턴스 생성](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton01)
  
  [[version 2] private 생성자로 인스턴스 생성 방지](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton02)
  
  [[version 3] getter를 통한 인스턴스 조건부 생성](https://github.com/wschoi8640/Design-Pattern/blob/master/src/singleton03)
  
  [[version 4] version 3를 이용해 printer 출력](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton04)
  
  [[version 5] 다중 스레드에서 인스턴스 다중 생성](https://github.com/wschoi8640/Design-Pattern/blob/master/src/singleton05)
  
  [[version final 1] 정적 변수에서 인스턴스 초기화](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton06)
  
  [[version final 2] 동기화를 통한 메소드, 자원 공유](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton07)
  
  [[version final 3] 정적 메소드, 클래스로 인스턴스 없이 클래스 사용](https://github.com/wschoi8640/Design-Pattern/tree/master/src/singleton08)

---

### 스테이트 패턴 (State Pattern)

  [[version 1] 조건문을 통한 state 행위 결정](https://github.com/wschoi8640/Design-Pattern/tree/master/src/state01)
  
  [[version final] 구현한 state 클래스에서 각각 행위 결정](https://github.com/wschoi8640/Design-Pattern/tree/master/src/state02)

---

### 커맨드 패턴 (Command Pattern)

  [[version 1] 정적인 기능 수행](https://github.com/wschoi8640/Design-Pattern/tree/master/src/command01)
  
  [[version 2] 조건화를 통한 기능 수행](https://github.com/wschoi8640/Design-Pattern/tree/master/src/command02)
  
  [[version final] 기능의 캡슐화를 통한 기능 수행](https://github.com/wschoi8640/Design-Pattern/tree/master/src/command03)

---

### 옵저버 패턴 (Observer Pattern)

  [[version 1] 지정된 클래스를 업데이트](https://github.com/wschoi8640/Design-Pattern/tree/master/src/observer01)
  
  [[version 2] 업데이트 할 대상을 직접 변경](https://github.com/wschoi8640/Design-Pattern/tree/master/src/observer02)
  
  [[version 3] 출력 방식별로 각각 업데이트](https://github.com/wschoi8640/Design-Pattern/tree/master/src/observer03)
  
  [[version final] 추상화, 캡슐화를 통해 업데이트 일원화](https://github.com/wschoi8640/Design-Pattern/tree/master/src/observer04)
  
---

### 데코레이터 패턴 (Decorator Pattern)

  [[version 1] 공통 기능을 상속하는 클래스](https://github.com/wschoi8640/Design-Pattern/tree/master/src/decorator01)

  [[version final] version 1을 상속하는 클래스로 객체 조합 만들기](https://github.com/wschoi8640/Design-Pattern/tree/master/src/decorator02)

---

### 템플릿메소드 패턴 (Template Method Pattern)

  [[version 1] 기능을 직접 구현](https://github.com/wschoi8640/Design-Pattern/tree/master/src/templateMethod01)
  
  [[version 2] 추가 기능을 상위 클래스 상속을 통해 구현](https://github.com/wschoi8640/Design-Pattern/tree/master/src/templateMethod02)
  
  [[version final] 중복되는 메소드를 추상 메소드로 만들어 중복 최소화](https://github.com/wschoi8640/Design-Pattern/tree/master/src/templateMethod03)
