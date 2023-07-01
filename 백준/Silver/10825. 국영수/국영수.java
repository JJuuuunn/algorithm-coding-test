import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String arr[][] = new String[N][4];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                if(o2[1].equals(o1[1])){
                    if(o1[2].equals(o2[2])){
                        if(o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
                    }

                    return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);

                }
                return Integer.parseInt(o2[1])- Integer.parseInt(o1[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String[] name : arr) {
            sb.append(name[0]).append("\n");
        }
        System.out.println(sb);
    }

    private static int sortNum(String num1, String num2) {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }
}