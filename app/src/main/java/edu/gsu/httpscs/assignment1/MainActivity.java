package edu.gsu.httpscs.assignment1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import edu.gsu.httpscs.assignment1.fragment.DemoFragment;
import edu.gsu.httpscs.assignment1.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalView();
        setListener();
    }

    private void initalView() {
       tv_demo = (TextView)findViewById(R.id.activity_tool_title);
        tv_work = (TextView)findViewById(R.id.activity_tool_work);

    }

    private void setListener() {
      final   WorkFragment workFragment = new WorkFragment();
        final DemoFragment demofragment = new DemoFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,demofragment).commit();

        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,demofragment).commit();
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_work.setTextColor(Color.RED);
                tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,workFragment).commit();
            }
        };
       tv_work.setOnClickListener(listener);
    }

    public void login(View v){
        Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT).show();
    }


}
