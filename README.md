# MITA Backend - Java (Spring Boot)

Spring Boot 4.0.1 backend for the Mini Issue Tracker Application.

## Tech Stack

- **Spring Boot 4.0.1**
- **Spring Security** (minimal config)
- **Spring Validation**
- **Lombok**
- **MySQL** (to be implemented)

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- MySQL 8.0 (for later implementation)

### Running the Application

```bash
# Clone with submodule
git clone --recurse-submodules https://github.com/vmatviichuk-epam/mita-backend-java.git
cd mita-backend-java

# Build and run
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

## API Endpoints

### Implemented (Skeleton)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/login` | Login (returns mock JWT) |

### To Implement (Workshop)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | User registration |
| POST | `/api/auth/logout` | User logout |
| GET | `/api/issues` | List user's issues |
| POST | `/api/issues` | Create issue |
| GET | `/api/issues/{id}` | Get issue |
| PUT | `/api/issues/{id}` | Update issue |
| DELETE | `/api/issues/{id}` | Delete issue |

## Testing the Login Endpoint

```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username": "testuser", "password": "password123"}'
```

Response:
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwidXNlcm5hbWUiOiJ0ZXN0dXNlciJ9.MOCK",
  "user": {
    "id": 1,
    "username": "testuser"
  }
}
```

## Project Structure

```
src/main/java/com/mita/
├── MitaApplication.java      # Main application class
├── controller/
│   └── AuthController.java    # Authentication endpoints
├── dto/
│   ├── LoginRequest.java
│   ├── LoginResponse.java
│   └── UserDto.java
└── config/
    ├── SecurityConfig.java    # Spring Security configuration
    └── CorsConfig.java        # CORS configuration
```

## Workshop Tasks

1. **Database Setup** - Uncomment MySQL config, create entities
2. **User Registration** - Implement `/api/auth/register` with password hashing
3. **JWT Authentication** - Generate real JWT tokens
4. **Issue CRUD** - Implement all issue endpoints
5. **User Isolation** - Ensure users can only access their own issues

## API Contract

See [mita-api-contract](https://github.com/vmatviichuk-epam/mita-api-contract) for the OpenAPI specification.

## License

MIT
