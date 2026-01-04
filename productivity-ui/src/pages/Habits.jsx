import HabitCard from "../components/HabitCard";

const habits = [
  { id: 1, name: "Morning Exercise", streak: 5 },
  { id: 2, name: "Reading", streak: 10 }
];

export default function Habits() {
  return (
    <div className="container">
      <h2>Habits</h2>
      {habits.map(h => (
        <HabitCard key={h.id} habit={h} />
      ))}
    </div>
  );
}
