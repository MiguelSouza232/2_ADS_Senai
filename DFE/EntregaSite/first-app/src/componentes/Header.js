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

        <button className="menu-toggle" onClick={alternarMenu}>
          {menuAberto ? '✕' : '☰'} 
        </button>

        <nav className={menuAberto ? 'menu ativo' : 'menu'}>
        <ul>
            <li><a href="https://drive.google.com/file/d/1vkqqaTbZ9rMqKw1HDFH2NAiABrCYmqIv/view" target="_blank">Press Kit</a></li>
            <li><a href="servicos.html">Serviços</a></li>
            <li><a href="encomendas.html">Encomendas</a></li>
            <li><a href="contato.html">Contato</a></li>
        </ul>
        </nav>
      </div>
    </header>
  );
}