package com.example.admin215.lifecicleexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plusButton, minusButton;
    EditText textA, textB;
    TextView rezult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = (Button) findViewById(R.id.plusbutton);
        minusButton = (Button) findViewById(R.id.minesbutton);
        textA = (EditText) findViewById(R.id.text1);
        textB = (EditText) findViewById(R.id.text2);
        rezult = (TextView) findViewById(R.id.rezult);

        Toast.makeText(this, "Я создана!", Toast.LENGTH_SHORT).show();

/*        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aStr, bStr;
                int a, b, c;
                aStr = textA.getText().toString();
                bStr = textB.getText().toString();
                a = Integer.parseInt(aStr);
                b = Integer.parseInt(bStr);
                c = a + b;
                rezult.setText(Integer.valueOf(c).toString());
            }
        });*/

    }

    void calculation(View v){
        int id = v.getId();
        String aStr, bStr;
        int a, b, c = 0;
        aStr = textA.getText().toString();
        bStr = textB.getText().toString();
        
        a = Integer.parseInt(aStr);
        b = Integer.parseInt(bStr);
        switch (id){
            case R.id.plusbutton:
                c = a + b; break;
            case R.id.minesbutton:
                c = a - b; break;
            default:
                c = 0; break;
        }
        rezult.setText(Integer.valueOf(c).toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Я стартовала!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Я возобновилась!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Я на паузе!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Я остановлена!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Я перезапустилась!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Убивают!!!!", Toast.LENGTH_SHORT).show();
    }
}
