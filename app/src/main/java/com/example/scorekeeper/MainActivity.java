package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * This method is called when the order button is clicked.
     */
    int team_a_score = 0;
    int team_b_score = 0;
    int foul_a = 0;
    int foul_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void six(View view) {
        team_a_score = team_a_score + 6;
        display_score_a(team_a_score);


    }

    public void three(View view) {

        team_a_score = team_a_score + 3;
        display_score_a(team_a_score);


    }

    public void two(View view) {

        team_a_score = team_a_score + 2;
        display_score_a(team_a_score);

    }

    public void one(View view) {

        team_a_score = team_a_score + 1;
        display_score_a(team_a_score);

    }

    public void foula(View view) {

        foul_a = foul_a + 1;
        display_foul_a(foul_a);

    }

    public void bsix(View view) {
        team_b_score = team_b_score + 6;
        display_score_b(team_b_score);


    }

    public void bthree(View view) {

        team_b_score = team_b_score + 3;
        display_score_b(team_b_score);


    }

    public void btwo(View view) {

        team_b_score = team_b_score + 2;
        display_score_b(team_b_score);

    }

    public void bone(View view) {

        team_b_score = team_b_score + 1;
        display_score_b(team_b_score);

    }

    public void foulb(View view) {

        foul_b = foul_b + 1;
        display_foul_b(foul_b);

    }

    public void reset(View view) {

        team_b_score = 0;
        team_a_score = 0;
        foul_b = 0;
        foul_a = 0;
        display_score_b(team_b_score);
        display_score_a(team_a_score);
        display_foul_b(foul_b);
        display_foul_a(foul_a);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_score_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_score_b(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + number);
    }

    private void display_foul_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_foul);
        quantityTextView.setText("" + number);
    }

    private void display_foul_b(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_foul);
        quantityTextView.setText("" + number);
    }

}