package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 13/04/2017.
 */

public class Militar implements Comparable<Militar>{
    private long   Id_Militar;
    private String Nome_Militar;
    private int    Numero_indentificacao;
    private Graduacao graduacao;
    private Subunidade subunidade;

    public Militar()
    {
        super();
    }



    public Militar(long pId_Militar, String pNome_Militar, int pNumero_indentificacao, Graduacao pGraduacao, Subunidade pSubunidade)
    {
        super();
        Id_Militar = pId_Militar;
        Nome_Militar = pNome_Militar;
        Numero_indentificacao = pNumero_indentificacao;
        graduacao = pGraduacao;
        subunidade = pSubunidade;
    }

    public long getId_Militar() {
        return Id_Militar;
    }

    public void setId_Militar(long id_Militar) {
        Id_Militar = id_Militar;
    }

    public String getNome_Militar() {
        return Nome_Militar;
    }

    public void setNome_Militar(String nome_Militar) {
        Nome_Militar = nome_Militar;
    }

    public int getNumero_indentificacao() {
        return Numero_indentificacao;
    }

    public void setNumero_indentificacao(int numero_indentificacao) {
        Numero_indentificacao = numero_indentificacao;
    }

    public Graduacao getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(Graduacao graduacao) {
        this.graduacao = graduacao;
    }

    public Subunidade getSubunidade() {
        return subunidade;
    }

    public void setSubunidade(Subunidade subunidade) {
        this.subunidade = subunidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Militar)) return false;

        Militar militar = (Militar) o;

        return Id_Militar == militar.Id_Militar;

    }

    @Override
    public int hashCode() {
        return (int) (Id_Militar ^ (Id_Militar >>> 32));
    }

    @Override
    public String toString() {
        return "Militar{" +
                "Id_Militar=" + Id_Militar +
                ", Nome_Militar='" + Nome_Militar + '\'' +
                ", Numero_indentificacao=" + Numero_indentificacao +
                ", graduacao=" + graduacao +
                ", subunidade=" + subunidade +
                '}';
    }


    @Override
    public int compareTo(Militar pO) {
        return Long.compare(getId_Militar(), pO.getId_Militar());

    }
}


