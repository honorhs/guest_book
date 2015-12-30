package com.honorhs.app.basecamp.dao;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;
 
public interface GBDao {
	List<GB> getGBList();
	List<GB> search_bar(GB gb);
	GB pw_check();
    void add(GB gb);
    int delete(GB gb);
    int update(GB gb);
    List<GB> m_list(GB gb);
}
