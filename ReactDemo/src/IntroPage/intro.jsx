import "./intro.css";
import wavingHii from "./wavingHii.png";

function Intro() {
    return (
        <div className="container">
            <h1>Welcome</h1>

            <img src={wavingHii} alt="Waving" />

            <p>Hello! My name is Purva Kulkarni.</p>

            <p>I am learning React and Spring Boot.</p>

            <button>Thank You</button>
        </div>
    );
}

export default Intro;