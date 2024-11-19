public class SalesItemTest {
    public static void main(String[] args) {
        SalesItem item = new SalesItem("Gaming Mouse", 4999);

        System.out.println("Initial SalesItem Info:");
        item.showInfo();

        item.addComment("Alice", "Great product! Smooth performance.", 5);
        item.addComment("Bob", "Good for the price.", 4);
        item.addComment("Charlie", "Not very durable.", 3);

        System.out.println("After Adding Comments:");
        item.showInfo();

        item.upvoteComment(0); 
        item.upvoteComment(0); 
        item.downvoteComment(2);

        Comment mostHelpful = item.findMostHelpfulComment();
        if (mostHelpful != null) {
            System.out.println("\nMost Helpful Comment:");
            System.out.println(mostHelpful.getFullDetails());
        } else {
            System.out.println("\nNo comments found.");
        }

        item.removeComment(1); 
        System.out.println("\nAfter Removing Bob's Comment:");
        item.showInfo();

        System.out.println("Total number of comments: " + item.getNumberOfComments());
    }
}
