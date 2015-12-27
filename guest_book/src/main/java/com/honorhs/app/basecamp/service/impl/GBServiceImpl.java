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
    public List<GB> m_list(GB Item) {
        return GBDao.m_list(Item);
    }
    
    @Override
    public void add(GB gb) {
    	this.GBDao.add(gb);
    }
    
    @Override
    public void delete(GB gb) {
    	this.GBDao.delete(gb);
    }
}