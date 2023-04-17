package com.spr.dao;

import java.util.List;

import com.spr.api.Loggs;

public interface LoggDAO {

	List<Loggs> getLoggs();
	
	void addLoggs(String logg);
	
}
