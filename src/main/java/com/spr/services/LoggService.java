package com.spr.services;

import java.net.UnknownHostException;
import java.util.List;

import com.spr.api.Loggs;

public interface LoggService {

	List<Loggs> getLoggs();

	void addLoggs(String logg) throws UnknownHostException;

}
