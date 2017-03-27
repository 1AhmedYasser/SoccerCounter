package com.example.android.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    // Declaration and initialization of 6 global variables.
    int TeamAGoals = 0;
    int TeamAPenalties = 0;
    int TeamAFouls = 0;
    int TeamBGoals = 0;
    int TeamBPenalties = 0;
    int TeamBFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increments the number of goals for Team A by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     */
    public void AddGoalTeamA(View view) {
        TeamAGoals += 1;
        UpdateGoalsCountDisplayForTeamA(TeamAGoals);
    }

    /**
     * Increments the number of penalties for Team A by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     * Also increment the number of goals by 1 because a penalty shot is worth 1 goal if it gets in.
     */
    public void AddPenaltiesTeamA(View view) {
        TeamAGoals += 1;
        TeamAPenalties += 1;
        UpdateGoalsCountDisplayForTeamA(TeamAGoals);
        UpdatePenaltiesCountDisplayForTeamA(TeamAPenalties);
    }

    /**
     * Increments the number of fouls for Team A by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     */
    public void AddFoulsTeamA(View view) {
        TeamAFouls += 1;
        UpdateFoulsCountDisplayForTeamA(TeamAFouls);
    }

    /**
     * Increments the number of goals for Team B by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     */
    public void AddGoalTeamB(View view) {
        TeamBGoals += 1;
        UpdateGoalsCountDisplayForTeamB(TeamBGoals);
    }

    /**
     * Increments the number of penalties for Team B by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     * Also increment the number of goals by 1 because a penalty shot is worth 1 goal if it gets in.
     */
    public void AddPenaltiesTeamB(View view) {
        TeamBGoals += 1;
        TeamBPenalties += 1;
        UpdateGoalsCountDisplayForTeamB(TeamBGoals);
        UpdatePenaltiesCountDisplayForTeamB(TeamBPenalties);
    }

    /**
     * Increments the number of fouls for Team B by 1 and
     * then calls the appropriate method to update and display the value on the device screen.
     */
    public void AddFoulsTeamB(View view) {
        TeamBFouls += 1;
        UpdateFoulsCountDisplayForTeamB(TeamBFouls);
    }

    /**
     * Resets the number of goals,penalties and fouls for both teams.
     */
    public void ResetAllScores(View view) {
        TeamAGoals = 0;
        TeamAPenalties = 0;
        TeamAFouls = 0;
        TeamBGoals = 0;
        TeamBPenalties = 0;
        TeamBFouls = 0;
        UpdateGoalsCountDisplayForTeamA(TeamAGoals);
        UpdatePenaltiesCountDisplayForTeamA(TeamAPenalties);
        UpdateFoulsCountDisplayForTeamA(TeamAFouls);
        UpdateGoalsCountDisplayForTeamB(TeamBGoals);
        UpdatePenaltiesCountDisplayForTeamB(TeamBPenalties);
        UpdateFoulsCountDisplayForTeamB(TeamBFouls);
    }

    /**
     * Update and display the number of goals for team A.
     */
    public void UpdateGoalsCountDisplayForTeamA(int number) {
        TextView score = (TextView) findViewById(R.id.goals_count_teamA);
        score.setText("" + number);
    }

    /**
     * Update and display the number of goals for team B.
     */
    public void UpdateGoalsCountDisplayForTeamB(int number) {
        TextView score = (TextView) findViewById(R.id.goals_count_teamB);
        score.setText("" + number);
    }

    /**
     * Update and display the number of penalties for team A.
     */
    public void UpdatePenaltiesCountDisplayForTeamA(int number) {
        TextView penalties = (TextView) findViewById(R.id.penalties_count_TeamA);
        penalties.setText("" + number);
    }

    /**
     * Update and display the number of penalties for team B.
     */
    public void UpdatePenaltiesCountDisplayForTeamB(int number) {
        TextView penalties = (TextView) findViewById(R.id.penalties_count_TeamB);
        penalties.setText("" + number);
    }

    /**
     * Update and display the number of fouls for team A.
     */
    public void UpdateFoulsCountDisplayForTeamA(int number) {
        TextView fouls = (TextView) findViewById(R.id.fouls_count_TeamA);
        fouls.setText("" + number);
    }

    /**
     * Update and display the number of fouls for team B.
     */
    public void UpdateFoulsCountDisplayForTeamB(int number) {
        TextView fouls = (TextView) findViewById(R.id.fouls_count_TeamB);
        fouls.setText("" + number);
    }
}
