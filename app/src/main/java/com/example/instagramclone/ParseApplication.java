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
                .applicationId("VRCyRwg2MxI0VLrAfon3tIAI5dG8tEULP6a6qtSx")
                .clientKey("jryOKEcraszoJuupXbwQKJ15Gyio5RjnngI8WunJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
