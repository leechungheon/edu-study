package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] planes = new Plane[2];
		planes[0] = new Airplane("L747", 1000);
		planes[1] = new Cargoplane("C40", 1000);
		printInfo(planes);
		
		System.out.println("\n[100 운항]");
		for(Plane plane : planes) {
			plane.flight(100);
		}
		printInfo(planes);
		
		System.out.println("\n[200 주유]");
		for(Plane plane : planes) {
			plane.refuel(200);
		}
		printInfo(planes);
	}
	public static void printInfo(Plane[] list) {
		 // 타이틀 출력
		 // Plane 객체들의 데이터 출력(출력 결과 참조)
		System.out.println("Plane\t\tfuelSize");
		System.out.println("--------------------------");
		for(Plane plane : list) {
			System.out.println(plane.getPlaneName()+"\t\t"+plane.getFuelSize());
		}
	}
}
