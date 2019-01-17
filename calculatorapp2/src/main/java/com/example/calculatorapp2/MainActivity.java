package com.example.calculatorapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_input, tv_output;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bClear, bDivide,
            bMultiply, bDel, bMinus, bPlus, bPercent, bComma, bEqually;

    private static double[] masN = new double[100];
    private static char[] masA = new char[99];
    private static boolean boolComma = true;
    private DecimalFormat df = new DecimalFormat("#.##########");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b_0);
        b1 = findViewById(R.id.b_1);
        b2 = findViewById(R.id.b_2);
        b3 = findViewById(R.id.b_3);
        b4 = findViewById(R.id.b_4);
        b5 = findViewById(R.id.b_5);
        b6 = findViewById(R.id.b_6);
        b7 = findViewById(R.id.b_7);
        b8 = findViewById(R.id.b_8);
        b9 = findViewById(R.id.b_9);
        bClear = findViewById(R.id.b_clear);
        bDivide = findViewById(R.id.b_divide);
        bMultiply = findViewById(R.id.b_multiply);
        bDel = findViewById(R.id.b_del);
        bMinus = findViewById(R.id.b_minus);
        bPlus = findViewById(R.id.b_plus);
        bPercent = findViewById(R.id.b_percent);
        bComma = findViewById(R.id.b_comma);
        bEqually = findViewById(R.id.b_equally);
        tv_input = findViewById(R.id.tv_input);
        tv_output = findViewById(R.id.tv_output);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bClear.setOnClickListener(this);
        bDivide.setOnClickListener(this);
        bMultiply.setOnClickListener(this);
        bDel.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bPercent.setOnClickListener(this);
        bComma.setOnClickListener(this);
        bEqually.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_0:
                tv_input.append("0");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_1:
                tv_input.append("1");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_2:
                tv_input.append("2");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_3:
                tv_input.append("3");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_4:
                tv_input.append("4");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_5:
                tv_input.append("5");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_6:
                tv_input.append("6");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_7:
                tv_input.append("7");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_8:
                tv_input.append("8");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_9:
                tv_input.append("9");
                algebRun();
                if (boolComma) {
                    bComma.setEnabled(true);
                    boolComma = false;
                }
                break;

            case R.id.b_clear:
                tv_input.setText("");
                tv_output.setText("");
                setBtnEneb(false);
                bMinus.setEnabled(true);
                bEqually.setEnabled(false);
                bComma.setEnabled(false);
                boolComma = true;
                break;

            case R.id.b_divide:
                replacementChar("/x-+,");
                tv_input.append("/");
                bComma.setEnabled(false);
                boolComma = true;
                break;

            case R.id.b_multiply:
                replacementChar("/x-+,");
                tv_input.append("x");
                bComma.setEnabled(false);
                boolComma = true;
                break;

            case R.id.b_del:
                boolean bool = tv_input.getText().toString().endsWith(",");
                tv_input.setText(tv_input.getText().toString().substring(
                        0, tv_input.length() -1));

                if (tv_input.getText().toString().equals("")) {
                    tv_output.setText("");
                    setBtnEneb(false);
                    bMinus.setEnabled(true);
                    bEqually.setEnabled(false);
                    bComma.setEnabled(false);
                    boolComma = false;;

                } else {
                    String text = tv_input.getText().toString();
                    String endText = "" + text.charAt(text.length()-1);
                    if (!"/x-+".contains(endText)) {
                        algebRun();
                    }else {
                        bComma.setEnabled(false);
                        boolComma = true;
                    }
                }
                if (bool) {
                    bComma.setEnabled(true);
                    boolComma = true;
                }
                break;

            case R.id.b_minus:
                if (!tv_input.getText().toString().equals("")) {
                    replacementChar("-+,");
                }
                tv_input.append("-");
                bComma.setEnabled(false);
                boolComma = true;
                break;

            case R.id.b_plus:
                replacementChar("/x-+,");
                tv_input.append("+");
                bComma.setEnabled(false);
                boolComma = true;
                break;

            case R.id.b_comma:
                tv_input.append(",");
                bComma.setEnabled(false);
                boolComma = false;
                break;

            case R.id.b_equally:
                tv_input.setText(tv_output.getText());
                setBtnEneb(true);
                bMinus.setEnabled(true);
                bComma.setEnabled(true);
                boolComma = true;
                break;

          /*  case R.id.b_percent:
                tv_input.append("%");
                break;*/
        }

    }


    public void algebRun() {
        String str = tv_input.getText().toString();

        str = str.replaceAll("-", "+-");
        str = str.replaceAll("x\\+", "x");
        str = str.replaceAll("/\\+", "/");
        str = str.replace(',', '.');

        String gap = "";

        int i, j = 0;
        char ch;

        for (i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if ("/x+".indexOf(ch) < 0) {
                gap += ch;
            } else {
                masA[j] = ch;
                if (!gap.equals("")) {
                    masN[j++] = Double.parseDouble(gap);
                }
                gap = "";
            }
        }
        masN[j] = Double.parseDouble(gap);

        i = 0;
        int end = j;

        for (int k = 0; k < j; k++) {
            if ((masA[i] == 'x') || (masA[i] == '/')) {
                masN[i+1] = operation(masN[i], masN[i+1], masA[i]);
                movingElem(i, end--);
            } else {
                i++;
            }
        }

        i = 0;
        if (masA[0] == '+') {
            for (int k = 0; k <= end; k++) {
                masN[i + 1] = operation(masN[i], masN[i + 1], masA[i]);
                movingElem(i, end--);
            }
        }

        setBtnEneb(true);
        if (Double.isInfinite(masN[0])){
            tv_output.setText("Нельзя делить на 0");
            bEqually.setEnabled(false);

        } else {
            tv_output.setText(df.format(masN[0]));
            bEqually.setEnabled(true);
        }
    }


    public double operation(double x, double y, char action) {
        double z = 0;

        switch (action) {
            case '/':
                z = x / y;
                break;

            case 'x':
                z = x * y;
                break;

            case '+':
                z = x + y;
                break;
        }

        return z;
    }


    public static void movingElem(int index, int endIndex) {
        for (int i = index; i < endIndex; i++) {
            masN[i] = masN[i+1];
            masA[i] = masA[i+1];
        }
        masN[endIndex] = 0;
    }


    public void setBtnEneb(boolean bool) {
        bDivide.setEnabled(bool);
        bMultiply.setEnabled(bool);
        bDel.setEnabled(bool);
        bPlus.setEnabled(bool);
//        bComma.setEnabled(bool);
    }


    public void replacementChar(String s) {
        String text, endText;
        for (int i = 1; i <= 2; i++) {
            text  = tv_input.getText().toString();
            endText = text.substring(text.length() - 1, text.length());
            if (s.contains(endText)) {
                tv_input.setText(text.substring(0, text.length() - 1));
            }
        }
    }
}
