public class VolumeOfEarth {
    public static void main(String[] args) {

        double radius = 6378.0; // in km 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the Earth in cubic Km is : " + volume );
        System.out.println("The volume of the Earth in cubic miles is : " + volume * 1.6*1.6*1.6);


    }
}