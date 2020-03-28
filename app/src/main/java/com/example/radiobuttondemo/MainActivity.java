package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private RadioGroup radio_group;
        private Button show_button;
        private RadioButton gender_button;
        private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_group = (RadioGroup)findViewById(R.id.radio_group_id);
        show_button = (Button) findViewById(R.id.show_buttonId);
        result = (TextView) findViewById(R.id.resultId);
        show_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int selectedId = radio_group.getCheckedRadioButtonId();
        gender_button = (RadioButton) findViewById(selectedId);
        String value=gender_button.getText().toString();
        result.setText("You are Selected "+value);
    }
}
