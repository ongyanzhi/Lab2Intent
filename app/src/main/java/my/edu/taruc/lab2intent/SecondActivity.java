package my.edu.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textViewMsg;
        textViewMsg = findViewById(R.id.textViewMessage);
        //Read the intent extra value
        Intent intent = getIntent(); //Who called me?
        if(intent.hasExtra(MainActivity.TAG_MESSAGE))
        {
            String stringMsg;
            stringMsg = intent.getStringExtra(MainActivity.TAG_MESSAGE);
            textViewMsg.setText(stringMsg);
        }
    }
}
