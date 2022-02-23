android_library(
    name = "app-lib",
    srcs = [
        "main/java/com/example/myapplication3/MainActivity.java",
    ],
    manifest = "main/AndroidManifest.xml",
    resource_files = glob(["main/res/**"]),
    deps = [
#        "androidx.appcompat:appcompat:1.1.0"
    ]
)


android_binary(
    name = "myapplication",
    manifest = "main/AndroidManifest.xml",
    deps = [
        ":app-lib",
    ],
)