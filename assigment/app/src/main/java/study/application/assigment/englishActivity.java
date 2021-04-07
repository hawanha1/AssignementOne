package study.application.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;

import org.w3c.dom.Text;

import java.util.Locale;

public class englishActivity extends AppCompatActivity {

    //    private TextToSpeech mTTS;
//    private EditText mEditText;
//    private SeekBar mSeekBarPitch;
//    private SeekBar mSeekBarSpeed;
//    private Button mButtonSpeak;
//
    MediaPlayer mp;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
//
//
//
//        mButtonSpeak=findViewById(R.id.button_speak);
//        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int status) {
//                if(status==TextToSpeech.SUCCESS){
//                    int result = mTTS.setLanguage(Locale.US);
//                    if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
//                        Log.e("tts","language not supported");
//                    }else{
//                        mButtonSpeak.setEnabled(true);
//                    }
//                }else{
//                    Log.e("tts","intialization failed");
//                }
//            }
//        });
//
//        mEditText=findViewById(R.id.edit_text);
//        mSeekBarPitch=findViewById(R.id.seek_bar_pitch);
//        mSeekBarSpeed=findViewById(R.id.seek_bar_speed);
//        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                speak();
//            }
//        });
//    }
//
//
//
//    private void speak(){
//        String text = mEditText.getText().toString();
//        float pitch = (float)mSeekBarPitch.getProgress()/50;
//        if(pitch<0.1) pitch=0.1f;
//        float speed = (float)mSeekBarSpeed.getProgress()/50;
//        if(speed<0.1) speed=0.1f;
//
//        mTTS.setPitch(pitch);
//        mTTS.setSpeechRate(speed);
//
//        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH,null);
//    }
//    @Override
//    protected void onDestroy() {
//        if(mTTS!=null){
//            mTTS.stop();
//            mTTS.shutdown();
//        }
//        super.onDestroy();
//    }
    }

    public void clickOnImage(View view) {
        switch (view.getId()){
            case R.id.aimg:
                mp = MediaPlayer.create(this,R.raw.a);
                mp.start();
                iv = findViewById(R.id.aimg);
                iv.animate().rotation(720).setDuration(2000);
                break;
            case R.id.bimg:
                mp = MediaPlayer.create(this,R.raw.b);
                mp.start();
                iv = findViewById(R.id.bimg);
                iv.animate().translationXBy(-500).setDuration(500);
                break;
            case R.id.cimg:
                mp = MediaPlayer.create(this,R.raw.c);
                mp.start();
                iv = findViewById(R.id.cimg);
                iv.animate().translationX(-500).setDuration(2000);
                break;
            default:
                mp = MediaPlayer.create(this,R.raw.d);
                mp.start();
                iv = findViewById(R.id.dimg);
                iv.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
                break;
        }
        //iv.animate().alpha(0).setDuration(500);
        //iv.animate().translationX(-500).setDuration(2000);
        //ImageView imageView = findViewById(R.id.imageView);

        //imageView.animate().alpha(0).setDuration(500);

        // imageView.animate().translationXBy(-500).setDuration(500);

         iv.animate().rotation(720).setDuration(2000);

        // imageView.animate().rotation(720).alpha(0).setDuration(2000);

        // imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        // imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }
}