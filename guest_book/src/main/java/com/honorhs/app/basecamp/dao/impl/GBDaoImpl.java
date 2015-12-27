package com.honorhs.app.basecamp.dao.impl;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
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

	public void add(GB gb){
		sqlSession.selectList("add", gb);
	}
	
	public void delete(GB gb){
		sqlSession.selectList("delete", gb);
	}
	
	public List<GB> m_list(GB gb){
		return sqlSession.selectList("m_list", gb);
	}
}
