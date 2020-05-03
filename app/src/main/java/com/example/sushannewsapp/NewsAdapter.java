package com.example.sushannewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<Newspaper> {

    public NewsAdapter(Context context, ArrayList<Newspaper> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        Newspaper currentNews = getItem(position);
        TextView newsTitleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getmTitle();
        newsTitleView.setText(title);


        TextView newsCategoryView = (TextView) listItemView.findViewById(R.id.category_text_view);
        String category = currentNews.getmCategory();
        newsCategoryView.setText(category);

        TextView newsDateView = (TextView) listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getmDate();
        newsDateView.setText(date);

        TextView newsAuthorView = (TextView) listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getmAuthor();
        newsAuthorView.setText(author);

        return listItemView;
    }
}
