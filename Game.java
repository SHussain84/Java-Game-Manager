/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private String objective;
    private int costInPence;
    private int numberOfDownloads;
    private String bestScoreName;
    private int bestScore = 0;
    private Manager gameManager;

    /**
     * Constructor for objects of class Game
     */
    public Game(String gameTitle, String gameObjective, int gameCostInPence, Manager newGameManager) // constructor
    {
        title = gameTitle;
        objective = gameObjective;
        costInPence = gameCostInPence;
        numberOfDownloads = 0;
        gameManager = newGameManager;
        bestScore = 0;
        bestScoreName = "";
    }
    
    public Game(Manager defaultManager) // default constructor (just to make testing easier)
    {
        title = "Revenge of the Killer Zombies";
        objective = "To thrill";
        costInPence = 75;
        numberOfDownloads = 6784;
        bestScore = 2000;
        bestScoreName = "Subhaan";
        gameManager = defaultManager;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    public String getObjective() {
        return objective;
    }
    
    public void setObjective(String newObjective) {
        objective = newObjective;
    }
    
    public int getCostInPence() {
        return costInPence;
    }
    
    public void setCostInPence(int newCostInPence) {
        costInPence = newCostInPence;
    }
    
    public void download() {
        System.out.println("Congratulations on purchasing and downloading your new game!");
        System.out.println("The cost of this game is " + costInPence);
        numberOfDownloads += 1;
    }
    
    public void checkScore(int playerScore, String playerName) {
        if (playerScore > bestScore) {
            bestScore = playerScore;
            bestScoreName = playerName;
        }
    }
    
    public void printReport() {
        System.out.println("Title : " + title);
        System.out.println("Objective : " + objective);
        System.out.println("Download cost : " + costInPence);
        System.out.println("Number of downloads to date : " + numberOfDownloads);
        System.out.println("Best score to date : " + bestScore);
        System.out.println("Player with best score : " + bestScoreName);
        System.out.println("Earnings to date : " + calculateEarnings());
        System.out.println("Manager's name : " + gameManager.getSurname());
    }
    
    public int calculateEarnings() {
        return costInPence * numberOfDownloads;
    }
    
    public int getBestScore() {
        return bestScore;
    }
    
    public String getBestScoreName() {
        return bestScoreName;
    }
    
    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }
    
    public String getManagerID() {
        return gameManager.getManagerID();
    }
}
