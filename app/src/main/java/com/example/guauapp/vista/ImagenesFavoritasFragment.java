package com.example.guauapp.vista;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guauapp.R;
import com.example.guauapp.adaptador.AdaptadorListaFavoritos;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImagenesFavoritasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImagenesFavoritasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    List<String> listaImagenesFavoritos;

    private RecyclerView reciclaImagenesFavoritos;

    AdaptadorListaFavoritos adaptadorListaFavoritos;





    public ImagenesFavoritasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ImagenesFavoritasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ImagenesFavoritasFragment newInstance(String param1, String param2) {
        ImagenesFavoritasFragment fragment = new ImagenesFavoritasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vista = inflater.inflate(R.layout.fragment_imagenes_favoritas, container, false);

        //reciclaImagenesFavoritos= (RecyclerView) vista.findViewById(R.id.RecyclerListaFavoritos);
        reciclaImagenesFavoritos=  vista.findViewById(R.id.RecyclerListaFavoritos);


        //SE HARDCODEA UNA LISTA Y SE DA COMO PARAMETRO AL ADAPTADOR DE IMAGENES DE FAVORITOS

        List<String> listaImagenesFavoritos= new ArrayList<>();

        listaImagenesFavoritos.add("https://images.dog.ceo/breeds/poodle-toy/n02113624_836.jpg");
        listaImagenesFavoritos.add("https://images.dog.ceo/breeds/poodle-toy/n02113624_3344.jpg");
        listaImagenesFavoritos.add("https://images.dog.ceo/breeds/poodle-toy/n02113624_2595.jpg");
        listaImagenesFavoritos.add("https://images.dog.ceo/breeds/poodle-toy/n02113624_189.jpg");
        listaImagenesFavoritos.add("https://images.dog.ceo/breeds/poodle-toy/n02113624_1801.jpg");
        //

//        if(listaIamgenesFavoritos!=null){
//            adaptadorListaFavoritos=new AdaptadorListaFavoritos(listaImagenesFavoritos,getContext());
//
//        }

        adaptadorListaFavoritos=new AdaptadorListaFavoritos(listaImagenesFavoritos,getContext());



        reciclaImagenesFavoritos.setAdapter(adaptadorListaFavoritos);

        reciclaImagenesFavoritos.setLayoutManager(new LinearLayoutManager(getContext()));

        return vista;
    }
}
