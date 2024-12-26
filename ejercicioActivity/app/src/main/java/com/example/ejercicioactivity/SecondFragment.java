package com.example.ejercicioactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    private static final String ARG_MESAGGE = "message";
    private String message;

    public static SecondFragment newInstance(String message){
        SecondFragment secondFragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_MESAGGE,message);
        secondFragment.setArguments(args);
        return  secondFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            message = getArguments().getString(ARG_MESAGGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView mensaje = view.findViewById(R.id.text_message);
        mensaje.setText(message);
    }
}