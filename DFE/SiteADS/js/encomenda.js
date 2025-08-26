// document.querySelector(".total").textContent=document.querySelector(".qtde").textContent * document.querySelector(".unitario").textContent
//Captura as encomendas da tabela
var clientes = document.querySelectorAll(".cliente");

// Passa por todas as encmendas e calcula o valor total
for (var count = 0; count < clientes.length; count++) {
  // var cliente = clientes[count];

  // Captura valores de quantidade e valor unitário
  var tab_qtde = clientes[count].querySelector(".qtde").textContent;
  var tab_unitario = clientes[count].querySelector(".unitario").textContent;

  //Verifica se a quantidade é válida
  if (tab_qtde < 1 || isNaN(tab_qtde)) {
    //A quantidae é menor que 1 ou não é numérica
    clientes[count].querySelector(".qtde").textContent = "Quantidade inválida!";
    clientes[count].classList.add("info-invalida");
  } else {
    //Verifica se o valor unitário é valido
    if (tab_unitario <= 0 || isNaN(tab_unitario)) {
      //O unitário é menor ou igual a 0 ou não é numérico
      clientes[count].querySelector(".unitario").textContent =
        "Valor Unitário inválido";
      clientes[count].classList.add("info-invalida-unit");
    } else {
      //Calcula e exibe o total
      clientes[count].querySelector(".total").textContent = calcularTotal(
        tab_qtde,
        tab_unitario
      );

      //Envia formatação para o valor unitário
      clientes[count].querySelector(".unitario").textContent = formataValor(
        parseFloat(tab_unitario)
      );
    }
  }
}

// Função de cálculo do valor total
function calcularTotal(qtde, unit) {
  var total = 0;

  total = qtde * unit;

  return formataValor(total);
}

//Função que formata os valores em R$
function formataValor(valor) {
  var valor_formatado = valor.toLocaleString("pt-BR", {
    style: "currency",
    currency: "BRL",
  });

  return valor_formatado;
}
