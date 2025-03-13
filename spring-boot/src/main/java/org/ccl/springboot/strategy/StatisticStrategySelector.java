package org.ccl.springboot.strategy;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


import java.util.Map;

/**
 * 统计策略选择器
 */
@Component
public class StatisticStrategySelector {

    @Resource
    private Map<String, StatisticBaseHandler> selectorMap;

    /**
     * 根据类型选择对应的策略
     *
     * @param type 统计周期类型
     * @return 统计抽象策略处理器
     */
    public StatisticBaseHandler select(String type) {
        return selectorMap.get(type);
    }


}
