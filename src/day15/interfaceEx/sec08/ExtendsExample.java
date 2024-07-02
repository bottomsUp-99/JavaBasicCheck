package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {
    InterfaceCImpl imple = new InterfaceCImpl();

    InterfaceA interfaceA = imple;
    interfaceA.methodA();

    InterfaceB interfaceB = imple;
    interfaceB.methodB();

    InterfaceC interfaceC = imple;
    interfaceC.methodA();
    interfaceC.methodB();
    interfaceC.methodC();
  }
}