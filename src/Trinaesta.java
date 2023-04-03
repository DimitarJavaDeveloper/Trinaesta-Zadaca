public class TrinaesetaZadaca {
	public static void main(String[] args) {
     
        char randomLetter = (char) (random.nextInt(26) + 'a');

        int numTrials = 0;
        while (true) {
            System.out.print("Pogodi ja bukvata: ");
            char guess = scanner.nextLine().charAt(0);

            numTrials++;
            if (guess == randomLetter) {
                System.out.println("Ja pogodivte bukvata " + randomLetter + " vo vashiot" + numTrials + " obid.");
                break;
            }
        }
    }