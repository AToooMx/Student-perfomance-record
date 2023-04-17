package com.spr.dao;

import java.util.List;

import com.spr.api.Group;

public interface GroupDAO {

	List<Group> getAllGroups();
	
	Group getGroupById(int id);
	
	List<Group> getGroupByParametrs(String para);
	
}
