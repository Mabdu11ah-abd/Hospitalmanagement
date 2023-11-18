public class Billing {
    private float Dueamount=0;
    public void GenerateInvoice(Patient p)
    {
    System.out.println(p);
    System.out.println("Due Amount " +Dueamount);
    }
    public void UpdatePayment(Patient p, float Newamount)
    {
     Dueamount+=Newamount;
    }


    public float getDueamount() {
        return Dueamount;
    }

    public void setDueamount(float dueamount) {
        Dueamount = dueamount;
    }

}
