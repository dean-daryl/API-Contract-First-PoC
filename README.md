# Contract-First Architecture Demo

A contract-first API development demo where a single OpenAPI specification (`bookstore-api.yaml`) generates both backend (Java Spring) and frontend (TypeScript Angular) code.


Running `mvn clean install` generates:
- **Java** Spring interfaces and DTOs in `target/generated-sources/java/` (package: `com.bookstore.api`)
- **TypeScript** Angular services and models in `target/generated-sources/typescript/`

The build produces two artifacts:
- A **JAR** (`com.bookstore:bookstore-api-contract:1.0.0-SNAPSHOT`) — published to your local Maven repo via `mvn clean install`
- A **TypeScript package** in `target/generated-sources/typescript/` — can be copied locally or published to npm

## Importing in the Backend (Java/Spring Boot)

Add the contract JAR as a dependency in your `pom.xml`:

**From a Maven registry (Artifactory, Nexus, etc.):**

```xml
<dependency>
    <groupId>com.bookstore</groupId>
    <artifactId>bookstore-api-contract</artifactId>
    <version>1.0.0</version>
</dependency>
```

**Local setup:**

```bash
cd api-contract && mvn clean install
```

Then use the same dependency block but with a SNAPSHOT prefix `1.0.0-SNAPSHOT`.

Then implement the generated interfaces in your controllers:

```java
@RestController
public class BooksController implements BooksApi {
    // implement createBook, getBooks, getBookById, updateBook, deleteBook
}
```

## Importing in the Frontend (Angular)

**From an npm registry:**

```bash
npm install @bookstore/api-contract
```

Then import directly from the package:

```typescript
import { BooksService } from '@bookstore/api-contract/api/books.service';
import { BookRequest } from '@bookstore/api-contract/model/book-request';
import { BASE_PATH } from '@bookstore/api-contract';
```

**Locally (for development):**

```bash
cp -r api-contract/target/generated-sources/typescript/ frontend/src/app/api/
```

Then import from the local path:

```typescript
import { BooksService } from '../api/api/books.service';
import { BookRequest } from '../api/model/book-request';
import { BASE_PATH } from '../api';
```

**In both cases**, configure the base path in `app.config.ts`:

```typescript
import { provideHttpClient } from '@angular/common/http';
import { BASE_PATH } from './api'; // or '@bookstore/api-contract'

export const appConfig: ApplicationConfig = {
  providers: [
    provideHttpClient(),
    { provide: BASE_PATH, useValue: 'http://localhost:8080/api' }
  ]
};
```

Then inject the generated services in your components:

```typescript
constructor(private booksService: BooksService) {}

this.booksService.createBook(request).subscribe(book => { ... });
```
