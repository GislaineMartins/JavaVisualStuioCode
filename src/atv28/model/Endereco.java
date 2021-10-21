package model;

public class Endereco extends Base{

    public String logradouro;
    public int numero;
    public String complemento;
    public String cpf;
    public String cidade;
    public String estado;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Endereco){
            Endereco end = (Endereco)obj;
            if(super.equals(end)){
                return true;
            }
        }
        return true;
    }



    @Override
    public String toString() {
        String msg = super.toString() + " Logradouro: " + this.logradouro + " Numero: " + this.numero
                + " Complemento: " + this.complemento + " CPF: " + this.cpf
                + " Idade: " + this.cidade + " Estado: " + this.estado;
        return msg;
    }



}
