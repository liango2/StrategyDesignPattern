/*
 * Created by softwarepassion.com
 * Any information regarding license for this code snippets and
 * other copyright info can be found @softwarepassion.com
 * The author doesn't take any reposnsibility for the presented
 * code and design patterns solutions.
 * Please be advised that this code can contain errors!
 *
 */

package strategydesignpattern;

/**
 * Simple main class for running an Strategy Pattern example
 * @author Krzysztof Grajek
 * @version 28-01-2011
 */
public class Main {

    /**
     * @param args the command line arguments (not used for Strategy Pattern example)
     */
    public static void main(String[] args) {
        MockReportServlet servlet = new MockReportServlet();
        String request = "PDF";
        String response = "";
        servlet.onGet(request, response);
    }

}
