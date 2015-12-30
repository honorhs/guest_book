package com.honorhs.app.basecamp.dao.impl;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.honorhs.app.basecamp.dao.GBDao;
import com.honorhs.app.basecamp.model.GB;


@Repository("GBDao")
public class GBDaoImpl implements GBDao{
     
    @Autowired
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    @Override
    public List<GB> getGBList() {
        return sqlSession.selectList("getGBList");
    }
    
    @Override
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
=======
    public List<GB> search_bar(GB gb) {
        return sqlSession.selectList("search_bar", gb);
    }
    
    @Override
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
    public GB pw_check() {
        return sqlSession.selectOne("pw_check");
    }

	public void add(GB gb){
		sqlSession.selectList("add", gb);
	}
	
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
	public void delete(GB gb){
		sqlSession.selectList("delete", gb);
=======
	public int delete(GB gb){
		int c = sqlSession.delete("delete", gb);
		return c;
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
	}

	public int update(GB gb){
		int c = sqlSession.update("update", gb);
		return c;
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
		
=======
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
	}
	
	public List<GB> m_list(GB gb){
		return sqlSession.selectList("m_list", gb);
	}
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
=======

>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/dao/impl/GBDaoImpl.java
}
