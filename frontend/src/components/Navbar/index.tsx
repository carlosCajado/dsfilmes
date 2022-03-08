
import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'
function Navbar(){
    return(    
    <header>
        <nav className="container">
          <div className='dslivros-nav-content'>
            <h1>Livros BiCT</h1>
            <a href="https://github.com/carlosCajado">
            <div className='dslivros-nav-content'>
              <GithubIcon className='img'/>
              <p className='dslivros-contact-link'>/carlosCajado</p>
            </div>
            </a>
          </div>
        
        </nav>
      </header>);

}
export default Navbar;
