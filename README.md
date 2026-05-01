# 🔐 Session Management Demo — Java Servlet + JSP
 
A Java web application demonstrating **session management** using **Cookies** and **HttpSession**, built with Jakarta Servlets and JSP. The project also includes a feedback form and a modular JSP component structure.
 
---
 
## 📁 Project Structure
 
```
├── src/
│   └── session/manage/
│       ├── Request1Servlet.java      # Creates cookie & HTTP session
│       └── Request2Servlet.java      # Reads cookie & HTTP session
│
└── WebContent/
    ├── index.jsp                     # Home page
    ├── feedback.jsp                  # Feedback form page
    ├── about.jsp                     # About page
    └── components/
        ├── header.jsp                # Shared navbar with active-tab logic
        ├── links.jsp                 # CSS/CDN link imports
        └── scripts.jsp              # JS script imports
```
 
---
 
## ✨ Features
 
- **Cookie Management** — Creates and reads cookies across servlet requests
- **HttpSession Management** — Stores and retrieves session attributes (UUID-based user keys)
- **ServletConfig & ServletContext** — Reads init parameters from `web.xml`
- **Feedback Form** — Collects email, phone, and message via a POST form
- **Modular JSP Layout** — Reusable header, links, and scripts components via `@include`
- **Active Nav Highlighting** — Server-side active tab detection using request URI
---
 
## 🔄 How Session Management Works
 
### `Request1Servlet` (`/servlet1`)
- Creates a `Cookie` named `username` with a 10-minute expiry
- Reads `app_name` (context param) and `userName` (servlet init param) from `web.xml`
- Creates an `HttpSession` and stores a random UUID as `userKey`
### `Request2Servlet` (`/servlet2`)
- Reads the `username` cookie from the incoming request
- Displays a welcome message if the cookie is found
- Fetches `app_name` and `userEmail` init params from `web.xml`
- Retrieves and displays the `userKey` stored in the HTTP session
---
 
## 🛠️ Tech Stack
 
| Layer      | Technology                        |
|------------|-----------------------------------|
| Backend    | Java, Jakarta Servlet API         |
| Frontend   | JSP, Bootstrap 5                  |
| Build      | Maven / your IDE (e.g., IntelliJ) |
| Server     | Apache Tomcat (Jakarta EE)        |
 
---
 
## ⚙️ Setup & Running
 
### Prerequisites
- JDK 17+
- Apache Tomcat 10+ (Jakarta EE namespace)
- Maven or an IDE like IntelliJ IDEA
### Steps
 
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```
 
2. **Configure `web.xml`**
   Add the following to your `WEB-INF/web.xml`:
   ```xml
   <context-param>
       <param-name>app_name</param-name>
       <param-value>MyApp</param-value>
   </context-param>
 
   <servlet>
       <servlet-name>Request1Servlet</servlet-name>
       <servlet-class>session.manage.Request1Servlet</servlet-class>
       <init-param>
           <param-name>userName</param-name>
           <param-value>riddhi</param-value>
       </init-param>
   </servlet>
   <servlet-mapping>
       <servlet-name>Request1Servlet</servlet-name>
       <url-pattern>/servlet1</url-pattern>
   </servlet-mapping>
 
   <servlet>
       <servlet-name>Request2Servlet</servlet-name>
       <servlet-class>session.manage.Request2Servlet</servlet-class>
       <init-param>
           <param-name>userEmail</param-name>
           <param-value>riddhi@example.com</param-value>
       </init-param>
   </servlet>
   <servlet-mapping>
       <servlet-name>Request2Servlet</servlet-name>
       <url-pattern>/servlet2</url-pattern>
   </servlet-mapping>
   ```
 
3. **Deploy to Tomcat**
   - Build the project and deploy the `.war` file to your Tomcat `webapps` directory, or use your IDE's run configuration.
4. **Access the app**
   ```
   http://localhost:8080/<your-app-name>/
   ```
 
---
 
## 🚀 Usage Flow
 
1. Open the home page (`index.jsp`)
2. Click **"Go to Servlet 1"** — a cookie and session are created
3. Click **"Go to Servlet 2"** — the cookie and session are read and displayed
4. Click **"Give us Feedback"** — fill and submit the feedback form
---
 
## 📝 Notes
 
- Cookies are set with a **10-minute** max age (`setMaxAge(600)`)
- Sessions are set with a **10-minute** inactivity timeout (`setMaxInactiveInterval(600)`)
- The `@WebServlet` annotations are commented out in favour of `web.xml` mapping — choose one approach
---
