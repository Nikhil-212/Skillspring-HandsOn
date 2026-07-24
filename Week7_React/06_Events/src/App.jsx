import { useState } from 'react';

export default function App() {
  const [text, setText] = useState('');
  const [hover, setHover] = useState(false);

  return (
    <div className="container card">
      <button onClick={() => alert('Button Clicked!')}>Click Me</button>
      <div 
        onMouseEnter={() => setHover(true)} 
        onMouseLeave={() => setHover(false)}
        style={{ padding: '20px', background: hover ? '#ddd' : '#eee', marginTop: '10px' }}
      >
        Hover over me!
      </div>
      <input 
        type="text" 
        placeholder="Type here..." 
        value={text} 
        onChange={(e) => setText(e.target.value)} 
      />
      <p>Input: {text}</p>
      <button onDoubleClick={() => alert('Double Clicked!')}>Double Click Me</button>
    </div>
  );
}