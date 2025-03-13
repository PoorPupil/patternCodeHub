package org.ccl.springboot.strategy;

import org.springframework.stereotype.Component;

/**
 * 月统计策略
 */
@Component("month")
public class StatisticByMonthHandler implements StatisticBaseHandler {

    @Override
    public void doStatistic() {
        System.out.println("StatisticByMonthHandler");
    }
}
