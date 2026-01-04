import ReminderCard from "../components/ReminderCard";

const reminders = [
  { id: 1, title: "Meeting", time: "10:00 AM", status: "PENDING" },
  { id: 2, title: "Medicine", time: "9:00 PM", status: "TRIGGERED" }
];

export default function Reminders() {
  return (
    <div className="container">
      <h2>Reminders</h2>
      {reminders.map(r => (
        <ReminderCard key={r.id} reminder={r} />
      ))}
    </div>
  );
}
