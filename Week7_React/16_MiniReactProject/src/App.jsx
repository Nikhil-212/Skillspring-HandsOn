import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import StudentList from './pages/StudentList';
import AddStudent from './pages/AddStudent';

export default function App() {
  return (
    <BrowserRouter>
      <div className="container">
        <nav className="card">
          <Link to="/" style={{ marginRight: '10px' }}>Home / List</Link>
          <Link to="/add">Add Student</Link>
        </nav>
        <Routes>
          <Route path="/" element={<StudentList />} />
          <Route path="/add" element={<AddStudent />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}