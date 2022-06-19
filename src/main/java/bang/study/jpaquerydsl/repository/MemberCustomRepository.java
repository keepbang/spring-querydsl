/*
 * Created by Gibyoung on 2022/06/18
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <gibyoung_chae@bigin.io>, 2022/06/18
 */
package bang.study.jpaquerydsl.repository;

import static bang.study.jpaquerydsl.entity.QMember.member;

import bang.study.jpaquerydsl.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * create on 2022/06/18. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Gibyoung Chae
 * @version 1.0
 * @see
 * @since 1.0
 */
@Repository
@RequiredArgsConstructor
public class MemberCustomRepository {

  private final JPAQueryFactory queryFactory;

  public List<Member> findAll() {
    return queryFactory
        .selectFrom(member)
        .fetch();
  }
}
