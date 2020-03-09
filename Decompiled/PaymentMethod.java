public final class PaymentMethod extends Enum
{

    public static PaymentMethod[] values()
    {
        return (PaymentMethod[])$VALUES.clone();
    }

    public static PaymentMethod valueOf(String name)
    {
        return (PaymentMethod)Enum.valueOf(PaymentMethod, name);
    }

    private PaymentMethod(String s, int i)
    {
        super(s, i);
    }

    public static final PaymentMethod CREDIT;
    public static final PaymentMethod RAMBUSRS;
    private static final PaymentMethod $VALUES[];

    static 
    {
        CREDIT = new PaymentMethod("CREDIT", 0);
        RAMBUSRS = new PaymentMethod("RAMBUSRS", 1);
        $VALUES = (new PaymentMethod[] {
            CREDIT, RAMBUSRS
        });
    }
}