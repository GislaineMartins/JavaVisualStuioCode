export class Pessoa{
    
    #nome;
    #sobrenome;
    #idade;

    get nome(){
        return this.#nome;
    }

    set nome(nome){
        this.#nome = nome;
    }

    get sobrenome(){
        return this.#sobrenome;
    }

    set sobrenome(sobrenome){
        this.#sobrenome = sobrenome;
    }

    get idade(){
        return this.#idade;
    }

    set idade(idade){
        this.#idade = idade;

    }
    

}