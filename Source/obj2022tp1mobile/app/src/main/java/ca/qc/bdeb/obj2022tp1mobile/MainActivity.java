package ca.qc.bdeb.obj2022tp1mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Choreographer;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mDefaultNavigationView;
    Fragment mMainFragment = new MainFragment();
    Fragment mControleFragment = new ControleFragment();
    Fragment mGraphicFragment = new GraphicFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, mMainFragment).commit();
        mDefaultNavigationView = findViewById(R.id.bottomNavigationView);
        mDefaultNavigationView.setSelectedItemId(R.id.home);
        mDefaultNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            switch (id) {
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, mMainFragment).commit();
                    return true;
                case R.id.controle:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, mControleFragment).commit();
                    return true;
                case R.id.graphics:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, mGraphicFragment).commit();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        });


    }
}