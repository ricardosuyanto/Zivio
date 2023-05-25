import React from 'react'
import { Carousel } from 'antd';
import './CarouselComponent.css'

function CarouselComponent(){
    return(
        <Carousel autoplay>
            <div className="carousel-slide">
                <div className="jumbotron-carousel" style={{backgroundImage:"url('/images/jeans-jumbo.jpg')"}}>
                    <div className='jumbotron-content'>
                        <h1 className="display-4 header-font">50% off every Jeans Product</h1>
                        <p className="lead header-font">Available in all size and all color!</p>
                        <hr className="my-4 header-font"></hr>
                        <p className="header-font">Designs that appeals, Cost that doesn't hurt, Quality that lasts forever</p>
                        <p className="lead header-font">
                        <a className="btn btn-secondary btn-lg btn-style" href="#" role="button">SHOP JEANS NOW</a>
                        </p>
                    </div>
                </div>
            </div>
            <div className="carousel-slide">
                <div className="jumbotron-carousel" style={{backgroundImage:"url('/images/jacket-jumbo.jpg')"}}>
                    <div className='jumbotron-content'>
                        <h1 className="display-4 header-font">50% off on all Jacket</h1>
                    </div>
                </div>
            </div>
     </Carousel>
    );
}

export default CarouselComponent