package edu.gsu.httpscs.assignment1;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import edu.gsu.httpscs.assignment1.adapter.BaseViewPagerAdapter;
import edu.gsu.httpscs.assignment1.fragment.BlueFragment;
import edu.gsu.httpscs.assignment1.fragment.GreenFragment;
import edu.gsu.httpscs.assignment1.fragment.RedFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList <Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onCreate ");
        viewPager = (ViewPager) findViewById(R.id.activity_view_pager);
        list.add(new RedFragment());
        list.add(new GreenFragment());
        list.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(1);
    }

    public ViewPagerActivity(){
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart ");
    }
}
