package exam;

    public static void main(String[] args) 
    {
        int n;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Integer Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
    }
}
