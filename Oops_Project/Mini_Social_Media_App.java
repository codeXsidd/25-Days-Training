/*
 This is a Mini Instagram Application

 In this program, user can:
 - Register and login
 - View and edit profile
 - Create posts
 - Like posts
 - Comment on posts
 - View all posts (feed)

 This program uses basic OOPS concepts like:
 - Interface (for notification)
 - Abstract class (Person)
 - Inheritance (User class)
 - Constructors
*/
import java.util.Scanner;

// This interface is used to show notification messages
interface NotificationService {
    void notifyUser(String msg);
}

// This is a basic person class
// It stores username and password
abstract class Person {
    String username;
    String password;

    // constructor to set values
    Person(String u, String p) {
        username = u;
        password = p;
    }

    // this method will be defined in child class
    abstract void showProfile();
}

// User class is created from Person class
// It also uses notification feature
class User extends Person implements NotificationService {

    String bio;

    // constructor
    User(String u, String p) {
        super(u, p);
        bio = "No bio";
    }

    // show user details
    public void showProfile() {
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio);
    }

    // show notification message
    public void notifyUser(String msg) {
        System.out.println("Notification: " + msg);
    }
}

// This class is used to store post details
class Post {
    int id;
    String user;
    String caption;
    int like;

    String[] comments = new String[10];
    int commentCount = 0;

    // constructor
    Post(int i, String u, String c) {
        id = i;
        user = u;
        caption = c;
        like = 0;
    }

    // display post
    void show() {
        System.out.println("\nPost ID: " + id);
        System.out.println("User: " + user);
        System.out.println("Caption: " + caption);
        System.out.println("Likes: " + like);
    }
}

// Main class starts here
public class Mini_Social_Media_App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array to store users
        User[] users = new User[5];

        // array to store posts
        Post[] posts = new Post[10];

        int userCount = 0;
        int postCount = 0;

        User currentUser = null;

        // main loop (runs again and again)
        while (true) {

            System.out.println("\n1 Register");
            System.out.println("2 Login");
            System.out.println("3 Exit");

            int choice = sc.nextInt();

            // REGISTER
            if (choice == 1) {

                System.out.print("Enter username: ");
                String u = sc.next();

                System.out.print("Enter password: ");
                String p = sc.next();

                // create user object
                User newUser = new User(u, p);

                // store in array
                users[userCount] = newUser;

                userCount = userCount + 1;

                System.out.println("User Registered");
            }

            // LOGIN
            else if (choice == 2) {

                System.out.print("Enter username: ");
                String u = sc.next();

                System.out.print("Enter password: ");
                String p = sc.next();

                currentUser = null;

                // check all users
                for (int i = 0; i < userCount; i++) {
                    if (users[i].username.equals(u) && users[i].password.equals(p)) {
                        currentUser = users[i];
                    }
                }

                // if user not found
                if (currentUser == null) {
                    System.out.println("Login Failed");
                } 
                
                // if login success
                else {
                    System.out.println("Login Success");

                    // menu after login
                    while (true) {

                        System.out.println("\n1 Profile");
                        System.out.println("2 Edit Bio");
                        System.out.println("3 Create Post");
                        System.out.println("4 View Feed");
                        System.out.println("5 Logout");

                        int ch = sc.nextInt();

                        // show profile
                        if (ch == 1) {
                            currentUser.showProfile();
                        }

                        // edit bio
                        else if (ch == 2) {
                            System.out.print("Enter new bio: ");
                            currentUser.bio = sc.next();
                        }

                        // create post
                        else if (ch == 3) {

                            System.out.print("Enter caption: ");
                            String cap = sc.next();

                            // create post object
                            Post newPost = new Post(postCount, currentUser.username, cap);

                            // store post
                            posts[postCount] = newPost;

                            postCount = postCount + 1;

                            System.out.println("Post Created");
                        }

                        // view all posts
                        else if (ch == 4) {

                            for (int i = 0; i < postCount; i++) {

                                posts[i].show();

                                System.out.println("1 Like");
                                System.out.println("2 Comment");
                                System.out.println("3 View Comments");

                                int act = sc.nextInt();

                                // like post
                                if (act == 1) {
                                    posts[i].like = posts[i].like + 1;
                                    currentUser.notifyUser("Post liked");
                                }

                                // add comment
                                else if (act == 2) {

                                    System.out.print("Enter comment: ");
                                    String cmt = sc.next();

                                    posts[i].comments[posts[i].commentCount] = cmt;
                                    posts[i].commentCount = posts[i].commentCount + 1;

                                    currentUser.notifyUser("Comment added");
                                }

                                // view comments
                                else if (act == 3) {

                                    for (int j = 0; j < posts[i].commentCount; j++) {
                                        System.out.println(posts[i].comments[j]);
                                    }
                                }
                            }
                        }

                        // logout
                        else if (ch == 5) {
                            break;
                        }
                    }
                }
            }

            // exit program
            else {
                break;
            }
        }
    }
}
