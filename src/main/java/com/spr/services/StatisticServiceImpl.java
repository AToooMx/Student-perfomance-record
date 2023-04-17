package com.spr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Statistic;
import com.spr.dao.StatisticDAO;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticDAO statisticDAO;

	@Override
	public Statistic getStatistics() {

		return statisticDAO.getStatistics();
	}

}
