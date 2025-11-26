import '../App.css';
import banner from '../assets/CelsinhoGregs.jpg';
import subLogo from '../assets/SubLogoCelsinho.png';
import logoContrate from '../assets/Contrate.png';

export default function Home() {
  return (
    <main>
      {/* Banner */}
      <div className="divBanner">
        <img src={banner} alt="Banner Celsinho" className="banner" />
      </div>

      {/* Biografia */}
      <section className="bio">
        <h2 className="titulo_bio">Biografia</h2>
        <img src={subLogo} alt="Sublogo" className="img_bio" />

        <p>
          Crescer rodeado por sons e ritmos foi algo mágico. Lembro de tardes inteiras ouvindo meu pai mixar músicas, 
          aprendendo a sentir a batida e compreender como cada estilo tem sua alma. Aos poucos, fui criando minha 
          identidade sonora, explorando produções próprias e arriscando meus primeiros sets.
        </p>

        <p>
          Com o tempo, comecei a tocar em pequenas festas, eventos de amigos e até mesmo ajudar meu pai em apresentações. 
          A conexão com o público é o que mais me motiva a seguir em frente.
        </p>

        <p>
          Hoje estudo produção musical e dedico meu tempo a entender tudo sobre mixagem, masterização e técnicas de DJ. 
          Meu objetivo é levar minha arte para o mundo e emocionar pessoas com minhas músicas. A jornada está só começando 
          e cada batida me aproxima do meu sonho.
        </p>
      </section>

      {/* Localização */}
      <section className="mapaGeral">
        <h2 className="titulo_bio">Local de Atuação</h2>
        <p>Uma das áreas que costumo tocar</p>

        <div className="mapa">
          <iframe
            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d58454.010464624225!2d-46.65463067626247!3d-23.69827560402097!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce445de3962263%3A0x9ca2ba904b9421db!2sDiadema%2C%20SP!5e0!3m2!1spt-BR!2sbr!4v1748640617351!5m2!1spt-BR!2sbr"
            width="900"
            height="450"
            style={{ border: 0 }}
            allowFullScreen
            loading="lazy"
          ></iframe>
        </div>
      </section>

      {/* Serviços */}
      <section className="servicosGeral">
        <h2 className="titulo_servicos">Serviços</h2>

        <div className="div_servicos">
          <ul className="servicos">
            <li>Sets</li>
            <li>Mashups</li>
            <li>Remixes</li>
          </ul>

          <img src={logoContrate} alt="Contrate" className="img_servicos" />
        </div>

        {/* Vídeo */}
        <div className="video">
          <iframe
            width="800"
            height="500"
            src="https://www.youtube.com/embed/N5fuaJVJVW4?si=c5bVDRMoKOc6QH_f"
            title="YouTube video player"
            frameBorder="0"
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
            loading="lazy"
            allowFullScreen
          ></iframe>
        </div>
      </section>
    </main>
  );
}