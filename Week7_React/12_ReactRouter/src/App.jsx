import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';

function Home() { return <div className="card"><h2>Home</h2></div>; }
function About() { return <div className="card"><h2>About</h2></div>; }
function Contact() { return <div className="card"><h2>Contact</h2></div>; }
function Students() { return <div className="card"><h2>Students</h2></div>; }

export default function App() {
  return (
    <BrowserRouter>
      <div className="container">
        <nav style={{ marginBottom: '20px' }}>
          <Link to="/" style={{ marginRight: '10px' }}>Home</Link>
          <Link to="/about" style={{ marginRight: '10px' }}>About</Link>
          <Link to="/contact" style={{ marginRight: '10px' }}>Contact</Link>
          <Link to="/students">Students</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/students" element={<Students />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}