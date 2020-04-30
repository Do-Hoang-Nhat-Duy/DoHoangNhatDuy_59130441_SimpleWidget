package vn.edu.ntu.nhatduy.dohoangnhatduy_59130441_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtDate, edtSTKhac;
    RadioGroup rdg;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnxn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }
    void addView(){
        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        edtSTKhac = findViewById(R.id.edtSTKhac);

        rdg = findViewById(R.id.rdg);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        btnxn = findViewById(R.id.btnxn);

    }
    void addEvents(){
        btnxn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                text += edtName.getText().toString();
                text += "\nNgày sinh: " + edtDate.getText().toString();

                switch (rdg.getCheckedRadioButtonId())
                {
                    case R.id.rdb1: text += "\nGiới tính: Nam";break;
                    case R.id.rdb2: text += "\nGiới tính: Nữ";break;
                }
                text += "\nSở thích :";
                if (cb1.isChecked()) text += cb1.getText().toString() + ";";
                if (cb2.isChecked()) text += cb2.getText().toString() + ";";
                if (cb3.isChecked()) text += cb3.getText().toString() + ";";
                if (cb4.isChecked()) text += cb4.getText().toString() + ";";
                if (cb5.isChecked()) text += cb5.getText().toString() + ";";

                text += ";" + edtSTKhac.getText().toString();

                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();
            }
        });

    }
}
