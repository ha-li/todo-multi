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

}