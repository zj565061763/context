# About
通过ContentProvider，保存全局Context来使用

# Gradle
[![](https://jitpack.io/v/zj565061763/context.svg)](https://jitpack.io/#zj565061763/context)

# Example
```java
Context context = FContext.get();
String appName = context.getResources().getString(R.string.app_name);
```