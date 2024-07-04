package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class p30087_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            switch (input) {
                case "Algorithm":
                    sb.append(204).append("\n");
                    break;
                case "DataAnalysis":
                    sb.append(207).append("\n");
                    break;
                case "ArtificialIntelligence":
                    sb.append(302).append("\n");
                    break;
                case "CyberSecurity":
                    sb.append("B" + 101).append("\n");
                    break;
                case "Network":
                    sb.append(303).append("\n");
                    break;
                case "Startup":
                    sb.append(501).append("\n");
                    break;
                case "TestStrategy":
                    sb.append(105).append("\n");
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
