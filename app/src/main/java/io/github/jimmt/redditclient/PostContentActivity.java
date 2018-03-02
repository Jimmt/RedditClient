package io.github.jimmt.redditclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.TextView;

import java.net.URLEncoder;

public class PostContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_content);

        Intent intent = getIntent();
        Post post = (Post) intent.getSerializableExtra("post");
        WebView webView = (WebView) findViewById(R.id.webView);

        if(post.postData.selfTextHTML == null){
            webView.loadUrl(post.postData.url);
        } else {
            webView.loadData(post.postData.selfTextHTML, "text/html", null);
        }
    }
}
