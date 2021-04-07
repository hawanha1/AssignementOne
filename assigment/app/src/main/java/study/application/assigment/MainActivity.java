package study.application.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.english).setOnClickListener(this);
        findViewById(R.id.urdu).setOnClickListener(this);
        findViewById(R.id.counting).setOnClickListener(this);
    }

    public void onClick(View view){
        switch(view.getId()) {
            case R.id.english:
                startActivity(new Intent(this,englishActivity.class));
                break;
            case R.id.urdu:
                startActivity(new Intent(this,urduActivity.class));
                break;
            case R.id.counting:
                startActivity(new Intent(this,countingActivity.class));
                break;
        }
    }
}