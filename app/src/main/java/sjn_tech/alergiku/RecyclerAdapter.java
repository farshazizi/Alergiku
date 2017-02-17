package sjn_tech.alergiku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Azi on 2/8/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private final Context context;

    String [] name = {"Pengenalan", "Tips & Trik", "Simulasi", "Tentang Kami"};
    String [] desk = {"Apa sih alergi itu?", "Menghindari alergi", "Kenali alergi dengan simulasi sederhana", "Memperkenalkan kami"};
    int [] icon = {R.drawable.perkenalan, R.drawable.tnt, R.drawable.simulasi, R.drawable.aboutus};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.judul.setText(name[position]);
        holder.judul.setOnClickListener(clickListener);
        holder.judul.setTag(holder);

        holder.deskripsi.setText(desk[position]);
        holder.deskripsi.setOnClickListener(clickListener);
        holder.deskripsi.setTag(holder);

        holder.imageView.setImageResource(icon[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            if (position == 0) {
                Intent intent = new Intent(context.getApplicationContext(), Pengenalan.class);
                context.startActivity(intent);
            } else if (position == 1) {
                Intent intent = new Intent(context.getApplicationContext(), TipsAndTrick.class);
                context.startActivity(intent);
            } else if (position == 2) {
                Intent intent = new Intent(context.getApplicationContext(), SimulasiSoal1.class);
                context.startActivity(intent);
            } else if (position == 3) {
                Intent intent = new Intent(context.getApplicationContext(), AboutUs.class);
                context.startActivity(intent);
            }
//            Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    public int getItemCount() {
        return name.length;
    }
}
