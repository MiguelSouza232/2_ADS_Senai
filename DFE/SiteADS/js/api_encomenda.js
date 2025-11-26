var botaoAPI = document.querySelector("#api-encomenda");

botaoAPI.addEventListener("click", function () {
  var xhr = new XMLHttpRequest();
  xhr.open("GET", "http://localhost:3000/encomendas_web");

  xhr.addEventListener("load", function () {
    if (xhr.status === 200) {
      var resposta = JSON.parse(xhr.responseText);

      resposta.forEach(function (encomendaAPI) {
        adicionaEncomendaTabela(encomendaAPI);
      });
    } else {
      alert("Erro ao carregar API: " + xhr.status);
    }
  });

  xhr.send();
});
