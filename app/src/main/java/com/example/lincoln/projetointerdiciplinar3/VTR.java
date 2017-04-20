package com.example.lincoln.projetointerdiciplinar3;

/**
 * Created by Lincoln on 13/04/2017.
 */

public class VTR implements Comparable<VTR>
{
    private long Id_VTR;
    private String Modelo_Vtr;

    public VTR()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public VTR(long pId_VTR, String pModelo_Vtr)
    {
        super();
        Id_VTR = pId_VTR;
        Modelo_Vtr = pModelo_Vtr;
    }



    public VTR(long pId_VTR)
    {
        super();
        Id_VTR = pId_VTR;
    }

    public long getId_VTR() {
        return Id_VTR;
    }

    public void setId_VTR(long id_VTR) {
        Id_VTR = id_VTR;
    }

    public String getModelo_Vtr() {
        return Modelo_Vtr;
    }

    public void setModelo_Vtr(String modelo_Vtr) {
        Modelo_Vtr = modelo_Vtr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VTR)) return false;

        VTR vtr = (VTR) o;

        return Id_VTR == vtr.Id_VTR;

    }

    @Override
    public int hashCode() {
        return (int) (Id_VTR ^ (Id_VTR >>> 32));
    }

    @Override
    public String toString() {
        return "VTR{" +
                "Id_VTR=" + Id_VTR +
                ", Modelo_Vtr='" + Modelo_Vtr + '\'' +
                '}';
    }

    @Override
    public int compareTo(VTR pO) {
        return Long.compare(getId_VTR(), pO.getId_VTR());
    }
}
