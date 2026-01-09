import TaskCard from "../components/TaskCard";
import axios from "axios";
import { useEffect, useState } from "react";

export default function Tasks() {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const token = localStorage.getItem("token");
    console.log("Retrieved token:", token);
    if (!token) return;
    
    axios.get("http://localhost:8080/api/tasks", {
      headers: {
        Authorization: "Bearer " + token
      }
    })
    .then(res => {
      setTasks(res.data);
    })
    .catch(err => {
      alert("Unauthorized");
    });
  }, []);
  return (
    <ul>
    {tasks.map((task, i) => (
      <li key={i}>{task}</li>
    ))}
  </ul>
  );
}
