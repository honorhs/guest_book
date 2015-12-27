package com.honorhs.app.basecamp.dao;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;
 
public interface GBDao {
	List<GB> getGBList();
    void add(GB gb);
    void delete(GB gb);
    void update(GB gb);
    List<GB> m_list(GB gb);
}
