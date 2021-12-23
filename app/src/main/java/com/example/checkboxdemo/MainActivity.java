package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox CSE,ECE,EEE;
    Button CHK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        CSE = (CheckBox)findViewById(R.id.CS);
        ECE = (CheckBox)findViewById(R.id.EC);
        EEE = (CheckBox)findViewById(R.id.EE);
        CHK = (Button)findViewById(R.id.CK);

        //Applying the Listener on the Button click
        CHK.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                StringBuilder result = new StringBuilder();
                result.append("Selected Abbreviations and its Expansions:");

                if ((!CSE.isChecked()) && (!ECE.isChecked()) && (!EEE.isChecked())) {
                    //Displaying the message on the toast to ask the user to select the Checkbox(s) to proceed further
                    result.append("\nNO CheckBox is Checked. Select the CheckBox(s) and Proceed with EXPAND THE TERMS Button");
                    Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

                } else {

                    if (CSE.isChecked()) {
                        result.append("\nCSE: Computer Science and Engineering");
                    }
                    if (ECE.isChecked()) {
                        result.append("\nECE: Electronics and Communication Engineering");
                    }
                    if (EEE.isChecked()) {
                        result.append("\nEEE: Electrical and Electronics Engineering");
                    }

                    result.append("\nThe above detail is the CheckBox Summary.");
                    //Displaying the message on the toast to Display the checked boxes relevant content
                    Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}