package com.example.a4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    numbrController nc;
    CaclControlleer cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new numbrController();
        nc.setDisplay((TextView) findViewById(R.id.mainEditText));
        cc=new CaclControlleer();
        cc.setNc(nc);
    }

    public void onDigitClick (View button){
        Button b = (Button)button;
        nc.addDigit(Integer.parseInt(b.getText().toString()));
    }

    public void onClick (View button){
        nc.clear();
    }

    public void onPlusClick(View b){
        cc.slojit();
    }

    public void onMinesClick(View b){
        cc.vychest();
    }

    public void onUmnojitClick(View b){
        cc.umnojit();
    }

    public void onDelenieClick(View b){
        cc.delenie();
    }

    public void onProcentClick(View b){
        cc.procent();
    }

    public void onCalcClick(View b){
        cc.vychaclit();
    }

    public void onDotClick(View b){
        nc.addDot();
    }

    public void onInfoClick(View b){
        Intent i = new Intent(this, InfoActivity.class);
        startActivity (i);
    }
}
