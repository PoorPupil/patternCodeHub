package org.ccl.springboot.strategy;

import org.springframework.stereotype.Component;

/**
 * 周统计策略
 */
@Component("week")
public class StatisticByWeekHandler implements StatisticBaseHandler {

    @Override
    public void doStatistic() {
        System.out.println("StatisticByWeekHandler");
    }
}
