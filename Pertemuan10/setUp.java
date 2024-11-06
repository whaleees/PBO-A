@Before
public class setUp {
    SalesItem salesIte1 = new SalesItem("Java Book", 12345);
    SalesItem salesIte2 = new SalesItem("Other", 123);
    SalesItem salesIte2.addComment("Fred", "too expensive", 1);
}
