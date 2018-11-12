package com.example.student.cw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    var userInput = (EditText) findViewById(R.id.editText);
    var button = (Button) findViewById(R.id.button);
    var textView = (TextView) findViewById(R.id.textView);
    Integer numTimesClicked;
    View.OnClickListener('ourOnClickListener') = new View.OnClickListener() {
        @Override
        public void onClick(View.view) {
            numTimesClicked = numTimesClicked + 1;
            String result = "\nClicked " + numTimesClicked + " times";
            textView.append(result);

        }
    };
        button.setOnClickListener(ourOnClickListener);
}
