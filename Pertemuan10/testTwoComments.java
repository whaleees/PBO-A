@Test
public class testTwoComments {
    SalesItem salesIte1 = new SalesItem("Java Book", 12345);
    assertEquals(true, salesIte1.addComment("James Duckling", "Great book. . . .", 4));
    assertEquals(true, salesIte1.addComment("Fred", "Like it", 2));
    assertEquals(2, salesIte1.getNumberOfComments());
}
