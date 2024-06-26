package day11.exec;

import day11.dao.CarDAO;
import day11.dto.CarVO;

public class CarMain {

  public static void main(String[] args) {
    //1. 자동차의 정보를 입력 받아 자동차 volvo를 생성 ㄱㄱ
    CarVO volvo = new CarVO();
    volvo.carSn = 1111;
    volvo.carName = "volvo600";
    volvo.carPrice = 50000000;
    volvo.carOwner = "이주환";
    volvo.carYear = 2024;
    volvo.carType = "SUV";
    //2. 생성된 volvo 인스턴스를 데이터베이스애 입력해주세요
    CarDAO carDAO = new CarDAO();
    carDAO.carInsert(volvo);
    //3. 데이터베이스에 저장된 volvo를 조회해주세요.
    carDAO.carSelect(volvo);
  }
}