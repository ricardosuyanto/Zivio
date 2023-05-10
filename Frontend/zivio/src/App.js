import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import Header from './components/Header';
import HomeCatalog from './components/HomeCatalog';

function App() {
  return (
    <div className='App'>
      <Navbar/>
      <Header/>
      <HomeCatalog/>
    </div>    
  );
}

export default App;
