package day3;

public class VariableScopeExam {
    static int globalValue = 100;//클래스 변수 : 해당 클래스의 모든 인스턴스에서 접근 가능하다.
    public static void main(String[] args) {
        System.out.println("Globalvalue :" + globalValue);
        VariableScopeExam instance = new VariableScopeExam();//인스턴스를 생성
        instance.accessInstanceVariable();//인스턴스 메소드를 호출하여 인스턴스메소드의 지역변수를 접근한다.
        modifyGlobalValue();//

    }

    public void accessInstanceVariable(){
        int localVariable = 200;
        System.out.println("localVariable = " + localVariable + globalValue);
    }

    public static void modifyGlobalValue(){
        globalValue = 200;
        System.out.println("globalValue = " + globalValue);
    }

    //렉시컬 스코프란 변수의 유효 범위가 코드의 작성 위치에 결정된다.


    //static block(초기화 블럭) -> 클래스가 JVM에 처음 로드될때 실행될 java클래스 내부의 명령문 블록
    //생성자가 인스턴스 멤버를 초기화라는 것처럼, static 데이터(변수/상수)를 초기화
    //생성자보다 먼저 순서에 할당됨
    {
        int anmos = 500;
        System.out.println("anmos = "+ anmos);
    }

}