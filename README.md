# ToDo-Web-App-Basic-Project-1-

# TASK_MATE

A simple, modern, and visually appealing **Todo Application** built with **Spring Boot**, **Thymeleaf**, **Bootstrap 5
**, and **Maven**.  
Keep track of your tasks, mark them as completed, and meet your deadlines effortlessly.

---

## Features

- Add new tasks with a title and deadline
- Mark tasks as **Complete** or **Pending**
- Delete tasks
- Modern UI with **hero section**, gradients, and card animations
- Light/Dark theme (auto switching on task toggle)
- Responsive design for desktop and mobile

---

## Tech Stack

- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, Bootstrap 5
- **Database:** H2 (default, in-memory for simplicity)
- **Build Tool:** Maven
- **Version Control:** Git & GitHub

---

## Installation & Setup

1. **Clone the repository**

```bash
git clone https://github.com/<YOUR-USERNAME>/todo-app.git
cd todo-app
```

2. Build the project with Maven

```bash
mvn clean package
```

3. Run the application

```bash
java -jar target/todo-app-0.0.1-SNAPSHOT.jar
```

4.Open your browser and visit:

```bash
http://localhost:8080
```

📁 Project Structure

todo-app/
├─ src/
│ ├─ main/
│ │ ├─ java/com/todoapp/...
│ │ └─ resources/templates/ -> Thymeleaf HTML files
│ └─ test/
├─ pom.xml
└─ README.md

⚡ Usage

Add a task → Enter title & deadline → Click "Add Task"

Toggle task status → Click "Mark as Complete" / "Mark as Pending"

Delete a task → Click "Delete"

📌 Notes

Currently uses H2 in-memory database, so all tasks reset after restart.

Can be deployed on Render / Docker / Heroku with Java environment.

💡 Future Improvements

Persistent database (MySQL/PostgreSQL)

User authentication and multi-user support

Filter and search tasks

Real dark/light theme toggle