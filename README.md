# Stetho-Release

This lib allows the developer to import a release version reducing all the unecessary methods when the Stetho is not necessary for release.

## Import

Dependency:
```groovy 
   debugCompile 'com.facebook.stetho:stetho:1.3.0'
   debugCompile 'com.uphyca:stetho_realm:0.9.0' //use this only if you need the realm provider
   releaseCompile 'com.github.luispereira:stethorelease:0.1.3'
 ```
Repository:
```groovy
    repositories {
        jcenter()   //or  mavenCentral()
    }
```

## Usage

The usage is the same as calling the http://facebook.github.io/stetho/  (1.3.0)

```java
  Stetho.initialize(
          Stetho.newInitializerBuilder(this)
                  .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                  .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                  .build()
  );
```

Additionally, was added support for RealmInspectorModulesProvider provided by stetho_realm (https://github.com/uPhyca/stetho-realm)

```java
  Stetho.initialize(
          Stetho.newInitializerBuilder(this)
                  .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                  .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                  .build()
  );
```
