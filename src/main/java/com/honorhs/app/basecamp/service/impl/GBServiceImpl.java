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
    public List<GB> search_bar(GB Item) {
        return GBDao.search_bar(Item);
    }
    
    @Override
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
    public int delete(GB gb) {
    	return this.GBDao.delete(gb);
    }
    
    @Override
    public int update(GB gb) {
    	return this.GBDao.update(gb);
    }
    
}