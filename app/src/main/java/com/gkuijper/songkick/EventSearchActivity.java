package com.gkuijper.songkick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.gkuijper.songkick.DrawerActivity.CITY;

public class EventSearchActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private int id = 0;
    private City city;
    private Button zoek;
    private EditText edit;
    private ArrayList<Event> EventArrayList;
    private ListView list;
    private EventAdapter adapter;

    public static final String EVENT = "event";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_search);
        list = (ListView) findViewById(R.id.artists_row_id);

        zoek = (Button) findViewById(R.id.button_artist_id);
        edit = (EditText) findViewById(R.id.search_artist__id);

        Bundle bundle = getIntent().getExtras();
        city = (City) bundle.get(CITY);

        EventArrayList = new ArrayList<>();

        adapter = new EventAdapter(this, getLayoutInflater(), EventArrayList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        zoek.setOnClickListener(this);

        id = city.getId();
        getEvents();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onClick(View v) {
        EventArrayList.clear();


    }

    public void getEvents() {
        Log.i("btn", "Clicked");
        String[] URL = {
                "http://api.songkick.com/api/3.0/events.json?apikey=rX8RhAq6lkDw5OnK&location=sk:" + id
        };

        //  new EventAPIConnector(this).execute(URL);

    }
}
