import { Pessoa } from "./Pessoa.js";
import { PessoaFisica } from "./PessoaFisica.js";
import { PessoaJuridica } from "./PessoaJuridica.js";

const pf = new PessoaFisica(1234567);
pf.nome("pf");
pf.sobrenome("pessoa fisica");
pf.idade(32);

const pj = new PessoaJuridica(1111111111);
pj.nome("pj");
pj.sobrenome("pessoa juridica");
pj.idade(21);


console.log(pf);
console.log(pj);