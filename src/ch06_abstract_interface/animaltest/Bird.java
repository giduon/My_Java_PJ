package ch06_abstract_interface.animaltest;

public interface Bird {
     int speed = 300;
     //public static final int speed = 300;
     // 인터페이스 안에 변수는 암시적으로 public static final이 있다.
     // *따라서 초기화 해야함*

     void fly();
     // public abstract void fly();

     default void flutter(){ // 기본 동작 정의
          System.out.println("날개를 펄럭입니다.");
     }
}
