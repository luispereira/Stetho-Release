package com.uphyca.stetho_realm;

import android.content.Context;

import com.facebook.stetho.inspector.protocol.InspectorModulesProvider;

import java.io.File;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author lpereira on 18/05/2016.
 */
public class RealmInspectorModulesProvider implements InspectorModulesProvider {

    public RealmInspectorModulesProvider(String packageName, InspectorModulesProvider baseProvider, File folder, boolean withMetaTables, Pattern databaseNamePattern, long limit, boolean ascendingOrder, byte[] defaultEncryptionKey, Map<String, byte[]> encryptionKeys, Object o) {
    }

    public static RealmInspectorModulesProvider.ProviderBuilder builder(Context context) {
        return new RealmInspectorModulesProvider.ProviderBuilder(context);
    }

    public static class ProviderBuilder {

        public ProviderBuilder(Context context) {
        }

        public RealmInspectorModulesProvider.ProviderBuilder baseProvider(InspectorModulesProvider provider) {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withMetaTables() {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withLimit(long limit) {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withFolder(File folder) {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withDescendingOrder() {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder databaseNamePattern(Pattern databaseNamePattern) {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withDefaultEncryptionKey(byte[] key) {
            return this;
        }

        public RealmInspectorModulesProvider.ProviderBuilder withEncryptionKey(String filename, byte[] key) {
            return this;
        }

        public RealmInspectorModulesProvider build() {
            return new RealmInspectorModulesProvider(null, null, null, false, null, 0, false, null, null, null);
        }
    }
}
