import './App.css';
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Collections from './pages/Collections';

function App() {
  return (
    <Router>
      <div className='App'>
        <Navbar/>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/collections" element={<Collections />} />
        </Routes>
        <Footer/>
      </div>    
    </Router>
  );
}

export default App;
