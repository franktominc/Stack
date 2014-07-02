package Pilha;


public class TestPilha {

    public static Pilha[] sort(Pilha[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(!A[i].compareTo(A[j])){
                    Pilha aux = A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Pilha<Integer>[] V = new Pilha[(int)(Math.random()*100)+50];
        for (int i = 0; i < V.length; i++) {
            V[i] = new Pilha<Integer>();
            int n = (int) (Math.random()*100);
            for (int j = 0; j < n; j++) {
                V[i].push((int)(Math.random()*100));
            }
        }
        V=sort(V);
        System.out.println("Quantidade de pilhas:" + V.length);
        for (int i = 0; i < V.length; i++) {
            System.out.println("Tamanho da pilha: " + V[i].getK());
            while (!V[i].isEmpty()){
                System.out.print(V[i].pop() + " ");
            }
            System.out.println();
        }

    }
}
