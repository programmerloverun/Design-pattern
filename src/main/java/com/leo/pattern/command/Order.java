package com.leo.pattern.command;

import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leijiong
 * @version 1.0
 */
public class Order {
    private int diningTable;
    private Map<String, Integer> foodDic = new HashMap<>();


    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, Integer num) {
        foodDic.put(name, num);
    }
}
