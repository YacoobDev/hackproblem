//given a string of Us and Ds, count the number of valleys
public class ValleyCount {

    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }
    
    public static int countingValleys(int steps, String path){
        int altitude = 0;
        int valleyCount = 0;

        for(int i=0; i<steps; i++){
            if(path.charAt(i)=='U'){
                altitude++;
                if(altitude==0){
                    valleyCount++;
                }
            } else {
                altitude--;
            }
        }
        return valleyCount;
    }
}
