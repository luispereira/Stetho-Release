/*
 *  Copyright (c) 2016 WIT Software. All rights reserved.;
 *
 * WIT Software Confidential and Proprietary information. It is strictly forbidden for 3rd parties to modify, decompile,
 * disassemble, defeat, disable or circumvent any protection mechanism; to sell, license, lease, rent, redistribute
 * make accessible to any third party, whether for profit or without charge.
 *
 * Created by Luis Pereira on 4/13/2016.
 */
package com.facebook.stethoapp;

import android.app.Application;

import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

/**
 * @author lpereira on 13/04/2016.
 */
public class DemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        Stetho.initialize(
//                Stetho.newInitializerBuilder(this)
//                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
//                        .build());

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());

    }
}
