package com.spr.services;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Loggs;
import com.spr.dao.LoggDAO;

@Service
public class LoggServiceImpl implements LoggService {

	@Autowired
	private LoggDAO loggDAO;

	@Override
	public List<Loggs> getLoggs() {

		return loggDAO.getLoggs();
	}

	@Override
	public void addLoggs(String logg) throws UnknownHostException{

		loggDAO.addLoggs(logg + " . IP " + InetAddress.getLocalHost().getHostAddress());

	}

}
