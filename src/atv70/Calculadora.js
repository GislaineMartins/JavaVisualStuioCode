class Calculadora{
    numeroUm;
    numeroDois;


    somar(numeroUm, numeroDois){
        return numeroUm + numeroDois;
    }

    subtracao(numeroUm, numeroDois){
        return numeroUm - numeroDois;
    }

    multiplicacao(numeroUm, numeroDois){
        return numeroUm * numeroDois;
    }

    divisao(numeroUm, numeroDois){
        return numeroUm / numeroDois;
    }
    
}

console.log("testando calculadora teste");

const calc = new Calculadora();
const soma = calc.somar(1,1)
const sub = calc.subtracao(2,2)
const mult = calc.multiplicacao(2,2)
const div = calc.divisao(4,4)

console.log("Soma: ",soma)
console.log("Subtração: ",sub)
console.log("Multiplicação: ",mult)
console.log("Divisão: ",div)