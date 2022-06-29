package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link splashFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class splashFragment extends Fragment {


    // TODO: Rename and change types of parameters
    private Button btnInicioSpash;
    private EditText tvSubtitulo;

    public splashFragment() {
        // Required empty public constructor
    }

    public static splashFragment newInstance(String param1, String param2) {
        splashFragment fragment = new splashFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_splash, container, false);


        this.btnInicioSpash = (Button)view.findViewById(R.id.btnInicioSpash);
        this.btnInicioSpash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }
}