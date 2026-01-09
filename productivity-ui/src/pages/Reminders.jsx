import { useEffect, useState } from "react";
import api from "../services/api";

const Reminders = () => {
  const [reminders, setReminders] = useState([]);

  useEffect(() => {
    api.get("/reminders")
      .then(res => setReminders(res.data))
      .catch(err => {
      alert("Unauthorized");
    });
  }, []);

  return (
    <div>
      

      <ul>
        {reminders.map(reminder => (
          <li key={reminder.id}>
            <strong>{reminder.title}</strong> — {reminder.time}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Reminders;
