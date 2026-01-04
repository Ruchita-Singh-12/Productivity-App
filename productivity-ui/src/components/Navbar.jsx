import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <div className="navbar">
      <h2>Productivity App</h2>
      <div>
        <Link to="/dashboard">Dashboard</Link>
        <Link to="/tasks">Tasks</Link>
        <Link to="/reminders">Reminders</Link>
        <Link to="/habits">Habits</Link>
      </div>
    </div>
  );
}
