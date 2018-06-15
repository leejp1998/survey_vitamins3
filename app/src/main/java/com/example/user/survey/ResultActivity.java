package com.example.user.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class ResultActivity extends AppCompatActivity {

    private Context mContext;
    private TextView testText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        JSONObject json = new JSONObject();
        Set<String> keys = bundle.keySet();

        testText = findViewById(R.id.testText);
        //testText.setText(bundle.getString("q1") + bundle.getString("q3") + bundle.getString("q4") + bundle.getString("q5"));

        String answer = "";
        for(String key:keys){
            answer += bundle.getString(key) + "\n";
        }
        testText.setText("Thank you for the survey" + "\n "
                + answer);


        for(String key:keys){
            try{
                json.put(key, bundle.get(key));
            } catch(JSONException e){
                e.printStackTrace();
            }
        }
//        File file = new File("storage")
    }

}
