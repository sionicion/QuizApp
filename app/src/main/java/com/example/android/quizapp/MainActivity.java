package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // This is where I declare all the XML objects, I want these properties all wired up as soon as the app starts for the sake of simplicity.
    RadioGroup q1RadioGroup;
    Button q2AnswerA;
    Button q2AnswerB;
    Button q2AnswerC;
    TextView questionThree;
    ImageView q3imgA;
    ImageView q3imgB;
    ImageView q3imgC;
    CheckBox q4AnswerA;
    CheckBox q4AnswerB;
    CheckBox q4AnswerC;
    CheckBox q4AnswerD;
    EditText q5Answer;
    // General variables
    int question2Answer = 0;
    int happyCatsFound = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // This is where I initialize the variables for the XML objects.
        q1RadioGroup = (RadioGroup) findViewById(R.id.q1RadioGroup);
        q2AnswerA = (Button) findViewById(R.id.q2AnswerA);
        q2AnswerB = (Button) findViewById(R.id.q2AnswerB);
        q2AnswerC = (Button) findViewById(R.id.q2AnswerC);
        questionThree = (TextView) findViewById(R.id.questionThree);
        q3imgA = (ImageView) findViewById(R.id.q3imgA);
        q3imgB = (ImageView) findViewById(R.id.q3imgB);
        q3imgC = (ImageView) findViewById(R.id.q3imgC);
        q4AnswerA = (CheckBox) findViewById(R.id.q4AnswerA);
        q4AnswerB = (CheckBox) findViewById(R.id.q4AnswerB);
        q4AnswerC = (CheckBox) findViewById(R.id.q4AnswerC);
        q4AnswerD = (CheckBox) findViewById(R.id.q4AnswerD);
        q5Answer = (EditText) findViewById(R.id.q5Answer);
    }

    public void q2AnswerAClicked(View Views) {
        q2AnswerA.setEnabled(false);
        q2AnswerB.setEnabled(false);
        q2AnswerC.setEnabled(false);
        question2Answer = 1;
    }

    public void q2AnswerBClicked(View Views) {
        q2AnswerA.setEnabled(false);
        q2AnswerB.setEnabled(false);
        q2AnswerC.setEnabled(false);
        question2Answer = 2;
    }

    public void q2AnswerCClicked(View Views) {
        q2AnswerA.setEnabled(false);
        q2AnswerB.setEnabled(false);
        q2AnswerC.setEnabled(false);
        question2Answer = 3;
    }

    public void q3imgAclicked(View Views) {
        q3imgA.setVisibility(View.GONE);
        happyCatsFound++;
        if (happyCatsFound >= 3) {
            questionThree.setText("Great! Proceed to Question 4!");
        }
    }

    public void q3imgBclicked(View Views) {
        q3imgB.setVisibility(View.GONE);
        happyCatsFound++;
        if (happyCatsFound >= 3) {
            questionThree.setText("Great! Proceed to Question 4!");
        }
    }

    public void q3imgCclicked(View Views) {
        q3imgC.setVisibility(View.GONE);
        happyCatsFound++;
        if (happyCatsFound >= 3) {
            questionThree.setText("Great! Proceed to Question 4!");
        }
    }
}
