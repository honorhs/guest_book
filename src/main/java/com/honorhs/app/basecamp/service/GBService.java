package com.honorhs.app.basecamp.service;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;

public interface GBService {
	
	List<GB> getGBList();
	List<GB> search_bar(GB Item);
	GB pw_check();
	void add(GB Item);
	List<GB> m_list(GB Item);
	int delete(GB gb);
    int update(GB gb);
}
