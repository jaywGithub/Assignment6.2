package com.example.jayson.assignment6.services.courierCostServices.courierCost;

import android.content.Context;

import com.example.jayson.assignment6.domain.courierCost.SizeCost;

/**
 * Created by JAYSON on 2016-05-08.
 */
public interface SizeCostService {

    String activateAccount(String size, double cost);

    void addSizeCost(Context context, SizeCost sizeCost);

    void updateSizeCost(Context context, SizeCost sizeCost);
}
