import React from 'react'
import './CollectionsCatalog.css'
import { Select } from 'antd';

function CollectionsCatalog(){
    return(
        <div >
            <div class="jumbotron-search">
                <div class="split-container">
                    <div class="split-image" onclick="handleClickLeft()" style={{backgroundImage:"url('/images/men-fashion.jpg')"}}>
                        <div class="gender-option-content">
                            <h1 className="display-4 header-font">MEN</h1>
                        </div>
                    </div>
                    <div class="split-image" onclick="handleClickRight()" style={{backgroundImage:"url('/images/women-fashion.jpg')"}}>
                        <div class="gender-option-content">
                            <h1 className="display-4 header-font">WOMEN</h1>
                        </div>
                    </div>
                </div>
            </div>

            <div class="search-components">
                
            </div>

        </div>
    );
}

export default CollectionsCatalog