import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] a = {2, 4, 7, 13, 14, 15, 16};
    int[] b = {1, 6, 7, 11, 13, 16, 18};

    int[] c = uniao(a, b);
    int[] d = interseccao(a, b);
    int[] e = diferenca(a, b);

    System.out.println("União => " + Arrays.toString(c));
    System.out.println("Intersecção => " + Arrays.toString(d));
    System.out.println("Diferença => " + Arrays.toString(e));
  }

  private static int[] uniao(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    int k = 0;

    for (int i = 0; i < a.length; i++){
      c[k++] = a[i];
    }

    for (int i = 0; i < a.length; i++){
      c[k++] = b[i];
    }

    return c;
  }

  private static int[] interseccao(int[] a, int[] b){
    int[] aux = new int[a.length + b.length];
    int k = 0;

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < b.length; j++){
        if(a[i] == b[j]){
          aux[k++] = a[i];
        }
      }
    }

    int [] d = new int[k];

    for (int i = 0; i < k; i++){
      d[i] = aux[i];
    }


    return d;
  }

  private static int[] diferenca(int[] a, int[] b){
    int[] aux = new int[a.length + b.length];
    int k = 0;

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < b.length; j++){
        if(a[i] == b[j]){
          aux[k++] = a[i];
        }
      }
    }

    int [] d = new int[k];

    for (int i = 0; i < k; i++){
      d[i] = aux[i];
    }


    return d;
  }

}