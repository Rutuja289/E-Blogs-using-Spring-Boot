# 📝 E-Blogs Backend Application

> *Turning ideas into structured, scalable backend systems.*

---

## 📌 Overview

E-Blogs is a backend application built using Spring Boot that allows users to create, manage, and analyze blogs efficiently.  
It also integrates plagiarism detection to ensure content originality and uses pagination for optimized data handling.

---

## 🚀 Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- REST APIs  
- Maven  
- Postman  

---

## ✨ Key Features

🔐 Secure Authentication  
- Implemented using Spring Security (session-based)

📝 Blog Management  
- Create, update, delete, and view blogs  
- Clean Controller → Service → Repository architecture  

📊 Pagination *(New)*  
- Backend pagination using Pageable for efficient data loading  

🔍 Search Functionality *(New)*  
- Search blogs by title and content  

🧠 Plagiarism Detection  
- Integrated external API to verify content originality  

⚙️ RESTful APIs  
- Well-structured APIs with proper HTTP methods  

🚫 Global Exception Handling  
- Centralized error handling  

✅ Input Validation  
- Ensures reliable and clean data processing  

---

## 🏗️ Architecture

- Layered Architecture (Controller → Service → Repository)  
- Clean and maintainable code structure  
- Scalable backend design  

---

## ⚙️ How to Run

1. Clone the repository  
2. Open in IntelliJ / Eclipse  

3. Create database:

CREATE DATABASE eblogs;

4. Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/eblogs  
spring.datasource.username=your_username  
spring.datasource.password=your_password  

⚠️ Note:
- Add your own API key for plagiarism service  
- Do not expose secret keys  

5. Run the Spring Boot application  

6. Test APIs using Postman  

---

## 📂 API Base URL

http://localhost:8080

---

## 🌟 Highlights

- Clean architecture implementation  
- Real-world feature: plagiarism detection  
- Backend pagination & search for scalability  
- Production-like API structure  

---

## 👩‍💻 Author

Rutuja Chaudhari
