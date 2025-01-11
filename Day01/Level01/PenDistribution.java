public class PenDistribution{
	public static void main(String[] args){
		int totalPens = 14;
		int peoples = 3;
		int penPerStudent = totalPens / peoples;
		int remainingPens = totalPens % peoples;
		System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}