package com.example.user.survey;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button startSurveyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        startSurveyButton = findViewById(R.id.start_survey_button_through_app);
        startSurveyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(mContext, SurveyActivity.class);
                startActivity(intent);
            }
        });
    }

    public void open(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vitamins3.com/pages/survey"));
        startActivity(intent);
    }
}
