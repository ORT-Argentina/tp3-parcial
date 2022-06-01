package ort.tp3_login.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.tp3_login.R
import ort.tp3_login.entities.ServicioCard
import ort.tp3_login.holders.ServicioViewHolder

class ServicioAdapter(
    private var servicioList: MutableList<ServicioCard>
)  : RecyclerView.Adapter<ServicioViewHolder>()
{
    override fun onBindViewHolder(holder: ServicioViewHolder, position: Int) {

        holder.setNames(
            servicioList[position].notification,
            servicioList[position].fecha
        )


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicioViewHolder {

        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design,parent,false)
        return ServicioViewHolder(view)
    }



    override fun getItemCount(): Int {

        return servicioList.size
    }

    fun setData(newData : ArrayList<ServicioCard>){
        this.servicioList = newData
        this.notifyDataSetChanged()
    }


}