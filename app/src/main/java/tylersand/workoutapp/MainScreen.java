package tylersand.workoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import times.xml.Times;
import workouts.xml.Workouts;

//
public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    //YOU CAN'T TRUST THE SYSTEM MAAAANNNN!!! I'M AN ADUUULLLLT!  YOU CAN'T BUY ME HOTDOG MAN
    //
    public void openWorkoutsActivity(View view) {
      // Do something in response to button

        Intent intent = new Intent(this, Workouts.class);

        startActivity(intent);

    }
    public void openTimesActivity(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Times.class);

        startActivity(intent);

    }

}

