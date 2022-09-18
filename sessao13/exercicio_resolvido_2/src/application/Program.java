package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awsome!");

        Post post = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12
                );

        post.addComent(c1);
        post.addComent(c2);

        System.out.println(post);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you!!");

        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );

        p2.addComent(c3);
        p2.addComent(c4);
        System.out.println(p2);

    }
}
