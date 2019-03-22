package com.company.kim;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDAOTest {
	@Inject private UserDAO dao;
	
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertUser()throws Exception{
		UserVO temp = new UserVO();
		temp.setUid("kim");
		temp.setUpw("1234");
		temp.setUname("김사장");
		temp.setUpoint(0);
		dao.insertUser(temp);
		
	}
	@Test
	public void testReadUser()throws Exception{
		UserVO temp =  dao.readUser("kim");
		System.out.println(temp.toString());
	}
	@Test
	public void testReadWithPW()throws Exception{
		UserVO temp =  dao.readWithPw("kim", "1234");
		System.out.println(temp.toString());
	}
	
	
}
