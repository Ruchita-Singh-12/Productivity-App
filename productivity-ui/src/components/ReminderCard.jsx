export default function ReminderCard({ reminder }) {
  return (
    <div className="card">
      <h4>{reminder.title}</h4>
      <p>Time: {reminder.time}</p>
      <p>Status: {reminder.status}</p>
    </div>
  );
}
