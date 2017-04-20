package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 13/04/2017.
 */

public class Subunidade implements Comparable<Subunidade>
{
    private long Id_Subunidade;
    private String Subunidade;
    /**
     *
     */
    public Subunidade()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param pId_Subunidade
     * @param pSubunidade
     */
    public Subunidade(long pId_Subunidade, String pSubunidade)
    {
        super();
        Id_Subunidade = pId_Subunidade;
        Subunidade = pSubunidade;
    }

    public long getId_Subunidade() {
        return Id_Subunidade;
    }

    public void setId_Subunidade(long id_Subunidade) {
        Id_Subunidade = id_Subunidade;
    }

    public String getSubunidade() {
        return Subunidade;
    }

    public void setSubunidade(String subunidade) {
        Subunidade = subunidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subunidade)) return false;

        Subunidade that = (Subunidade) o;

        return Id_Subunidade == that.Id_Subunidade;

    }

    @Override
    public int hashCode() {
        return (int) (Id_Subunidade ^ (Id_Subunidade >>> 32));
    }

    @Override
    public String toString() {
        return "Subunidade{" +
                "Id_Subunidade=" + Id_Subunidade +
                ", Subunidade='" + Subunidade + '\'' +
                '}';
    }


    @Override
    public int compareTo(Subunidade pO) {
        return Long.compare(getId_Subunidade(), pO.getId_Subunidade());
    }
}
