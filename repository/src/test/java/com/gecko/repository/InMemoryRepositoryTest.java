package com.gecko.repository;

import com.gecko.domain.ToDoItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 01/8/17.
 */
public class InMemoryRepositoryTest {

   private ToDoRepository inMemoryRepo;

   @Before
   public void setUp () {
      inMemoryRepo = new InMemoryRepository ();
   }

   @Test
   public void insertToDoItem () {
      ToDoItem item = new ToDoItem ();
      item.setName ("Write unit tests");
      Long newId = inMemoryRepo.insert (item);
      assertNotNull (newId);

      ToDoItem persistedItem = inMemoryRepo.findById (newId);
      assertNotNull (persistedItem);
      assertEquals (item, persistedItem);
   }
}