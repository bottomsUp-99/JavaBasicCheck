package day11.dao;

import day11.dto.CarVO;

public class CarDAO {

  public void carInsert(CarVO car) {
    //DB 연 , insert SQL

    System.out.println("car 정보가 DB에 저장되었습니다.");
  }

  public void carSelect(CarVO car) {
    //DB 연 , insert SQL

    System.out.println("car 정보가 조회되었습니다 모든 car 객체 조회.");
  }
}
