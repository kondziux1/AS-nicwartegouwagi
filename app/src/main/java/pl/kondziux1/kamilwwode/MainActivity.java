package pl.kondziux1.kamilwwode;

import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCompat;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    DisplayMetrics chujsss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            chujsss = v.getResources().getDisplayMetrics();
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        Button cipa = (Button) findViewById(R.id.lefttop);
        Button lefttop;
        Button leftmiddle;
        Button leftdown;
        Button middletop;
        Button Controller;
        TextView seram = findViewById(R.id.textView);

        float chuj = cipa.getX();



        ImageView sex = findViewById(R.id.cipadwa);

        float fiut = sex.getPivotX();
        cipa.setOnClickListener(v -> {
            MediaPlayer song = MediaPlayer.create(MainActivity.this,R.raw.meow);
            song.start();
            ObjectAnimator anim = ObjectAnimator.ofFloat(sex,"X",100f);

        });
    }






}