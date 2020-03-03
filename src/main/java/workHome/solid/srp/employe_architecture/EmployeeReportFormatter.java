package workHome.solid.srp.employe_architecture;

public class EmployeeReportFormatter  extends ReportFormatter{


    public EmployeeReportFormatter(Object o, FormatType formatType) {
        super(o, formatType);
    }
public String getFormatterEmployee(){
        return formattedOutput;
}

}
