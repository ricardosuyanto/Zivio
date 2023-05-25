import React from 'react'
import './Navbar.css'
import { Link, useNavigate} from 'react-router-dom';

function Navbar() {

    const navigate = useNavigate();

    const handleCollectionsPage = () => {
        navigate("/collections")
    }

    return(
        <nav class="navbar navbar-expand-lg navbar-light ">
            <span className="brand">ZIVIO</span>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                <li class="nav-item active">
                    <Link to="/" class="nav-link">Home</Link>
                </li>
                <li class="nav-item">
                    <Link to="/collections" class="nav-link" onClick={handleCollectionsPage}>Browse</Link>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
                </ul>
            </div>
        </nav>
    );
}

export default Navbar;
