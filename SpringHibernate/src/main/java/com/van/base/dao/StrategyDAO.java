package com.van.base.dao;

import java.util.List;

import com.van.base.model.Strategy;

public interface StrategyDAO {

    public void addStrategy(Strategy strategy);
    public Strategy getStrategy(int id);
    public void updateStrategy(Strategy strategy);
    public void deleteStrategy(int id);
    public List<Strategy> getStrategies();
    
}
