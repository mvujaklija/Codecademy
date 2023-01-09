public class MadLibs {

     /*
     This program generates a mad libbed story.
     Author: Milan
     Date: 09/01/2023
  */

    public static void main(String[] args) {

        String name1 = "Alex";
        String adjective1 = "Nice";
        String adjective2 = "Charming";
        String adjective3 = "Boring";
        String verb1 = "Walking";
        String noun1 = "Table";
        String noun2 = "Window";
        String noun3 = "Track";
        String noun4 = "Cup";
        String noun5 = "Paper";
        String noun6 = "Bottle";
        String name2 = "Dorian";
        int number = 42;
        String place1 = "Street";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "
        +adjective2+" day!' Outside, a bunch of "
        +noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+
        " to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+"." +
        " Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+
        " in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);

    }
}
