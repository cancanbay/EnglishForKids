package com.example.canbay.englishforkids;

/**
 * Created by canbay on 24.12.2016.
 */

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


import java.util.ArrayList;

public class QuizResultActivity extends AppCompatActivity {

    ArrayList<String> myAnsList=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity_result);



        //get rating bar object
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        bar.setNumStars(5);
        bar.setStepSize(0.5f);

        //get text view
        TextView tvAnsweredInfo =(TextView)findViewById(R.id.tvAnsweredInfo);
        TextView t=(TextView)findViewById(R.id.textResult);

        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        int totalQs= b.getInt("totalQs");
        myAnsList=b.getStringArrayList("myAnsList");

        //display score
        bar.setRating(score);

        tvAnsweredInfo.setText(+totalQs+"sorudan "+score+" tanesini doğru yanıtladın!");

        float percentage=(score*100)/totalQs;

        if (percentage>=80 && percentage<=100){
            t.setText("Skorun mükemmel!");
        }else if(percentage>=70 && percentage<=79){
            t.setText("Skorun başarılı!");
        }else if(percentage>=60 && percentage<=69){
            t.setText("Skorun iyi!");
        }else if(percentage>=50 && percentage<=59){
            t.setText("Skorun ortalama!");
        }else if(percentage>=33 && percentage<=49){
            t.setText("Skorun ortalamadan düşük!");
        }else{
            t.setText("Skorun düşük, daha fazla çalışmalısın!");
        }


        Button btnDone=(Button)findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnViewAnswer=(Button)findViewById(R.id.btnViewAnswer);
        btnViewAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vIntent=new Intent(QuizResultActivity.this,QuizViewAnswerActivity.class);
                vIntent.putStringArrayListExtra("myAnsList",myAnsList);
                startActivity(vIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}