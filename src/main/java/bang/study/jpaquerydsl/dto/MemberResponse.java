/*
 * Created by Gibyoung on 2022/06/18
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <gibyoung_chae@bigin.io>, 2022/06/18
 */
package bang.study.jpaquerydsl.dto;

import bang.study.jpaquerydsl.entity.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * create on 2022/06/18. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Gibyoung Chae
 * @version 1.0
 * @since 1.0
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class MemberResponse {
  private long id;
  private String username;
  private String countryCode;
  private String phoneNumber;

  public static MemberResponse toDto(Member member) {
    return MemberResponse.builder()
        .id(member.getId())
        .username(member.getUsername())
        .countryCode(member.getCountryCode())
        .phoneNumber(member.getPhoneNumber())
        .build();
  }

}
