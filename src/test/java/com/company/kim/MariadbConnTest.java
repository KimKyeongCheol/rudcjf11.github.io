package com.company.kim;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariadbConnTest {

	private static final String Driver = "org.mariadb.jdbc.Driver";
	private static final String URL="jdbc:mariadb://127.0.0.1:3306/kimdb?useSSL=false&serverTimezone=Asia/Seoul";
	
	private static final String User = "root";
	private static final String Pass = "cheol";
	@Test
	public void testConnection() throws Exception{
		Class.forName(Driver);//드라이버 지정 클래스 로딩
		try(Connection con = DriverManager.getConnection(URL, User, Pass)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
