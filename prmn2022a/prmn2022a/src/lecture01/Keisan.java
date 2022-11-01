package lecture01;

public class Keisan {
    int min(int[] arrays){
        int min = arrays[0];
        for(int i=1;i<arrays.length;i++){
            if(min>arrays[i]){
                min = arrays[i];
            }
        }
        return min;
    }

    int max(int[] arrays){
        int max = arrays[0];
        for(int i=1;i<arrays.length;i++){
            if(max<arrays[i]){
                max = arrays[i];
            }
        }
        return max;
    }

    double average(int[] arrays){
        int sum =0;
        double ave;
        for(int i=0;i<arrays.length;i++){
            sum = sum + arrays[i];
        }
        return ave = (double)sum/arrays.length;
    }
}
