# Stetho-Release

This lib allows the developer to import a release version reducing all the unecessary methods when the Stetho is not necessary for release.

## Import

Dependency:
```groovy 
   debugCompile 'compile 'com.facebook.stetho:stetho:1.3.1'
   releaseCompile 'com.github.luispereira:stethorelease:0.1.1'
 ```
Repository:
```groovy
    repositories {
        jcenter()   //or  mavenCentral()
    }
```

## Usage

The usage is the same as calling the http://facebook.github.io/stetho/  (1.3.1)

```java
  Stetho.initialize(
          Stetho.newInitializerBuilder(this)
                  .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                  .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                  .build()
  );
```
