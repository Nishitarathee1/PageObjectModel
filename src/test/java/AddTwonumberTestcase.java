public class AddTwonumberTestcase {
    public static void main(String agr[])
    {
        AddTwonumbers ad = new AddTwonumbers();
        int total = ad.sum(1,2);
        if (total==4)
        {
            System.out.println("Testcase is passed and expected results is"+total);
        }
        else

        {
            System.out.println("Testcase is failed");
        }
    }
}
