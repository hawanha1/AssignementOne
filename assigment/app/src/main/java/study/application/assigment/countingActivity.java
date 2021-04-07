package study.application.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class countingActivity extends AppCompatActivity {
    MediaPlayer mp;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);
    }
    public void clickOnImage(View view) {
        switch (view.getId()) {
            case R.id.img12:
                mp = MediaPlayer.create(this, R.raw.audio12);
                mp.start();
                iv = findViewById(R.id.img12);
                iv.animate().rotation(720).setDuration(2000);
                break;
            case R.id.img34:
                mp = MediaPlayer.create(this, R.raw.audio34);
                mp.start();
                iv = findViewById(R.id.img34);
                iv.animate().translationXBy(-500).setDuration(500);
                break;
            case R.id.img56:
                mp = MediaPlayer.create(this, R.raw.audio56);
                mp.start();
                iv = findViewById(R.id.img56);
                iv.animate().translationX(-500).setDuration(2000);
                break;
            default:
                mp = MediaPlayer.create(this, R.raw.audio78);
                mp.start();
                iv = findViewById(R.id.img78);
                iv.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                break;
        }
    }
}