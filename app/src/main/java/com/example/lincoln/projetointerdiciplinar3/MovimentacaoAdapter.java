package com.example.lincoln.projetointerdiciplinar3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MovimentacaoAdapter extends ArrayAdapter<Movimentacao> {

    private List<Movimentacao> movimentacoes;
    private int layout;

    public MovimentacaoAdapter(Context context, int rescurce, List<Movimentacao>movimentacoes){
        super(context,rescurce,movimentacoes);
        this.movimentacoes=movimentacoes;
        layout=rescurce;
    }
    @Override
    public View getView(int position, View contentView, ViewGroup parent){
        View localView=contentView;
        if(localView==null){
            LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            localView=inflater.inflate(layout,null);
        }
        Movimentacao movimentacao =movimentacoes.get(position);
        if(movimentacao != null){
            TextView TextMiltar=(TextView) localView.findViewById(R.id.textmilitar);
           // TextView TextMiltar=(TextView) localView.findViewById(R.id.textmilitar);


            if(TextMiltar !=null){
                TextMiltar.setText(movimentacao.getMilitar().toString());
            }



        }
        return localView;
    }

}
