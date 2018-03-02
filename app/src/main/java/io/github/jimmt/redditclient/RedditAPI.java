package io.github.jimmt.redditclient;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RedditAPI {
    @GET("r/{subreddit}/hot.json")
    Call<Feed> getHot(@Path("subreddit") String subreddit, @Query("after") String after, @Query("limit") int limit);
}
