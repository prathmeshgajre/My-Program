package returntype;

public class College {

    College collegeName()
    {
        System.out.println(" IIT college in India");
        return new College();
    }

    College estYear()
    {
        System.out.println("1926");
        return this;
    }

    static void main() {

        College c = new College();
        College cName = c.collegeName();
        System.out.println(cName);
        College eYear = c.estYear();
        System.out.println(eYear);
    }
}
