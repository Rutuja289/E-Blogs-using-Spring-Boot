# 📝 E-Blogs Backend Application



## 📌 Description

A scalable backend application built with Spring Boot that allows users to 

create, manage, and analyze blogs. Features include plagiarism checking, 

pagination, search functionality, and is fully containerized using Docker.



---



## 🚀 Tech Stack

- Java 17

- Spring Boot

- Spring Security

- Hibernate (JPA)

- MySQL 8

- REST APIs

- Maven

- Postman

- Docker

- Docker Compose



---



## ✨ Features

- Blog Creation, Update, and Management

- User and Category Management

- Plagiarism Detection using API integration

- Pagination for optimized data loading (~50 → 5 records per request)

- Search blogs by title and content

- RESTful API Design (Controller-Service-Repository pattern)

- Global Exception Handling

- Input Validation

- Fully Dockerized with Docker Compose



---



## 🐳 How to Run with Docker (Recommended)



### Prerequisites

- Install Docker Desktop from https://www.docker.com/products/docker-desktop



### Steps

1. Clone the repository

   git clone https://github.com/Rutuja289/Blogs-using-SpringBoot-main.git



2. Switch to docker-aws branch

   git checkout docker-aws



3. Create a .env file in project root with these values:

   SPRING_DATASOURCE_PASSWORD=your_password

   OPENAI_API_KEY=your_openai_key

   MAIL_USERNAME=your_email

   MAIL_PASSWORD=your_email_password



4. Run with Docker Compose

   docker-compose up --build



5. Access the application

   http://localhost:8308



### Docker Screenshots
Docker Containers Running


Application Started Successfully


Application in Browser
https://github.com/Rutuja289/E-Blogs-using-Spring-Boot/blob/docker-aws/screenshots/application.png?raw=true



---



## ⚙️ How to Run Locally (Without Docker)



1. Clone the repository

2. Open project in Spring Tool Suite / IntelliJ

3. Create MySQL database: eblogs11

4. Update application.properties with your credentials

5. Run the Spring Boot application

6. Test APIs using Postman



---



## 📂 API Base URL

http://localhost:8308



---



## 🌿 Branches

| Branch | Description |

|--------|-------------|

| `main` | Original version without Docker |

| `docker-aws` | Dockerized version with Docker Compose |



---



## 👩‍💻 Author

Rutuja Chaudhari

- LinkedIn: linkedin.com/in/rutuja20

- GitHub: github.com/Rutuja289
