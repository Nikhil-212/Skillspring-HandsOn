import Student from './components/Student';

export default function App() {
  return (
    <div className="container">
      <Student name="Jane Doe" roll="CS101" department="IT" cgpa={9.2} />
    </div>
  );
}