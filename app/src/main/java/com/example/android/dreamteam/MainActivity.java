package com.example.android.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] dreamTeam = new String[] {"LeBron James", "Anthony Davis", "Russell Westbrook", "Carmelo Anthony", "Dwight Howard", "Rajon Rondo", "Talen Horton-Tucker", "Malik Monk", "Kent Bazemore", "Wayne Ellington", "DeAndre Jordan", "Austin Reaves", "Kendrick Nunn", "Trevor Ariza", "Marc Gasol"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> dreamTeamAdaptor = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, dreamTeam);
        listView.setAdapter(dreamTeamAdaptor);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        System.out.println(dreamTeam[position]);

        Intent moveToDetailIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveToDetailIntent.putExtra("playerName", dreamTeam[position]);
        startActivity(moveToDetailIntent);
    }
}