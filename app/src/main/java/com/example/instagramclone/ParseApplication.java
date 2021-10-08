package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register your parse module
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("19tTdzTB0xia3lGjavDwPS0RZ2EEYaWi9yXeJ0d9")
                .clientKey("kh7mBsZ4bEU9H4ROx38jVEdj3PmqrlNACQ2eQdyA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
