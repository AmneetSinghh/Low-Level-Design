
import java.util.*;
import java.io.*;

public class practice {

    static long startTime = System.currentTimeMillis();

    // for global initializations and methods starts here

    // global initialisations and methods end here

    static void run() {
        boolean tc = true;
        AmneetFastIO r = new AmneetFastIO();
        //FastReader r = new FastReader();

        try (OutputStream out = new BufferedOutputStream(System.out)) {

            //long startTime = System.currentTimeMillis();

            int testcases = tc ? r.ni() : 1;
            int tcCounter = 1;
            // Hold Here Sparky------------------->>>
            // Solution Starts Here

            start:
            while (testcases-- > 0) {

                int n = r.ni();
                if(n%2==0){
                    out.write(("No").getBytes());
                    out.write(("\n").getBytes());
                }
                else{
                    out.write(("Yes").getBytes());
                    out.write(("\n").getBytes());
                    n*=2;
                    int i=n;
                    int j=1;
                    while(j<=n/2){
                        out.write((i+" ").getBytes());
                        out.write((j+"").getBytes());
                        out.write(("\n").getBytes());
                        i--;
                        j+=2;
                    }
                    j=2;
                    while(j<i){
                        out.write((i+" ").getBytes());
                        out.write((j+"").getBytes());
                        out.write(("\n").getBytes());
                        j+=2;
                        --i;
                    }
                }

            }
            // Solution Ends Here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class AmneetFastIO {
        final private int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;
        public BufferedReader br;
        public StringTokenizer st;

        public AmneetFastIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public AmneetFastIO(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String word() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String line() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[100000001]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int ni() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }

        public long nl() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }

        public double nd() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
            if (neg) return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null) return;
            din.close();
        }
    }

    public static void main(String[] args) throws Exception {
        run();
    }

    static int[] readIntArr(int n, AmneetFastIO r) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.ni();
        return arr;
    }

    static long[] readLongArr(int n, AmneetFastIO r) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = r.nl();
        return arr;
    }

    static List<Integer> readIntList(int n, AmneetFastIO r) throws IOException {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) al.add(r.ni());
        return al;
    }

    static List<Long> readLongList(int n, AmneetFastIO r) throws IOException {
        List<Long> al = new ArrayList<>();
        for (int i = 0; i < n; i++) al.add(r.nl());
        return al;
    }

    static long mod = 998244353;

    static long modInv(long base, long e) {
        long result = 1;
        base %= mod;
        while (e > 0) {
            if ((e & 1) > 0) result = result * base % mod;
            base = base * base % mod;
            e >>= 1;
        }
        return result;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String word() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String line() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int ni() {
            return Integer.parseInt(word());
        }

        long nl() {
            return Long.parseLong(word());
        }

        double nd() {
            return Double.parseDouble(word());
        }
    }

    static int MOD = (int) (1e9 + 7);

    static long powerLL(long x, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) result = result * x % MOD;
            n = n / 2;
            x = x * x % MOD;
        }
        return result;
    }

    static long powerStrings(int i1, int i2) {
        String sa = String.valueOf(i1);
        String sb = String.valueOf(i2);
        long a = 0, b = 0;
        for (int i = 0; i < sa.length(); i++) a = (a * 10 + (sa.charAt(i) - '0')) % MOD;
        for (int i = 0; i < sb.length(); i++) b = (b * 10 + (sb.charAt(i) - '0')) % (MOD - 1);
        return powerLL(a, b);
    }

    static long gcd(long a, long b) {
        if (a == 0) return b;
        else return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    static long lower_bound(int[] arr, int x) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (arr[m] >= x) r = m;
            else l = m;
        }
        return r;
    }

    static int upper_bound(int[] arr, int x) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (arr[m] <= x) l = m;
            else r = m;
        }
        return l + 1;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int edge1, int edge2) {
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }

    public static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            if (this.first != o.first)
                return (int) (this.first - o.first);
            else return (int) (this.second - o.second);
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 17 * hash + this.first;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            final Pair other = (Pair) obj;
            return this.first == other.first;
        }
    }

    public static class PairC<X, Y> implements Comparable<PairC> {
        X first;
        Y second;

        public PairC(X first, Y second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(PairC o) {
            // TODO Auto-generated method stub
            return o.compareTo((PairC) first);
        }
    }

    static boolean isCollectionsSorted(List<Long> list) {
        if (list.size() == 0 || list.size() == 1) return true;
        for (int i = 1; i < list.size(); i++) if (list.get(i) <= list.get(i - 1)) return false;
        return true;
    }

    static boolean isCollectionsSortedReverseOrder(List<Long> list) {
        if (list.size() == 0 || list.size() == 1) return true;
        for (int i = 1; i < list.size(); i++) if (list.get(i) >= list.get(i - 1)) return false;
        return true;
    }

}