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
 * Example class using {@code ReportGenerator} interface
 * This class mimmicks the behaviour of a http servlet, assuming that all needed
 * parameters for generating report are coming from the database or in the form
 * of servlet request parameters contained in a single {@code ReportData } object,
 * we choose one of the available report generators
 * to generate our report.
 * 
 * @author Krzysztof Grajek
 * @version 28-01-2011
 */
public class MockReportServlet {

    private ReportGenerator reportGenerator;

    public void onGet(String request, String response){
        //1. get the data from the database, request parameters or any other source
        //in the form of ReportData object
        ReportData reportData = new ReportData();
        reportData.setTitle("Design Patterns Report for: Strategy Pattern");
        //2. Using the request parameter decide on which one of three report generators
        //to use when generating the report
        
        //3. Assuming that PDF generator was selected by the user generate PDF report
        if("PDF".equals(request)){
            reportGenerator = new PDFReportGenerator();
            reportGenerator.generateReport(reportData);
        }
    }
}
