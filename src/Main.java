public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int people = 10;
        if (people >= 2 && people <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else {
        if (people >= 7 && people <= 17) {
            System.out.println("нужно ходить в школу");
        } else {
        if (people >= 18 && people <= 24) {
            System.out.println("ему пора в университет");
        } else {
        if (people > 24) {
            System.out.println(" ему пора ходить на работу");
        }
        }
        }
            }
        int atraction = 3;
        if (atraction < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else {
        if (atraction >= 5 && atraction <= 14) {
            System.out.println("может кататься только в сопровождении взрослого");
        } else {
        if (atraction > 14) {
            System.out.println("он может кататься без сопровождения взрослого");
        }
        }
        }

        int vagon = 1;
        if (vagon > 1 && vagon <= 60) {
            System.out.println("в вагоне есть сидячие места");
        } else {
        if (vagon > 60 && vagon < 102) {
            System.out.println("есть стоячие места ");
        } else {
        if (vagon > 102) {
            System.out.println("вагон забит");
        }
        }
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (three > one && three > two) {
            System.out.println("максимальное число");
        }
    }

        }


