# Employee Payroll App - Spring Boot

A RESTful web service built using Spring Boot to manage employee payroll data, demonstrating layered architecture, validation, exception handling, and logging.

---

## 🔧 Tech Stack

- Java 17
- Spring Boot 3.5.0
- Spring Web
- Lombok
- Maven
- Git & GitHub

---

## ✅ Completed Use Cases

### ✔️ UC1 - Project Setup
- Set up Spring Boot project with required dependencies
- Basic application structure initialized

### ✔️ UC2 - CRUD Operations (In-Memory)
- `POST /create` → Add a new employee using DTO
- `GET /get/{id}` → Get employee by ID
- `GET /getall` → Retrieve all employees
- `PUT /update/{id}` → Update employee details
- `DELETE /delete/{id}` → Delete employee by ID

### ✔️ UC3 - Logging & Profile Configuration
- Added console logging with `@Slf4j`
- Profile-based configuration using `application-dev.properties`
- Port and log patterns are profile dependent

### ✔️ UC4 - Validation & Global Exception Handling
- Validated name and salary in `EmployeeDTO` using annotations
- Added a `GlobalExceptionHandler` to handle validation errors
- Customized error responses for cleaner output

### ✔️ UC5 - Custom Exceptions + ResponseEntity
- Created `EmployeeNotFoundException`
- Wrapped all responses using `ResponseEntity`
- Unified API response structure

### ✔️ UC6 - Get All Employees
- Added a new endpoint to fetch all employees
- Uses logging and returns a JSON array of employees

---

## 📁 Folder Structure
<img width="368" alt="Screenshot 2025-05-25 at 21 35 15" src="https://github.com/user-attachments/assets/c92d0d36-b510-4558-b6dd-a634c10f8400" />


---

## 🧪 API Testing

You can test the endpoints using:
- `curl`
- Postman
- REST Client (VS Code)

Example:
```bash
curl -X POST http://localhost:8080/employeepayrollservice/create \
     -H "Content-Type: application/json" \
     -d '{"name":"John Doe", "salary":50000}'




👨‍💻 Author
Kartik Gupta — Spring Boot Learning Project


