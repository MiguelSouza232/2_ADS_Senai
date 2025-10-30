import '../App.css';
import logo from '../assets/SubLogoCelsinho.png';

export default function Header() {
  return (
    <header>
      <div className="divHeader">
        <img src={logo} alt="Dj Celsinho" className="logo" />
        <nav>
          <ul>
            <li>Home</li>
            <li><a href="servicos.html">Serviços</a></li>
            <li><a href="contato.html">Contato</a></li>
            <li><a href="encomendas.html">Encomendas</a></li>
          </ul>
        </nav>
      </div>
    </header>
  );
}