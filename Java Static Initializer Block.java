
    static Scanner sc = new Scanner(System.in);
    public static int B = sc.nextInt();
    public static int H = sc.nextInt();
    public static boolean flag= (B>0 && H>0)?true:false;
    static{if(flag==false)System.out.println("java.lang.Exception: Breadth and height must be positive");}
