package com.company.kim;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImple implements UserDAO {

	@Inject private SqlSession sqlSession;
	private static final String namespace = "com.company.mapper.UserMapper";
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertUser", vo);
	}
	 @Override  
	 public UserVO readUser(String uid) throws Exception {  
		 
		 return (UserVO) sqlSession.selectOne(namespace + ".selectUser", uid);  } 
	 
	 @Override
	 public UserVO readWithPw(String uid, String pw) throws Exception {  
		 Map<String, Object> paramMap = new HashMap<String,Object>();  
		 paramMap.put("uid", uid);   
		 paramMap.put("upw", pw);   
		 return sqlSession.selectOne(namespace + ".readWithPW", paramMap);  }


}
