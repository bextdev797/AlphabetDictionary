# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.alphabetdictionary.AlphabetDictionary {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/alphabetdictionary/repack'
-flattenpackagehierarchy
-dontpreverify
