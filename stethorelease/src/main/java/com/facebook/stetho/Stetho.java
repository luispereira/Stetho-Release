/*
 * Copyright (c) 2016 WIT Software. All rights reserved.;
 *
 * WIT Software Confidential and Proprietary information. It is strictly forbidden for 3rd parties to modify, decompile,
 * disassemble, defeat, disable or circumvent any protection mechanism; to sell, license, lease, rent, redistribute
 * make accessible to any third party, whether for profit or without charge.
 *
 * Created by Luis Pereira on 5/13/2016.
 */

package com.facebook.stetho;

import android.content.Context;

import com.facebook.stetho.server.RegistryInitializer;

/**
 * @author lpereira on 13/05/2016.
 */
public class Stetho {

    private Stetho() {
    }

    public static InitializerBuilder newInitializerBuilder(Context context) {
        return new InitializerBuilder(context);
    }

    public static void initialize(final Initializer initializer) {
    }


    public static abstract class Initializer implements RegistryInitializer {
    }

    public static class InitializerBuilder {
        private InitializerBuilder(Context context) {
        }
    }

    private static class BuilderBasedInitializer extends Initializer {
    }
}
