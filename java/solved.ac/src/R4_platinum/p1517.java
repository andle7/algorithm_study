package R4_platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1517 {
    static long inversionCount;
    static long[] array, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        array = new long[size];
        tmp = new long[size];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, size - 1);
        System.out.println(inversionCount);
        
        br.close();
    }

    private static void mergeSort(int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;

        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        merge(start, mid, end);
    }

    private static void merge(int start, int mid, int end) {
        int left = start, right = mid + 1, index = start;

        while (left <= mid && right <= end) {
            if (array[left] <= array[right]) {
                tmp[index++] = array[left++];
            } else {
                inversionCount += mid - left + 1;
                tmp[index++] = array[right++];
            }
        }

        while (left <= mid) tmp[index++] = array[left++];
        while (right <= end) tmp[index++] = array[right++];

        for (int i = start; i <= end; i++) {
            array[i] = tmp[i];
        }
    }
}
