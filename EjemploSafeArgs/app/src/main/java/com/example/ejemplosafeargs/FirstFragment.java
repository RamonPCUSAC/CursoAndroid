package com.example.ejemplosafeargs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplosafeargs.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private FirstFragmentArgs args;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);
        args = FirstFragmentArgs.fromBundle(getArguments());

        binding.button.setOnClickListener(view -> {
            FirstFragmentDirections.ActionFirstFragmentToMainFragment action = FirstFragmentDirections.actionFirstFragmentToMainFragment();
            action.setPassword(binding.editTextTextPassword.getText().toString());
            action.setUser(args.getUser());
            Navigation.findNavController(view).navigate(action);
        });
        // Inflate the layout for this fragment
        return binding.getRoot();

    }

}