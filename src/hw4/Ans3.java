package hw4;

public class Ans3 {

	public static void main(String[] args) {

		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {

				if (planets[i].charAt(j) == 'a' || planets[i].charAt(j) == 'e' || planets[i].charAt(j) == 'i'
						|| planets[i].charAt(j) == 'o' || planets[i].charAt(j) == 'u') {
					count++;
				}
//				System.out.print(planets[i].charAt(j));

			}

		}
		System.out.println(count);

	}

}
