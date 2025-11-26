// // var botaoAdicionar = document.querySelector("#adicionar-encomenda");

// // botaoAdicionar.addEventListener("click", function(event){
// //   event.preventDefault();
// // })

// // var tabela = document.querySelector("#tabela-clientes");

// // botaoAdicionar.addEventListener("click", function (e) {
// //   e.preventDefault();

// //   var nome = document.querySelector("#nome-form").value;
// //   var quantidade = document.querySelector("#quantidade-form").value;
// //   var servico = document.querySelector("#servico-form").value;
// //   var valorUnitario = document.querySelector("#valor-form").value;

// //   var total = quantidade * valorUnitario;

// //   //Adiciona encomenda
// //   adicionaEncomendaTabela(novaEncomenda);

// //   var novaLinha = document.createElement("tr");
// //   novaLinha.classList.add("cliente");
// //   novaLinha.innerHTML = `
// //     <td class="nome">${nome}</td>
// //     <td class="servico">${servico}</td>
// //     <td class="qtde">${quantidade}</td>
// //     <td class="unitario">${valorUnitario}</td>
// //     <td class="total">${formataValor(total)}</td>
// //   `;

// //   tabela.appendChild(novaLinha);

// //   document.querySelector("#form-encomenda").reset();
// // });

// // //Função para adicionar noca encomenda na tabela
// // function adicionaEncomendaTabela(dadosEncomenda) {
// //   var tabela = document.querySelector("#tabela-clientes");
// //   tabela.appendChild(montaTR(dadosEncomenda));
// // }

// // var botaoAdicionar = document.querySelector("#adicionar-encomenda");

// // botaoAdicionar.addEventListener("submit", function(event){
// //     event.preventDefault();
    
// //     //Captura o formulário
// //     var form = document.querySelector("#form-adiciona");

// //     //Captura a nova encomenda
// //     var novaEncomenda = obtemEncomenda(form);

// //     //Captura a tabela de encomendas
// //     var tabela = document.querySelector("#tabela-clientes");
    
// //     //Insere a nova encomenda na tabela
// //     tabela.appendChild(montaTR(novaEncomenda));

// //     //Limpa o formulário
// //     form.reset(); 
// // });

// var botaoAdicionar = document.querySelector("#adicionar-encomenda");

// botaoAdicionar.addEventListener("submit", function(event){
//     event.preventDefault();
    
//     //Captura o formulário
//     var form = document.querySelector("#form-adiciona");

//     //Captura a nova encomenda
//     var novaEncomenda = obtemEncomenda(form);

//     // //Captura a tabela de encomendas
//     // var tabela = document.querySelector("#tabela-clientes");
    
//     // //Insere a nova encomenda na tabela
//     // tabela.appendChild(montaTR(novaEncomenda));

//     //Limpa o formulário
//     form.reset(); 
// });

// //Função para adicionar nova encomenda na tabela
// function adicionaEncomendaTabela(dadosEncomenda) {
//   var tabela = document.querySelector("#tabela-clientes");
//   tabela.appendChild(montaTR(dadosEncomenda));
// }


// //Captura os dados do formulário
// function obtemEncomenda(formulario){
//     var encomenda = {
//         nome: formulario.nome.value,
//         produto: formulario.produto.value,
//         qtde: formulario.qtde.value,
//         unitario: formulario.unitario.value
//     }

//     return encomenda;
// }

// //Função para criar nova linha
// function montaTR(dadosNovaEncomenda){
//     var linha = document.createElement('tr');

//     linha.appendChild(montaTD(dadosNovaEncomenda.nome));
//     linha.appendChild(montaTD(dadosNovaEncomenda.produto));
//     linha.appendChild(montaTD(dadosNovaEncomenda.qtde));
//     linha.appendChild(montaTD(formataValor(dadosNovaEncomenda.unitario)));
//     linha.appendChild(montaTD(calculaTotal(dadosNovaEncomenda.qtde,dadosNovaEncomenda.unitario)));

//     return linha;
// }

// //Função para criar nova coluna
// function montaTD(dadoColuna){
//     var coluna = document.createElement('td');
//     coluna.textContent = dadoColuna;

//     return coluna;
// }

var form = document.querySelector("#form-encomenda");

// Evento de submit do formulário
form.addEventListener("submit", function(event) {
    event.preventDefault();

    // Pega os dados digitados
    var novaEncomenda = obtemEncomenda(form);

    // Adiciona na tabela com todas validações e formatações
    adicionaEncomendaTabela(novaEncomenda);

    // Reseta o formulário
    form.reset();
});


// -------- FUNÇÕES --------

// Captura os valores digitados no formulário
function obtemEncomenda(formulario) {
    return {
        nome: formulario.querySelector("#nome-form").value,
        servico: formulario.querySelector("#servico-form").value,
        qtde: Number(formulario.querySelector("#quantidade-form").value),
        unitario: Number(formulario.querySelector("#valor-form").value)
    };
}

// Cria a linha da tabela
function adicionaEncomendaTabela(encomenda) {
    var tabela = document.querySelector("#tabela-clientes");
    tabela.appendChild(montaTR(encomenda));
}

// Cria TR com validação e formatação
function montaTR(encomenda) {
    var tr = document.createElement("tr");
    tr.classList.add("cliente");

    // Valida quantidade
    if (isNaN(encomenda.qtde) || encomenda.qtde < 1) {
        tr.appendChild(montaTD("Quantidade inválida!", "info-invalida"));
        tr.appendChild(montaTD(""));
        tr.appendChild(montaTD(""));
        tr.appendChild(montaTD(""));
        tr.appendChild(montaTD(""));
        tr.classList.add("info-invalida");
        return tr;
    }

    // Valida valor unitário
    if (isNaN(encomenda.unitario) || encomenda.unitario <= 0) {
        tr.appendChild(montaTD(encomenda.nome));
        tr.appendChild(montaTD(encomenda.servico));
        tr.appendChild(montaTD(encomenda.qtde));

        tr.appendChild(montaTD("Valor inválido!", "info-invalida-unit"));
        tr.appendChild(montaTD(""));

        tr.classList.add("info-invalida-unit");
        return tr;
    }

    // Dados válidos → formata e adiciona normalmente
    tr.appendChild(montaTD(encomenda.nome));
    tr.appendChild(montaTD(encomenda.servico));
    tr.appendChild(montaTD(encomenda.qtde));
    tr.appendChild(montaTD(formataValor(encomenda.unitario)));

    var total = calcularTotal(encomenda.qtde, encomenda.unitario);
    tr.appendChild(montaTD(formataValor(total)));

    return tr;
}

// Cria TD com possibilidade de classe CSS
function montaTD(conteudo, classe) {
    var td = document.createElement("td");
    td.textContent = conteudo;

    if (classe) {
        td.classList.add(classe);
    }

    return td;
}

// Calcula o total
function calcularTotal(qtde, unit) {
    return qtde * unit;
}

// Formata em moeda brasileira
function formataValor(valor) {
    return valor.toLocaleString("pt-BR", {
        style: "currency",
        currency: "BRL"
    });
}
