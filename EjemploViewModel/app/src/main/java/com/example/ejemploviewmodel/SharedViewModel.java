package com.example.ejemploviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private final MutableLiveData<String> texto = new MutableLiveData<>();

    public void setText(String text){
        texto.setValue(text);
    }

    public LiveData<String> getText(){
        return texto;
    }

    public void resetText(){
        texto.setValue("");
    }
}
