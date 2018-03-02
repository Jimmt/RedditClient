package io.github.jimmt.redditclient;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Post implements Serializable {
    @SerializedName("data")
    PostData postData;

    @SerializedName("kind")
    String kind;

    public Post(){
    }

    public String getTitle(){
        return postData.title;
    }
}

class PostData implements Serializable {
    @SerializedName("title")
    String title;

    @SerializedName("selftext_html")
    String selfTextHTML;

    @SerializedName("url")
    String url;
}