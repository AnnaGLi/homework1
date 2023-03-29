public class Triangle {
    static int calculateTriangle(int n){
        int result = 0;
        for (int i = 1; i <=n; i ++){
            result = result+i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateTriangle(3));
    }
}