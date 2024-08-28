class WithoutFinalVariable {
    final int value = 100;
 
     public void modifyValue() {
         value = 200;
     }
 
     public void displayValue() {
         System.out.println("The modified value is: " + value);
     }
 }
 
 public class NonFinalVariableExample {
     public static void main(String[] args) {
         WithoutFinalVariable obj = new WithoutFinalVariable();
         obj.modifyValue();
         obj.displayValue();
     }
 }