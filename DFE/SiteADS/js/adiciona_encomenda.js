// var botaoAdicionar = document.querySelector("#adicionar-encomenda");

// botaoAdicionar.addEventListener("click", function(event){
//   event.preventDefault();
// })

// var tabela = document.querySelector("#tabela-clientes");

// botaoAdicionar.addEventListener("click", function (e) {
//   e.preventDefault();

//   var nome = document.querySelector("#nome-form").value;
//   var quantidade = document.querySelector("#quantidade-form").value;
//   var servico = document.querySelector("#servico-form").value;
//   var valorUnitario = document.querySelector("#valor-form").value;

//   var total = quantidade * valorUnitario;

//   //Adiciona encomenda
//   adicionaEncomendaTabela(novaEncomenda);

//   var novaLinha = document.createElement("tr");
//   novaLinha.classList.add("cliente");
//   novaLinha.innerHTML = `
//     <td class="nome">${nome}</td>
//     <td class="servico">${servico}</td>
//     <td class="qtde">${quantidade}</td>
//     <td class="unitario">${valorUnitario}</td>
//     <td class="total">${formataValor(total)}</td>
//   `;

//   tabela.appendChild(novaLinha);

//   document.querySelector("#form-encomenda").reset();
// });

// //Função para adicionar noca encomenda na tabela
// function adicionaEncomendaTabela(dadosEncomenda) {
//   var tabela = document.querySelector("#tabela-clientes");
//   tabela.appendChild(montaTR(dadosEncomenda));
// }

// var botaoAdicionar = document.querySelector("#adicionar-encomenda");

// botaoAdicionar.addEventListener("submit", function(event){
//     event.preventDefault();
    
//     //Captura o formulário
//     var form = document.querySelector("#form-adiciona");

//     //Captura a nova encomenda
//     var novaEncomenda = obtemEncomenda(form);

//     //Captura a tabela de encomendas
//     var tabela = document.querySelector("#tabela-clientes");
    
//     //Insere a nova encomenda na tabela
//     tabela.appendChild(montaTR(novaEncomenda));

//     //Limpa o formulário
//     form.reset(); 
// });

var botaoAdicionar = document.querySelector("#adicionar-encomenda");

botaoAdicionar.addEventListener("submit", function(event){
    event.preventDefault();
    
    //Captura o formulário
    var form = document.querySelector("#form-adiciona");

    //Captura a nova encomenda
    var novaEncomenda = obtemEncomenda(form);

    // //Captura a tabela de encomendas
    // var tabela = document.querySelector("#tabela-clientes");
    
    // //Insere a nova encomenda na tabela
    // tabela.appendChild(montaTR(novaEncomenda));

    //Limpa o formulário
    form.reset(); 
});

//Função para adicionar nova encomenda na tabela
function adicionaEncomendaTabela(dadosEncomenda) {
  var tabela = document.querySelector("#tabela-clientes");
  tabela.appendChild(montaTR(dadosEncomenda));
}


//Captura os dados do formulário
function obtemEncomenda(formulario){
    var encomenda = {
        nome: formulario.nome.value,
        produto: formulario.produto.value,
        qtde: formulario.qtde.value,
        unitario: formulario.unitario.value
    }

    return encomenda;
}

//Função para criar nova linha
function montaTR(dadosNovaEncomenda){
    var linha = document.createElement('tr');

    linha.appendChild(montaTD(dadosNovaEncomenda.nome));
    linha.appendChild(montaTD(dadosNovaEncomenda.produto));
    linha.appendChild(montaTD(dadosNovaEncomenda.qtde));
    linha.appendChild(montaTD(formataValor(dadosNovaEncomenda.unitario)));
    linha.appendChild(montaTD(calculaTotal(dadosNovaEncomenda.qtde,dadosNovaEncomenda.unitario)));

    return linha;
}

//Função para criar nova coluna
function montaTD(dadoColuna){
    var coluna = document.createElement('td');
    coluna.textContent = dadoColuna;

    return coluna;
}