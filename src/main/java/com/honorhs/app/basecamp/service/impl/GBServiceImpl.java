package com.honorhs.app.basecamp.service.impl;
import java.util.List;

import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
 
import com.honorhs.app.basecamp.dao.GBDao;
import com.honorhs.app.basecamp.model.GB;
import com.honorhs.app.basecamp.service.GBService;
 
@Service("GBService")
public class GBServiceImpl implements GBService {
     
    @Resource(name="GBDao")
    private GBDao GBDao;
 
    @Override
    public List<GB> getGBList() {
        return GBDao.getGBList();
    }
    
    @Override
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
=======
    public List<GB> search_bar(GB Item) {
        return GBDao.search_bar(Item);
    }
    
    @Override
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
    public GB pw_check() {
        return GBDao.pw_check();
    }
    
    @Override
    public List<GB> m_list(GB Item) {
        return GBDao.m_list(Item);
    }
    
    @Override
    public void add(GB gb) {
    	this.GBDao.add(gb);
    }
    
    @Override
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
    public void delete(GB gb) {
    	this.GBDao.delete(gb);
=======
    public int delete(GB gb) {
    	return this.GBDao.delete(gb);
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
    }
    
    @Override
    public int update(GB gb) {
    	return this.GBDao.update(gb);
    }
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
=======
    
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/service/impl/GBServiceImpl.java
}