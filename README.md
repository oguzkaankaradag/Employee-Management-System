# Spring WebFlux Reactive CRUD App

This is a sample CRUD (Create, Read, Update, Delete) application built using Spring WebFlux, a reactive programming model for building non-blocking, asynchronous applications on the JVM.

## Description

This application provides RESTful endpoints to perform CRUD operations on an entity called `Employee`. It uses MongoDB as the data store and Lombok annotations for boilerplate code reduction.

## Requirements

- Java Development Kit (JDK) 17 or higher
- Maven
- Docker (optional, for running MongoDB in a container)
- MongoDB (if not using Docker)

## Setup

1. **Clone the Repository**:

   ```bash
   git clone <repository-url>
   ```

2. **Build the Application**:

   Navigate to the project directory and run:

   ```bash
   ./mvnw clean package
   ```

3. **Run MongoDB (Optional)**:

   If you don't have MongoDB installed locally or prefer to run it in a Docker container, you can use Docker Compose:

   ```bash
   docker-compose up -d
   ```

   Alternatively, you can run MongoDB locally on the default port (`27017`).

4. **Run the Application**:

   ```bash
   java -jar target/springboot-webflux-application-0.0.1-SNAPSHOT.jar
   ```

   The application will start on port `8080` by default.

## Usage

You can interact with the application via HTTP requests using tools like POSTMAN. Below are examples of how to use POSTMAN to perform CRUD operations:

### Create Employee

- **Endpoint**: `POST /api/employees`
- **Request Body**: JSON representation of the employee object

1. Open POSTMAN.
2. Set the request method to POST.
3. Enter the request URL: `http://localhost:8080/api/employees`.
4. Set the request body to a JSON object representing the employee:

    ```json
    {
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
    }
    ```

5. Click "Send" to submit the request.

### Get Employee by ID

- **Endpoint**: `GET /api/employees/{id}`

1. Open POSTMAN.
2. Set the request method to GET.
3. Enter the request URL with the employee ID: `http://localhost:8080/api/employees/{id}`.
4. Click "Send" to submit the request.

### Get All Employees

- **Endpoint**: `GET /api/employees`

1. Open POSTMAN.
2. Set the request method to GET.
3. Enter the request URL: `http://localhost:8080/api/employees`.
4. Click "Send" to submit the request.

### Update Employee

- **Endpoint**: `PUT /api/employees/{id}`
- **Request Body**: JSON representation of the updated employee object

1. Open POSTMAN.
2. Set the request method to PUT.
3. Enter the request URL with the employee ID: `http://localhost:8080/api/employees/{id}`.
4. Set the request body to a JSON object representing the updated employee:

    ```json
    {
        "firstName": "Jane",
        "lastName": "Doe",
        "email": "jane.doe@example.com"
    }
    ```

5. Click "Send" to submit the request.

### Delete Employee

- **Endpoint**: `DELETE /api/employees/{id}`

1. Open POSTMAN.
2. Set the request method to DELETE.
3. Enter the request URL with the employee ID: `http://localhost:8080/api/employees/{id}`.
4. Click "Send" to submit the request.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
