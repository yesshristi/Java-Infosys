public class PlayerRating {
public int playerPosition;
public String playerName;
public float criticOneRating;
public float criticTwoRating;
public float criticThreeRating;
public float averageRating;
public char category;

public PlayerRating(int playerPosition, String playerName) {
this.playerPosition = playerPosition;
this.playerName = playerName;
}

public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
this.criticOneRating = criticOneRating;
this.criticTwoRating = criticTwoRating;
averageRating = (criticOneRating + criticTwoRating)/2;
}

public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
this.criticOneRating = criticOneRating;
this.criticTwoRating = criticTwoRating;
this.criticThreeRating = criticThreeRating;
averageRating = (criticOneRating + criticTwoRating + criticThreeRating)/3;
}

public void calculateCategory() {
if(averageRating>8) {
category = 'A';
}
else if(averageRating>5 && averageRating<=8) {
category = 'B';
}
else if(averageRating>=0 && averageRating<=5) {
category = 'C';
}
else
category = 'D';
}

public void display() {
System.out.println("The player name : " + playerName);
System.out.println("The player position : " + playerPosition);
System.out.println("The average Rating is : " + averageRating);
System.out.println("The category is : " + category);
}

public static void main(String[] args) {
PlayerRating pr = null;
pr = new PlayerRating(1, "Beckham");
pr.calculateAverageRating(9, 9.9f);
pr.calculateCategory();
pr.display();
System.out.println("The second player is");
pr = new PlayerRating(1, "Oscar");
pr.calculateAverageRating(1, 1.1f);
pr.calculateCategory();
pr.display();
}
}
