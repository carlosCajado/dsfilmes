
import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'
function Navbar(){
    return(    
    <header>
        <nav className="container">
          <div className='dsfilmes-nav-content'>
            <h1>Filmes Brasil</h1>
            <a href="https://github.com/carlosCajado">
            <div className='dsfilmes-nav-content'>
              <GithubIcon className='img'/>
              <p className='dsfilmes-contact-link'>/carlosCajado</p>
            </div>
            </a>
          </div>
        
        </nav>
      </header>);

}
export default Navbar;
