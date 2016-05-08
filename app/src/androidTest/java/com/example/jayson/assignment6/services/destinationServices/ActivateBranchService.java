package com.example.jayson.assignment6.services.destinationServices;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.test.AndroidTestCase;

import com.example.jayson.assignment6.config.databases.util.App;
import com.example.jayson.assignment6.services.destinationServices.settings.Impl.ActivateBranchServiceImpl;

import junit.framework.Assert;

/**
 * Created by JAYSON on 2016-05-08.
 */
public class ActivateBranchService extends AndroidTestCase {

    private ActivateBranchServiceImpl activateService;
    private boolean isBound;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(App.getAppContext(), ActivateBranchServiceImpl.class);
        App.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);

    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            ActivateBranchServiceImpl.ActivateServiceLocalBinder binder
                    = (ActivateBranchServiceImpl.ActivateServiceLocalBinder) service;
            activateService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;

        }
    };

    public void testActivateAccount() throws Exception {
        String activate = activateService.activateAccount("155Durban");
        Assert.assertEquals("ACTIVATED", activate);

    }
}
