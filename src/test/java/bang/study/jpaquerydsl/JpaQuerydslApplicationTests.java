package bang.study.jpaquerydsl;

import static org.assertj.core.api.Assertions.assertThat;

import bang.study.jpaquerydsl.entity.Member;
import bang.study.jpaquerydsl.repository.MemberCustomRepository;
import bang.study.jpaquerydsl.repository.MemberRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaQuerydslApplicationTests {

  @Autowired
  private MemberCustomRepository customRepository;

  @Autowired
  private MemberRepository memberRepository;

  @Test
  void contextLoads() {
  }

  @Test
  void querydslFindAllTest() {
    // given
    Member member = new Member("chae", "KR", "01012345678");
    Member savedMember = memberRepository.save(member);
    // when
    List<Member> members = customRepository.findAll();
    // then
    assertThat(members).hasSize(1);
    assertThat(members).containsExactly(savedMember);
  }

}
