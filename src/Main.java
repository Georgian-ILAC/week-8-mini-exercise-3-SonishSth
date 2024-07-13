public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(78891, 18, "Sonish", "Shrestha");
        e1.setHeight(165);

        System.out.println(e1);

        // after employee gets a raise
        System.out.println("You got a pay raise and your new hourly pay is "+e1.getRaise());

        // printing the weekly income
        System.out.println("You income this week is "+e1.payDay(45));
    }
}