import React from "react";
import {Button, Card, Col, Row} from 'antd';
import './CardComponent.css'

const {Meta} = Card;

function CardComponent() {
    const data = [
        { id: 1, title: 'SHOP TOP' , img: require('../assets/t-shirt.jpg')},
        { id: 2, title: 'SHOP SHOES' , img: require('../assets/shoes.jpg')},
        { id: 3, title: 'SHOP PANTS' , img: require('../assets/jeans.jpg')},
        { id: 4, title: 'SHOP JACKET' , img: require('../assets/jacket.jpg')},
        // Add more data objects as needed
      ];

    return(
        <div>
            <Row gutter={20} style={{padding:"50px", justifyContent:"center"}}>
                 {data.map((item => 
                    <Col span={5}  xs={24} sm={12} md={8} lg={6} xl={5} key={item.id}>
                    <Card cover={<img alt="example" src={item.img} />}>
                    {/* <Meta title="Europe Street beat" description="www.instagram.com" /> */}
                        <button className="btn btn-outline-dark btn-lg btn-shop"  role="button">{item.title}</button>
                    </Card>
                    </Col>
                ))}
            </Row>
        </div>
    );
}

export default CardComponent