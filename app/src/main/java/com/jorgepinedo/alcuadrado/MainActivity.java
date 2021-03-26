package com.jorgepinedo.alcuadrado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AlCuadradoMVP.View {

    private AlCuadradoMVP.Presenter presenter;

    private EditText ed_amount;
    private TextView tv_response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_amount=findViewById(R.id.ed_amount);
        tv_response=findViewById(R.id.tv_response);
        presenter = new AlCuadradoPresenter(this);
    }

    public void calculate(View view){
        presenter.doOperation(ed_amount.getText().toString());
    }

    @Override
    public void showMessage(String message) {
        tv_response.setText(message);
    }

    @Override
    public void showError(String error) {
        tv_response.setText(error);
    }
}
