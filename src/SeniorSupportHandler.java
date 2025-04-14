public class SeniorSupportHandler extends SupportHandler {
    public void handle(String issue) {
        if ("account_ban".equals(issue) || "data_loss".equals(issue)) {
            System.out.println("SeniorSupport Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("Support Cannot handle " + issue + " — manually");
        }
    }
}
