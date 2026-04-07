package model;

import javax.swing.JOptionPane;

public class Empresa {

    private String nome;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String fone;

    public Empresa() {
        this("", "", "", "", "", "");
    }

    public Empresa(String nome, String endereco, String cep, String cidade, String estado, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.fone = fone;

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;

    }

    public String getCep() {
        return cep;

    }

    public String getCidade() {
        return cidade;

    }

    public String getEstado() {
        return estado;
    }

    public String getFone() {
        return fone;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFone(String fone) {
        this.fone = fone;

    }
    public void leitura(){
        setNome(JOptionPane.showInputDialog("diga seu nome "));
        setEndereco(JOptionPane.showInputDialog("diga seu endereço "));
        setCep(JOptionPane.showInputDialog("diga seu cep "));
        setCidade(JOptionPane.showInputDialog("diga seu cidade "));
        setEstado(JOptionPane.showInputDialog("diga seu estado  "));
        setFone(JOptionPane.showInputDialog("diga seu telefone "));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nome:" + getNome());
        JOptionPane.showMessageDialog(null,"Endereco:" + getEndereco());
        JOptionPane.showMessageDialog(null,"Cep:" + getCep());
        JOptionPane.showMessageDialog(null,"Cidade:" + getCidade());
        JOptionPane.showMessageDialog(null,"Estado:" + getEstado());
        JOptionPane.showMessageDialog(null,"Telefone:" + getFone());
    }

}
