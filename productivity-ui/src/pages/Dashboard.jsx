import { useEffect, useState } from "react";
import api from "../services/api";

function Dashboard() {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    api.get("/tasks")
      .then(res => setTasks(res.data))
      .catch(() => alert("Unauthorized"));
  }, []);

  return (
    <div>
      <ul>
        {tasks.map((task, i) => (
          <li key={i}>{task}</li>
        ))}
      </ul>
    </div>
  );
}

export default Dashboard;
