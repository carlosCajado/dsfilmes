import {ReactComponent as StarFull} from "assets/img/estrela1.svg"
import {ReactComponent as StarHalf} from "assets/img/estrela2.svg"
import {ReactComponent as StarEmpty} from "assets/img/estrela3.svg"
import "./styles.css"
function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );

}
export default MovieStars;