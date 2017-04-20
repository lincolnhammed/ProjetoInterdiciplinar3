package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 13/04/2017.
 */

public class Graduacao implements Comparable<Graduacao>
{
    private long Id_Graduacao;
    private String Patente;
    /**
     *
     */
    public Graduacao()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param pId_Graduacao
     * @param pPatente
     */
    public Graduacao(long pId_Graduacao, String pPatente)
    {
        super();
        Id_Graduacao = pId_Graduacao;
        Patente = pPatente;
    }

    public long getId_Graduacao() {
        return Id_Graduacao;
    }

    public void setId_Graduacao(long id_Graduacao) {
        Id_Graduacao = id_Graduacao;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Graduacao)) return false;

        Graduacao graduacao = (Graduacao) o;

        return Id_Graduacao == graduacao.Id_Graduacao;

    }

    @Override
    public int hashCode() {
        return (int) (Id_Graduacao ^ (Id_Graduacao >>> 32));
    }

    @Override
    public String toString() {
        return "Graduacao{" +
                "Id_Graduacao=" + Id_Graduacao +
                ", Patente='" + Patente + '\'' +
                '}';
    }


    @Override
    public int compareTo(Graduacao pO) {
        return Long.compare(getId_Graduacao(), pO.getId_Graduacao());
    }
}
