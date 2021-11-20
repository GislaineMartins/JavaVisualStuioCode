window.onload = function(){
    console.log('Carregando Js...');
    let viagem = [];
    localStorage.setItem("viagem", JSON.stringify(viagem))  
}

function salvar(event) {
    event.preventDefault();
    let id = document.getElementById('id');
    let uf = document.getElementById('uf');
    let destino = document.getElementById('destino');
    let ufDestino = document.getElementById('ufDestino');
    let dataIda = document.getElementById('dataIda');
    let dataVolta = document.getElementById('dataVolta');   

    viagem = {"id": id.value, "uf": uf.value, "destino":destino.value,
     "ufDestino": ufDestino.value, "dataIda": dataIda.value, "dataVolta": dataVolta.value}
     let vaigens = JSON.parse(localStorage.getItem("viagem"));
     vaigens.push(viagem);
     localStorage.setItem("viagem", JSON.stringify(vaigens));
     carregaTabela();
    
}


function carregaTabela(){

    let tbody = document.getElementById("tabela");
    let viagens = JSON.parse(localStorage.getItem("viagem")); 
    tbody.innerHTML = "";
    viagens.forEach(v => {
        tbody.innerHTML += "<tr>" 
                     +"<td>"+ v["id"] +"</td>"
                     +"<td>"+ v["uf"] +"</td>"
                     +"<td>"+ v["destino"] +"</td>"
                     +"<td>"+ v["ufDestino"] +"</td>"
                     +"<td>"+ v["dataIda"] +"</td>"
                     +"<td>"+ v["dataVolta"] +"</td>"      
                     +"</tr>";        
    });
}

carregaTabela();