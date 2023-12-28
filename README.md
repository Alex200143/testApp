**Reproduce Step**
1. Generate gradle apk: `./gradlew :app:assemble :app:assembleAndroidTest`
2. Generate bazel apk: `bazelisk build //app/src:test_application //app/src:my_application`
3. Compare the differences between gradle test apk and bazel test apk.
  * Bazel test apk included the redundant `lib/armeabi-v7a/libclang_rt.ubsan_standalone-aarch64-android.so` entry which is removed in gradle test apk
  * Bazel test apk included the redundant `res/` app resources which is already provided by app apk
  * Bazel test apk included the redundant kotlin-stdlib source classes under the dex file


**Expected Behavior**
* Bazel test apk should strip the resources and native libraries which are already provided by app apk
  * The `instruments = ":my_application",` parameter in `android_binary` rule will strip the shared classes in test apk. But it doesn't strip the resources and native libraries.  