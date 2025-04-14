public class FAQBotHandler extends SupportHandler {
    public void handle(String issue) {
        if ("password_reset".equals(issue)) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually");
        }
    }
}
