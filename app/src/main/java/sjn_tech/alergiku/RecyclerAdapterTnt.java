package sjn_tech.alergiku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Azi on 2/14/2017.
 */

public class RecyclerAdapterTnt extends RecyclerView.Adapter<RecyclerViewHolderTnt> {

    private final Context context;

    String [] nama = {"Apa yang menyebabkan memicu alergi?", "Apa tips dan trik untuk mengatasi dan mencegah alergi?"};
    int [] gambar = {R.drawable.tandatanya, R.drawable.tnt};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapterTnt(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolderTnt onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list_tnt, parent, false);

        RecyclerViewHolderTnt viewHolderTnt = new RecyclerViewHolderTnt(v);
        return viewHolderTnt;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderTnt holder, int position) {
        holder.txt_judul_tnt.setText(nama[position]);
        holder.txt_judul_tnt.setOnClickListener(clickListener);
        holder.txt_judul_tnt.setTag(holder);

        holder.img_icon_tnt.setImageResource(gambar[position]);
        holder.img_icon_tnt.setOnClickListener(clickListener);
        holder.img_icon_tnt.setTag(holder);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolderTnt vholder = (RecyclerViewHolderTnt) v.getTag();
            int position = vholder.getPosition();

            if (position == 0) {
                Intent intent = new Intent(context.getApplicationContext(), IsiTipsAndTrick1.class);
                context.startActivity(intent);
            } else if (position == 1) {
                Intent intent = new Intent(context.getApplicationContext(), IsiTipsAndTrick2.class);
                context.startActivity(intent);
            }
        }
    };

    @Override
    public int getItemCount() {
        return nama.length;
    }
}
