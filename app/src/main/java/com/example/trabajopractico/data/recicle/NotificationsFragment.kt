package com.example.trabajopractico.data.recicle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.R

class NotificationsFragment : Fragment() {


    // This property is only valid between onCreateView and
    // onDestroyView.
    lateinit var v: View

    lateinit var viewRecNotification: RecyclerView

    var notifications : MutableList<Notification> = ArrayList<Notification>()

    companion object {
        fun newInstance() = NotificationsFragment().apply {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        v = inflater.inflate(R.layout.fragment_notifications, container, false)
        viewRecNotification = v.findViewById(R.id.rev_notifications)
        return v
    }

    override fun onStart(){

        super.onStart();

        for(i in 1..100) {
            notifications.add(Notification("Texto falso $i"))
        }

        viewRecNotification.setHasFixedSize(true);
        viewRecNotification.layoutManager = LinearLayoutManager(context)
        viewRecNotification.adapter = NotificationsAdapter(notifications)

    }
}