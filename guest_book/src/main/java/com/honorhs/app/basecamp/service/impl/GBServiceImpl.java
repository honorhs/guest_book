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
}