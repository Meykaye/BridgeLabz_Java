package linkedlist.singly;
/*
 * Social Media Friend Connections
 */
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        this.friendId = id;
    }
}

class UserNode {
    int userId;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int id, String name) {
        this.userId = id;
        this.name = name;
    }
}

public class SocialMediaFriends {

    private UserNode head;

    public void addUser(int id, String name) {
        UserNode newUser = new UserNode(id, name);
        newUser.next = head;
        head = newUser;
    }

    public void displayUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.userId + " | " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();
        sm.addUser(1, "Alice");
        sm.addUser(2, "Bob");
        sm.displayUsers();
    }
}
