package com.honorhs.app.basecamp.dao;
import java.util.List;
import com.honorhs.app.basecamp.model.GB;
 
public interface GBDao {
	List<GB> getGBList();
<<<<<<< HEAD:src/main/java/com/honorhs/app/basecamp/dao/GBDao.java
	GB pw_check();
    void add(GB gb);
    void delete(GB gb);
=======
	List<GB> search_bar(GB gb);
	GB pw_check();
    void add(GB gb);
    int delete(GB gb);
>>>>>>> develop:src/main/java/com/honorhs/app/basecamp/dao/GBDao.java
    int update(GB gb);
    List<GB> m_list(GB gb);
}
