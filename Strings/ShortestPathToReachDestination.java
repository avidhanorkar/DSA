// Que: Given a root containing 4 directions (E, W, N, S) find the shortest path to reach destination. Path: WNEENESENNN

package Strings;

public class ShortestPathToReachDestination {
    public static double shortestPath(String str){
        double distance = 0;
        double x = 0;
        double y = 0;

        for (int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'W':
                    x -= 1;
                    break;
                case 'E':
                    x += 1;
                    break;
                case 'N':
                    y += 1;
                    break;
                case 'S':
                    y -= 1;
                    break;
                
            }
        }

        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distance;
    }
    
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest distance is: " + shortestPath(path));
    }
}
