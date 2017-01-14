package com.gecko.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlieu on 01/8/17.
 */
public class ToDoItemTest {

   @Test
   public void testPojo () {

      String name = "a task to complete";
      Long id = 1L;
      ToDoItem toDoItem = new ToDoItem ();
      toDoItem.setId(id);
      toDoItem.setName (name);
      boolean complete = false;
      toDoItem.setCompleted (complete);

      Assert.assertEquals(id, toDoItem.getId());
      Assert.assertEquals(name, toDoItem.getName ());
      Assert.assertEquals(complete, toDoItem.isCompleted ());
   }

   @Test
   public void test_Compare_0 () {
      ToDoItem one = new ToDoItem ();
      one.setId (1L);

      ToDoItem two = new ToDoItem ();
      two.setId (1L);

      int compare = one.compareTo (two);
      Assert.assertTrue (compare == 0);
   }

   @Test
   public void test_Compare_1 () {
      ToDoItem one = new ToDoItem ();
      one.setId (1L);

      ToDoItem two = new ToDoItem ();
      two.setId (2L);

      int compare = one.compareTo (two);
      Assert.assertTrue (compare == -1);
   }

   @Test
   public void test_Compare_2 () {
      ToDoItem one = new ToDoItem ();
      one.setId (1L);

      ToDoItem two = new ToDoItem ();
      two.setId (2L);

      int compare = two.compareTo (one);
      Assert.assertTrue (compare == 1);
   }
}