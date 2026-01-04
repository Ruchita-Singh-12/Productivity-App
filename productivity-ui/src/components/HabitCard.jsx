export default function HabitCard({ habit }) {
  return (
    <div className="card">
      <h4>{habit.name}</h4>
      <p>Streak: 🔥 {habit.streak} days</p>
    </div>
  );
}
