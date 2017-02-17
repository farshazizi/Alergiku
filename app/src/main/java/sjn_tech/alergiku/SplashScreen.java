package sjn_tech.alergiku;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 2000;

    ImageView img_splash_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        img_splash_screen = (ImageView) findViewById(R.id.img_splash_screen);
        Picasso.with(getApplicationContext())
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Alergiku_MAGE17/logo_zpscnrtvb1a.png")
                .into(img_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashScreen.this, Welcome.class);
                startActivity(i);
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub
            }
        }, splashInterval);
    }
}