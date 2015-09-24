package com.peremartramanonelles.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();
    private int mMAS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        String TAG = FunFactsActivity.class.getSimpleName();
        //Declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButto = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(Color.RED+mMAS);
                mMAS += 10;
            }
        };
        showFactButto.setOnClickListener(listener);
        String message = getString(R.string.saludito);
        //Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Log.d("funFact", "yep aqui te,!EEE");
    }
}
