package sjn_tech.alergiku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    ImageView img_mainView;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.middle_title_bar);

        img_mainView = (ImageView) findViewById(R.id.img_mainView);
        Picasso.with(getApplicationContext())
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Alergiku_MAGE17/micro_zps2ystxtvn.jpg")
                .into(img_mainView);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerAdapter adapter = new RecyclerAdapter(this);
        //membuat adapter baru untuk reyclerview
        recyclerView.setAdapter(adapter);
        //menset nilai dari adapter
        recyclerView.setHasFixedSize(true);
        //menset setukuran
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini
    }
}
