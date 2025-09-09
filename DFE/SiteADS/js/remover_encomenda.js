var tabela = document.querySelector("table");

//Escuta o duplo clique na linha que será removida
tabela.addEventListener("dblclick", function(event){

  //Adiciona p efeito na linha
  event.target.parentNode.classList.add("fadeOut");

  //Atrasa a exclusão da linha para ver o efeito
  setTimeout(function(){
    //Exclui a linha clicada
    event.target.parentNode.remove();
  }, 600)
});