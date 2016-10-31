package net.lezhang.udacity.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(View view) {
        Context context = getApplicationContext();
        CharSequence buttonText = ((Button)view).getText();
        String toastText = "This button will launch my " + buttonText.toString() + " project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }
}
