var botaoAPI = document.querySelector("#api-encomenda");

botaoAPI.addEventListener("click", function () {
  //Consome a API
  var api = new XMLHttpRequest();
  api.open("GET", "http://localhost:3000/encomendas_web");
  api.addEventListener("load", function () {
    var resposta = api.responseText;

    resposta.ForEach(function (encomendaAPI) {
      adicionaEncomendaTabela(encomendaAPI);
    });
  });
  api.send();
});
