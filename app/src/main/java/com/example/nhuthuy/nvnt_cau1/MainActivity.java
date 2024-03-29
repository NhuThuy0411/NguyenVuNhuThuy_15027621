package com.example.nhuthuy.nvnt_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText taik, taik1;
    CheckBox luu;
    Button dangnhap;
    Button out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taik = (EditText)findViewById(R.id.ed_taiKhoan);
        taik1 = (EditText)findViewById(R.id.ed_taiKhoan1);
        luu = (CheckBox)findViewById(R.id.ckb_luuTT);

        dangnhap = (Button)findViewById(R.id.btn_dangNhap);

        dangnhap.setOnClickListener(new View.OnClickListener()
        {
            @Override
                public void onClick(View view) {
                String chuoia = taik.getText().toString();
                String chuoib = taik1.getText().toString();
                if (chuoia .isEmpty() || chuoia .length() == 0 || chuoia .equals("") || chuoia == null){
                    Toast.makeText(MainActivity.this,"Tài khoản chưa có dữ liệu!",Toast.LENGTH_LONG).show();

                }else if (chuoib .isEmpty() || chuoib .length() == 0 || chuoib .equals("") || chuoib == null){
                    Toast.makeText(MainActivity.this,"Tài khoản chưa có dữ liệu!",Toast.LENGTH_LONG).show();

                } else {
                    if(luu.isChecked()){
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                    }
                }
            }

        });

        out = (Button)findViewById(R.id.btn_thoat);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");
                builder.setMessage("Bạn có muốn thoát không?");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });

    }
}
