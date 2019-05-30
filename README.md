# About
通过ContentProvider，保存全局Context来使用

# Gradle
[![](https://jitpack.io/v/zj565061763/context.svg)](https://jitpack.io/#zj565061763/context)

# Example
```java
// 获得Context对象
Context context = FContext.get();
String appName = context.getResources().getString(R.string.app_name);
```

如果需要Context被设置的时候初始化，则需要在xml中配置目标Class，如下：
```xml
<resources>

    <!-- Context被初始化的时候需要创建的Class全名 -->
    <string name="lib_context_init_class">com.sd.lib.context.demo.InitClass</string>

</resources>
```
```java
package com.sd.lib.context.demo;

import android.util.Log;

public class InitClass
{
    public InitClass()
    {
        // 初始化操作
        Log.i(InitClass.class.getSimpleName(), "InitClass created");
    }
}

```