package com.example.jayson.assignment6.services.courierPackageServices.courierPackage;

import android.content.Context;

import com.example.jayson.assignment6.domain.courierPackage.CourierPackage;

/**
 * Created by JAYSON on 2016-05-08.
 */
public interface PackageService {

    String activateAccount(String description);

    void addPackage(Context context, CourierPackage pack);

    void updatePackage(Context context, CourierPackage pack);
}
