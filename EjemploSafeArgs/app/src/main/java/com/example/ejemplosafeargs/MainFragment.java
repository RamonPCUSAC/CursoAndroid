package com.example.ejemplosafeargs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplosafeargs.adapters.PersonAdapter;
import com.example.ejemplosafeargs.databinding.FragmentMainBinding;
import com.example.ejemplosafeargs.models.Person;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {

    private FragmentMainBinding binding;
    private MainFragmentArgs args;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);
        args = MainFragmentArgs.fromBundle(getArguments());
        binding.userName.setText(args.getUser());
        binding.recylerList.setLayoutManager(new LinearLayoutManager(requireContext()));
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ramon"));
        personList.add(new Person("Fernando"));
        personList.add(new Person("Denisse"));
        personList.add(new Person("Marjorie"));
        personList.add(new Person("Ramon"));
        personList.add(new Person("Fernando"));
        personList.add(new Person("Denisse"));
        personList.add(new Person("Marjorie"));
        personList.add(new Person("Ramon"));
        personList.add(new Person("Fernando"));
        personList.add(new Person("Denisse"));
        personList.add(new Person("Marjorie"));
        personList.add(new Person("Ramon"));
        personList.add(new Person("Fernando"));
        personList.add(new Person("Denisse"));
        personList.add(new Person("Marjorie"));
        personList.add(new Person("Ramon"));
        personList.add(new Person("Fernando"));
        personList.add(new Person("Denisse"));
        personList.add(new Person("Marjorie"));


        PersonAdapter adapter = new PersonAdapter(personList);
        binding.recylerList.setAdapter(adapter);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}