package com.example.jayson.assignment6.services.courierPackageServices.settings;

/**
 * Created by JAYSON on 2016-05-08.
 */
public interface ActivatePackageService {

    String activateAccount(String description);

    boolean isAccountActivated();

    boolean deactivateAccount();
}
