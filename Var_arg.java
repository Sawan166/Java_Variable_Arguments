class HelloWorld  {
    static int run(int ...arr){
        int res=0;
        for(int e: arr){
            res+=e;
        }
        return res;
    } 
    public static void main(String[] args) {
        System.out.println("Sum of 2 is "+run(2));
        System.out.println("Sum of 2, 3 is "+run(2,3));
        System.out.println("Sum of 2, 3, 5 is "+run(2,3,5));
    }
}
