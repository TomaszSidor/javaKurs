package pl.sda.blok1.interface1;

import java.util.ArrayList;
import java.util.List;

public class FigureColection {
    public static void main(String[] args) {


        List<Rectangle> prostokaty = new ArrayList<>();
        List<Triangle> trojkaty = new ArrayList<>();
        List<Circle> kola = new ArrayList<>();


        kola.add(new Circle(5));
        kola.add(new Circle(2));
        kola.add(new Circle(6));
        kola.add(new Circle(8));
        kola.add(new Circle(0));
        kola.add(new Circle(3));

        double poleKol = 0;
        double obwodKol = 0;

        for (int i = 0; i < kola.size(); i++) {

            poleKol += kola.get(i).getArea();
            obwodKol += kola.get(i).getPerimeter();
        }

        System.out.println("poleKol = " + poleKol);
        System.out.println("obwodKol = " + obwodKol);



        double poleTrojkatow = 0;
        double obwodTrojkotow = 0;



        trojkaty.add(new Triangle(2,5));
        trojkaty.add(new Triangle(5,5));
        trojkaty.add(new Triangle(3,5));
        trojkaty.add(new Triangle(2,1));
        trojkaty.add(new Triangle(2,8));
        trojkaty.add(new Triangle(2,8));

        for (int i = 0; i < trojkaty.size(); i++){
            poleTrojkatow += trojkaty.get(i).getArea();
            System.out.println(poleTrojkatow + " ");
            obwodTrojkotow += trojkaty.get(i).getPerimeter();
        }

        System.out.println("Pole trojkatow = " + poleTrojkatow);
//
//
//        prostokaty.add(new Rectangle(5,1));
//        prostokaty.add(new Rectangle(5,5));
//        prostokaty.add(new Rectangle(2,3));
//        prostokaty.add(new Rectangle(4,1));
//        prostokaty.add(new Rectangle(5,1));







    }




}
