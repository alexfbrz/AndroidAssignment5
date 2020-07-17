package com.example.alexf.a5_william;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup bgTxt;
    CheckBox backgroundColor, textColor;
    TextView backgroundColorText, textColorTxt, txtClr1, txtClr2, txtClr3, redTV, greenTV, blueTV, tv;
    SeekBar redSB, greenSB, blueSB;
    int red, green, blue;
    String hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgTxt = findViewById(R.id.bgTxt);
        backgroundColor = findViewById(R.id.backgroundColor);
        textColor = findViewById(R.id.textColor);
        backgroundColorText = findViewById(R.id.backgroundColorTxt);
        textColorTxt = findViewById(R.id.textColorTxt);
        txtClr1 = findViewById(R.id.txtClr1);
        txtClr2 = findViewById(R.id.txtClr2);
        txtClr3 = findViewById(R.id.txtClr3);
        tv = findViewById(R.id.tv);
        redTV = findViewById(R.id.redTV);
        greenTV = findViewById(R.id.greenTV);
        blueTV = findViewById(R.id.blueTV);
        redSB = findViewById(R.id.redSB);
        greenSB = findViewById(R.id.greenSB);
        blueSB = findViewById(R.id.blueSB);


        bgTxt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                RadioButton bgTxt = findViewById(i);

                switch (bgTxt.getText().toString())
                {
                    case "Background Color":
                        redSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                red = redSB.getProgress();
                                redTV.setText(String.valueOf(red));
                                setBackgroundColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                backgroundColorText.setText(hex);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });

                        greenSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                green = greenSB.getProgress();
                                greenTV.setText(String.valueOf(green));
                                setBackgroundColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                backgroundColorText.setText(hex);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });

                        blueSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                blue = blueSB.getProgress();
                                blueTV.setText(String.valueOf(blue));
                                setBackgroundColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                backgroundColorText.setText(hex);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });

                        tv.setBackgroundColor(Color.rgb(red, green, blue));

                        /*
                        backgroundColor.setOnCheckedChangeListener((buttonView, isChecked)->{
                            String hex = String.format("#%02X%02X%02X", red, green, blue);
                            if(backgroundColor.isChecked())
                            {
                                backgroundColorText.setText(String hex = String.format ("#%02X%02X%02X", red, green, blue));
                            }
                        });
                        */
                        break;

                    case  "Text Color":
                        redSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                red = redSB.getProgress();
                                redTV.setText(String.valueOf(red));
                                setTextColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                textColorTxt.setText(hex);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });

                        greenSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                green = greenSB.getProgress();
                                greenTV.setText(String.valueOf(green));
                               setTextColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                textColorTxt.setText(hex);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });

                        blueSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                blue = blueSB.getProgress();
                                blueTV.setText(String.valueOf(blue));
                                setTextColor();
                                hex = String.format("#%02X%02X%02X", red, green, blue);
                                textColorTxt.setText(hex);

                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });


                        /*
                        textColor.setOnCheckedChangeListener((buttonView, isChecked)->{
                            hex = String.format("#%02X%02X%02X", red, green, blue);
                            if(textColor.isChecked())
                            {
                                textColorTxt.set(hex);
                            }
                        });
                        */
                        break;

                }

            }
        });


        textColor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(textColor.isChecked())
                {
                    textColorTxt.setVisibility(View.VISIBLE);
                }
                else
                {
                    textColorTxt.setVisibility(View.GONE);
                }
            }
        });

        backgroundColor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(backgroundColor.isChecked())
                {
                    backgroundColorText.setVisibility(View.VISIBLE);
                }
                else
                {
                    backgroundColorText.setVisibility(View.GONE);
                }
            }
        });


    }

    public void setTextColor()
    {
        txtClr1.setTextColor(Color.rgb(red, green, blue));
        txtClr2.setTextColor(Color.rgb(red, green, blue));
        txtClr3.setTextColor(Color.rgb(red, green, blue));
    }

    public void setBackgroundColor()
    {
        tv.setBackgroundColor(Color.rgb(red, green, blue));
    }
}
