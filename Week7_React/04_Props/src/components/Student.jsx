export default function Student({ name, roll, department, cgpa }) {
  return (
    <div className="card">
      <p>Name: {name}</p>
      <p>Roll Number: {roll}</p>
      <p>Department: {department}</p>
      <p>CGPA: {cgpa}</p>
    </div>
  );
}