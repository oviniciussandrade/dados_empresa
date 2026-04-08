package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {

    private String tipoComida;
    private float precoMedio;

    public Restaurante() {
        this("", "", "", "", "", "", "", (float) 0.0);
    }

    public Restaurante(String nome, String endereco, String cep, String cidade, String estado, String fone, String tipoComida, float precoMedio) {
        super(nome, endereco, cep, cidade, estado, fone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public float getPrecoMedio() {
        return precoMedio;

    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;

    }

    public void leitura() {
        super.leitura();
        setTipoComida(JOptionPane.showInputDialog("Diga a comida: "));
        setPrecoMedio(Float.parseFloat(JOptionPane.showInputDialog("Diga o preco medio: ")));
   
    } public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Comida:" + getTipoComida());
        JOptionPane.showMessageDialog(null, "Preço médio:" + getPrecoMedio());
    }

}
