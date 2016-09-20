package com.example.rm40300.androidmultitelas;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaItensFragment extends Fragment {

    private ArrayAdapter<Item> adapter;
    private ListView lvItens;

    public ListaItensFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lista_itens, container, false);

        lvItens = (ListView) v.findViewById(R.id.lvItens);
        lvItens.setAdapter(adapter);

        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_activated_1,
                Item.getItens());
    }
}
