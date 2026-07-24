import { useState } from 'react';

export default function App() {
  const [items, setItems] = useState([]);

  const addItem = () => {
    setItems([...items, 'New Item ' + (items.length + 1)]);
  };

  return (
    <div className="container card">
      <h2>Debugged Application</h2>
      <button onClick={addItem}>Add Item</button>
      <ul>
        {items.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}