import { useEffect, useState } from "react";
import api from "../services/api";

const Habit = () => {
  const [habits, setHabits] = useState([]);

  useEffect(() => {
    api.get("/habits")
      .then(res => setHabits(res.data))
      .catch(err => {
        alert("Unauthorized");
      });
  }, []);

  return (
    <div>
      <ul>
        {habits.map(habit => (
          <li key={habit.id}>
            <strong>{habit.name}</strong> — {habit.status}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Habit;
