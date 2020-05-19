package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView beachAccessCardView, foodCardView, fitnessCenterCardView,poolCardView,spaCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poolCardView = findViewById(R.id.poolCardViewID);
        fitnessCenterCardView = findViewById(R.id.fitnesscenterCardViewID);
        foodCardView = findViewById(R.id.foodCardViewID);
        beachAccessCardView = findViewById(R.id.beachCardViewID);
        spaCardView = findViewById(R.id.spaCardViewID);

        poolCardView.setOnClickListener(this);
        fitnessCenterCardView.setOnClickListener(this);
        foodCardView.setOnClickListener(this);
        beachAccessCardView.setOnClickListener(this);
        spaCardView.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.fitnesscenterCardViewID:
            {

               intent = new Intent(this, FitnessCenterActivity.class);
               startActivity( intent);
               break;
            }
            case R.id.beachCardViewID:
            {

                intent = new Intent(this, BeachActivity.class);
                startActivity( intent);
                break;
            }
            case R.id.foodCardViewID:
            {

                intent = new Intent(this, FoodActivity.class);
                startActivity( intent);
                break;
            }
            case R.id.poolCardViewID:
            {

                intent = new Intent(this, PoolActivity.class);
                startActivity( intent);
                break;
            }
            case R.id.spaCardViewID:
            {

                intent = new Intent(this, SpaActivity.class);
                startActivity( intent);
                break;
            }
        }

    }
}
