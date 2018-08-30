package com.example.jaielalondon.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class articlesAdapter extends ArrayAdapter {

    // the context
    private Context mContext;

    /** List of articles */
    private ArrayList<Article> mArticles;

    public articlesAdapter(@NonNull Context context, int resource, ArrayList<Article> articlesList) {
        super(context, resource, articlesList);
        mContext = context;
        mArticles = articlesList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get list item view
        View listItem = convertView;

        // if the view listItem is null, inflate a new list item
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent,false);

        }

        // Get current article at the current position
        Article currentArticle = mArticles.get(position);

        // Find resource for titleTextView and set the current article's title as its text
        TextView titleTextView = (TextView) listItem.findViewById(R.id.title_text_view);
        titleTextView.setText(currentArticle.getTitle());

        // Return the list item
        return listItem;

    }


}
