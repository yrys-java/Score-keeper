package com.example.scorejust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    int score1 = 0;
    int score2 = 0;

    public void addThree(View view) {
        score1 += 3;
        displayForTeamA(score1);
    }

    public void addTwo(View view) {
        score1 += 2;
        displayForTeamA(score1);
    }

    public void addOne(View view) {
        score1 += 1;
        displayForTeamA(score1);
    }


    public void addThreeb(View view) {
        score2 += 3;
        displayForTeamB(score2);
    }

    public void addTwob(View view) {
        score2 += 2;
        displayForTeamB(score2);
    }

    public void addOneb(View view) {
        score2 += 1;
        displayForTeamB(score2);
    }

    public void reset(View view) {
        score1 = 0;
        score2 = 0;
        displayForTeamA(score1);
        displayForTeamB(score2);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}