package com.honorhs.app.basecamp.service;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;

public interface GBService {
	
	List<GB> getGBList();
	void add(GB Item);
	List<GB> m_list(GB Item);
    void delete(GB gb);
}
