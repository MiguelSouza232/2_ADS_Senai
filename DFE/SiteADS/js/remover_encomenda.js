var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event) {
  var elemento = event.target.parentNode;

  // Evita remover cabeçalho
  if (elemento.tagName !== "TR" || elemento.parentNode.tagName === "THEAD") {
    return;
  }

  elemento.classList.add("fadeOut");

  setTimeout(function () {
    elemento.remove();
  }, 600);
});
