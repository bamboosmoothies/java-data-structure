import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author School
 */
public class WorkingWithStacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> stackOfVideoGames = new Stack<String>();

        // System.out.println(stackOfVideoGames.empty());

        stackOfVideoGames.push("Minecraft");
        stackOfVideoGames.push("Skyrim");
        stackOfVideoGames.push("DOOM");
        stackOfVideoGames.push("Borderlands");
        stackOfVideoGames.push("Insurgency");

        // String myFavGame = stackOfVideoGames.pop();
        // System.out.println(myFavGame);

        System.out.println(stackOfVideoGames.peek());

        System.out.println(stackOfVideoGames.search("Minecraft"));

        /**
         * use of stacks?
         * 1. undo/redo features in text editors
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directories)
         * 4. calling functions (call stack)
         */

    }

}
