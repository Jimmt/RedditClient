package io.github.jimmt.redditclient;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RedditData {
    @SerializedName("children")
    List<Post> posts;
}
