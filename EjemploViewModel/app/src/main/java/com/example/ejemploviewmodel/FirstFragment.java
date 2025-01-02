package com.example.ejemploviewmodel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemploviewmodel.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private SharedViewModel viewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        binding.botonContinuar.setOnClickListener(view -> {
            viewModel.setText(binding.editText.getText().toString());
            Navigation.findNavController(view).navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment());
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}