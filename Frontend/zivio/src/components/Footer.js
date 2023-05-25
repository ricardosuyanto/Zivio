import React from "react";
import './Footer.css'

function Footer() {

    return(
    //     <footer class="bg-dark text-lg-start">
    //     <div class="container p-4">
    //     <div class="row">
    //         <div class="col-lg-6 col-md-6 mb-4 lg-mb-md-0 footer-content">
    //             <h5 class="text-uppercase">Links</h5>
    //             <ul class="list-unstyled mb-0">
    //                 <li>
    //                     <a href="#!" class="text-light">Link 1</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 2</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 3</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 4</a>
    //                 </li>
    //             </ul>
    //         </div>

    //         <div class="col-lg-6 col-md-6 mb-4 lg-mb-md-0 footer-content">
    //             <h5 class="text-uppercase">Links</h5>
    //             <ul class="list-unstyled mb-0">
    //                 <li>
    //                     <a href="#!" class="text-light">Link 1</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 2</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 3</a>
    //                 </li>
    //                 <li>
    //                     <a href="#!" class="text-light">Link 4</a>
    //                 </li>
    //             </ul>
    //         </div>

    //     </div>
    // </div>

    // <div class="text-center p-3 text-light" style={{backgroundColor: 'rgba(0, 0, 0, 0.2)'}}>
    //     © 2023 ZIVIO
    // </div>
    //     </footer>
    <footer className="footer">
      <div className="container">
        <div className="footer-row">
          <div className="footer-column">
            <h5>About Us</h5>
            <p>Some information about your company.</p>
          </div>
          <div className="footer-column">
            <h5>Contact</h5>
            <p>Email: info@example.com</p>
            <p>Phone: +1 123-456-7890</p>
          </div>
          
          <div className="footer-column">
            <h5>Follow Us</h5>
            <div className="social-icons">
              <a href="#" className="icon">
                <i className="fab fa-facebook-f"></i>
              </a>
              <a href="#" className="icon">
                <i className="fab fa-twitter"></i>
              </a>
              <a href="#" className="icon">
                <i className="fab fa-instagram"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
    </footer>
    );
}

export default Footer