package day18.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(exclude = "shopTypeCode")
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"shopName"}) // 클래스에 대한 equals(), hashCode() 2개의 객체가 존재할때, 서로 같은 객체인지 판단.
@Builder
public class ShopDTO {

  //가게이름
  //가게 업종 코드
  //가게 전화번호
  //업종명
  //가게주소
  @Setter
  private String shopName;
  private String shopTypeCode;
  private String shopTel;
  private String shopTypeName;
  private String shopAddress;
}