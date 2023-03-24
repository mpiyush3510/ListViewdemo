package com.mpiyush510.listviewdemo.ListViewCompany;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mpiyush510.listviewdemo.R;

public class mdAdapter extends BaseAdapter {
    Context context;
    String[] text;
    int[] img;
    LayoutInflater inflater;

    public mdAdapter(Context context, String[] text, int[] img) {
        this.context = context;
        this.text = text;
        this.img = img;
        inflater=LayoutInflater.from(context);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public int[] getImg() {
        return img;
    }

    public void setImg(int[] img) {
        this.img = img;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view=inflater.inflate(R.layout.lst_items,parent,false);
        ImageView ig=view.findViewById(R.id.img1);
        TextView tg=view.findViewById(R.id.text1);
        ig.setImageResource(img[i]);
        tg.setText(text[i]);
        return view;
    }
}
