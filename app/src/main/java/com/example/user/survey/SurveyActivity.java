package com.example.user.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

import static java.lang.Integer.parseInt;

public class SurveyActivity extends AppCompatActivity{

    private Context mContext;
    private TextView surveyExplanation;
    private TextView q1;
    private EditText a1;
    private TextView q2;
    private EditText a2;
    private TextView q3;
    private EditText a3;
    private TextView q4;
    private RadioGroup a4;
    private RadioButton a4_1;
    private RadioButton a4_2;
    private RadioButton a4_3;
    private TextView q5;
    private RadioGroup a5;
    private RadioButton a5_1;
    private RadioButton a5_2;
    private RadioButton a5_3;
    private TextView q6;
    private RadioGroup a6;
    private RadioButton a6_1;
    private RadioButton a6_2;
    private RadioButton a6_3;
    private TextView q7;
    private RadioGroup a7;
    private RadioButton a7_1;
    private RadioButton a7_2;
    private RadioButton a7_3;
    private TextView q8;
    private RadioGroup a8;
    private RadioButton a8_1;
    private RadioButton a8_2;
    private RadioButton a8_3;
    private TextView q9;
    private RadioGroup a9;
    private RadioButton a9_1;
    private RadioButton a9_2;
    private RadioButton a9_3;
    private TextView q10;
    private EditText a10;
    private TextView q11;
    private RadioGroup a11;
    private RadioButton a11_1;
    private RadioButton a11_2;
    private RadioButton a11_3;
    private RadioButton a11_4;
    private RadioButton a11_5;
    private TextView q12;
    private RadioGroup a12;
    private RadioButton a12_1;
    private RadioButton a12_2;
    private TextView q13;
    private RadioGroup a13;
    private RadioButton a13_1;
    private RadioButton a13_2;
    private RadioButton a13_3;
    private RadioButton a13_4;
    private RadioButton a13_5;
    private TextView q14;
    private RadioGroup a14;
    private RadioButton a14_1;
    private RadioButton a14_2;
    private RadioButton a14_3;
    private TextView q15;
    private RadioGroup a15;
    private RadioButton a15_1;
    private RadioButton a15_2;
    private RadioButton a15_3;
    private TextView q16;
    private EditText a16;
    private TextView q17;
    private CheckBox a17_1;
    private CheckBox a17_2;
    private CheckBox a17_3;
    private CheckBox a17_4;
    private CheckBox a17_5;
    private CheckBox a17_6;
    private CheckBox a17_7;
    private CheckBox a17_8;
    private CheckBox a17_9;
    private CheckBox a17_10;
    private CheckBox a17_11;
    private CheckBox a17_12;
    private TextView q18;
    private RadioGroup a18;
    private RadioButton a18_1;
    private RadioButton a18_2;
    private TextView q19;
    private CheckBox a19_1;
    private CheckBox a19_2;
    private CheckBox a19_3;
    private CheckBox a19_4;
    private CheckBox a19_5;
    private CheckBox a19_6;
    private TextView q20;
    private RadioGroup a20;
    private RadioButton a20_1;
    private RadioButton a20_2;
    private RadioButton a20_3;
    private RadioButton a20_4;
    private TextView q21;
    private RadioGroup a21;
    private RadioButton a21_1;
    private RadioButton a21_2;
    private RadioButton a21_3;
    private TextView q22;
    private EditText a22;
    private TextView q23;
    private RadioGroup a23;
    private RadioButton a23_1;
    private RadioButton a23_2;
    private TextView q24;
    private RadioGroup a24;
    private RadioButton a24_1;
    private RadioButton a24_2;
    private RadioButton a24_3;
    private TextView q25;
    private RadioGroup a25;
    private RadioButton a25_1;
    private RadioButton a25_2;
    private RadioButton a25_3;
    private TextView q26;
    private RadioGroup a26;
    private RadioButton a26_1;
    private RadioButton a26_2;
    private RadioButton a26_3;
    private RadioButton a26_4;
    private RadioButton a26_5;
    private RadioButton a26_6;
    private RadioButton a26_7;
    private RadioButton a26_8;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_activity);

        surveyExplanation = findViewById(R.id.survey_explanation);
        surveyExplanation.setText(R.string.survey_explanation);

        q1 = findViewById(R.id.q1);
        q1.setText(R.string.q1);
        a1 = findViewById(R.id.a1);

        q2 = findViewById(R.id.q2);
        q2.setText(R.string.q2);
        a2 = findViewById(R.id.a2);

        q3 = findViewById(R.id.q3);
        q3.setText(R.string.q3);
        a3 = findViewById(R.id.a3);

        q4 = findViewById(R.id.q4);
        q4.setText(R.string.q4);
        a4 = findViewById(R.id.a4);
        a4_1 = findViewById(R.id.a4_1);
        a4_2 = findViewById(R.id.a4_2);
        a4_3 = findViewById(R.id.a4_3);

        q5 = findViewById(R.id.q5);
        q5.setText(R.string.q5);
        a5 = findViewById(R.id.a5);
        a5_1 = findViewById(R.id.a5_1);
        a5_2 = findViewById(R.id.a5_2);
        a5_3 = findViewById(R.id.a5_3);

        q6 = findViewById(R.id.q6);
        q6.setText(R.string.q6);
        a6 = findViewById(R.id.a6);
        a6_1 = findViewById(R.id.a6_1);
        a6_2 = findViewById(R.id.a6_2);
        a6_3 = findViewById(R.id.a6_3);

        q7 = findViewById(R.id.q7);
        q7.setText(R.string.q7);
        a7 = findViewById(R.id.a7);
        a7_1 = findViewById(R.id.a7_1);
        a7_2 = findViewById(R.id.a7_2);
        a7_3 = findViewById(R.id.a7_3);

        q8 = findViewById(R.id.q8);
        q8.setText(R.string.q8);
        a8 = findViewById(R.id.a8);
        a8_1 = findViewById(R.id.a8_1);
        a8_2 = findViewById(R.id.a8_2);
        a8_3 = findViewById(R.id.a8_3);

        q9 = findViewById(R.id.q9);
        q9.setText(R.string.q9);
        a9 = findViewById(R.id.a9);
        a9_1 = findViewById(R.id.a9_1);
        a9_2 = findViewById(R.id.a9_2);
        a9_3 = findViewById(R.id.a9_3);

        q10 = findViewById(R.id.q10);
        q10.setText(R.string.q10);
        a10 = findViewById(R.id.a10);

        q11 = findViewById(R.id.q11);
        q11.setText(R.string.q11);
        a11 = findViewById(R.id.a11);
        a11_1 = findViewById(R.id.a11_1);
        a11_2 = findViewById(R.id.a11_2);
        a11_3 = findViewById(R.id.a11_3);
        a11_4 = findViewById(R.id.a11_4);
        a11_5 = findViewById(R.id.a11_5);

        q12 = findViewById(R.id.q12);
        q12.setText(R.string.q12);
        a12 = findViewById(R.id.a12);
        a12_1 = findViewById(R.id.a12_1);
        a12_2 = findViewById(R.id.a12_2);

        q13 = findViewById(R.id.q13);
        q13.setText(R.string.q13);
        a13 = findViewById(R.id.a13);
        a13_1 = findViewById(R.id.a13_1);
        a13_2 = findViewById(R.id.a13_2);
        a13_3 = findViewById(R.id.a13_3);
        a13_4 = findViewById(R.id.a13_4);
        a13_5 = findViewById(R.id.a13_5);

        q14 = findViewById(R.id.q14);
        q14.setText(R.string.q14);
        a14 = findViewById(R.id.a14);
        a14_1 = findViewById(R.id.a14_1);
        a14_2 = findViewById(R.id.a14_2);
        a14_3 = findViewById(R.id.a14_3);

        q15 = findViewById(R.id.q15);
        q15.setText(R.string.q15);
        a15 = findViewById(R.id.a15);
        a15_1 = findViewById(R.id.a15_1);
        a15_2 = findViewById(R.id.a15_2);
        a15_3 = findViewById(R.id.a15_3);

        q16 = findViewById(R.id.q16);
        q16.setText(R.string.q16);
        a16 = findViewById(R.id.a16);

        q17 = findViewById(R.id.q17);
        q17.setText(R.string.q17);
        a17_1 = findViewById(R.id.a17_1);
        a17_2 = findViewById(R.id.a17_2);
        a17_3 = findViewById(R.id.a17_3);
        a17_4 = findViewById(R.id.a17_4);
        a17_5 = findViewById(R.id.a17_5);
        a17_6 = findViewById(R.id.a17_6);
        a17_7 = findViewById(R.id.a17_7);
        a17_8 = findViewById(R.id.a17_8);
        a17_9 = findViewById(R.id.a17_9);
        a17_10 = findViewById(R.id.a17_10);
        a17_11 = findViewById(R.id.a17_11);
        a17_12 = findViewById(R.id.a17_12);

        q18 = findViewById(R.id.q18);
        q18.setText(R.string.q18);
        a18 = findViewById(R.id.a18);
        a18_1 = findViewById(R.id.a18_1);
        a18_2 = findViewById(R.id.a18_2);

        q19 = findViewById(R.id.q19);
        q19.setText(R.string.q19);
        a19_1 = findViewById(R.id.a19_1);
        a19_2 = findViewById(R.id.a19_2);
        a19_3 = findViewById(R.id.a19_3);
        a19_4 = findViewById(R.id.a19_4);
        a19_5 = findViewById(R.id.a19_5);
        a19_6 = findViewById(R.id.a19_6);

        q20 = findViewById(R.id.q20);
        q20.setText(R.string.q20);
        a20_1 = findViewById(R.id.a20_1);
        a20_2 = findViewById(R.id.a20_2);
        a20_3 = findViewById(R.id.a20_3);
        a20_4 = findViewById(R.id.a20_4);

        q21 = findViewById(R.id.q21);
        q21.setText(R.string.q21);
        a21_1 = findViewById(R.id.a21_1);
        a21_2 = findViewById(R.id.a21_2);
        a21_3 = findViewById(R.id.a21_3);

        q22 = findViewById(R.id.q22);
        q22.setText(R.string.q22);
        a22 = findViewById(R.id.a22);

        q23 = findViewById(R.id.q23);
        q23.setText(R.string.q23);
        a23_1 = findViewById(R.id.a23_1);
        a23_2 = findViewById(R.id.a23_2);

        q24 = findViewById(R.id.q24);
        q24.setText(R.string.q24);
        a24_1 = findViewById(R.id.a24_1);
        a24_2 = findViewById(R.id.a24_2);
        a24_3 = findViewById(R.id.a24_3);

        q25 = findViewById(R.id.q25);
        q25.setText(R.string.q25);
        a25_1 = findViewById(R.id.a25_1);
        a25_2 = findViewById(R.id.a25_2);
        a25_3 = findViewById(R.id.a25_3);

        q26 = findViewById(R.id.q26);
        q26.setText(R.string.q26);
        a26_1 = findViewById(R.id.a26_1);
        a26_2 = findViewById(R.id.a26_2);
        a26_3 = findViewById(R.id.a26_3);
        a26_4 = findViewById(R.id.a26_4);
        a26_5 = findViewById(R.id.a26_5);
        a26_6 = findViewById(R.id.a26_6);
        a26_7 = findViewById(R.id.a26_7);
        a26_8 = findViewById(R.id.a26_8);

        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //when clicked, save everything into SQLite
                //Or directly pass it into a json file?
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                Bundle bundle = new Bundle();

                //a1
                if(!a1.getText().toString().equals("")){
                    bundle.putString("q1", a1.getText().toString());
                }  else
                    bundle.putString("q1", null);

                //a2
                if(!a2.getText().toString().equals("")) {
                    bundle.putString("q2", a2.getText().toString());
                }  else
                    bundle.putString("q2", null);

                //a3
                if(!a3.getText().toString().equals("")) {
                    bundle.putString("q3", a3.getText().toString());
                } else
                    bundle.putString("q3", null);

                //a4
                if(a4_1.isChecked()){
                    bundle.putString("q4", "male");
                } else if(a4_2.isChecked()){
                    bundle.putString("q4", "female");
                } else if(a4_3.isChecked()){
                    bundle.putString("q4", "other");
                } else
                    bundle.putString("q4", null);

                //a5
                if(a5_1.isChecked()){
                    bundle.putString("q5", "never");
                } else if(a5_2.isChecked()){
                    bundle.putString("q5", "1~2 times");
                } else if(a5_3.isChecked()){
                    bundle.putString("q5", "3 or more times");
                } else
                    bundle.putString("q5", null);

                //a6
                if(a6_1.isChecked()){
                    bundle.putString("q6", "never");
                } else if(a6_2.isChecked()){
                    bundle.putString("q6", "1~2 times");
                } else if(a6_3.isChecked()){
                    bundle.putString("q6", "3 or more times");
                } else
                    bundle.putString("q6", null);

                //a7
                if(a7_1.isChecked()){
                    bundle.putString("q7", "never");
                } else if(a7_2.isChecked()){
                    bundle.putString("q7", "1~2 times");
                } else if(a7_3.isChecked()){
                    bundle.putString("q7", "3 or more times");
                } else
                    bundle.putString("q7", null);

                //a8
                if(a8_1.isChecked()){
                    bundle.putString("q8", "never");
                } else if(a8_2.isChecked()){
                    bundle.putString("q8", "1~2 times");
                } else if(a8_3.isChecked()){
                    bundle.putString("q8", "3 or more times");
                } else
                    bundle.putString("q8", null);

                //a9
                if(a9_1.isChecked()){
                    bundle.putString("q9", "never");
                } else if(a9_2.isChecked()){
                    bundle.putString("q9", "1~2 times");
                } else if(a9_3.isChecked()){
                    bundle.putString("q9", "3 or more times");
                } else
                    bundle.putString("q9", null);

                //a10
                if(!a10.getText().toString().equals("")){
                    bundle.putString("q10", a10.getText().toString());
                } else
                    bundle.putString("q10", null);

                //a11
                if(a11_1.isChecked()){
                    bundle.putString("q11", "None");
                } else if(a11_2.isChecked()){
                    bundle.putString("q11", "Vegan");
                } else if(a11_3.isChecked()){
                    bundle.putString("q11", "Vegetarian");
                } else if (a11_4.isChecked()){
                    bundle.putString("q11", "Mediterranean");
                } else if (a11_5.isChecked()){
                    bundle.putString("q11", "Atkins");
                } else
                    bundle.putString("q11", null);

                //a12
                if(a12_1.isChecked()){
                    bundle.putString("q12", "Yes");
                } else if(a12_2.isChecked()){
                    bundle.putString("q12", "No");
                } else
                    bundle.putString("q2", null);

                //a13
                if(a13_1.isChecked()){
                    bundle.putString("q13", "Never");
                } else if(a13_2.isChecked()){
                    bundle.putString("q13", "1 or less time");
                } else if(a13_3.isChecked()){
                    bundle.putString("q13", "1~2 times");
                } else if (a13_4.isChecked()){
                    bundle.putString("q13", "3~5 times");
                } else if (a13_5.isChecked()){
                    bundle.putString("q13", "6 or more times");
                } else
                    bundle.putString("q13", null);

                //a14
                if(a14_1.isChecked()){
                    bundle.putString("q14", "Causing sickness");
                } else if(a14_2.isChecked()){
                    bundle.putString("q14", "Feeling burnt out");
                } else if(a14_3.isChecked()){
                    bundle.putString("q14", "Neither");
                } else
                    bundle.putString("q14", null);

                //a15
                if(a15_1.isChecked()){
                    bundle.putString("q15", "Bad");
                } else if(a15_2.isChecked()){
                    bundle.putString("q15", "Normal");
                } else if(a15_3.isChecked()){
                    bundle.putString("q15", "Good");
                } else
                    bundle.putString("q15", null);

                //a16
                if(!a16.getText().toString().equals("")) {
                    bundle.putString("q16", a16.getText().toString());
                }  else
                    bundle.putString("q16", null);

                //a17
                if(a17_1.isChecked()){
                    bundle.putString("q17", "Eye");
                } else if(a17_2.isChecked()){
                    bundle.putString("q17", "Brain");
                } else if(a17_3.isChecked()){
                    bundle.putString("q17", "Liver");
                } else if(a17_4.isChecked()){
                    bundle.putString("q17", "Stomach");
                } else if(a17_5.isChecked()){
                    bundle.putString("q17", "Prostate");
                } else if(a17_6.isChecked()){
                    bundle.putString("q17", "Skin");
                } else if(a17_7.isChecked()){
                    bundle.putString("q17", "Bone");
                } else if(a17_8.isChecked()){
                    bundle.putString("q17", "Heart");
                } else if(a17_9.isChecked()){
                    bundle.putString("q17", "Anti Aging");
                }else if(a17_10.isChecked()){
                    bundle.putString("q17", "Hair Loss");
                } else if(a17_11.isChecked()){
                    bundle.putString("q17", "Cholesterol");
                } else if(a17_12.isChecked()){
                    bundle.putString("q17", "Immune");
                }  else
                    bundle.putString("q17", null);

                //a18
                if(a18_1.isChecked()){
                    bundle.putString("q18", "Yes");
                } else if(a18_2.isChecked()){
                    bundle.putString("q18", "No");
                }  else
                    bundle.putString("q18", null);

                //a19
                if(a19_1.isChecked()){
                    bundle.putString("q19", "Diabetes");
                } else if(a19_2.isChecked()){
                    bundle.putString("q19", "Stomach and Intestine disease");
                } else if(a19_3.isChecked()){
                    bundle.putString("q19", "Chronic headache");
                } else if(a19_4.isChecked()){
                    bundle.putString("q19", "Insomnia");
                } else if(a19_5.isChecked()){
                    bundle.putString("q19", "High Blood Pressure");
                } else if(a19_6.isChecked()){
                    bundle.putString("q19", "None");
                } else
                    bundle.putString("q19", null);

                //a20
                if(a20_1.isChecked()){
                    bundle.putString("q20", "Dry Skin");
                } else if(a20_2.isChecked()){
                    bundle.putString("q20", "Wrinkles");
                } else if(a20_3.isChecked()){
                    bundle.putString("q20", "Aging");
                } else if(a20_4.isChecked()){
                    bundle.putString("q20", "None");
                } else
                    bundle.putString("q20", null);

                //a21
                if(a21_1.isChecked()){
                    bundle.putString("q21", "Great");
                } else if(a21_2.isChecked()){
                    bundle.putString("q21", "Need more");
                } else if(a21_3.isChecked()){
                    bundle.putString("q21", "Too often");
                } else
                    bundle.putString("q21", null);

                //a22
                if(a22.getText().toString()!=null) {
                    bundle.putString("q22", a22.getText().toString());
                } else
                    bundle.putString("q22", null);

                //a23
                if(a23_1.isChecked()){
                    bundle.putString("q23", "Yes");
                } else if(a23_2.isChecked()){
                    bundle.putString("q23", "No");
                } else
                    bundle.putString("q23", null);

                //a24
                if(a24_1.isChecked()){
                    bundle.putString("q24", "Never");
                } else if(a24_2.isChecked()){
                    bundle.putString("q24", "1~2 times");
                } else if(a24_3.isChecked()){
                    bundle.putString("q24", "3 or more times");
                } else
                    bundle.putString("q24", null);

                //a25
                if(a25_1.isChecked()){
                    bundle.putString("q25", "Want it");
                } else if(a25_2.isChecked()){
                    bundle.putString("q25", "Learn more");
                } else if(a25_3.isChecked()){
                    bundle.putString("q25", "Don\'t want it");
                } else
                    bundle.putString("q25", null);

                //a26
                if(a26_1.isChecked()){
                    bundle.putString("q26", "Facebook");
                } else if(a26_2.isChecked()){
                    bundle.putString("q26", "Article or blog");
                } else if(a26_3.isChecked()){
                    bundle.putString("q26", "From a friend");
                } else if(a26_4.isChecked()){
                    bundle.putString("q26", "Instagram");
                } else if(a26_5.isChecked()){
                    bundle.putString("q26", "Google");
                } else if(a26_6.isChecked()){
                    bundle.putString("q26", "Mail");
                } else if(a26_7.isChecked()){
                    bundle.putString("q26", "Youtube");
                } else if(a26_8.isChecked()){
                    bundle.putString("q26", "Other");
                } else
                    bundle.putString("q26", null);

                //PUTTING INTENT AND SAVING IT INTO JSON
                intent.putExtras(bundle);
                for(String key: bundle.keySet()){
                    if(bundle.get(key)==null){
                        error();
                        break;
                    }
                }
                startActivity(intent);
            }
        });
    }
    public void error(){
        Toast.makeText(this, "You did not complete the survey.", Toast.LENGTH_LONG).show();
    }
}
