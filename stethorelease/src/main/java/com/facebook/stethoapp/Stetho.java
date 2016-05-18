package com.facebook.stethoapp;

import android.content.Context;

import com.facebook.stethoapp.dumpapp.DumperPluginsProvider;
import com.facebook.stethoapp.inspector.protocol.InspectorModulesProvider;
import com.facebook.stethoapp.server.RegistryInitializer;

/**
 * @author lpereira on 13/05/2016.
 */
public class Stetho {

    private Stetho() {
    }

    public static InitializerBuilder newInitializerBuilder(Context context) {
        return new InitializerBuilder(context);
    }

    /**
     * Start the listening server.  Most of the heavy lifting initialization is deferred until the
     * first socket connection is received, allowing this to be safely used for debug builds on
     * even low-end hardware without noticeably affecting performance.
     */
    public static void initialize(final Initializer initializer) {
    }

    public static DumperPluginsProvider defaultDumperPluginsProvider(final Context context) {
        return null;
    }

    public static InspectorModulesProvider defaultInspectorModulesProvider(final Context context) {
        return null;
    }


    /**
     * Callers can choose to subclass this directly to provide the initialization configuration
     * or they can construct a concrete instance using {@link #newInitializerBuilder(Context)}.
     */
    public static abstract class Initializer implements RegistryInitializer {

    }

    /**
     * Configure what services are to be enabled in this instance of Stetho.
     */
    public static class InitializerBuilder {

        private InitializerBuilder(Context context) {
        }

        public InitializerBuilder enableDumpapp(DumperPluginsProvider plugins) {
            return this;
        }

        public InitializerBuilder enableWebKitInspector(InspectorModulesProvider modules) {
            return this;
        }

        public Stetho.Initializer build() {
            return null;
        }

    }

    private static class BuilderBasedInitializer extends Initializer {

    }
}
