package com.gecko.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

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

      Assert.assertEquals(id, toDoItem.getId());
      Assert.assertEquals(name, toDoItem.getName ());
   }

}