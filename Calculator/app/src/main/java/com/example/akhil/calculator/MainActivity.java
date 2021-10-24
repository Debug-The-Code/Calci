package com.example.akhil.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

import org.apache.commons.lang3.StringUtils;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {
    
    String expression = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView button_0, button_1, button_2, button_3, button_4, button_5,button_6,button_7,button_8,button_9,clear_button,decimal_button,percentage_button;
        IconTextView backspace,plus,minus,divide,multply,equal;


        button_0 = (TextView)findViewById(R.id.no_0);
        button_1 = (TextView)findViewById(R.id.no_1);
        button_2 = (TextView)findViewById(R.id.no_2);
        button_3 = (TextView)findViewById(R.id.no_3);
        button_4 = (TextView)findViewById(R.id.no_4);
        button_5 = (TextView)findViewById(R.id.no_5);
        button_6 = (TextView)findViewById(R.id.no_6);
        button_7 = (TextView)findViewById(R.id.no_7);
        button_8 = (TextView)findViewById(R.id.no_8);
        button_9 = (TextView)findViewById(R.id.no_9);
        backspace=(IconTextView)findViewById(R.id.backspace);
        clear_button = (TextView)findViewById(R.id.clear);
        plus = (IconTextView)findViewById(R.id.plus);
        minus = (IconTextView)findViewById(R.id.minus);
        multply = (IconTextView)findViewById(R.id.multiplication);
        divide = (IconTextView)findViewById(R.id.division);
        equal = (IconTextView)findViewById(R.id.equalto);
        decimal_button = (TextView)findViewById(R.id.decimal);
        percentage_button = (TextView)findViewById(R.id.percent);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"0";
                Display1(expression);
                Display2(solve());
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression=expression+"1";
                Display1(expression);
                Display2(solve());
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"2";
                Display1(expression);
                Display2(solve());
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"3";
                Display1(expression);
                Display2(solve());
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"4";
                Display1(expression);
                Display2(solve());
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"5";
                Display1(expression);
                Display2(solve());
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"6";
                Display1(expression);
                Display2(solve());
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"7";
                Display1(expression);
                Display2(solve());
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"8";
                Display1(expression);
                Display2(solve());
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression+"9";
                Display1(expression);
                Display2(solve());
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = method(expression);
                Display1(expression);
                Display2(solve());
            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display1("");
                Display2("");
                expression="";
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression + "+";
                Display1(expression);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression + "-";
                Display1(expression);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression + "/";
                Display1(expression);
            }
        });

        multply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = expression + "*";
                Display1(expression);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression e = new Expression(expression);
                String result = solve();
                expression=result;
                Display1(result);
                Display2("");
            }
        });
        decimal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression=expression+".";
                Display1(expression);
            }
        });

        percentage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression=expression+"%";
                Display1(expression);
            }
        });


    }

    private void Display1(String n)
    {
        FontFitTextView screen = (FontFitTextView) findViewById(R.id.screen1);
        screen.setText(n);
    }

    private void Display2(String n)
    {
        TextView screen = (TextView)findViewById(R.id.screen2);
        screen.setText(n);
    }

    private String solve(){
        Expression e = new Expression(expression);
        double ans = e.calculate();
        String result;
        if(ans - floor(ans) == 0.0)
            result = String.valueOf((long)(ans));
        else
            result=String.valueOf(ans);
        return result;
    }
    
    public String method(String s) {
        return StringUtils.chop(s);
    }

}
