package com.spr.services;

import java.util.List;

import com.spr.api.Group;

public interface GroupService {

	List<Group> getAllGroups();

	Group getGroupById(int id);
	
	List<Group> getGroupByParametrs(String para);

}
