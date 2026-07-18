import "./Coffee.css";
import coffee from "./coffee.png";

function Coffee() {
    return (
        <div className="container">

            <h1>Brew Haven</h1>

            <h3>Fresh Coffee • Fresh Mood</h3>

            <img src={coffee} alt="Coffee Cup" className="coffee-img"/>

            <h2>About Us</h2>

            <p>
                Welcome to Brew Haven! We serve freshly brewed coffee
                made with premium coffee beans and lots of love.
            </p>

            <h2>Our Menu</h2>

            <div className="menu">

                <div className="card">
                    <h3> Espresso</h3>
                    <p>₹120</p>
                </div>

                <div className="card">
                    <h3> Latte</h3>
                    <p>₹200</p>
                </div>

                <div className="card">
                    <h3> Cappuccino</h3>
                    <p>₹180</p>
                </div>

                <div className="card">
                    <h3> Mocha</h3>
                    <p>₹220</p>
                </div>

            </div>

            <h2>Visit Us</h2>

            <p>📍 Nanded, Maharashtra</p>

            <p>🕘 Open : 9:00 AM - 9:00 PM</p>

            <button>Order Now</button>

        </div>
    );
}

export default Coffee;