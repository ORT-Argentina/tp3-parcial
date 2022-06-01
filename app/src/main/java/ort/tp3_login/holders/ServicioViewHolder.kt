package ort.tp3_login.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import ort.tp3_login.R

class ServicioViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    private var view : View
    init {
        this.view = v
    }

    fun setNames (titulo: String, nombreGuia: String) {
        var notificationText : TextView = view.findViewById(R.id.notificationtext)
        var fecha : TextView = view.findViewById(R.id.notificationTime)


        notificationText.text = titulo
        fecha.text = nombreGuia

    }

    fun getCardLayout () : CardView {
        return view.findViewById(R.id.card_package_item)
    }
}