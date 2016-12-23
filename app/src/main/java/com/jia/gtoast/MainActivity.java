package com.jia.gtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jia.gtoast.widget.GToast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener
{
    /** View */
    private Button btnTest1;
    private Button btnTest2;
    /**********************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        btnTest1 = (Button)findViewById(R.id.btn_test1);
        btnTest2 = (Button)findViewById(R.id.btn_test2);

        initData();
    }

    private void initData(){
        btnTest1.setOnClickListener(this);
        btnTest2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test1:
                GToast.i.show("test1...test1...test1.Important thing is to say three times!");
                break;
            case R.id.btn_test2:
                GToast.i.show("Give you thirty-two praise!");
                break;
        }
    }
}
