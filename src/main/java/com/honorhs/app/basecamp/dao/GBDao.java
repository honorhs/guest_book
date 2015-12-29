package com.honorhs.app.basecamp.dao;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;
 
public interface GBDao {
	List<GB> getGBList();
	GB pw_check();
    void add(GB gb);
    void delete(GB gb);
    int update(GB gb);
    List<GB> m_list(GB gb);
}
