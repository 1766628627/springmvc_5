package com.accp.springmvc_2.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.springmvc_2.biz.DomenBiz;
import com.accp.springmvc_2.biz.FlighInfoBiz;
import com.accp.springmvc_2.biz.PaperBiz;
import com.accp.springmvc_2.biz.StudentBiz;
import com.accp.springmvc_2.pojo.Domen;
import com.accp.springmvc_2.pojo.Paper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-ctx.xml"})
public class test {
	@Autowired
	private FlighInfoBiz biz;
	
	@Resource PaperBiz biz1;
	@Resource StudentBiz biz2;
	
	@Test
	public void queryno() {
		
		/*
		 * biz1.queryby(null, "理论性").forEach(temp->{
		 * 
		 * System.out.println(temp); });
		 */
		 biz2.query().forEach(temp->{
			 
			 System.out.println(temp);
		 });
		/* System.out.println(biz1.remove(7)); */
	}
	@Test
	public void add() {
		Date date = new Date();
	SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(biz1.add(new Paper("2", "2", "2", "2",date, null, null, "2")));
	}
}
