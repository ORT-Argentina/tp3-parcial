package ort.tp3_login.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_login.*
import ort.tp3_login.R
import ort.tp3_login.adapters.ServicioAdapter
import ort.tp3_login.dataclasses.CategoriaItem
import ort.tp3_login.dataclasses.Categorias
import ort.tp3_login.dataclasses.ServicioService
import ort.tp3_login.dataclasses.Servicios
import ort.tp3_login.entities.ServicioCard
import ort.tp3_login.services.RetrofitInstance
import ort.tp3_login.viewModels.ViewModelHomeTurista
import retrofit2.Response


class home_turista : Fragment() {


    lateinit var view1 : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view1 = inflater.inflate(R.layout.fragment_home_turista, container, false)

        return view1
    }




}


