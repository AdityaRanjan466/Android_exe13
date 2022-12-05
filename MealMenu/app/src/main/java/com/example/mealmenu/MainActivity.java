package com.example.mealmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spnrMealMenu;
    ImageView imgMeal;
    EditText edtxtPrice, edtxtTotalPrice;
    SeekBar skbrQuantity;
    RadioGroup rdgrpTip;
    RadioButton rdbtnTip10, rdbtnTip15, rdbtnTip20;
    CheckBox chckbxConfirm;
    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnrMealMenu = findViewById(R.id.spnr_mealmenu);
        imgMeal = findViewById(R.id.imgvw_meal);
        edtxtPrice = findViewById(R.id.edtxt_price);
        edtxtTotalPrice = findViewById(R.id.edtxt_totalprice);
        skbrQuantity = findViewById(R.id.skbr_quantity);
        rdgrpTip = findViewById(R.id.rdgrp_tip);
        rdbtnTip10 = findViewById(R.id.rdbtn_ten);
        rdbtnTip15 = findViewById(R.id.rdbtn_fifteen);
        rdbtnTip20 = findViewById(R.id.rdbtn_twenty);
        chckbxConfirm = findViewById(R.id.chckbx_confirm);
        btnOrder = findViewById(R.id.btn_order);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.mealoptionsarray, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnrMealMenu.setAdapter(spinnerAdapter);

        MenuDetails.initList();

        spnrMealMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = adapterView.getSelectedItemPosition();
                imgMeal.setImageResource(MenuDetails.getImageResourceID(index));
                edtxtPrice.setText(""+MenuDetails.getPrice(index));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}