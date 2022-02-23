android_library(
    name = "app-lib",
    srcs = [
        "main/java/com/example/myapplication3/MainActivity.kt",
    ],
    manifest = "main/AndroidManifest.xml",
    resource_files = glob(["main/res/**"]),
    deps = [
#        ""
    ]
)


android_binary(
    name = "myapplication",
    manifest = "main/AndroidManifest.xml",
    deps = [
        ":app-lib",
    ],
)