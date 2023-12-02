import java.io.IOException;

public class Car implements AutoCloseable {
    public void drive(){
        System.out.println("машина журуп жатат");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Машина жабылды");
    }
}
