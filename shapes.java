abstract class shapes {
    abstract void draw();

    public void cubeshape() {
        System.out.println("_____");
        System.out.println("|    |");
        System.out.println("|____|");
    }
    public void rectangleshape() {
        System.out.println("________");
        System.out.println("|       |");
        System.out.println("|_______|");
    }
    public void lineshape() {
        System.out.println("________");
        
    }
}

    
    class line{
        public void lineshape() {
            System.out.println("________");
            
        }
    }
    class rectangle extends line{
        public void rectangleshape() {
            System.out.println("________");
            System.out.println("|       |");
            System.out.println("|_______|");
        }
    }
    class cube extends rectangle{public void cubeshape() {
        System.out.println("_____");
        System.out.println("|    |");
        System.out.println("|____|");
    
    }
}
    class allshapes extends cube{
        public static void main(String[] args) {
            cube s=new cube();
            s.cubeshape();
            s.rectangleshape();
            s.lineshape();
        }
    } 