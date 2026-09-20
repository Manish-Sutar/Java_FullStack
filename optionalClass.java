import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalClass {
    public static void main(String [] args)
    {
        List<String> name = Arrays.asList("rajeshn","shyam","ram","raj","chetan","chaudhari");
        List<String> name2= new ArrayList<>();


      Optional<String>  name3 =   name.stream().filter(n->n.contains("z")).findFirst();
        System.out.println(name3.orElse("the name is not the list"));
    }
}
