package sjn_tech.alergiku;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Azi on 2/14/2017.
 */

public class RecyclerViewHolderTnt extends RecyclerView.ViewHolder {

    ImageView img_icon_tnt;
    TextView txt_judul_tnt;

    public RecyclerViewHolderTnt(View itemView) {
        super(itemView);

        img_icon_tnt = (ImageView) itemView.findViewById(R.id.img_icon_tnt);
        txt_judul_tnt = (TextView) itemView.findViewById(R.id.txt_judul_tnt);
    }
}
