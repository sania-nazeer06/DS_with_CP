class Demo{
    public String check(int a, int b){
        if(a%2==0){
            return "even";
        }
        return "odd";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("DS with CC");
        Demo obj= new Demo();
        System.out.println(obj);
        String a= obj.check(10, 21);
        System.out.println(a);
        String b= obj.check(11, 21);
        System.out.println(b);
    }
}
