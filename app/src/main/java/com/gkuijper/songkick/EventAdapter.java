package com.gkuijper.songkick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gabrielle on 06-08-17.
 */

public class EventAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Event> currentList;

    public EventAdapter(Context context, LayoutInflater layoutInflater, ArrayList<Event> EventArrayList) {
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.currentList = EventArrayList;
    }

    @Override
    public int getCount() {
        return currentList.size();
    }

    @Override
    public Event getItem(int position) {
        return this.currentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final EventAdapter.ViewHolder viewHolder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_event_row, null);

            viewHolder = new EventAdapter.ViewHolder();
            viewHolder.event = (TextView) convertView.findViewById(R.id.event_row_id);
            viewHolder.tijdstip = (TextView) convertView.findViewById(R.id.datum_tijdstip_id);
            viewHolder.locatie = (TextView) convertView.findViewById(R.id.locatie_id);
            //viewHolder.afbeelding = (ImageButton) convertView.findViewById(R.id.afbeelding_id);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (EventAdapter.ViewHolder) convertView.getTag();
        }
        final Event event = currentList.get(position);

        viewHolder.event.setText(event.getName());
        if (event.getTime().contains("null")) {
            event.setTime("N/A");
        }
        viewHolder.tijdstip.setText(event.getStartdate() + " " +  event.getTime());
        viewHolder.locatie.setText(event.getVenue());
       // viewHolder.afbeelding.setImageResource(R.drawable.ic_menu_camera);


        return convertView;
    }

    private static class ViewHolder {
        private TextView event, tijdstip, locatie;
        private ImageButton afbeelding;
    }
}