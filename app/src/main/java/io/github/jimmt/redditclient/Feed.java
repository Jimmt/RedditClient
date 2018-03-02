package io.github.jimmt.redditclient;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    @SerializedName("kind")
    String kind;
    @SerializedName("data")
    RedditData data;

    public Feed(){

    }
}
