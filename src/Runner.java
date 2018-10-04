
public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {



        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(true,true));

        System.out.println(stringTimes("Matt",44));
        System.out.println(stringTimes("Jim",23));

        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));

        int[] outerArray = {2, 2, 2, 2, 2};
        int[] innerArray = {2,4};
        System.out.println(linearIn(outerArray, innerArray));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static String stringTimes(String str, int n) {
        String string = "";
        for(int i=0; i<n; i++){
            string += str;
        }
        return string;
    }


    public static String helloName(String name) {
        return "Hello " + name+"!";
    }

    public static boolean firstLast6(int[] nums) {
        if(nums[0]==6|| nums[nums.length-1]==6){
            return true;
        }else{
            return false;
        }
    }

    public static String fizzString(String str) {
        if(str.startsWith("f") && str.endsWith("b")){
            str="FizzBuzz";
        }
        if(str.startsWith("f")){
            str="Fizz";
        }
        if(str.endsWith("b")){
            str="Buzz";
        }
        return str;
    }

    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if(a==b || a==c){
            sum-=a;
        }
        if(b==a || b==c){
            sum-=b;
        }
        if(c==a || c==b){
            sum-=c;
        }
        return sum;
    }

    public int countHi(String str) {
        int result = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
                result+=1;
            }
        }
        return result;
    }

    public int countTriple(String str) {
        int result = 0;
        for(int i = 0; i < str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1) &&  str.charAt(i) == str.charAt(i+2)){
                result+=1;
            }
        }
        return result;
    }

    public boolean lucky13(int[] nums) {
        boolean x = true;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1 || nums[i]==3){
                x = false;
            }
        }
        return x;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int numFound = 0;
        if(inner.length == 0) {
            return true;
        }

        int k = 0;
        for(int i = 0; i < outer.length; i++) {
            if(outer[i] == inner[k]) {
                numFound++;
                k++;
            } else if(outer[i] > inner[k]) {
                return false;
            }

            if(numFound == inner.length)
                return true;
        }

        return false;
    }

}

