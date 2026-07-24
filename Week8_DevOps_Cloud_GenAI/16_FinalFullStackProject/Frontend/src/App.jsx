import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import { useState, useEffect } from 'react';
import axios from 'axios';

function StudentList() {
    const [students, setStudents] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8080/api/students').then(res => setStudents(res.data));
    }, []);
    return (
        <div>
            <h2>Students</h2>
            <ul>{students.map(s => <li key={s.id}>{s.name}</li>)}</ul>
        </div>
    );
}

export default function App() {
  return (
    <BrowserRouter>
      <div>
        <nav><Link to="/">Home</Link></nav>
        <Routes>
          <Route path="/" element={<StudentList />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}
