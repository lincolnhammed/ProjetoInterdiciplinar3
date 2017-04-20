package com.example.lincoln.projetointerdiciplinar3;


public class Movimentacao implements Comparable<Movimentacao>  {

    private long Id_movimentacao;
    private String Hora_Saida;
    private int Odometro_Saida;
    private String Hora_Retorno;
    private String Odometro_retorno;
    private Militar militar;
    private VTR vtr;
    private Missao missao;

    public Movimentacao() {
        super();
    }
    public Movimentacao(long pId_movimentacao, String pHora_Saida, int pOdometro_Saida, String pHora_Retorno, String pOdometro_retorno, Militar pMilitar,
                        VTR pVtr, Missao pMissao)
    {
        super();
        Id_movimentacao = pId_movimentacao;
        Hora_Saida = pHora_Saida;
        Odometro_Saida = pOdometro_Saida;
        Hora_Retorno = pHora_Retorno;
        Odometro_retorno = pOdometro_retorno;
        militar = pMilitar;
        vtr = pVtr;
        missao = pMissao;
    }

    public long getId_movimentacao() {
        return Id_movimentacao;
    }

    public void setId_movimentacao(long id_movimentacao) {
        Id_movimentacao = id_movimentacao;
    }

    public String getHora_Saida() {
        return Hora_Saida;
    }

    public void setHora_Saida(String hora_Saida) {
        Hora_Saida = hora_Saida;
    }

    public int getOdometro_Saida() {
        return Odometro_Saida;
    }

    public void setOdometro_Saida(int odometro_Saida) {
        Odometro_Saida = odometro_Saida;
    }

    public String getHora_Retorno() {
        return Hora_Retorno;
    }

    public void setHora_Retorno(String hora_Retorno) {
        Hora_Retorno = hora_Retorno;
    }

    public String getOdometro_retorno() {
        return Odometro_retorno;
    }

    public void setOdometro_retorno(String odometro_retorno) {
        Odometro_retorno = odometro_retorno;
    }

    public Militar getMilitar() {
        return militar;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public VTR getVtr() {
        return vtr;
    }

    public void setVtr(VTR vtr) {
        this.vtr = vtr;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movimentacao)) return false;

        Movimentacao that = (Movimentacao) o;

        return Id_movimentacao == that.Id_movimentacao;

    }

    @Override
    public int hashCode() {
        return (int) (Id_movimentacao ^ (Id_movimentacao >>> 32));
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "Id_movimentacao=" + Id_movimentacao +
                ", Hora_Saida='" + Hora_Saida + '\'' +
                ", Odometro_Saida=" + Odometro_Saida +
                ", Hora_Retorno='" + Hora_Retorno + '\'' +
                ", Odometro_retorno='" + Odometro_retorno + '\'' +
                ", militar=" + militar +
                ", vtr=" + vtr +
                ", missao=" + missao +
                '}';
    }

    @Override
    public int compareTo(Movimentacao pO)
    {
        // TODO Auto-generated method stub
        return Long.compare(getId_movimentacao(), pO.getId_movimentacao());
    }



}
