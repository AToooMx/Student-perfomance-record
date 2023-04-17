package com.spr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Group;
import com.spr.dao.GroupDAO;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDAO groupDAO;
	
	@Override
	public List<Group> getAllGroups() {
		
		return groupDAO.getAllGroups();
	}

	@Override
	public Group getGroupById(int id) {
		
		return groupDAO.getGroupById(id);
	}

	@Override
	public List<Group> getGroupByParametrs(String para) {
		
		para = "%" + para + "%";
		
		return groupDAO.getGroupByParametrs(para);
	}

}
