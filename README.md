﻿# SpringBootRestApiDemo

In Spring Boot, REST API methods correspond to HTTP methods and are used to handle various types of web requests:

1. **GET**: Retrieves resources. It’s typically used to fetch data from the server (e.g., getting a list of users).
2. **POST**: Creates new resources. It's used for sending data to the server, often for creating new records.
3. **PUT**: Updates existing resources. Unlike POST, it’s used to update an existing entity or record.
4. **DELETE**: Removes resources. This method deletes a specified resource from the server.
5. **PATCH**: Partially updates resources. It’s used to modify parts of a resource, unlike PUT which updates the entire resource.
6. **@RequestMapping**: Can map any HTTP request method, but is often used for more complex routing requirements.
7. **@RestController**: Combines @Controller and @ResponseBody, simplifying RESTful APIs by handling requests and automatically serializing the responses into JSON.

These methods help build efficient, scalable, and maintainable APIs in Spring Boot.
