package pl.sda.blok1.ToolsShop;

public class ToolsShop {


    public static void main(String[] args) {

        Hammer hammer1 = new Hammer("Super młotek ", 200, 15);
        Hammer hammer2 = new Hammer("bardziej super młotek", 150, 50);

        Saw saw1 = new Saw("piła", 100, 40);

        Tool[] tools = {hammer1, hammer2, saw1};
        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            System.out.println(tool.showDescription());

        }



    }
}
