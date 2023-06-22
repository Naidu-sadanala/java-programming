import java.util.com;
public class project {
    int input1 = 9;
    int input2 = 5;
    int[2][] input3 = {
        {0,5,123},
        {4,9,234}
    };
    route(input1 , input2 , input3);
    System.out.println(route);
}
static int route(int input1, int input2, int[][] input3){
    int start = 0;
    int end = 0;
    for (int i = 0; i < input3.length; i++) {
        for (int j = 0; j < input3[i].length; j++) {
            if (input3[i][j] == 0) {
                start++;
            }
        }
    }

    }
}
