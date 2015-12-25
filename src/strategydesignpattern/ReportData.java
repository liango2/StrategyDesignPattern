/*
 * Created by softwarepassion.com
 * Any information regarding license for this code snippets and
 * other copyright info can be found @softwarepassion.com
 * The author doesn't take any reposnsibility for the presented
 * code and design patterns solutions.
 * Please be advised that this code can contain errors!
 */

package strategydesignpattern;

/**
 * Used to transport data needed to produce report
 * in any form using {@link ReportGenerator}
 * 
 * @author Krzysztof Grajek
 * @version 28-01-2011
 */
public class ReportData {

    private String title;
    private String description;
    //...other report related stuff needed to produce report

    //..getters and setters for the class fields
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
