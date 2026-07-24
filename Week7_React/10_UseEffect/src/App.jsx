import { useState, useEffect } from 'react';

export default function App() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    setTimeout(() => {
      setData("Data loaded successfully!");
      setLoading(false);
    }, 2000);
  }, []);

  return (
    <div className="container card">
      {loading ? <p>Loading data...</p> : <h2>{data}</h2>}
    </div>
  );
}