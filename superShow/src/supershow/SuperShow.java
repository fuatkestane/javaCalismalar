package supershow;

class A {
  int i, j;
 
  A(int a, int b) {
    i = a;
    j = b;
  } // i ile j yi yazar
  void show() {
    System.out.println("i and j: " + i + " " + j);
  }
}
 
class B extends A {
  int k;
 
  B(int a, int b, int c) {
    super(a, b);
    k = c;
  } // k ‘yı göster – A içindeki show() metodunu örter.
  void show() {
    System.out.println("k: " + k);
  }
}
public class SuperShow {
    
    public static void main(String[] args) {
       B subOb = new B(1, 2, 3);
       subOb.show();
    }    
}
