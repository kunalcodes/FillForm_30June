package com.example.fill_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    private ImageButton mBtnsecondright;
    private EditText mEtsecondorg;
    private EditText mEtsecondname;
    private EditText mEtsecondphone;
    private EditText mEtsecondemail;
    private EditText mEtsecondaddress;
    private EditText mEtsecondtaxid;
    private EditText mEtsecondcompanyid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mBtnsecondright = findViewById(R.id.btnSecondright);
        mEtsecondorg = findViewById(R.id.etsecondorg);
        mEtsecondname = findViewById(R.id.etsecondname);
        mEtsecondphone = findViewById(R.id.etseondphone);
        mEtsecondemail = findViewById(R.id.etsecondemail);
        mEtsecondaddress = findViewById(R.id.etmainaddress);
        mEtsecondtaxid = findViewById(R.id.etsecondtaxid);
        mEtsecondcompanyid = findViewById(R.id.etsecondcompanyid);

        if (getIntent() != null && getIntent().getExtras() != null){
            String org = getIntent().getStringExtra("org");
            String name = getIntent().getStringExtra("name");
            String phone = getIntent().getStringExtra("phone");
            String email = getIntent().getStringExtra("email");
            String address = getIntent().getStringExtra("address");
            String taxid = getIntent().getStringExtra("taxid");
            String companyid = getIntent().getStringExtra("companyid");

            mEtsecondorg.setText(org);
            mEtsecondname.setText(name);
            mEtsecondphone.setText(phone);
            mEtsecondemail.setText(email);
            mEtsecondaddress.setText(address);
            mEtsecondtaxid.setText(taxid);
            mEtsecondcompanyid.setText(companyid);
        }

    }
}