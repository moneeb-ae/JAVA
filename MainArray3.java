package Arrays;

public class MainArray3 {
	public static void main(String[] args) {
		String[] Protien = {"Eggs", "Chicken", "Beef", "Tuna"};
		String[] TypesofSalads = java.util.Arrays.copyOfRange(Protien, 1,4);        
        for (String meat : TypesofSalads) {
            System.out.print(meat + " ");           
        }            
	}
}
