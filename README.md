# User Registration CRUD Application

This is a basic Spring Boot application that performs CRUD (Create, Read, Update, Delete) operations for user registration. It allows users to register, view a list of all registered users, update user details, and delete users.

## Technologies Used

- **Spring Boot**: The application is built using Spring Boot framework.
- **Spring MVC**: For creating the Controller and handling HTTP requests.
- **Thymeleaf**: Used for rendering dynamic HTML pages.
- **JPA (Hibernate)**: For database interaction and CRUD operations.
- **MySQL**: The database used to store user registration data.

## Features

- Register a new user
- View a list of all registered users
- Update user details
- Delete a user
- User details include name, email, phone number, date of birth, and gender

## Project Setup

### Prerequisites

- JDK 11 or higher
- MySQL database
- Maven (for dependency management)

### Steps to Run the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/chethann07/registration-crud-repo.git
   ```
2. **Navigate into the project directory**:
   ```bash
   cd your-repo-name
   ```
3. **Configure the Database**:
   ```bash
   CREATE DATABASE registration;
   ```
4. **Update the `application.properties` file with your MySQL database credentials**:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/registration
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
5. **Run the project in the IDE with `RegistrationApplication.java` as the main file**
