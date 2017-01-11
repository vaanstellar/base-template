package com.van.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.van.base.dao.StrategyDAO;
import com.van.base.model.Strategy;

@Service
@Transactional
public class StrategyServiceImpl implements StrategyService {

	@Autowired
	private StrategyDAO strategyDAO;

	public void addStrategy(Strategy strategy) {
		strategyDAO.addStrategy(strategy);
	}

	public void updateStrategy(Strategy strategy) {
		strategyDAO.updateStrategy(strategy);
	}

	public Strategy getStrategy(int id) {
		return strategyDAO.getStrategy(id);
	}

	public void deleteStrategy(int id) {
		strategyDAO.deleteStrategy(id);
	}

	public List<Strategy> getStrategies() {
		return strategyDAO.getStrategies();
	}

}
