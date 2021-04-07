package study.application.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class urduActivity extends AppCompatActivity {

    MediaPlayer mp;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urdu);
    }
    public void clickOnImage(View view) {
        switch (view.getId()) {
            case R.id.alifimg:
                mp = MediaPlayer.create(this, R.raw.alif);
                mp.start();
                iv = findViewById(R.id.alifimg);
                iv.animate().rotation(720).setDuration(2000);
                break;
            case R.id.bayimg:
                mp = MediaPlayer.create(this, R.raw.bay);
                mp.start();
                iv = findViewById(R.id.bayimg);
                iv.animate().translationXBy(-500).setDuration(500);
                break;
            case R.id.tayimg:
                mp = MediaPlayer.create(this, R.raw.tay);
                mp.start();
                iv = findViewById(R.id.tayimg);
                iv.animate().translationX(-500).setDuration(2000);
                break;
            default:
                mp = MediaPlayer.create(this, R.raw.tha);
                mp.start();
                iv = findViewById(R.id.thaimg);
                iv.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                break;
        }
    }
}