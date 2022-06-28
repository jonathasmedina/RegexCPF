package com.example.regexcpf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String cpf = "011.828.241-70";

        if(validaCPF(cpf))
            Toast.makeText(this, "CPF OK", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "CPF não OK", Toast.LENGTH_SHORT).show();


    }

    //sem verificação dos dígitos/cálculos
    private boolean validaCPF(String cpf) {
        String regEx = "[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}";

        CharSequence inputStr = cpf;

        Pattern pattern = Pattern.compile(regEx,Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }
}