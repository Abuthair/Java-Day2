public class VarArgs {

    void calcSum(String name,int... marks) {
        System.out.println("Names " + name);
        System.out.println("Number of Subject " + marks.length);
         int sum=0;
         for (int i : marks){
            sum+=i;
         }
         System.out.println("Sum" +sum);
    }
    public static void main(String[] args) {
      VarArgs vars=new VarArgs();
     vars.calcSum("Ram");
     vars.calcSum("Abu",20);
     vars.calcSum("Sheik",30,20);
    //  vars.calcSum();
    }
}