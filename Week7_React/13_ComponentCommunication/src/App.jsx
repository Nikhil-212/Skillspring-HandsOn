import { useState } from 'react';

function Child({ parentMessage, onChildEvent }) {
  return (
    <div className="card">
      <h3>Child Component</h3>
      <p>Message from Parent: {parentMessage}</p>
      <button onClick={() => onChildEvent('Hello from Child!')}>Send to Parent</button>
    </div>
  );
}

export default function App() {
  const [childData, setChildData] = useState('');

  return (
    <div className="container card">
      <h2>Parent Component</h2>
      <p>Data from Child: {childData}</p>
      <Child parentMessage="Hello from Parent!" onChildEvent={setChildData} />
    </div>
  );
}