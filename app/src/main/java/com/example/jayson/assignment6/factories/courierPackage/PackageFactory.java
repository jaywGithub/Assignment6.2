package com.example.jayson.assignment6.factories.courierPackage;

import com.example.jayson.assignment6.domain.courierPackage.CourierPackage;

/**
 * Created by JAYSON on 2016-04-17.
 */
public class PackageFactory {

    public static CourierPackage getPackage(String description)
    {
        return new CourierPackage.Builder()
                .description(description)
                .build();
    }
}
