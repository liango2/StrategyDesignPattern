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
 * Common interface for generating reports using different formats
 * 
 * @author Krzysztof Grajek
 * @version 28-01-2011
 */
public interface ReportGenerator {

    /**
     * Generates report using provided report data
     * @param rd ReportData object carrying all info needed to produce report
     */
    public void generateReport(ReportData rd);
}
