package OOP.Sttatic;

public class staticWord {
    public static void main(String[] args) {

        Friend friend1 = new Friend("SpongeBOB");
        Friend friend2 = new Friend("Patrick");
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
