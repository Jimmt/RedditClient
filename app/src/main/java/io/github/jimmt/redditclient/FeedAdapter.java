package io.github.jimmt.redditclient;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FeedAdapter extends ArrayAdapter<Post> {
    Context context;
    List<Post> posts;
    int resource;

    public FeedAdapter(@NonNull Context context, int resource, @NonNull List<Post> posts) {
        super(context, resource, posts);
        this.posts = posts;
        this.resource = resource;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Post post = posts.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resource, parent, false);
        }

        TextView textView = convertView.findViewById(android.R.id.text1);
        textView.setText(post.getTitle());
        textView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostContentActivity.class);
                intent.putExtra("post", post);
                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}