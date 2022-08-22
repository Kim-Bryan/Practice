public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for(int x: numbers){
            if(x%divider==0){
                count++;
            } 
        }
    int[] divisiblebynumbers = new int[count];
    int i = 0;
    for(int number: numbers){
        if(number%divider==0){
            divisiblebynumbers[i] = number;
            i++;
        } 
    }
        return divisiblebynumbers;
    }
}
