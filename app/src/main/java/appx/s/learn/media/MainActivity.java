package appx.s.learn.media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Picasso.get().load(Uri.parse("https://bunrealbo.github.io/assets-media-player/lac_troi.jpeg")).into((ImageView) findViewById(R.id.iv_artist));
        try {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), Uri.parse("https://bunrealbo.github.io/assets-media-player/lac_troi.mp3"));
            mediaPlayer.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}