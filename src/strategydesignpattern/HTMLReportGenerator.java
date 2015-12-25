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
 * Responsible for generating reports in HTML format
 *
 * @author Krzysztof Grajek
 * @version 28-01-2011
 */
public class HTMLReportGenerator implements ReportGenerator{

    public void generateReport(ReportData rd) {
        System.out.println("Generating HTML report..." + rd.getTitle());
    }

}
