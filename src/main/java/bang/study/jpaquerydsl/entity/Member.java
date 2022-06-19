/*
 * Created by Gibyoung on 2022/06/07
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <gibyoung_chae@bigin.io>, 2022/06/07
 */
package bang.study.jpaquerydsl.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * create on 2022/06/07. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Gibyoung Chae
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", length = 50)
  private String username;

  @Column(name = "country_code")
  private String countryCode;

  @Column(name = "phone_number", length = 11)
  private String phoneNumber;

  public Member(String username, String countryCode, String phoneNumber) {
    this.username = username;
    this.countryCode = countryCode;
    this.phoneNumber = phoneNumber;
  }

  public Member(Long id, String username, String countryCode, String phoneNumber) {
    this.id = id;
    this.username = username;
    this.countryCode = countryCode;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(id, member.id) && Objects.equals(username,
        member.username) && Objects.equals(countryCode, member.countryCode)
        && Objects.equals(phoneNumber, member.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, countryCode, phoneNumber);
  }
}
