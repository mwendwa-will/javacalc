package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button add;
    Button div;
    Button sub;
    Button mut;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);

        add=(Button)findViewById(R.id.btAdd);
        sub=(Button)findViewById(R.id.btSub);
        mut=(Button)findViewById(R.id.btDiv);
        div=(Button)findViewById(R.id.btMut);

        result=(TextView) findViewById(R.id.tvAns);
    }

    public void btAdd(View view) {
        int number1,number2,sum;

        number1=Integer.parseInt(num1.getText().toString());
        number2=Integer.parseInt(num2.getText().toString());

        sum = number1 + number2;

        result.setText(String.valueOf(sum));

    }

    public void btSub(View view) {
        int number1,number2,diff;

        number1=Integer.parseInt(num1.getText().toString());
        number2=Integer.parseInt(num2.getText().toString());

        diff = number1 - number2;

        result.setText(String.valueOf(diff));
    }

    public void btDiv(View view) {
        int number1,number2,div;

        number1=Integer.parseInt(num1.getText().toString());
        number2=Integer.parseInt(num2.getText().toString());

        div = number1 / number2;

        result.setText(String.valueOf(div));

    }

    public void btMut(View view) {
        int number1,number2,mut;

        number1=Integer.parseInt(num1.getText().toString());
        number2=Integer.parseInt(num2.getText().toString());

        mut = number1 * number2;

        result.setText(String.valueOf(mut));
    }
}
