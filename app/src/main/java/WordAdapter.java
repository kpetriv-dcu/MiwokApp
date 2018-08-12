package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words         A List of Word objects to display in a list
     */

    public WordAdapter(Activity context, ArrayList<Word> words){

        super(context,0, words);

    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
    View listItemView = convertView;
    if (listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }

    Word currentWord = getItem(position);

    TextView defaultWord = (TextView) listItemView.findViewById(R.id.mDefault);

    defaultWord.setText(currentWord.getDefaultTranslation());

    TextView miwokWord = (TextView) listItemView.findViewById(R.id.mMiwok);

    miwokWord.setText(currentWord.getMiwokTranslation());

    return listItemView;
}

}
