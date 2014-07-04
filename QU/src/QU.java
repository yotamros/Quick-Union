import java.util.Arrays;

public class QU {

    private int[] id;

    public QU(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        System.out.println(Arrays.toString(id));
    }
    
    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
        System.out.println(Arrays.toString(id));
    }

    public static void main(String[] args) {

        System.out.println("how many number would you like to have?");
        int N = StdIn.readInt();
        QU qu = new QU(N);
        System.out.println("which number would you like to unite?");
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!qu.connected(p, q)) {
                qu.union(p, q);
            } else {
                System.out.println("already connected!");
            }
        }
    }
}
