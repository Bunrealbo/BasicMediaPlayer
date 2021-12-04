package appx.s.learn.media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ImageView ivArtist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivArtist = findViewById(R.id.iv_artist);
        Runnable loadIvArtist = () -> Picasso.get().load(Uri.parse("https://bunrealbo.github.io/assets-media-player/lac_troi.jpeg")).into(ivArtist);
        loadIvArtist.run();
        Runnable runAnim = ()-> {
            Animation animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_rotate);
            ivArtist.startAnimation(animRotate);
        };
        runAnim.run();


        try {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), Uri.parse("https://bunrealbo.github.io/assets-media-player/lac_troi.mp3"));
            mediaPlayer.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}