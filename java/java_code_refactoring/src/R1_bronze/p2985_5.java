package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class p2985_5 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);

        Operation1[] Operation1s = {
            new Operation1(A, B, C, "+", (x, y) -> x + y),
            new Operation1(A, B, C, "-", (x, y) -> x - y),
            new Operation1(A, B, C, "*", (x, y) -> x * y),
            new Operation1(A, B, C, "/", (x, y) -> y != 0 ? x / y : Integer.MAX_VALUE),
            new Operation1(B, C, A, "+", (x, y) -> x + y),
            new Operation1(B, C, A, "-", (x, y) -> x - y),
            new Operation1(B, C, A, "*", (x, y) -> x * y),
            new Operation1(B, C, A, "/", (x, y) -> y != 0 ? x / y : Integer.MAX_VALUE)
        };

        Stream.of(Operation1s)
            .filter(op -> op.calculate() == true)
            .findFirst()
            .ifPresent(op -> {
                if (op.getX() == A && op.getY() == B && op.getZ() == C) {
                    System.out.println(A + op.getOperator() + B + "=" + C);
                } else {
                    System.out.println(A + "=" + B + op.getOperator() + C);
                }
            });
    }
}

class Operation1 {
    private int x, y, z;
    private String operator;
    private BiFunction<Integer, Integer, Integer> function;

    public Operation1(int x, int y, int z, String operator, BiFunction<Integer, Integer, Integer> function) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.operator = operator;
        this.function = function;
    }

    public boolean calculate() {
        return function.apply(x, y) == z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getOperator() {
        return operator;
    }
}
