package org.study.web;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.dao.MemberDAO;
import org.study.domain.MemberVO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
/*	@Inject
	private MemberDAO dao;*/
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssss");
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return "home";
	}
	
/*	@RequestMapping(value="/memberinsert", method = RequestMethod.GET)
	public void insertTest(){
		System.out.println("µé¾î¿È");
		MemberVO vo = new MemberVO();
		vo.setUserid("1");
		vo.setUserpw("2");
		vo.setUsername("3");
		dao.insertMember(vo);
	
		
	}*/
	
}
