abstract class persistance {
abstract void persist();

}
class FilePersistance extends persistance{
     public void files() {
         System.out.println("this is your persistancefile");
     }
}
class Databasepersistance extends persistance{
    public void database() {
        System.out.println("this is your persistance database");
    }
}
class data {
    public static void main(String[] args) {
        persistance p= new persistance();
        p.persist();
    }
}
