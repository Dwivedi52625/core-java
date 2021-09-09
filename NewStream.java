import java.util.*;
import java.util.stream.Collectors;
class Fruit{
    String name,colour;
    int price,calories;
    Fruit(String name,String colour,int price,int calories){
        this.name=name;
        this.colour=colour;
        this.price=price;
        this.calories=calories;

    }
    public String toString(){
        return this.name;
    }
    int getcalories(){
        return calories;
    }
    String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    }
    class NameComparator implements Comparator<Fruit>{
        public int compare(Fruit i1,Fruit i2){
            return i2.getName().compareTo(i1.getName());
        }
    }
    class NameComparator1 implements comparator<Fruit>{
        public int compare(Fruit j1,Fruit j2){
            return j1.getColour().compareTo(j2.getColour());
        }
    }
    class News{
        int newsid;
        String postedbyuser,commentedbyuser,comment;
        News(int newsid,String postedbyuser,String commentedbyuser,String comment){
            this.newsid=newsid;
            this.postedbyuser=postedbyuser;
            this.commentedbyuser=commentedbyuser;
            this.comment=comment;
        }
        public String toString(){
            return this.comment;
        }
        public int getNewsid() {
            return newsid;
        }
        public void setNewsid(int newsid) {
            this.newsid = newsid;
        }
        public String getPostedbyuser() {
            return postedbyuser;
        }
        public void setPostedbyuser(String postedbyuser) {
            this.postedbyuser = postedbyuser;
        }
        public String getCommentedbyuser() {
            return commentedbyuser;
        }
        public void setCommentedbyuser(String commentedbyuser) {
            this.commentedbyuser = commentedbyuser;
        }
        public String getComment() {
            return comment;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
    }
   
class TestStream{
    public static void main(String[] args) {
        ArrayList<Fruit> lst= new ArrayList<>();
        lst.add(new Fruit("apple","red",20,90));
        lst.add(new Fruit("orange","orange",15,120));
        lst.add(new Fruit("kiwi","pink",10,80));
        lst.add(new Fruit("strawberry","red",19,105));
        System.out.println(lst);
        List<Fruit> newlst=lst.stream().filter(i->i.getcalories()<100).sorted(new NameComparator()).collect(Collectors.toList());
        System.out.println(newlst);
        List<Fruit> newlst1=lst.stream().sorted(new NameComparator()).collect(Collectors.toList());
        System.out.println(newlst1);
        List<Fruit> newlst2=lst.stream().filter(i->i.getColour()=="red").sorted(new NameComparator()).collect(Collectors.toList());
        System.out.println(newlst2);

        ArrayList<News> nst= new ArrayList<>();
        nst.add(new News(1001, "great news", "well done", "this is best"));
        nst.add(new News(1001, "great work", "nailed it", "this is amazing"));
        nst.add(new News(1002, "great ", "well done", "this is good budget"));
        nst.add(new News(1003, "nicely done ", "great job", "this is best budget"));
        System.out.println(nst);
        List<News> newnst=nst.stream().filter(i->i.getNewsid()== 1001).collect(Collectors.toList());
        System.out.println(newnst);
        
        System.out.println(nst.getComment());

    }
}