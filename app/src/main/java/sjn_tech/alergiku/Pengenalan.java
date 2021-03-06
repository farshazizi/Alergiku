package sjn_tech.alergiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Pengenalan extends AppCompatActivity {

    TextView txt_paragraf1, txt_paragraf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengenalan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt_paragraf1 = (TextView) findViewById(R.id.txt_paragraf1);
        txt_paragraf2 = (TextView) findViewById(R.id.txt_paragraf2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
