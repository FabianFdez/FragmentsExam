package com.example.fragmentsexam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class ListFragmentos extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lista_fragmento, container, false);
        ListView list = (ListView)view.findViewById(R.id.lista);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.paises, android.R.layout.simple_list_item_2 );
        list.setAdapter(arrayAdapter);
        return view;
    }
}
