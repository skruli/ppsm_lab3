package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    String[] englishJoke = new String[]{"Why is Peter Pan always flying?\n -He neverlands",
            "I just wrote a book on reverse psychology. \n-Do not read it",
            "What did the buffalo say when his son left? \n-Bison!"};
    String[] polishJoke = new String[]{"Człowiek, który zawsze siedzi w cieniu? \n-cienias",
            "Jak nazywa sie wóz, którym jeździ radio? \n-radiowóz",
            "Jaką trawe lubi koń? \n-koniczyne"};

    public void generujText(View view) {
        TextView textView2 = findViewById(R.id.textView2);
        Random ran = new Random();
        int random = ran.nextInt(3);
        if(Locale.getDefault().getLanguage() == "pl"){
            textView2.setText(polishJoke[random]);
        }
        else if(Locale.getDefault().getLanguage() == "en"){
            textView2.setText(englishJoke[random]);
        }
    }
}