package model;

public class PessoaFisica extends Pessoa{

    public String cpf;



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Endereco){
            PessoaFisica pessoaFisica = (PessoaFisica)obj;
            if(super.equals(pessoaFisica)){
                return true;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " CPF: " + this.cpf;
        return msg;
    }
}
