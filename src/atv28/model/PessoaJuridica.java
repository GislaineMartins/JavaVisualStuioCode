package model;

public class PessoaJuridica extends Pessoa{

    public String cnpj;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Endereco){
            PessoaJuridica pessoaJuridica = (PessoaJuridica)obj;
            if(super.equals(pessoaJuridica)){
                return true;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String msg = super.toString() + "CNPJ: " + this.cnpj;
        return msg;
    }
}
