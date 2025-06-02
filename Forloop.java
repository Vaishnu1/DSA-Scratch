public class Forloop {
    void printnames(int n,String name)
    {
        for (int i=0;i<n;i++)
        {
            System.out.println(name +""+i);
        } 
    }
    public static void main(String[] args) {
        Forloop loop = new Forloop();
        loop.printnames(5, "John");
        // Example of a for loop
        
    }

    }
