package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // This is where I declare all the XML objects, I want these properties all wired up as soon as the app starts for the sake of simplicity.
    RadioButton q1AnswerA;
    RadioButton q1AnswerB;
    RadioButton q1AnswerC;
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
    Button submitButton;
    // General variables
    int question2Answer = 0;
    int happyCatsFound = 0;
    int score = 0;
    boolean isQ1Answered = false;
    boolean isQ4Answered = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // This is where I initialize the variables for the XML objects.
        q1AnswerA = findViewById(R.id.q1AnswerA);
        q1AnswerB = findViewById(R.id.q1AnswerB);
        q1AnswerC = findViewById(R.id.q1AnswerC);
        q2AnswerA = findViewById(R.id.q2AnswerA);
        q2AnswerB = findViewById(R.id.q2AnswerB);
        q2AnswerC = findViewById(R.id.q2AnswerC);
        questionThree = findViewById(R.id.questionThree);
        q3imgA = findViewById(R.id.q3imgA);
        q3imgB = findViewById(R.id.q3imgB);
        q3imgC = findViewById(R.id.q3imgC);
        q4AnswerA = findViewById(R.id.q4AnswerA);
        q4AnswerB = findViewById(R.id.q4AnswerB);
        q4AnswerC = findViewById(R.id.q4AnswerC);
        q4AnswerD = findViewById(R.id.q4AnswerD);
        q5Answer = findViewById(R.id.q5Answer);
        submitButton = findViewById(R.id.submitButton);
    }
// The code below makes some changes to the UI to make sure the user knows they selected an answer and to let the app keep track if every question was answered. It also simplifies the grading system by collecting the answers ahead of time.

    public void radioButtonClicked(View Views) {
        isQ1Answered = true;
    }

    public void checkBoxClicked(View Views) {
        isQ4Answered = true;
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
    // This starts the grading logic, the app runs through a check to see everything is answered, then it begins the grading process. If grading is successful, it deactivates all the UI elements to prevent unexpected input.

    public void submitQuiz(View Views) {
        String q5String = q5Answer.getText().toString();
        if (isQ1Answered == true) {
            if (question2Answer > 0) {
                if (happyCatsFound > 0) {
                    if (isQ4Answered == true) {
                        if (q5String.isEmpty() == false) {
                            if (q1AnswerC.isChecked() == true) {
                                score++;
                            }
                            if (question2Answer == 3) {
                                score++;
                            }
                            if (happyCatsFound == 3) {
                                score++;
                            }
                            if (q4AnswerA.isChecked() == true) {
                                if (q4AnswerB.isChecked() == true) {
                                    if (q4AnswerC.isChecked() == false) {
                                        if (q4AnswerD.isChecked() == true) {
                                            score++;
                                        }
                                    }
                                }
                            }
                            if (q5String.contains("meow")) {
                                score++;
                            }
                            if (q5String.contains("Meow")) {
                                score++;
                            }
                            Toast.makeText(this, "Meowww, you got " + score + " out of 5 right!", Toast.LENGTH_LONG).show();
                            q1AnswerA.setEnabled(false);
                            q1AnswerB.setEnabled(false);
                            q1AnswerC.setEnabled(false);
                            q4AnswerA.setEnabled(false);
                            q4AnswerB.setEnabled(false);
                            q4AnswerC.setEnabled(false);
                            q4AnswerD.setEnabled(false);
                            q5Answer.setEnabled(false);
                            submitButton.setEnabled(false);
                        } else {
                            Toast.makeText(this, "You missed a question!", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(this, "You missed a question!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(this, "You missed a question!", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "You missed a question!", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "You missed a question!", Toast.LENGTH_LONG).show();
        }


    }

}
