import java.util.*;

// Represents a profile in the network
class Profile {
    int id;
    String username;
    int age;
    List<Integer> connections;
    Profile link;

    Profile(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.connections = new ArrayList<>();
        this.link = null;
    }
}

public class SocialNetworkManager {

    static Profile start = null;

    public static void main(String[] args) {

        createProfile(1, "Alice", 21);
        createProfile(2, "Bob", 23);
        createProfile(3, "Charlie", 20);
        createProfile(4, "David", 24);

        connectFriends(1, 2);
        connectFriends(1, 3);
        connectFriends(2, 3);

        System.out.println();
        showFriends(1);

        System.out.println();
        showMutuals(1, 2);

        System.out.println();
        printFriendCounts();

        System.out.println();
        disconnectFriends(1, 2);

        System.out.println();
        showFriends(1);
        showFriends(2);
    }

    // Add new profile at end of linked list
    static void createProfile(int id, String name, int age) {
        Profile p = new Profile(id, name, age);

        if (start == null) {
            start = p;
            return;
        }

        Profile temp = start;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = p;
    }

    // Find profile by ID
    static Profile getProfile(int id) {
        Profile temp = start;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.link;
        }
        return null;
    }

    // Search profile by name
    static Profile findByName(String name) {
        Profile temp = start;
        while (temp != null) {
            if (temp.username.equalsIgnoreCase(name)) return temp;
            temp = temp.link;
        }
        return null;
    }

    // Create friend connection (bi-directional)
    static void connectFriends(int id1, int id2) {
        Profile p1 = getProfile(id1);
        Profile p2 = getProfile(id2);

        if (p1 == null || p2 == null) {
            System.out.println("Profile not found!");
            return;
        }

        if (!p1.connections.contains(id2))
            p1.connections.add(id2);

        if (!p2.connections.contains(id1))
            p2.connections.add(id1);

        System.out.println(p1.username + " and " + p2.username + " are now connected.");
    }

    // Remove friend connection
    static void disconnectFriends(int id1, int id2) {
        Profile p1 = getProfile(id1);
        Profile p2 = getProfile(id2);

        if (p1 == null || p2 == null) {
            System.out.println("Profile not found!");
            return;
        }

        p1.connections.remove(Integer.valueOf(id2));
        p2.connections.remove(Integer.valueOf(id1));

        System.out.println(p1.username + " and " + p2.username + " are no longer connected.");
    }

    // Display friend list of a profile
    static void showFriends(int id) {
        Profile p = getProfile(id);

        if (p == null) {
            System.out.println("Profile not found!");
            return;
        }

        System.out.println("Friends of " + p.username + ":");

        if (p.connections.isEmpty()) {
            System.out.println("No connections available.");
            return;
        }

        for (int fid : p.connections) {
            Profile f = getProfile(fid);
            if (f != null) {
                System.out.println("- " + f.id + " | " + f.username + " | Age: " + f.age);
            }
        }
    }

    // Display mutual friends
    static void showMutuals(int id1, int id2) {
        Profile p1 = getProfile(id1);
        Profile p2 = getProfile(id2);

        if (p1 == null || p2 == null) {
            System.out.println("Profile not found!");
            return;
        }

        System.out.println("Mutual connections of " + p1.username + " and " + p2.username + ":");

        boolean found = false;
        for (int x : p1.connections) {
            if (p2.connections.contains(x)) {
                Profile m = getProfile(x);
                System.out.println("- " + m.id + " | " + m.username);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No mutual connections.");
        }
    }

    // Count friends for each profile
    static void printFriendCounts() {
        Profile temp = start;
        while (temp != null) {
            System.out.println(temp.username + " has " + temp.connections.size() + " friends.");
            temp = temp.link;
        }
    }
}
