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
    public GB pw_check() {
        return sqlSession.selectOne("pw_check");
    }

	public void add(GB gb){
		sqlSession.selectList("add", gb);
	}
	
	public void delete(GB gb){
		sqlSession.selectList("delete", gb);
	}

	public int update(GB gb){
		int c = sqlSession.update("update", gb);
		return c;
		
	}
	
	public List<GB> m_list(GB gb){
		return sqlSession.selectList("m_list", gb);
	}
}
