public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int A=1;A<=100;A++)
            for(int B=2;B<=A;B++)
                for(int C=B+1;C<=A;C++)
                    for(int D=C+1;D<=A;D++)
                        if(Math.pow(A,3)==Math.pow(B,3)+Math.pow(C,3)+Math.pow(D,3))
                            sb.append(String.format("Cube = %d, Triple = (%d,%d,%d)\n",A,B,C,D));
        System.out.println(sb);
    }
}
