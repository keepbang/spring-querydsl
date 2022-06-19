/*
 * Created by Gibyoung on 2022/06/18
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Infra Team <gibyoung_chae@bigin.io>, 2022/06/18
 */
package bang.study.jpaquerydsl.controller;

import bang.study.jpaquerydsl.dto.MemberRequest;
import bang.study.jpaquerydsl.dto.MemberResponse;
import bang.study.jpaquerydsl.entity.Member;
import bang.study.jpaquerydsl.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

  private final MemberService memberService;

  @PostMapping()
  public ResponseEntity<MemberResponse> save(@RequestBody MemberRequest memberRequest) {
    MemberResponse response = memberService.save(memberRequest);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<MemberResponse>> findAll() {
    List<MemberResponse> responses = memberService.findAll();
    return new ResponseEntity<>(responses, HttpStatus.OK);
  }

}
