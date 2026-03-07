export * from './authors.service';
import { AuthorsService } from './authors.service';
export * from './authors.serviceInterface';
export * from './books.service';
import { BooksService } from './books.service';
export * from './books.serviceInterface';
export const APIS = [AuthorsService, BooksService];
