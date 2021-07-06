package com.example.fill_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mBtnmainright;
    private EditText mEtmainorg;
    private EditText mEtmainname;
    private EditText mEtmainphone;
    private EditText mEtmainemail;
    private EditText mEtmainaddress;
    private EditText mEtmaintaxid;
    private EditText mEtmaincompanyid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnmainright = findViewById(R.id.btnSecondright);
        mEtmainorg = findViewById(R.id.etsecondorg);
        mEtmainname = findViewById(R.id.etsecondname);
        mEtmainphone = findViewById(R.id.etseondphone);
        mEtmainemail = findViewById(R.id.etsecondemail);
        mEtmainaddress = findViewById(R.id.etmainaddress);
        mEtmaintaxid = findViewById(R.id.etsecondtaxid);
        mEtmaincompanyid = findViewById(R.id.etsecondcompanyid);

        mBtnmainright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("org",mEtmainorg.getText().toString());
                intent.putExtra("name",mEtmainname.getText().toString());
                intent.putExtra("phone",mEtmainphone.getText().toString());
                intent.putExtra("email",mEtmainemail.getText().toString());
                intent.putExtra("address",mEtmainaddress.getText().toString());
                intent.putExtra("taxid",mEtmaintaxid.getText().toString());
                intent.putExtra("companyid",mEtmaincompanyid.getText().toString());
                startActivity(intent);
            }
        });
    }
}