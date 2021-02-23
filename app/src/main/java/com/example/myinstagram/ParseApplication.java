package com.example.myinstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IRZ5Avbrm8w27UK40O5Yi3BLsUNUqFz3L9XQVFPR")
                .clientKey("Xt7J2zzZtxFL1btXTdkF7hSnY9P5jSiAwI6ESsZn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
