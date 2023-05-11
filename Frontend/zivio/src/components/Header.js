import React from 'react'
import './Header.css'

function Header(){
    return(
        <div className="jumbotron">
            <h1 className="display-4 header-font">Welcome to ZIVIO!</h1>
            <p className="lead header-font">A Clothing paradise where you can get in touch and keep up with the latest fashion and trend</p>
            <hr className="my-4 header-font"></hr>
            <p className="header-font">Designs that appeals, Cost that doesn't hurt, Quality that lasts forever</p>
            <p className="lead header-font">
            <a className="btn btn-secondary btn-lg btn-style" href="#" role="button">SHOP NOW</a>
            </p>
        </div>  
    );
}

export default Header