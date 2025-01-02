package com.example.ejemploviewmodel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemploviewmodel.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private SharedViewModel viewModel;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        viewModel.getText().observe(getViewLifecycleOwner(),text -> {
            binding.subTitle.setText(text);
        });

        binding.continuar.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment());
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}