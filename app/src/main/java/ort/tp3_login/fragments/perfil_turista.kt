package ort.tp3_login.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.tp3_login.R
import ort.tp3_login.adapters.ServicioAdapter
import ort.tp3_login.entities.ServicioCard


class perfil_turista : Fragment() {
    lateinit var view1 : View
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ServicioAdapter

    //var cardsTuristaLista : MutableList<ServicioCard> = ArrayList<ServicioCard>()

    var cardsTuristaLista = mutableListOf<ServicioCard>(
        ServicioCard("ajlsdñjkfasdjf", "15-12-22"),
        ServicioCard("ajlsdñjkfasdjf", "15-12-22"),
        ServicioCard("ajlsdñjkfasdjf", "15-12-22")
    )

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1 =   inflater.inflate(R.layout.fragment_perfil_turista, container, false)
        recyclerView = view1.findViewById(R.id.recyclerViewHomeTurista)

        return view1

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //configuraciòn obligatoria recyclerview
        recyclerView.hasFixedSize()
        linearLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = linearLayoutManager


        adapter = ServicioAdapter(cardsTuristaLista)

        recyclerView.adapter = adapter

    }




}