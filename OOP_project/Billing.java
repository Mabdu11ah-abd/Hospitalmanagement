import java.util.Date;

public class Billing {
    private float Dueamount;
    private Date Dueddate;

    public void GenerateInvoice()
    {

    }
    public void UpdatePayment()
    {

    }


    public float getDueamount() {
        return Dueamount;
    }

    public void setDueamount(float dueamount) {
        Dueamount = dueamount;
    }

    public Date getDueddate() {
        return Dueddate;
    }

    public void setDueddate(Date dueddate) {
        Dueddate = dueddate;
    }
}
