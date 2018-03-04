package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private AutoCompleteTextView acTextView;
    private Button button;
    private String[] string = new String[]{"android", "androidLayout", "androidMarket", "adobe", "android studio", "白色", "白天", "java",
            "jave JDK", "eclipse", "Google", "Google Map", "Windows", "Windows10", "Windows Xp", "C", "C++"};

    @SuppressWarnings("unused")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        acTextView = (AutoCompleteTextView) findViewById(R.id.acTextView);
        button = (Button) findViewById(R.id.button);

        buttonListener Listener = new buttonListener();
        button.setOnClickListener(Listener);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, string);
        acTextView.setAdapter(arrayAdapter);


    }

    class buttonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            acTextView.setText("");
        }
    }
}
