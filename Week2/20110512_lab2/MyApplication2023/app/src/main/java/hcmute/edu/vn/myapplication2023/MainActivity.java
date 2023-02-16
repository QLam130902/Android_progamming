package hcmute.edu.vn.myapplication2023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtSo1,txtSo2;
    TextView lblKetQua;
    Button btnTinhTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSo1 = findViewById(R.id.txtSo1);
        txtSo2 = findViewById(R.id.txtSo2);
        lblKetQua = findViewById(R.id.lblKetQua);
        btnTinhTong = findViewById(R.id.btnTinhTong);
    }
    public void tinhtong(View view)
    {
        double so1 = Double.parseDouble(txtSo1.getText().toString().trim());
        double so2 = Double.parseDouble(txtSo2.getText().toString().trim());
        double tong = so1 + so2;
        lblKetQua.setText(String.valueOf(tong));
    }
}