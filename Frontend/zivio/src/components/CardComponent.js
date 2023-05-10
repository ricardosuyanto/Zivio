import React from "react";
import {Card, Col, Row} from 'antd';

const {Meta} = Card;
const num = 2;

function CardComponent() {
    const data = [
        { id: 1, title: 'Item 1' },
        { id: 2, title: 'Item 2' },
        { id: 3, title: 'Item 3' },
        { id: 4, title: 'Item 4' },
        // Add more data objects as needed
      ];

    return(
        <div>
            <Row gutter={20} style={{padding:"50px", justifyContent:"center"}}>
                 {data.map((item => 
                    <Col span={5}  xs={24} sm={12} md={8} lg={6} xl={5}>
                    <Card cover={<img alt="example" src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png" />}>
                    <Meta title="Europe Street beat" description="www.instagram.com" />
                        <p>Rp. 2.000.000</p>
                    </Card>
                    </Col>
                ))}
            </Row>
        </div>
    );
}

export default CardComponent