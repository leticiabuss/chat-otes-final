package br.edu.oprofvalmor.cliente2.modelo;

public class Mensagem {
    private static final Mensagem instance = new Mensagem();

    private String nomePessoa;
    private String txtMensagem;

    //    public Mensagem(String nomePessoa, String txtMensagem) {
//        this.nomePessoa = nomePessoa;
//        this.txtMensagem = txtMensagem;
//    }
    public static Mensagem getInstance() {
        return instance;
    }

    public void setNomePessoa(String userId) {
        this.nomePessoa = nomePessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void settTxtMensagem(String userId) {this.txtMensagem = txtMensagem;    }
    public String getTxtMensagem() {
        return txtMensagem;
    }
}
