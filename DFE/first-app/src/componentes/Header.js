import { useState } from 'react';
import '../App.css';
import logo from '../assets/LogoCelsinho.png';

export default function Header() {
  const [menuAberto, setMenuAberto] = useState(false);

  const alternarMenu = () => {
    setMenuAberto(!menuAberto);
  };

  return (
    <header>
      <div className="divHeader">
        <img src={logo} alt="Dj Celsinho" className="logo" />

        {/* Botão hamburger para mobile) */}
        <button className="menu-toggle" onClick={alternarMenu}>
          ☰
        </button>

        {/* Menu de navegação com condicional */}
        <nav className={menuAberto ? 'menu ativo' : 'menu'}>
          <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="servicos.html">Serviços</a></li>
            <li><a href="contato.html">Contato</a></li>
            <li><a href="encomendas.html">Encomendas</a></li>
          </ul>
        </nav>
      </div>
    </header>
  );
}