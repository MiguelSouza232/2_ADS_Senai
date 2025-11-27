// Captura todas as encomendas já existentes na tabela
var clientes = document.querySelectorAll(".cliente");

// Passa por cada linha e aplica validações
clientes.forEach(function (cliente) {

  var qtde = cliente.querySelector(".qtde").textContent;
  var unit = cliente.querySelector(".unitario").textContent;

  qtde = Number(qtde);
  unit = Number(unit);

  // Valida quantidade
  if (isNaN(qtde) || qtde < 1) {
    cliente.querySelector(".qtde").textContent = "Quantidade inválida!";
    cliente.classList.add("info-invalida");
    return;
  }

  // Valida valor unitário
  if (isNaN(unit) || unit <= 0) {
    cliente.querySelector(".unitario").textContent = "Valor inválido!";
    cliente.classList.add("info-invalida-unit");
    return;
  }

  // Calcula total
  var total = calcularTotal(qtde, unit);

  cliente.querySelector(".total").textContent = formataValor(total);
  cliente.querySelector(".unitario").textContent = formataValor(unit);
});

// ---------------------- FUNÇÕES -----------------------

function calcularTotal(qtde, unit) {
  return qtde * unit;
}

function formataValor(valor) {
  return valor.toLocaleString("pt-BR", {
    style: "currency",
    currency: "BRL"
  });
}
