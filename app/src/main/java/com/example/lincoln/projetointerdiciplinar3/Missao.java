package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 13/04/2017.
 */

public class Missao implements Comparable <Missao> {
    private long Id_Missao;
    private String Nome_Misso;
    private String Descricao;
    /**
     *
     */
    public Missao()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param pId_Missao
     * @param pNome_Misso
     * @param pDescricao
     */


    public Missao(long pId_Missao, String pNome_Misso, String pDescricao)
    {
        super();
        Id_Missao = pId_Missao;
        Nome_Misso = pNome_Misso;
        Descricao = pDescricao;
    }


    public Missao(long pId_Missao)
    {
        super();
        Id_Missao = pId_Missao;
    }
    /**
     * @param pNome_Misso
     * @param pDescricao
     */
    public Missao(String pNome_Misso, String pDescricao)
    {
        super();
        Nome_Misso = pNome_Misso;
        Descricao = pDescricao;
}

    public long getId_Missao() {
        return Id_Missao;
    }

    public void setId_Missao(long id_Missao) {
        Id_Missao = id_Missao;
    }

    public String getNome_Misso() {
        return Nome_Misso;
    }

    public void setNome_Misso(String nome_Misso) {
        Nome_Misso = nome_Misso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Missao)) return false;

        Missao missao = (Missao) o;

        return Id_Missao == missao.Id_Missao;

    }

    @Override
    public int hashCode() {
        return (int) (Id_Missao ^ (Id_Missao >>> 32));
    }

    @Override
    public String toString() {
        return "Missao{" +
                "Id_Missao=" + Id_Missao +
                ", Nome_Misso='" + Nome_Misso + '\'' +
                ", Descricao='" + Descricao + '\'' +
                '}';
    }


    @Override
    public int compareTo(Missao pO) {
        return Long.compare(getId_Missao(), pO.getId_Missao());
    }
}
