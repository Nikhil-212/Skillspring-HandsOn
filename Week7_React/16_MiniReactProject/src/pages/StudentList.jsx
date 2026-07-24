import { useState, useEffect } from 'react';
import axios from 'axios';

export default function StudentList() {
  const [students, setStudents] = useState([]);
  const [search, setSearch] = useState('');

  useEffect(() => {
    axios.get('https://jsonplaceholder.typicode.com/users')
      .then(res => setStudents(res.data))
      .catch(err => console.error(err));
  }, []);

  const deleteStudent = (id) => {
    setStudents(students.filter(s => s.id !== id));
  };

  const filtered = students.filter(s => s.name.toLowerCase().includes(search.toLowerCase()));

  return (
    <div className="card">
      <h2>Student List</h2>
      <input type="text" placeholder="Search..." onChange={e => setSearch(e.target.value)} />
      <ul>
        {filtered.map(s => (
          <li key={s.id} style={{ marginBottom: '10px' }}>
            {s.name} - {s.email}
            <button onClick={() => deleteStudent(s.id)} style={{ marginLeft: '10px', background: 'red' }}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}