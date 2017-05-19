package org.study.web;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.dao.MemberDAO;
import org.study.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
//테스트 코드를 실핼할 때 스프링이 로딩되도록 하는부분
public class SqlSessionFactoryTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void test(){
		MemberVO vo = new MemberVO();
		vo.setUserid("1");
		vo.setUserpw("2");
		vo.setUsername("3");
		dao.insertMember(vo);
	
	}	

}
