public class trapping_raining {
    public static int Trapping_Rain(int height[]){
        int n = height.length - 1;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i = 1 ; i < n ; i++){
            leftmax[i] = Math.max(leftmax[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i], rightmax[i + 1]);
        }

        int trapping_water = 0;
        for(int i = 0 ; i < n ; i++){
            int water_level = Math.max(leftmax[i], rightmax[i]);

            trapping_water = water_level - height[i];
        }

        return trapping_water;

    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 8, 6, 2, 3};

        System.out.println(Trapping_Rain(height));
    }
}
