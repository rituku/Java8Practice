
interface AddS{
    Integer add(int a1, int a2);
}

class AddStatic{
    public static Integer addition(int a, int b){
        return a + b;
    }
}
public class AddStatc {
    public static void main(String[] args) {
        AddS as = new AddS(){
            public Integer add(int a, int b){
                return a + b;
            }
        };
        System.out.println(as.add(2, 3));

        AddS adds = AddStatic::addition;
        System.out.println(adds.add(9, 5));

        AddS ads = (a, b) -> a+b;
        System.out.println(ads.add(1, 6));
    }
}
