export default function TaskCard({ task }) {
  return (
    <div className="card">
      <h4>{task.title}</h4>
      <p>Priority: {task.priority}</p>
      <p>Status: {task.status}</p>
    </div>
  );
}
