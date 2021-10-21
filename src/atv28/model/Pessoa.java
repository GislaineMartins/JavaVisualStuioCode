package model;

public abstract class Pessoa extends Base {

    public String nome;
    public Endereco enderecoResidencial;
    public Endereco enderecoComercial;

    public Pessoa(){
        this.enderecoComercial = new Endereco();
        this.enderecoResidencial = new Endereco();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Endereco){
            Pessoa pessoa = (Pessoa)obj;
            if(super.equals(pessoa)){
                return true;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " Nome: " + this.nome + " Endereço residencial: " + this.enderecoResidencial.toString()
        + " Endereço Comercial: " + this.enderecoComercial.toString();
        return msg;
    }
}
