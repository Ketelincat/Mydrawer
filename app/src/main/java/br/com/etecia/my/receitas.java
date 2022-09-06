package br.com.etecia.my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GalleryFragment extends Fragment {
    ListView LSreceitas;

    String tituloGallery[] = {"Livro", "Bicicleta", "Carro", "Moto"};
    int imagemGallery[] = {R.drawable.livro, R.drawable.bike,
            R.drawable.carro, R.drawable.moto};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        LSreceitas = view.findViewById(R.id.idListareceitas);

        MyAdapterGallery adapterGallery = new MyAdapterGallery();

        LSreceitas.setAdapter(adapterGallery);


        return view;
    }

    public class MyAdapterGallery extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemGallery.length;
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
            ImageView imgGallery;
            TextView txtGalery;


            View v = getLayoutInflater().inflate(R.layout.modelo_gallery, null);

            imgGallery = v.findViewById(R.id.modeloImagemGallery);
            txtGalery = v.findViewById(R.id.modeloTxtImagem);

            imgGallery.setImageResource(imagemGallery[i]);
            txtGalery.setText(tituloGallery[i]);


            return v;
        }
    }
}