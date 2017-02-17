package sjn_tech.alergiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class TipsAndTrick extends AppCompatActivity {

    RecyclerView recyclerViewTnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_trick);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewTnt = (RecyclerView) findViewById(R.id.recyclerViewTnt);

        RecyclerAdapterTnt adapterTnt = new RecyclerAdapterTnt(this);
        //membuat adapter baru untuk reyclerview
        recyclerViewTnt.setAdapter(adapterTnt);
        //menset nilai dari adapter
        recyclerViewTnt.setHasFixedSize(true);
        //menset setukuran
        recyclerViewTnt.setLayoutManager(new LinearLayoutManager(this));
        //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini
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
