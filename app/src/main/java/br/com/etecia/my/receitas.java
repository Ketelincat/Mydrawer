package br.com.etecia.my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class receitas extends Fragment {
    ListView LSreceitas;

    String tituloReceita[] = {"Maxixe do reino", "capuchinha", "peixinho", "taioba", "bertalha"};
    int imagemReceita[] = {R.drawable.maxixe_do_reino, R.drawable.capuchinha,
            R.drawable.peixinho, R.drawable.taioba, R.drawable.bertalha};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_receitas, container, false);

        LSreceitas = view.findViewById(R.id.idListareceitas);

        MyAdapterreceitas adapterReceitas = new MyAdapterreceitas();

        LSreceitas.setAdapter(adapterReceitas);


        return view;
    }

    public class MyAdapterreceitas extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemReceita.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imgreceita;
            TextView txtreceita;


            View v = getLayoutInflater().inflate(R.layout.fragment_receitas, null);

            imgreceita = v.findViewById(R.id.modeloImagemReceita);
            txtreceita= v.findViewById(R.id.modeloTxtreceita);

            imgreceita.setImageResource(imagemReceita[i]);
            txtreceita.setText(tituloReceita[i]);


            return v;
        }
    }
}