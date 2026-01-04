import TaskCard from "../components/TaskCard";

const tasks = [
  { id: 1, title: "Study Spring Boot", priority: "HIGH", status: "PENDING" },
  { id: 2, title: "Workout", priority: "MEDIUM", status: "COMPLETED" }
];

export default function Tasks() {
  return (
    <div className="container">
      <h2>Tasks</h2>
      {tasks.map(task => (
        <TaskCard key={task.id} task={task} />
      ))}
    </div>
  );
}
