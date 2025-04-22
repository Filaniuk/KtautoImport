need to specify to your own STD_LIB path f.e. ```STD_LIB="/mnt/c/My_Progs/IntelliJ IDEA 2024.1.2/plugins/Kotlin/kotlinc/lib/kotlin-stdlib.jar"``` which is used in runtime
```bash
java -cp "Finder.jar:$STD_LIB" mfilaniu.\MainKt AbstractCol
```
Output:  
kotlin.collections.AbstractCollection

or
```bash
java -cp "Finder.jar:$STD_LIB" mfilaniu.\MainKt Abstract
```
Output:  
kotlin.collections.AbstractCollection  
kotlin.collections.AbstractIterator  
kotlin.collections.AbstractList  
kotlin.collections.AbstractMap  
kotlin.collections.AbstractMutableCollection  
kotlin.collections.AbstractMutableList  
kotlin.collections.AbstractMutableMap  
kotlin.collections.AbstractMutableSet  
kotlin.collections.AbstractSet  
kotlin.collections.builders.AbstractMapBuilderEntrySet  
kotlin.coroutines.AbstractCoroutineContextElement  
kotlin.coroutines.AbstractCoroutineContextKey  
kotlin.random.AbstractPlatformRandom  
kotlin.time.AbstractDoubleTimeSource  
kotlin.time.AbstractLongTimeSource  
