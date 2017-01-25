package com.casinoreal;
import  java.util.ArrayList;
/**
 * Created by randallcrame on 1/24/17.
 */
public class BlackJack extends CardGames{
    private Shoe blackJack=; //Shoe Object
    private int playerHandValue;
    private int dealerHandValue;
    private double bet;
    private double secondBet;
    private double payout = 2.0;
    private double naturalBlackJackPayout = 2.5;
    private ArrayList<Object> playerHand = new ArrayList<>();
    private ArrayList<Object> player2ndHand = new ArrayList<>();
    private ArrayList<Object> dealerHand = new ArrayList<>();
    private ArrayList<ArrayList> membersInGame = new ArrayList();


    private void addMemberToGame(ArrayList member){
        this.membersInGame.add(member);
    }

    private void joinMembersInGame(){
        addMemberToGame(playerHand);
        addMemberToGame(dealerHand);
        // will add function to add NPCs
    }

    private void dealFromShoe(ArrayList currentMember){
        //deal 1 card to player
        //currentMember.add(first card from shoe);
        //this.blackJack.remove(0) removes first card from shoe.
    }
    private void dealToPlayers(){
        for (int i =0; i<2; i++) {
            for (ArrayList member : this.membersInGame) {
                dealFromShoe(member);
            }
        }
    }

    protected void setWager(double bet){
        //Set Bet
        //this.bet = bet;
        //playersBalance-= bet;
    }


    protected void hit(){
        //Command requesting another card
        //dealFromShoe(playerHand);
    }

    protected void stay(){
        //Command end turn
        //break;???
    }

    protected void doubleDown(){
        // raises bets 2x the amount
        //this.bet += this.bet;
        // request another card
        // dealFromShoe(playerHand);
        // Command ends turn
        // stay();
    }
    private void splitHand(ArrayList currentPlayer, ArrayList secondHand){
        //secondHand.add(1, currentPlayer);
        //currentPlayer.remove(1);
    }
    protected void split(ArrayList currentPlayer, ArrayList secondHand){
        // raises bets to another pot of the same bet
        // this.secondBet = this.bet;
        // splitHand(currentPlayer, secondHand);
        // deals 2nd card to new hands
    }
    private boolean isSplitState(){
        //checks if turn is currently split?? unsure of redundancy
        return false;
    }
    private boolean isSplittable(){
        //checks to see if starting hand is splittable 2
        return false;
    }

    public void setPlayerHandValue(ArrayList playerHandValue) {

                this.playerHandValue = 0; // sum of ArrayList Hand
    }

    public int getPlayerHandValue() {
        return playerHandValue;
    }

    public void setDealerHandValue(ArrayList dealerHandValue) {
        this.dealerHandValue = 0; // sum of ArrayList Hand
    }

    public int getDealerHandValue() {
        return dealerHandValue;
    }

    protected boolean compare(int playerHandValue, int dealerHandValue){
        //compares the value to see which is greater
        return false;
    }

    private boolean isNatural21(){
        //checks to see if starting hand is a Natural 21
        return false;
    }

    private void dealerNatural21(){
        // ends game for all who didn't have a natural 21
    }

    private int aceAs1or11(){
        // sets the value of Ave as 1 or 11 based on which is better
        return 0;
    }

    private boolean isBust(int handvalue){
        // checks if  handvalue is greater then 21
        return false;
    }

    private boolean isSoft16(int dealerHandValue){
        // checks if dealer handvalue is greater then 17
        return false;
    }

    private void insurance(){
        // request bets for insurance
        // checks for dealers natural 21
    }

    private void playerTurn(){
        // runs loop for player's turn until bust or stay occurs
    }

    private void dealerTurn(){
        // runs loop for dealer's turn until bust or stay occurs. Soft16 conditions occurs
    }

    private boolean isLowCardCount(){
        //checks to see if shoe card count is 2.3 gone
        return false;
    }

    private void shuffleShoe(){
        // shuffles a new Shoe deck for blackjack.
    }
}
