package sjn_tech.alergiku;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Azi on 2/8/2017.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1, tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.txt_judul);
        tv2 = (TextView) itemView.findViewById(R.id.txt_deskripsi);
        imageView = (ImageView) itemView.findViewById(R.id.img_gambar);
    }
}
