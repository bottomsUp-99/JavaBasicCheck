package Inheritance.sec06.exam01;

//객체 타입 변환 : 객체의 타입을 다른 타입으로 변환
//참조 타입 : 클래스 타입, 인터패이스 타입, enum, 배열
//클래스의 타입 변환은 클래스간 상속 관곙에 있는 클래스 사이에서 발생한다.
//업캐스팅(부모의 타입으로)과 다운(자식의 타입으로)캐스팅
//Cat cat = new Cat();   Animal animal = cat; 고양이는 동물이다. --> promotion 자동 타입 변환
//고양이사 동물의 특징과 기능을 상속 받았다면 (extends Animal) 고양이는 동물이다.
//Animal animal = cat; 의 의미는 cat과 animal변수는 타입만 다를 뿐, 동일한 Cat 객체를 참조
class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {

  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //상속 계층에서 상위 타입이라면 자동 타입 변환이 일어난다.
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
//    B b2 = e; --> 상속 구조가 아니므로 타입변환 불가
    C c1 = e;
//    C c2 = d;

  }
}