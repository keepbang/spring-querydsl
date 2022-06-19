/*
 * Created by Gibyoung on 2022/06/18
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <gibyoung_chae@bigin.io>, 2022/06/18
 */
package bang.study.jpaquerydsl.service;

import bang.study.jpaquerydsl.dto.MemberRequest;
import bang.study.jpaquerydsl.dto.MemberResponse;
import bang.study.jpaquerydsl.entity.Member;
import bang.study.jpaquerydsl.repository.MemberCustomRepository;
import bang.study.jpaquerydsl.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;
  private final MemberCustomRepository customRepository;

  @Transactional
  public MemberResponse save(MemberRequest request) {
    Member member = memberRepository.save(request.toEntity());
    return MemberResponse.toDto(member);
  }

  public List<MemberResponse> findAll() {
    return customRepository.findAll()
        .stream()
        .map(MemberResponse::toDto)
        .toList();
  }

}
