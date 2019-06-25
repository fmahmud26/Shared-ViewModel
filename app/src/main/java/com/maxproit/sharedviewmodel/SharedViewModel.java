package com.maxproit.sharedviewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

public class SharedViewModel extends AndroidViewModel {

    private MutableLiveData<CharSequence> text = new MutableLiveData<>();
    private Application app;

    public SharedViewModel(@NonNull Application application) {
        super(application);
        app = application;
    }

    public void setText(CharSequence text) {

        this.text.setValue(text);
    }

    public MutableLiveData<CharSequence> getText() {
        return text;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Toast.makeText(app, "onCleared", Toast.LENGTH_SHORT).show();

    }
}
