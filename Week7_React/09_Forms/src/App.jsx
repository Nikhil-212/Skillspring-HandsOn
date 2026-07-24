import { useState } from 'react';

export default function App() {
  const [formData, setFormData] = useState({ name: '', email: '', department: '', phone: '' });
  const [errors, setErrors] = useState({});

  const validate = () => {
    let tempErrors = {};
    if (!formData.name) tempErrors.name = "Name is required";
    if (!formData.email) tempErrors.email = "Email is required";
    if (!formData.department) tempErrors.department = "Department is required";
    if (!formData.phone) tempErrors.phone = "Phone is required";
    setErrors(tempErrors);
    return Object.keys(tempErrors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) {
      alert('Registration Successful');
    }
  };

  return (
    <div className="container card">
      <h2>Student Registration</h2>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Name" onChange={e => setFormData({...formData, name: e.target.value})} />
        {errors.name && <p className="error">{errors.name}</p>}
        
        <input type="email" placeholder="Email" onChange={e => setFormData({...formData, email: e.target.value})} />
        {errors.email && <p className="error">{errors.email}</p>}
        
        <input type="text" placeholder="Department" onChange={e => setFormData({...formData, department: e.target.value})} />
        {errors.department && <p className="error">{errors.department}</p>}
        
        <input type="text" placeholder="Phone Number" onChange={e => setFormData({...formData, phone: e.target.value})} />
        {errors.phone && <p className="error">{errors.phone}</p>}
        
        <button type="submit">Register</button>
      </form>
    </div>
  );
}