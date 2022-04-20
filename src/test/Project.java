package test;

public class Project {

    public  static  void  main(String [] args) {
        String str = addStr(str1, str2);
        int sum = addSum(e, f);
        System.out.println(str + sum);


    }

    static  String str1 = "Go ";
    static String str2 = "home   ";

    static  int e = 3;
    static  int f = 8;

    static  String  addStr(String aa, String bb) {
        String result = aa + bb;

        return result;

    }
    static int addSum(int a, int b){
        int result = a + b;
        return  result;
    }
}
