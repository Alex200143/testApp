load("@rules_kotlin//kotlin:android.bzl", "kt_android_library")

android_library(
    name = "app-lib",
    srcs = [
        "main/java/com/example/myapplication3/MainActivity.java",
    ],
    manifest = "main/AndroidManifest.xml",
    resource_files = glob(["main/res/**"]),
    deps = [
        "@maven//:com_google_android_exoplayer_exoplayer_core",
    ]
)

android_binary(
    name = "my_application",
    manifest = "main/AndroidManifest.xml",
    deps = [
        ":app-lib",
    ],
)

kt_android_library(
    name = "test-lib",
    srcs = [
        "androidTest/java/com/example/myapplication3/test/ExampleInstrumentedTest.kt",
    ],
    manifest = "androidTest/AndroidManifest.xml",
    deps = [
        ":app-lib",
        "@maven//:junit_junit",
        "@maven//:androidx_test_ext_junit",
        "@maven//:org_hamcrest_hamcrest_core",
        "@maven//:androidx_test_core",
        "@maven//:androidx_test_rules",
        "@maven//:androidx_test_espresso_espresso_core",
    ]
)

android_binary(
    name = "test_application",
    instruments = ":my_application",
    manifest = "androidTest/AndroidManifest.xml",
    deps = [
        ":test-lib",
    ],
)
