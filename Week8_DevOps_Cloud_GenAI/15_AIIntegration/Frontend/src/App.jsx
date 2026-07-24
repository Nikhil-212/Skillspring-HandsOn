import { useState } from 'react';
import axios from 'axios';
export default function App() {
  const [prompt, setPrompt] = useState('');
  const [response, setResponse] = useState('');
  const handleSubmit = (e) => {
    e.preventDefault();
    axios.post('http://localhost:8080/api/ai/prompt', { prompt })
      .then(res => setResponse(res.data.response))
      .catch(err => console.error(err));
  };
  return (
    <div style={{ padding: '20px' }}>
      <h2>AI Integration</h2>
      <form onSubmit={handleSubmit}>
        <input type="text" value={prompt} onChange={e => setPrompt(e.target.value)} />
        <button type="submit">Submit</button>
      </form>
      <p>{response}</p>
    </div>
  );
}
