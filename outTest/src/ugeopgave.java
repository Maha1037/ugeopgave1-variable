public class ugeopgave {
void main(){
//Opgave 1
    double mælk = 25.50;
    double egg = 16.75;
    double mæl = 18.00;
    double subtotal = mælk+egg+mæl;
    double moms = 25.00;
    double medMoms = subtotal+(subtotal*moms/100);
    System.out.println("Prisen for vare: "+subtotal);
    System.out.println("Prisen med moms: "+medMoms);
    System.out.println("");
//Opgave 2
    double mad = 450.00;
    double drikkepenge = 50.00;
    double drinks = 120.00;
    int antalpersoner = 4;
    double samletBeløb = mad+drikkepenge+drinks;
    double prisPerPerson = samletBeløb/antalpersoner;
    System.out.println("Pris for hver person: "+prisPerPerson);
    System.out.println("");
//Opgave 3
    double originalPrice = 300.00;
    double rabatProcent = 25.00;
    double prisEfterRabat = originalPrice - (originalPrice * rabatProcent / 100);
    double finalPrice = prisEfterRabat + (prisEfterRabat * moms / 100);
    System.out.println("Original price: "+originalPrice);
    System.out.println("Pris efter rabat: "+prisEfterRabat);
    System.out.println("Pris efter moms: "+finalPrice);
    System.out.println("");
//Opgave 4
    int antalGæster = 15;
    int cupcakeantal = 50;
    int cakePerGæst = cupcakeantal/antalGæster;
    int lefover = cupcakeantal%antalGæster;
    System.out.println("Each guest gets "+cakePerGæst+" Cupcakes");
    System.out.println("With "+lefover+" lefover");
    System.out.println("");
//Opgave 5
    StringBuilder sb = new StringBuilder();
    String name = "Marcus";
    int age = 22;
    sb.append("Hello, ");
    sb.append(name);
    sb.append("!");
    sb.append(" You are ");
    sb.append(age);
    sb.append(" years old. ");
    System.out.println(sb.toString());
    System.out.println("");
//Opgave 6
    int score = 100;
    System.out.println("Score: "+score);
    score += 50;
    System.out.println("New score: "+score);
    score += 25;
    System.out.println("Newer score: "+score);
    System.out.println("");
//Opgave 7
    int health = 100;
    System.out.println("Player health: "+health);
    health -= 15;
    System.out.println("Damage taken, player health: "+health);
    health -= 20;
    System.out.println("Damage taken, player health: "+health);
    System.out.println("");
//Opgave 8
    double price = 50.0;
    System.out.println("Price: "+price);
    price *= 2;
    System.out.println("New price: "+price);
    System.out.println("");
//Opgave 9
    int counter = 10;
    System.out.println("Counter: "+counter);
    counter++;
    System.out.println("New counter; "+counter);
    counter--;
    System.out.println("Newer counter: "+counter);
    System.out.println("");
//Opgave 10
    int tal = 10;
    tal += 5;
    System.out.println("Number: "+tal);
    tal -= 3;
    System.out.println("Number: "+tal);
    tal++;
    System.out.println("Number: "+tal);
    tal--;
    System.out.println("Number: "+tal);
    System.out.println("");
//Opgave 11
    String Produkt = "Laptop";
    double minimumpris = 7999.99;
    boolean flereProdukter = true;
    int produktantal = 15;
    double rabatEnkeltprodukt = 10.0;
    String category = "Electronics";
//Opgave 12
    String studentName = "Anna";
    int eksamePoints = 85;
    int afleveringsPoints = 92;
    double pointsgennemsnit = (eksamePoints + afleveringsPoints) / 2.0;
    boolean passedEksam = true;
//Opgave 13
    String guestName = "Peter Hansen";
    int roomNumber = 204;
    int numberOfNights = 3;
    double pricePerNight = 899.00;
    boolean BreakfastIncl = true;
    double totalPrice = pricePerNight * numberOfNights;
//Opgave 14
    int stepsToday = 8547;
    int stepGoal = 10000;
    double antalKm = 6.2;
    int caloriBurnt = 420;
    boolean gaolReached = false;
//Opgave 15
    String bookTitle;
    String writerName;
    int bookISBN;
    int numberOfPages;
    boolean borrowable;
    String currentborrower;
    String dueDate;
    double fineAmount;
    boolean bestSeller;
    double bookRating;
    }

}
