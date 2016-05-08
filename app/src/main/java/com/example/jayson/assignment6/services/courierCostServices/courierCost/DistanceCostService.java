package com.example.jayson.assignment6.services.courierCostServices.courierCost;

import android.content.Context;

import com.example.jayson.assignment6.domain.courierCost.DistanceCost;

/**
 * Created by JAYSON on 2016-05-08.
 */
public interface DistanceCostService {

    String activateAccount(double distance, double cost);

    void addDistanceCost(Context context, DistanceCost distanceCost);

    void updateDistanceCost(Context context, DistanceCost distanceCost);
}
