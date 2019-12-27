package com.example.stressedout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView testCardView,relaxCardView, gameCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testCardView=findViewById(R.id.testCardV);
        gameCardView=findViewById(R.id.gameCardView);
        relaxCardView=findViewById(R.id.relaxCardView);

        testCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent focus;
        if (v.getId()==R.id.testCardV){
            focus=new Intent(this,Test.class);
            startActivity(focus);
        }
    }
}
