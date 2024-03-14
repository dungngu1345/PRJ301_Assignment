
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ConvertToVnDate extends SimpleTagSupport {
    private String value;

    public ConvertToVnDate(String value) {
        this.value = value;
    }
    public void doTag() throws JspException, IOException {
        try {
            DateFormat inputFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date date = inputFormat.parse(value);
            DateFormat outputFormat = new SimpleDateFormat("d, MMMM, yyyy", new java.util.Locale("vi", "VN"));
            String formattedDate = outputFormat.format(date);
            getJspContext().getOut().write(formattedDate);
        } catch (ParseException e) {
            throw new JspException("Error parsing date", e);
        }
    }


}
