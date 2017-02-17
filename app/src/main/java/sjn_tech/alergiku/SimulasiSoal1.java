package sjn_tech.alergiku;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class SimulasiSoal1 extends FragmentActivity implements View.OnClickListener {

    CheckBox checkbox_ya, checkbox_tidak;

    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi_soal1);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        checkbox_ya = (CheckBox) findViewById(R.id.checkbox_ya);
        checkbox_tidak = (CheckBox) findViewById(R.id.checkbox_tidak);

        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();

        SimulasiSoal2 simulasiSoal2 = new SimulasiSoal2();
        transaction.add(R.id.frame, simulasiSoal2);
        transaction.commit();
    }

    public void SimulasiSoal2(View view)
    {
        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();

        SimulasiSoal2 simulasiSoal2 = new SimulasiSoal2();
        transaction.replace(R.id.frame, simulasiSoal2);
        transaction.commit();
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

    @Override
    public void onClick(View v) {
        if (checkbox_ya.isChecked()) {

        }
    }
}
