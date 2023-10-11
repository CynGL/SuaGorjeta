package br.com.etecia.suagorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
        Float res, valqs;
        TextInputEditText valc;
        String[] qs = {"Excelente - 10%" , "ótimo - 8%" , "Bom - 5%" , "Ruim - 2%"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pega o valor da conta
        valc = findViewById(R.id.valorc);


        Spinner spin = (Spinner) findViewById(R.id.spinnerqs);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter adap = new ArrayAdapter(this,android.R.layout.simple_spinner_item,qs);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adap);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),qs[position] , Toast.LENGTH_LONG).show();



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }





}