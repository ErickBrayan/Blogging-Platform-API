# Personal Blogging Platform API

This is a simple RESTful API for a personal blogging platform that allows users to perform basic CRUD operations on blog posts. The API is built using Spring Boot and MySQL.

## Features

- **Create Blog Post**: Create a new blog post with title, content, category, and tags.
- **Update Blog Post**: Update an existing blog post by its ID.
- **Delete Blog Post**: Delete a blog post by its ID.
- **Get a Single Blog Post**: Retrieve a single blog post by its ID.
- **Get All Blog Posts**: Retrieve a list of all blog posts.
- **Search Blog Posts**: Filter blog posts by a search term in the title, content, or category.

## Endpoints

### Create Blog Post

- **POST /posts**

  Request body:
  ```json
  {
    "title": "My First Blog Post",
    "content": "This is the content of my first blog post.",
    "category": "Technology",
    "tags": ["Tech", "Programming"]
  }
### Update Blog Post

- **PUT /posts/{id}**

  Request body:
  ```json
  {
  "title": "My Updated Blog Post",
  "content": "This is the updated content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"]
  }
### Delete Blog Post

- **DELETE /posts/{id}**

### GET ALL Blog Post

- **GET /posts**

### GET ALL Blog Post by term

- **GET /posts?=term=tech**

### TEST ENDPOINTS (SWAGGER)

- **GET /swagger-ui/index.html**

## Setup

1. **Clone this repository:**

   ```bash
   git clone https://github.com/yourusername/blog-api.git
   
2. **Set Up Environment Variables**
   Create an `application.properties` or `application.yml` file in the `src/main/resources` directory and add the following variables:
   ```properties
   password: <YOUR_DATASOURCE_URL>
   username: <YOUR_DATASOURCE_USERNAME>
   url: <YOUR_DATASOURCE_URL>
   ```

3. **Run Redis**
   Make sure Redis is running locally or is accessible remotely.

4. **Build and Run the Application**
   Use Maven or Gradle to build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   ```bash
   ./gradlew bootRun
   ```

https://roadmap.sh/projects/blogging-platform-api