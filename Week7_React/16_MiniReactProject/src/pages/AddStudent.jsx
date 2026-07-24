import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export default function AddStudent() {
  const [name, setName] = useState('');
  const navigate = useNavigate();

  const handleAdd = (e) => {
    e.preventDefault();
    alert('Student ' + name + ' added! (Mock)');
    navigate('/');
  };

  return (
    <div className="card">
      <h2>Add Student</h2>
      <form onSubmit={handleAdd}>
        <input type="text" placeholder="Name" onChange={e => setName(e.target.value)} required />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}