import Navbar from './components/Navbar';
import Home from './components/Home';
import About from './components/About';
import StudentCard from './components/StudentCard';
import Footer from './components/Footer';

export default function App() {
  return (
    <div>
      <Navbar />
      <div className="container">
        <Home />
        <About />
        <StudentCard />
      </div>
      <Footer />
    </div>
  );
}