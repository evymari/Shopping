package Shooping;

import Shopping.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    @Test
    void bookHasAnAthorAndDescription(){
        Book book = new Book("libro",30,"author","description");

        assertEquals("author", book.getAuthor());
        assertEquals("description", book.getDescription());

    }
  
}