package com.example.myinstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    // Keys matching our back end database
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED = "createdAt";
    public static final String KEY_TIMESTAMP = "updatedAt";

    // Ensure that your subclass has a public default constructor
    public Post(){}

    // Getter and setter for description
    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    // Getter and setter for image
    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }
    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    // Getter and setter for user who made the post
    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser parseUser) {
        put(KEY_USER, parseUser);
    }

    public void setTimeStamp(String timeStamp){
        put(KEY_TIMESTAMP, timeStamp);
    }
    public String getTimestamp() {
        return getString(KEY_TIMESTAMP);
    }
}
