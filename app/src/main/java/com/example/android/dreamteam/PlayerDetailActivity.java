package com.example.android.dreamteam;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class PlayerDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView nameTextView;
        TextView ageTextView;
        TextView collegeTextView;
        TextView heightTextView;
        ImageView playerImageView;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_player_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
        collegeTextView = (TextView) findViewById(R.id.collegeTextView);
        heightTextView = (TextView) findViewById(R.id.heightTextView);
        playerImageView = (ImageView) findViewById(R.id.playerImageView);

        // Player Name

        String playerName = (String) getIntent().getExtras().get("playerName");
        nameTextView.setText(playerName);

        if (playerName.equals("LeBron James")) {
            ageTextView.setText("Age: 40");
            collegeTextView.setText("College: St. Vincent-St. Mary HS");
            heightTextView.setText("Height: 6'9\"");
            playerImageView.setImageResource(R.mipmap.lebron);
        }
        if (playerName.equals("Anthony Davis")) {
            ageTextView.setText("Age: 29");
            collegeTextView.setText("College: Kentucky");
            heightTextView.setText("Height: 6'10\"");
            playerImageView.setImageResource(R.mipmap.anthony);
        }
        if (playerName.equals("Russell Westbrook")) {
            ageTextView.setText("Age: 34");
            collegeTextView.setText("College: UCLA");
            heightTextView.setText("Height: 6'3\"");
            playerImageView.setImageResource(R.mipmap.russell);
        }
        if (playerName.equals("Carmelo Anthony")) {
            ageTextView.setText("Age: 38");
            collegeTextView.setText("College: Syracuse");
            heightTextView.setText("Height: 6'7\"");
            playerImageView.setImageResource(R.mipmap.carmelo);
        }
        if (playerName.equals("Dwight Howard")) {
            ageTextView.setText("Age: 37");
            collegeTextView.setText("College: Southwest Atlanta Christian Academy");
            heightTextView.setText("Height: 6'10\"");
            playerImageView.setImageResource(R.mipmap.dwight);
        }
        if (playerName.equals("Rajon Rondo")) {
            ageTextView.setText("Age: 36");
            collegeTextView.setText("College: Kentucky");
            heightTextView.setText("Height: 6'1\"");
            playerImageView.setImageResource(R.mipmap.rajon);
        }
        if (playerName.equals("Talen Horton-Tucker")) {
            ageTextView.setText("Age: 21");
            collegeTextView.setText("College: Iowa State");
            heightTextView.setText("Height: 6'4\"");
            playerImageView.setImageResource(R.mipmap.talen);
        }
        if (playerName.equals("Malik Monk")) {
            ageTextView.setText("Age: 24");
            collegeTextView.setText("College: Kentucky");
            heightTextView.setText("Height: 6'3\"");
            playerImageView.setImageResource(R.mipmap.malik);
        }
        if (playerName.equals("Kent Bazemore")) {
            ageTextView.setText("Age: 32");
            collegeTextView.setText("College: Old Dominion");
            heightTextView.setText("Height: 6'5\"");
            playerImageView.setImageResource(R.mipmap.kent);
        }
        if (playerName.equals("Wayne Ellington")) {
            ageTextView.setText("Age: 34");
            collegeTextView.setText("College: North Carolina");
            heightTextView.setText("Height: 6'4\"");
            playerImageView.setImageResource(R.mipmap.wayne);
        }
        if (playerName.equals("DeAndre Jordan")) {
            ageTextView.setText("Age: 34");
            collegeTextView.setText("College: Texas A&M");
            heightTextView.setText("Height: 6'10\"");
            playerImageView.setImageResource(R.mipmap.deandre);
        }
        if (playerName.equals("Austin Reaves")) {
            ageTextView.setText("Age: 24");
            collegeTextView.setText("College: Oklahoma");
            heightTextView.setText("Height: 6'5\"");
            playerImageView.setImageResource(R.mipmap.austin);
        }
        if (playerName.equals("Kendrick Nunn")) {
            ageTextView.setText("Age: 27");
            collegeTextView.setText("College: Illinois/Oakland");
            heightTextView.setText("Height: 6'2\"");
            playerImageView.setImageResource(R.mipmap.kendrick);
        }
        if (playerName.equals("Trevor Ariza")) {
            ageTextView.setText("Age: 37");
            collegeTextView.setText("College: UCLA");
            heightTextView.setText("Height: 6'8\"");
            playerImageView.setImageResource(R.mipmap.trevor);
        }
        if (playerName.equals("Marc Gasol")) {
            ageTextView.setText("Age: 37");
            collegeTextView.setText("College: None (Spain)");
            heightTextView.setText("Height: 6'11\"");
            playerImageView.setImageResource(R.mipmap.marc);
        }
    }
}