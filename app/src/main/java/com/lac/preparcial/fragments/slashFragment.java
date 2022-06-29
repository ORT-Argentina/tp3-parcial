package com.lac.preparcial.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.lac.preparcial.R;
import com.lac.preparcial.activities.MainActivity;
import com.lac.preparcial.activities.SecondaryActivity;


public class slashFragment extends Fragment {

    Button btnIngreso;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_slash, container, false);
        btnIngreso = vista.findViewById(R.id.bIngresoSlash);

        return vista;

    }

    @Override
    public void onStart() {
        super.onStart();

        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
      /*          NavDirections accion = slashFragmentDirections.actionSlashFragmentToHome3();
                Navigation.findNavController(view).navigate(accion);*/
                Intent i = new Intent(getContext(), SecondaryActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });

    }
}